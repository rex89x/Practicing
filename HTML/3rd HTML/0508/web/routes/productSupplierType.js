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
    pool.query('select a.proNo, a.proName, a.typNo, b.typName from product a, protype b where a.typNo = b.typNo ', function (error, results, fields) {
        if (error||results.length==0){
            res.render('dataNotFound', {});  //轉給找不到資料的畫面
        }else{
            res.render('productSupplierType', {items:results});  //轉給顯示資料的畫面
        }       
    });
});

module.exports = router;