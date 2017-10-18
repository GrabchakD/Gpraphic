<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>
<br/>
<br/>
<br/>

<center>
    <c:forEach var="p" items="${products}">

        № ${p.id},
        ${p.name},
        ${p.WPExpense }  [m³/h],
        ${p.WPStaticPressure }  [Pa].
        <br/>
        <br/>

        <script type="text/javascript" language="JavaScript">
            getPo(${p.maxStaticPressure}, ${p.OEStaticPressure}, ${p.OEExpense}, ${p.WPStaticPressure}, ${p.WPExpense}, ${p.maxCosts});
        </script>

    </c:forEach>
</center>


<br/>
<br/>
<div id="myDiv" style="width: 800px; height: 800px;">
</div>
<script>


    function getPo(point0y, point1y, point1x, point2y, point2x, point3x) {

        var p0y = point0y;
        var p1y = point1y;
        var p2y = point2y;
        var p1x = point1x;
        var p2x = point2x;
        var p3x = point3x;

        var trace1 = {
            x: [0, p1x, p2x, p3x],
            y: [p0y, p1y, p2y, 0],
            mode: 'lines+markers',
            name: 'spline',
            line: {shape: 'spline'},
            type: 'scatter'
        };

        var data = [trace1];


        Plotly.newPlot('myDiv', data);
    }

</script>

<%@include file="/WEB-INF/views/template/footer.jsp" %>
