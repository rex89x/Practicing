/*
 * 製作表單指令檔(SQL Server 版)
 *
 * 已確認可在SQL Server 2005 + Windows XP Service Pack 2中執行
 */

-- 製作表單：商品清單
CREATE TABLE 商品清單 (
    商品ID     NUMERIC NOT NULL,
    商品名稱     VARCHAR(30) NOT NULL,
    群組名稱   VARCHAR(20) NOT NULL,
    進貨單價   NUMERIC,
    販賣單價     NUMERIC,
    CONSTRAINT pk_shohin PRIMARY KEY (商品ID)
);

-- 製作表單：負責人清單
CREATE TABLE 負責人清單 (
    負責人ID   NUMERIC NOT NULL,
    負責人姓名   VARCHAR(20) NOT NULL,
    姓名拼音   VARCHAR(20) NOT NULL,
    MGR_ID     NUMERIC,
    出生日期   DATETIME NOT NULL,
    性別       NUMERIC NOT NULL,
    CONSTRAINT pk_tanto PRIMARY KEY (負責人ID),
    CONSTRAINT fk_mgr FOREIGN KEY (MGR_ID) REFERENCES 負責人清單(負責人ID),
    CONSTRAINT ck_gender CHECK (性別=0 OR 性別=1)
);

-- 製作表單：顧客清單
CREATE TABLE 顧客清單 (
    顧客ID     NUMERIC NOT NULL,
    顧客名稱     VARCHAR(20) NOT NULL,
    聯絡地址     VARCHAR(20) NOT NULL,
    CONSTRAINT pk_kokyaku PRIMARY KEY (顧客ID)
);

-- 製作表單：販賣資料
CREATE TABLE 販賣資料 (
    傳票編號   NUMERIC NOT NULL,
    列編號     NUMERIC NOT NULL,
    處理日     DATETIME NOT NULL,
    商品ID     NUMERIC NOT NULL,
    負責人ID   NUMERIC NOT NULL,
    顧客ID     NUMERIC NOT NULL,
    數量       NUMERIC NOT NULL,
    CONSTRAINT pk_uriage PRIMARY KEY (傳票編號, 列編號),
    CONSTRAINT fk_shohin FOREIGN KEY (商品ID) REFERENCES 商品清單(商品ID),
    CONSTRAINT fk_tanto FOREIGN KEY (負責人ID) REFERENCES 負責人清單(負責人ID),
    CONSTRAINT fk_kokyaku FOREIGN KEY (顧客ID) REFERENCES 顧客清單(顧客ID)
);

-- 製作表單：分店負責人清單
CREATE TABLE 分店負責人清單 (
    分店負責人ID   NUMERIC NOT NULL,
    分店負責人姓名   VARCHAR(20) NOT NULL,
    姓名拼音   VARCHAR(20) NOT NULL,
    MGR_ID     NUMERIC,
    出生日期   DATETIME NOT NULL,
    性別       NUMERIC NOT NULL,
    CONSTRAINT pk_siten_tanto PRIMARY KEY (分店負責人ID),
    CONSTRAINT fk_siten_mgr FOREIGN KEY (MGR_ID) REFERENCES 分店負責人清單(分店負責人ID),
    CONSTRAINT ck_siten_gender CHECK (性別=0 OR 性別=1)
);
