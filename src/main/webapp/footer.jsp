<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<link rel="stylesheet" href="main.css" type="text/css" />
<%
	GregorianCalendar currentDate = new GregorianCalendar();
	int currentYear = currentDate.get(Calendar.YEAR);
%>
<p name="copyRight">&copy; Copyright <%= currentYear %> Bui Quoc Thong HCMUTE</p>

</body>
</html>