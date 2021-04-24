var express = require('express');
var router = express.Router();
//----------------------------------------------------
// 透過require引用db.js的pool物件,
// 即使多個程式均引用, 在系統中只有一份pool物件.
//----------------------------------------------------
var pool = require('./db.js');


/* GET home page. */
router.get('/', function(req, res, next) {
	var pno=req.param("no");
	console.log(pno);
	
	if(pno==null || pno==undefined){
		res.render('productEmpty', {items:[]});
	}else{
		pool.query('SELECT * FROM product WHERE proNo=?', [pno] , function (error, results, fields) {
			if (error || results.length==0){
				res.render('notFound', {items:[]});
			}else{
				res.render('productQuery', {items:results});
			}       
		});
	}
});

module.exports = router;