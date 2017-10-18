<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="/WEB-INF/views/template/header.jsp" %>

<center>
    <spring:form class="form-inline" method="post" action="/product">
        <div class="form-group mx-sm-3">
            <div class="d-inline-flex p-2">Expense [m³/h]</div>
            <input name="WPExpense" type="number" class="form-control" placeholder="0">
        </div>
        <br>
        <br>
        <div class="form-group mx-sm-3">
            <div class="d-inline-flex p-2">Pressure [Pa]</div>
            <input name="WPStaticPressure" type="number" class="form-control" placeholder="0">
        </div>
        <br>
        <br>
        <div>
            <div class="form-group mx-sm-3">Limit (+/-)</div>
            <br>
            <input name="limit" type="number" class="form-control" placeholder="0" value="0">
        </div>
        <br>
        <br>
        <button type="submit" class="btn btn-primary">Search</button>
    </spring:form>
</center>

<%@include file="/WEB-INF/views/template/footer.jsp" %>
