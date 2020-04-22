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

	
	
	<br/>
		<table class="table">
			<thead>
				<tr>
					<th>message</th>
				</tr>
			</thead>
			<tbody>
				<#list model["messages"] as message>
				<tr>
					<td>${message.body}</td>
				</tr>
				</#list>
			</tbody>
		</table>

	

</body>
</html>

