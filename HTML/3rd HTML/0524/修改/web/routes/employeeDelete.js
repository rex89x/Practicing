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

    pool.query('DELETE FROM employee WHERE empNo = ?', [empNo] , function(err, results, fields) {
        if (err){
            res.render('deleteFail', {});   
        }else{
            res.render('deleteSuccess', {}); 
        }
    });    	
});

module.exports = router;
