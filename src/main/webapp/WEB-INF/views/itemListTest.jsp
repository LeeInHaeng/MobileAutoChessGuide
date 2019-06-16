<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Test</title>
</head>
<body>
	
	<button id="ajaxTest">AjaxTest</button>
	<script
	  src="https://code.jquery.com/jquery-1.12.4.min.js"
	  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
	  crossorigin="anonymous"></script>
	<script>
	
	$(function(){
		
		$("#ajaxTest").click( function(){
			
			  $.ajax( {
				contentType: "application/json; charset=UTF-8",
			    url : "${pageContext.servletContext.contextPath }/api/item/itemList",
			    type: "get",
			    dataType: "",
			    success: function( response ){
			    	console.log(response);
			    },
			    error: function( jqXHR, status, error ){
			       console.error( status + " : " + error );
			    }
			  });
		});	
	});
	
	</script>
	
</body>
</html>