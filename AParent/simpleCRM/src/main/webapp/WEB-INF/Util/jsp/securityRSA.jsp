<%@page import="cn.com.noomn.util.RSAModel"%>

<%
RSAModel rsaModel = RSAModel.getRSAModelInstance();
request.setAttribute("publicExponent", rsaModel.getPublicExponent());
request.setAttribute("publicKeyModulus", rsaModel.getPublicKeyModulus());
session.setAttribute("privateExponent", rsaModel.getPrivateExponent());
session.setAttribute("privateKeyModulus", rsaModel.getPrivateKeyModulus());
%>