var express = require('express');
var router = express.Router();
var mysql = require('mysql');

//------------------
// 載入資料庫連結
//------------------
var pool = require('./db.js');



//-----------------
// 引用multer外掛
//----------------- 
var multer  = require('multer');

//---------------------------------
// 上傳圖片存放資料夾及檔名設定
//---------------------------------
var storage = multer.diskStorage({
    destination: function (req, file, cb) {
        cb(null, 'public\\images');
    },

    filename: function (req, file, cb) {
        cb(null, Date.now()+"--"+file.originalname);    
    }   
})

//-----------------------------------------------
// 產生multer的上傳物件
//-----------------------------------------------
var maxSize=1024*1024;  //設定最大可接受圖片大小
var upload = multer({
    storage:storage
})
//------------------
// POST 方法
//------------------
router.post('/', upload.single('picture'), function(req, res) {
	
	if (typeof req.file != 'undefined'){
        //----------------------------------
        // 上傳檔案大小不可超過 maxSize 
        //----------------------------------
        if(req.file.size>maxSize){
            res.render('productFileSizeFail', {});  //圖片過大的錯誤
            return;
        }                      
    }      
	

    //取得使用者傳來的參數
    var empNo=req.param("empNo");
    var empName=req.param("empName");
    var title=req.param("title");
    var birthday=req.param("birthday");
    var address=req.param("address");
	var tel=req.param("tel");
	var picture='';
	
    //建立一個新資料物件
    var newData={
        empNo:empNo,
        empName:empName,
        title:title,
        birthday:birthday,
        address:address,
		tel:tel,
		picture:picture
    }	
	
    pool.query('INSERT INTO employee SET ?', newData, function(err, rows, fields) {
        if (err){
            res.render('addFail', {});     //新增失敗
        }else{
            res.render('addSuccess', {});  //新增成功
        }
    });
});

module.exports = router;