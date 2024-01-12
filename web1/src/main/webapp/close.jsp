<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*" %>
<%@ page import = "java.text.ParseException" %>
<%@ page import = "org.json.*" %>
<%
	request.setCharacterEncoding("utf-8");
	StringBuffer jsonbuf = new StringBuffer();
	JSONObject jsonobj = null;
	String json = null;
	String line = null;
	
	try{
		BufferedReader bf = request.getReader();
		while((line=bf.readLine()) !=null ){
			jsonbuf.append(line);
		}
		json = jsonbuf.toString();
		System.out.println(json);
		
		jsonobj = new JSONObect(json);
		JSONArray array = new JSON
		
	}catch(Exception e){
		System.out.println("json 실패")
		e.printStackTrace();
	}
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>