<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<html>
<head>
    <title>热点事件排行榜</title>
</head>
<body>
<form action="/Events/listHotEvents" method="post">
	关键词:&nbsp;<input type="text" name="keyWord" vlaue="${keyWord }">
	<input type="submit" value="查询">
</form>
    <h1>热点事件排行榜</h1>
    <table border="1" style="width:800px;">
        <tr>
            <td>关键词</td>
            <td>搜索指数</td>
            <td>创建事件</td>
        </tr>
        <c:forEach items="${pager.datas }" var="hotEvent">
            <tr>
                <td><a href="/Events/getHotEvent?id=${hotEvent.id}">${hotEvent.keyWord }</a></td>
                <td>${hotEvent.searchSum }</td>
                <td><fmt:formatDate value="${hotEvent.createDate }" pattern="yyyy-MM-dd"/> </td>
            </tr>
        </c:forEach>
    </table>
    <div>
    	<a href="/Events/listHotEvents?currPageNo=1">首页</a>
    	<a href="/Events/listHotEvents?currPageNo=${pager.currPageNo - 1 <= 0 ? 1:pager.currPageNo - 1 }">上一页</a>
    	<a href="/Events/listHotEvents?currPageNo=${pager.currPageNo + 1 > pager.totalPager ? pager.currPageNo:pager.currPageNo + 1 }">下一页</a>
    	<a href="/Events/listHotEvents?currPageNo=${pager.totalPager}">末页</a>
    	<span>第${pager.currPageNo }页/</span>
    	<span>共${pager.totalPager }页</span>
    </div>
</body>
</html>
