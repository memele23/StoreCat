<%-- 
    Document   : header-mid-area
    Created on : Mar 3, 2024, 11:29:16 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="header-mid-area ptb-40">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-5 col-12">
                <div class="header-search">
                    <form action="HomeServlet?search=search" method="GET">
                        
                        <input type="text" placeholder="Search entire store here..." name="keyword" />
                        <a href="#" onclick="return this.closest('form').submit()"><i class="fa fa-search"></i></a>
                    </form>
                </div>
            </div>
            <div class="col-lg-6 col-md-4 col-12">
                <div class="logo-area text-center logo-xs-mrg">
                    <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/img/logo.png" alt="logo" style="width: 70%; height:100%;" /></a>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-12">
                <div class="my-cart text-right">
                    <ul>
                        <li>
                            <a href="#" style="display: flex; align-items: center;">
                                <span style="margin-right: 5px;">2</span>
                                <img src="${pageContext.request.contextPath}/img/cart.png" alt="cart" style="width: 25%; height: auto; margin-right: 5px;" />
                                <span>My Cart</span>
                            </a>

                            <div class="mini-cart-sub">
                                <div class="cart-product">
                                    <div class="single-cart">
                                        <a href="#"><img src="${pageContext.request.contextPath}/img/product/1.jpg" alt="book" /></a>
                                    </div>
                                    <div class="cart-info">
                                        <h5><a href="#">Joust Duffle Bag</a></h5>
                                        <p>1 x £60.00</p>
                                    </div>
                                    <div class="cart-icon">
                                        <a href="#"><i class="fa fa-remove"></i></a>
                                    </div>
                                </div>
                                <div class="single-cart">
                                    <div class="cart-img">
                                        <a href="#"><img src="${pageContext.request.contextPath}/img/product/3.jpg" alt="book" /></a>
                                    </div>
                                    <div class="cart-info">
                                        <h5><a href="#">Chaz Kangeroo Hoodie</a></h5>
                                        <p>1 x £52.00</p>
                                    </div>
                                    <div class="cart-icon">
                                        <a href="#"><i class="fa fa-remove"></i></a>
                                    </div>
                                </div>

                                <div class="cart-totals">
                                    <h5>Total <span>£12.00</span></h5>
                                </div>
                                <div class="cart-bottom">
                                    <a class="view-cart" href="cart.html">view cart</a>
                                    <a href="checkout.html">Check out</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
