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
	var pno=req.param("no");
	console.log(pno);
	
	if(pno==null || pno==undefined){
		res.render('productEmpty', {items:[]});
	}else{
    pool.query('select a.proNo, a.proName, a.supNo, b.supName, a.typNo, c.typName from product a, supplier b, protype c where a.supNo = b.supNo and a.typNo = c.typNo and a.proNo=?', [pno] ,function (error, results, fields) {
        if (error||results.length==0){
            res.render('index', {});  //轉給找不到資料的畫面
        }else{
            res.render('productQuery', {items:results});  //轉給顯示資料的畫面
        }       
    });
	}
});

module.exports = router;