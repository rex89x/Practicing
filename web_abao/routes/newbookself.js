var express = require('express');
var router = express.Router();

/* GET newbookcase page. */
router.get('/', function(req, res, next) {
  res.render('newbookself', { title: 'newbookself' });
});


module.exports = router;
