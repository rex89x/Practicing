import pandas as pd

DUMMY=False
TO_CSV=True

if TO_CSV:
    def feature_to_dummy(df, column, drop=False):
        tmp = pd.get_dummies(df[column], prefix=column, prefix_sep='_')
        df = pd.concat([df, tmp], axis=1)
        if drop:
            del df[column]
        return df

    x_train_PATH = "./data/X_train.csv"
    x_train=pd.read_csv(x_train_PATH, sep=',')

    # drop
    x_train=x_train.drop(columns=[
        'id',
        'member_id',
        'emp_title',
        'url',
        'desc',
        'purpose',
        'title',
        'zip_code',

        # 數據太少
        'pymnt_plan',
        'mths_since_last_record',
        'collections_12_mths_ex_med',
        'mths_since_last_major_derog',
        'policy_code',
        'annual_inc_joint',
        'dti_joint',
        'verification_status_joint',
        'acc_now_delinq',

        # date
        'issue_d',
        'earliest_cr_line',
        'next_pymnt_d',
        'last_pymnt_d',
        'last_credit_pull_d',

        # 116 ~ 128
        'revol_bal_joint',
        'sec_app_fico_range_low',
        'sec_app_fico_range_high',
        'sec_app_earliest_cr_line',
        'sec_app_inq_last_6mths',
        'sec_app_mort_acc',
        'sec_app_open_acc',
        'sec_app_revol_util',
        'sec_app_open_act_il',
        'sec_app_num_rev_accts',
        'sec_app_chargeoff_within_12_mths',
        'sec_app_collections_12_mths_ex_med',
        'sec_app_mths_since_last_major_derog',

        # 129 ~ 143
        'hardship_flag',
        'hardship_type',
        'hardship_reason',
        'hardship_status',
        'deferral_term',
        'hardship_amount',
        'hardship_start_date',
        'hardship_end_date',
        'payment_plan_start_date',
        'hardship_length',
        'hardship_dpd',
        'hardship_loan_status',
        'orig_projected_additional_accrued_interest',
        'hardship_payoff_balance_amount',
        'hardship_last_payment_amount',

        # 144 ~ 150
        'debt_settlement_flag',
        'debt_settlement_flag_date',
        'settlement_status',
        'settlement_date',
        'settlement_amount',
        'settlement_percentage',
        'settlement_term',
    ])

    # replace
    x_train['term'] = x_train['term'].replace({' months':''},regex=True)
    x_train['int_rate'] = x_train['int_rate'].replace({'%':''},regex=True)
    x_train['revol_util'] = x_train['revol_util'].replace({'%':''},regex=True)
    x_train['emp_length'] = x_train['emp_length'].replace({
        ' years':'',
        ' year':'',
        '\+':'1',
        '< 1':'0.5'
    },regex=True)

    if not DUMMY:
        file_name=f'x_train2.csv'
        x_train['home_ownership']=x_train['home_ownership'].replace({
            'MORTGAGE':'1',
            'RENT':'2',
            'OWN':'3'
        })
        x_train['verification_status']=x_train['verification_status'].replace({
            'Not Verified':'1',
            'Source Verified':'2',
            'Verified':'3'
        })
        x_train['application_type']=x_train['application_type'].replace({
            'Individual':'1',
            'Joint App':'2'
        })
    else:
        file_name=f'x_train2_dummy.csv'
        x_train=feature_to_dummy(x_train,'home_ownership',True)
        x_train=feature_to_dummy(x_train,'verification_status',True)
        x_train=feature_to_dummy(x_train,'application_type',True)

    print(x_train)
    x_train.to_csv(file_name,index = False)

# from sklearn.tree import DecisionTreeClassifier
#
# y_train_PATH = "./data/Y_train.csv"
# x_test_PATH = "./data/X_test.csv"
# y_test_PATH = "./data/Y_test.csv"
#
# y_train=pd.read_csv(y_train_PATH, sep=',')
# x_test=pd.read_csv(x_test_PATH, sep=',')
# y_test=pd.read_csv(y_test_PATH, sep=',')
#
# # model1
# model1 = DecisionTreeClassifier()
# model1.fit(x_train, y_train)
# y_pred1 = model1.predict(x_test)
#
# from sklearn import metrics
# print(metrics.confusion_matrix(y_test, y_pred1))
#
# # model2
