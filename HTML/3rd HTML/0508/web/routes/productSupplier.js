var express = require('express');
var router = express.Router();

//----------------------------
// 引用db.js的pool物件
//----------------------------
var pool = require('./db.js');


//========================
// 處理GET請求
//========================
router.get('/', function(req, res, next) {
    pool.query('select a.proNo, a.proName, a.supNo, b.supName from product a, supplier b where a.supNo = b.supNo', function (error, results, fields) {
        if (error||results.length==0){
            res.render('dataNotFound', {});  //轉給找不到資料的畫面
        }else{
            res.render('productSupplier', {items:results});  //轉給顯示資料的畫面
        }       
    });
});

module.exports = router;