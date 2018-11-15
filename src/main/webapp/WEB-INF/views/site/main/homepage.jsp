<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Cover Template for Bootstrap</title>
<style>
.bg {
	/* The image used */
	background-image:
		url("https://mdbootstrap.com/img/Photos/Horizontal/Nature/full page/img(20).jpg");
	/* Full height */
	height: 450px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

.form-inline my-2 my-lg-0 {
	float: right;
}

.boo {
	/* The image used */
	background-image: url('/resources/image/StockSnap_KSC88QWZBR.jpg');
	/* Half height */
	height: 450px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
} 
</style>

<!-- Bootstrap core CSS -->
<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div style="width: 100%"> 
		<div class="collapse navbar-collapse" id="navbarNav" style="float: left">
			<a class="navbar-brand" href="#">Naruter</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Freelancer</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Client</a></li>
			</ul>
		</div>
  
		<div class="" style="float: right">
			<button class="btn btn-outline-success" type="button" onclick="location.href='/site/all/signin'">Login</button>
			<button class="btn btn-outline-success my-2 my-sm-0" type="button" onclick="location.href='/site/all/signup'">Sign
				up</button>
		</div>
	</div>

</nav>


<body class="text-center">

	<main role="main" class="inner cover">
	<h1 class="cover-heading">Naruter</h1>
	<p class="lead">사이트 소개</p>
	<body>
		<div class="bg">
			<p class="py-5 text-center"></p>
		</div>

	</body>
	<p class="lead">이용방법</p>
	<body>
		<div class="boo"></div>
		<p class="py-5 text-center"></p>
	</body>
	<p class="lead">추천</p>

	<p class="lead">
		<a href="#" class="btn btn-lg btn-secondary">Learn more</a>
	</p>
	</main>

	<footer class="mastfoot mt-auto">
		<div class="inner">
			<p>
				Naruter <a href="https://getbootstrap.com/">Bootstrap</a>, by <a
					href="https://twitter.com/mdo">@mdo</a>.
			</p>
		</div>
	</footer>
	</div>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')
	</script>
	<script src="../../assets/js/vendor/popper.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>
</body>
</html>

