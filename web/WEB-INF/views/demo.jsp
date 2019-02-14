<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>JobGroupId</td>
        <td>JobId</td>
        <td>ReqCode</td>
        <td>MsgNo</td>
        <td>JobExe</td>
        <td>InstuCde</td>
        <td>OpId</td>
        <td>UsrId</td>
        <td>UsrName</td>
        <td>SetSeq</td>
    </tr>
    <c:forEach items="${list}" var="s" varStatus="st">
        <tr>
            <td>${s.JobGroupId}</td>
            <td>${s.JobId}</td>
            <td>${s.ReqCode}</td>
            <td>${s.MsgNo}</td>
            <td>${s.JobExe}</td>
            <td>${s.InstuCde}</td>
            <td>${s.OpId}</td>
            <td>${s.UsrId}</td>
            <td>${s.UsrName}</td>
            <td>${s.SetSeq}</td>
        </tr>
    </c:forEach>
</table>