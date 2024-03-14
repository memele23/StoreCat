<%-- 
    Document   : header-top-area
    Created on : Mar 3, 2024, 11:28:08 AM
    Author     : PC
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Header Top Area</title>
    <style>
        .btn {
            display: inline-block;
            padding: 8px 15px;
            margin: 5px;
            border-radius: 5px;
            color: white;
            text-decoration: none; /* Removes underline from links */
            transition: background-color 0.3s ease-in-out;
            background-color: #ff9900; /* Cam cho tất cả các nút */
        }

        .btn:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
<div class="header-top-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6 col-12">
                <div class="language-area">
                    <ul>
                        <li>
                            <img src="${pageContext.request.contextPath}/img/flag/1.jpg" alt="flag" />
                            <a href="#">English<i class="fa fa-angle-down"></i></a>
                            <div class="header-sub">
                                <ul>
                                    <li><a href="#"><img src="${pageContext.request.contextPath}/img/flag/2.jpg" alt="flag" />France</a></li>
                                    <li><a href="#"><img src="${pageContext.request.contextPath}/img/flag/3.jpg" alt="flag" />Croatia</a></li>
                                </ul>
                            </div>
                        </li>
                        <li>
                            <a href="#">USD $<i class="fa fa-angle-down"></i></a>
                            <div class="header-sub dolor">
                                <ul>
                                    <li><a href="#">EUR €</a></li>
                                    <li><a href="#">USD $</a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-6 col-md-6 col-12">
                <div class="account-area text-end">
                    <ul>
                        <c:if test="${account !=null}">
                            <li>
                                <a href="my-account.html" class="btn">My Account</a>
                            </li> 
                            <li>
                                <a href="checkout.html" class="btn">Checkout</a>
                            </li>
                        </c:if>

                        <c:if test="${account == null}">
                            <li>
                                <a href="authen?action=login" class="btn">Sign in</a>
                            </li>
                            <li>
                                <a href="authen?action=sign-up" class="btn">Sign up</a>
                            </li>
                        </c:if>
                        <c:if test="${account != null}">
                            <li>
                                <a href="authen?action=log-out" class="btn">Sign Out</a>
                            </li>
                        </c:if>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
