<%-- 
    Document   : login
    Created on : Mar 12, 2024, 2:43:53 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f7f6;
        }
        .login-container {
            width: 800px;
            display: flex;
            box-shadow: 0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23);
        }
        .login-info {
            width: 50%;
            background-color: #88c9bf;
            color: white;
            padding: 40px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        .login-info h2 {
            margin-bottom: 20px;
        }
        .login-info p {
            font-size: 15px;
            line-height: 1.5;
        }
        .login-form {
            width: 50%;
            padding: 40px;
            display: flex;
            flex-direction: column;
            justify-content: center;
        }
        .login-form h2 {
            margin-bottom: 20px;
            color: #333;
            text-align: center;
        }
        .login-form input {
            margin-bottom: 20px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }
        .login-form button {
            padding: 15px;
            border: none;
            border-radius: 20px;
            background-color: #ccc;
            font-size: 16px;
            color: #333;
            cursor: pointer;
        }
        .login-form button:hover {
            background-color: #b3b3b3;
        }
        .login-form .separator {
            display: flex;
            align-items: center;
            text-align: center;
            margin: 20px 0;
        }
        .login-form .separator::before,
        .login-form .separator::after {
            content: '';
            flex: 1;
            border-bottom: 1px solid #ccc;
        }
        .login-form .separator:not(:empty)::before {
            margin-right: .25em;
        }
        .login-form .separator:not(:empty)::after {
            margin-left: .25em;
        }
        .login-form a {
            color: #007bff;
            text-decoration: none;
        }
        .login-form a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <div class="login-info">
            <img src="${pageContext.request.contextPath}/img/banner/anhlogin.jpg"  style="max-width: 100%; height: auto;">
            <h2>CAT SHOP</h2>
            <p style="font-style: italic; color: green;">One small cat changes coming home to an empty house to coming home.</p>

        </div>
        <div class="login-form">
            <h2>Welcome to Cat Shop</h2>
            <form action="authen?action=login" method="POST">
                 <label>Enter name or gmail<span>*</span></label>
                <input type="text" name="username" placeholder="Username or Email"><br/>
                <label>Enter Password<span>*</span></label>
                <input type="password" name="password" placeholder="Password"><br/>
                <button type="submit">Sign in</button>
                <a href="#">Forgot password?</a>
                <p>Do not have an account? <a href="#">Sign Up</a></p>
            </form>
        </div>
    </div>
</body>
</html>
