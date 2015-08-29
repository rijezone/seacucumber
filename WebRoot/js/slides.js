$(document).ready(function(){
	//banner图切换
	var sWidth=$("#slide").width();
	var len=$("#slide ul li").length;
	var index=0;
	var picTimer;
	var dot="<div class='dot'>";
	for(var i=0;i<len;i++){
		dot+="<span></span>";
	    } 
	dot+="</div><div class='preNext pre'></div><div class='preNext next'></div>"
	$("#slide").append(dot); 
	//按钮的滑入事件
	$("#slide .dot span").mouseenter(function(){
		index=$("#slide .dot span").index(this);
		showPics(index);		
		}).eq(0).trigger("mouseenter");
	//按钮
	$("#slide .preNext").css("opacity",0.2).hover(function(){
		$(this).stop(true,false).animate({opacity:'0.5'},300);		
		},function(){
		$(this).stop(true,false).animate({opacity:'0.2'},300);
		});	 
	$("#slide .pre").click(function(){
		index-=1;
		if(index==-1){index=len-1;}
		showPics(index);
		}); 	
	$("#slide .next").click(function(){
		index+=1;
		if(index==len){index=0;}
		showPics(index);
		});	
	$("#slide ul").css("width",sWidth * (len));
		
	$("#slide").hover(function(){
		clearInterval(picTimer);
		},function(){
			picTimer=setInterval(function(){
			showPics(index);
			index++;
			if(index==len){index=0;}	
			},3000);
		}).trigger("mouseleave");
	function showPics(index){
		var nowLeft=-index*sWidth;
		$("#slide ul").stop(true,false).animate({
			left:nowLeft},300);
		$("#slide .dot span").stop(true,false).animate({
			opacity:'0.2'},300).eq(index).stop(true,false).animate({"opacity":"1"},300); 
		}	
	
	
	
	//新闻图切换	 
	var foodWidth="250";
	var foodLen=$(".food ul li").length;
	var foodIndex=0;
	var foodPicTimer;
	var nowFoodLeft=-foodIndex*foodWidth;
    $("#food ul").css("width",foodWidth * (foodLen));
	 
	$("#food ul").animate({});
	/* $("#food").hover(function(){
		clearInterval(foodPicTimer);		
		},function(){
			foodPicTimer=setInterval(function(){
				showFoodPics(foodIndex);
				foodIndex++;
				if(foodIndex==foodLen){foodIndex=0}
				},1000);
			}).trigger("mouseleave");
			function showFoodPics(foodIndex){
				var nowFoodLeft=-foodIndex*foodWidth;
				$("#food ul").stop(true,false).animate({
					left:nowFoodLeft},300); 
				} */
 
//		}).trigger("mouseleave");
//	function showPics(index){
//		var nowLeft=-index*sWidth;
//		$("#slide ul").stop(true,false).animate({
//			left:nowLeft},300);
//		$("#slide .dot span").stop(true,false).animate({
//			opacity:'0.2'},300).eq(index).stop(true,false).animate({"opacity":"1"},300); 
//		}	
});

 
	