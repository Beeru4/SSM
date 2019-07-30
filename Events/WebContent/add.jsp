<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>查看热点事件</title>
</head>
<body>
	<h1>${hotEvent.keyWord }</h1>
	<p>创建于:<fmt:formatDate value="${hotEvent.createDate }" pattern="yyyy-MM-dd"/></p>
	<p>${hotEvent.hotContent }</p>
	<h1>评论</h1>
	<c:forEach items="${hotEvent.comments}" var="comment">
		<p>评论时间:<fmt:formatDate value="${comment.commentDate }" pattern="yyyy-MM-dd"/></p>
		<p>评论内容:${comment.content }</p>
	</c:forEach>
	<form action="/" method="post"> 
		快速评论:
		<br/>
		<input type="hidden" name="hotEventsId" value="${hotEvent.id}">
		<textarea rows="" cols="" name="content"></textarea>
	    <span style="color:red;" id="msg"></span>
	<br/>
		<input type="submit" value="提交" /> <a href="/Events/listHotEvents">返回首页</a>
	</form>
</body>
<script type="text/javascript" src="/Events/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$("form").submit(function(){
		if($("[name='content']").val().trim() == ''){
			$("#msg").text("请填写评论内容!");
		}else{
			// 添评论
			$.ajax({
				url:"/Events/saveComment",
				data:$("form").serialize(),
				type:"post",
				dataType:"json",
				async:false,
				success:function(data){
					console.log(data);
					if(data.code == 200){
						 // 添加成功 刷新页面
						 window.location.reload();
					}else{
						// 添加失败
						$("#msg").text("添加失败");
					}
				}
			});
		}
		return false;
	});

</script>
</html>
