$(function(){
    var isOpened = true;
    //-------------------------------
    $('.news').mouseenter(function(){
        $(this).stop().animate({top:-10}, {duration:400, easing:'easeInOutBounce'});
    });

    $('.news').mouseleave(function(){
        $(this).stop().animate({top:0}, {duration:100});
    });
    //-------------------------------
    $('.logo').mousedown(function(){
        if(isOpened){
            $(this).stop().animate({top:40}, {duration:400, easing:'easeInOutBounce'});
            $(this).parent().stop().animate({top:-80}, {duration:400, easing:'easeInOutBounce'});
            $(this).rotate({angle:0, animateTo:180, duration:1000});
            isOpened=false;
        }else{
            $(this).stop().animate({top:20}, {duration:400, easing:'easeInOutBounce'});
            $(this).parent().stop().animate({top:0}, {duration:400, easing:'easeInOutBounce'});
            $(this).rotate({angle:180, animateTo:360, duration:1000});
            isOpened=true;
        }
    });
    //-------------------------------
});