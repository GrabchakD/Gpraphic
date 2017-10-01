<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="/WEB-INF/views/template/header.jsp" %>
<center>
    <form class="form-inline">
    <div class="form-group mx-sm-3">
        <div class="d-inline-flex p-2">Expense [m³/h]</div>
        <input type="text" class="form-control" placeholder="0">
    </div>
</form>
<br>

<form class="form-inline">
    <div class="form-group mx-sm-3">
        <div class="d-inline-flex p-2">Pressure [Pa]</div>
        <input type="text" class="form-control" placeholder="0">
    </div>
</form>
<br>

<div class="d-inline-flex p-2">Limit (+/-)</div>
<form class="form-inline">
    <div class="form-group mx-sm-3">
        <input type="text" class="form-control" placeholder="0">
    </div>
    <br>
    <br>
    <button type="submit" class="btn btn-primary">Search</button>
</form>
</center>
