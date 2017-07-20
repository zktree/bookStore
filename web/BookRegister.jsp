<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<center>
    <table width="80%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FF0000">
        <tr>
            <td colspan="2">
                <img src="img/banner.png" alt="书籍库存登记系统" width="100%" />
            </td>
        </tr>
        <tr>
            <td width="22%" height="480" valign="top" background="bg_left.png">
                <br /><br />
                <center><p><font color="#13598b" size="4">
                    <img src="img/icon_listlia.gif" />
                    <a href=""><B>首&nbsp;&nbsp;&nbsp;&nbsp;页</B></a>
                </font></p></center>
                <center><p><font color="#13598b" size="4">
                    <img src="img/icon_listlia.gif" />
                    <a href=""><B>入库登记</B></a>
                </font></p></center>
                <center><p><font color="#13598b" size="4">
                    <img src="img/icon_listlia.gif" />
                    <a href=""><B>库存列表</B></a>
                </font></p></center>
            </td>
            <td width="78%" valign="top" align="left">
                <br />
                <s:form action="bookAction" method="post">
                    <s:textfield label="书名" name="bname"></s:textfield><s:fielderror fieldName="bname"></s:fielderror>
                    <s:checkboxlist label="类别" list="{'科学','教育','文学','生活','其他'}" name="category"></s:checkboxlist><s:fielderror fieldName="category"></s:fielderror>
                    <s:textfield label="作者" name="author"></s:textfield><s:fielderror fieldName="author"></s:fielderror>
                    <s:radio label="折扣" name="discount" list="#{1:'全价',0.9:'9折',0.8:'8折',0.7:'7折',0.6:'6折'}"></s:radio><s:fielderror fieldName="discount"></s:fielderror>
                    <s:textfield label="价格" name="price"></s:textfield><s:fielderror fieldName="price"></s:fielderror>
                    <s:textfield label="数量" name="amount"></s:textfield><s:fielderror fieldName="amount"></s:fielderror>
                    <s:textarea label="简介" name="profile"></s:textarea><s:fielderror fieldName="profile"></s:fielderror>
                    <s:submit value="登记"></s:submit>
                    <s:reset value="重置"></s:reset>
                </s:form>
            </td>
        </tr>
    </table>
    <center>
</body>
</html>