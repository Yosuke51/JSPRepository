<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel='stylesheet' href='../css/styles.css'  type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>顯示當地時間</title>
<script>
window.onload = function () {
    document.getElementById("idsubmit").onclick = submitf;
}

function submitf() {
    
    var eleLen = document.getElementsByName("city").length;
    //alert(eleLen);
    for (var i = 0; i < eleLen; i++) {
        if (document.forms[0].elements[i].checked)
        	 alert("你選取了：" + document.forms[0].elements[i].value +"時區");
    }
}
</script>

</head>
<body>
<h2>顯示當地時間</h2>
請撰寫一個Servlet程式: ShowLocalTime.java，它能夠接受客戶端送來的城市代號，然後算出該城市現在的時間，
同時送回下列訊息給送出請求的瀏覽器：
[某某城市]現在的時間為：2015年7月3日20點17分35秒<br><br>
<small>本作業由Servlet來產生回應</small>
<small>本程式需要判斷使用者沒有挑選任何城市的情況</small>
<HR>
<Form Action="showTime.do" method="POST">
      請挑選城市:<P/> 
      <INPUT TYPE='radio' NAME='city' VALUE='NewYork'> 紐約 <BR>      
      <INPUT TYPE='radio' NAME='city' VALUE='Tokyo'> 東京 <BR>
      <INPUT TYPE='radio' NAME='city' VALUE='Taipei'> 台北 <BR>
      <INPUT TYPE='radio' NAME='city' VALUE='London'> 倫敦 <BR>
      <INPUT TYPE='radio' NAME='city' VALUE='Sydney'> 雪梨 <BR><P/>
      <input type="submit" id="idsubmit" value="提交">
</Form>
<p/>
<small>&lt;&lt;<a href="../index.jsp">回前頁</a>&gt;&gt;</small>
</body>
</html>