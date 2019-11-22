
var a_idx = 0;
jQuery(document).ready(function($) {
    $("body").click(function(e) {

        //倒计时
        var nowTime = new Date();
        var cetTime = new Date("2019-12-14");
        var time = cetTime.getTime()-nowTime.getTime();
        var days = time/(24*60*60*1000);
        var dayText = parseInt(days);
        $("#cet4").text(dayText);
        $("#cet6").text(dayText);
        var pqeTime = dayText + 7;
        $("#pqe").text(pqeTime);

        //单词分页



        //鼠标点击事件
        var a = new Array("早上醒来的时候",
            "不知为什么自己在哭",
            "这样的事时不时就会发生",
            "明明做过的梦",
            "却总是想不起来",
            "但是...，但是...",
            "总有一种若有所失的感觉",
            "醒来后一直难以驱散");
        var $i = $("<span></span>").text(a[a_idx]);
        a_idx = (a_idx + 1) % a.length;
        var x = e.pageX,
            y = e.pageY;
        $i.css({
            "z-index": 999999999999999999999999999999999999999999999999999999999999999999999,//元素置顶
            "top": y - 20,
            "left": x,
            "position": "absolute",
            "font-weight": "bold",
            "color": "rgb("+~~(255*Math.random())+","+~~(255*Math.random())+","+~~(255*Math.random())+")"
        });
        $("body").append($i);
        $i.animate({
                "top": y - 180,
                "opacity": 0  //透明度变为0
            },
            1500,
            function() {
                $i.remove();
            });
    });

});

