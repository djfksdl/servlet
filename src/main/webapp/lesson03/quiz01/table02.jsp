<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String category = 
			int id = Integer.valueOf(request.getParameter("id"));
    
	Map<String,Object> target = new HashMap<>();
    for (Map<String , Object> item : list){
    	if(id == (int)item.get("id")){
    		target = item;
    		break;
    	}
    }
%>