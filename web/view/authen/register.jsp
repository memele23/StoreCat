<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Sign Up - Cat Shop</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/img/favicon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/meanmenu.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css" integrity="sha512-+L4yy6FRcDGbXJ9mPG8MT/3UCDzwR9gPeyFNMCtInsol++5m3bk2bXWKdZjvybmohrAsn3Ua5x8gfLnbE1YkOg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/chosen.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/responsive.css">
    <script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3.min.js"></script>
    <style>
        body {
            background-color: #f4f7f6;
            font-family: 'Roboto', sans-serif;
        }
        .user-login-area {
            display: flex;
            justify-content: center;
            align-items: center;
            padding-top: 40px;
            padding-bottom: 40px;
        }
        .login-title h2 {
            font-size: 32px;
            color: #333;
            margin-bottom: 10px;
        }
        .login-title p {
            font-size: 16px;
            color: #555;
        }
        .billing-fields {
            background: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .billing-fields .single-register {
            margin-bottom: 20px;
        }
        .billing-fields label {
            font-weight: 600;
            margin-bottom: 10px;
            display: block;
        }
        .billing-fields input[type="text"],
        .billing-fields input[type="password"] {
            width: 100%;
            border: 1px solid #ddd;
            padding: 10px 15px;
            border-radius: 4px;
        }
        .single-register a {
            background-color: #88c9bf;
            color: white;
            padding: 10px 30px;
            border-radius: 20px;
            display: inline-block;
            text-decoration: none;
            margin-top: 10px;
            transition: background-color 0.3s;
        }
        .single-register a:hover {
            background-color: #77b3a9;
        }
    </style>
</head>
<body class="register">
    <header>
        <jsp:include page="../user/common/header-top-area.jsp" />
        <jsp:include page="../user/common/header-mid-area.jsp" />
        <jsp:include page="../user/common/main-menu-area.jsp" />
        <jsp:include page="../user/common/mobile-menu-area.jsp" />
    </header>
    <jsp:include page="../user/common/breadcrumbs-area.jsp" />
    
    <div class="user-login-area mb-70">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="login-title text-center mb-30">
                        <h2>Sign Up</h2>
                        <p>Welcome to Cat Shop</p>
                    </div>
                </div>
                <div class="offset-lg-2 col-lg-8 col-md-12 col-12">
                    <div class="billing-fields">
                        <div class="single-register">
                            <form action="authen?action=sign-up" method="POST" id="signUpForm">
                                <label for="username">Enter name or gmail<span>*</span></label>
                                <input type="text" id="username" placeholder="Username" name="username"/>
                                <br/>
                                <label for="password">Enter Password<span>*</span></label>
                                <input type="password" id="password" placeholder="Password" name="password" />
                                <br/>
                                <span style="color:red">${error}</span>
                                <div class="single-register" style="text-align:center; margin-top: 20px;">
                                    <a href="#" onclick="document.getElementById('signUpForm').submit()">Register</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <jsp:include page="../user/common/footer.jsp" />
    
    <script src="${pageContext.request.contextPath}/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.meanmenu.js"></script>
    <script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.parallax-1.1.3.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.countdown.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.flexslider.js"></script>
    <script src="${pageContext.request.contextPath}/js/chosen.jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.counterup.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/waypoints.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/plugins.js"></script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>
