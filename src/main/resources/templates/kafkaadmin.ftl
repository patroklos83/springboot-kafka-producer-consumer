<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring Boot Kafka Meaasing Admin</title>

<link href="/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.container {
	margin-top: 80px;
}

.bg-dark {
	background-color: #3b8dbd !important;
}
</style>
</head>
<body>
	
	
	<div class="container">
       <h3>Fill the form and click submit...</h3>
        <#if message?? >
         ${message.body}
        </#if>
        <br>
        <form action="/kafka/sentmessage" method="post">
            message:<br>
            <input type="text" name="body">
            <br><br>
            <input type="submit" value="Submit">
        </form>
		<br/>
	</div>
	
	<br/>
		<table class="table">
			<thead>
				<tr>
					<th>message</th>
				</tr>
			</thead>
			<tbody>
			<#if messages??>
				<#list messages as message>
				<tr>
					<td>${message.body}</td>
				</tr>
				</#list>
			</#if>
			</tbody>
		</table>

	

</body>
</html>

