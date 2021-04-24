var express = require('express');
var router = express.Router();
var mysql = require('mysql');

//------------------
// 載入資料庫連結
//------------------
var pool = require('./db.js');


//============================
// 處理 POST 請求
//============================
router.post('/', function(req, res) {
    // 取得使用者傳來的參數
    var empNo=req.param("empNo");
    var empName=req.param("empName");
    var title=req.param("title");
    var birthday=req.param("birthday");	

    // 建立一個新資料物件
    var newData={        
        empNo:empNo,
        empName:empName,
        title:title,
        birthday:birthday
    }  
	
    pool.query('UPDATE employee SET ? WHERE empNo = ?', [newData, empNo] , function(err, rows, fields) {
        if (err){
            res.render('modifyFail', {});   
        }else{
            res.render('modifySuccess', {}); 
        }
    });    	
});

module.exports = router;