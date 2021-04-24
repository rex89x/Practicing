$(function(){
    $('.news').mouseenter(function(){
        $(this).find('img').animate({width:300 , top:-40, left:-40 }, {duration:500});
        $(this).find('p').animate({bottom:0},{duration : 400,easing:"easeOutBounce"});
    })
    $('.news').mouseleave(function(){
        $(this).find('img').animate({width:220 , top:0, left:0 }, {duration:500});
        $(this).find('p').animate({bottom:-40},{duration : 50,easing:"easeOutBounce"});
    })
})