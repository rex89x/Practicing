$(function(){
    $('.news').mouseenter(function(){
        $(this).find('p').animate({bottom:0},{duration : 400,easing:"easeOutBounce"});
    })
    $('.news').mouseleave(function(){
        $(this).find('p').stop().animate({bottom:-40},{duration : 50,easing:"easeOutBounce"});
    })
})