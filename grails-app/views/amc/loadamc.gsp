<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>Import AMC Data</title>
</head>
<body>
	<div class="col-md-12">
		<g:if test="${flash.message}">
			<div>
				<h2>
					${flash.message}
				</h2>
			</div>
		</g:if>
		<h1>Upload AMC list</h1>
		<g:uploadForm name="amc" action="uploadamc">
			<fieldset>
				<legend>Upload text file(only csv):</legend>
				<input type="file" name="infile" /> <input type="submit" />
			</fieldset>
		</g:uploadForm>
	</div>
</body>
</html>