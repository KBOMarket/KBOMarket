<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   <header>
      <div class="header-container">
         <a href="/KBOMarket/"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/skin/front/awesome/img/banner/75490bc770a63d80d0c82184384406fc_38484.png"
            alt="KBO Market Logo" class="main-logo"></a>

         <div class="header-right">
            <div class="user-options">
				<c:if test="${not empty sessionScope.name}">
        			<p>${sessionScope.name}님</p>
        			<a href="/KBOMarket/logout" class="logout">로그아웃</a>
					<c:if test="${sessionScope.name != '관리자'}">
				        <a href="/KBOMarket/order/cartForm" class="mypage">마이페이지</a>
				    </c:if>
   			 	</c:if>
    
			    <c:if test="${empty sessionScope.name}">
			        <a href="/KBOMarket/user/loginForm" class="login">로그인</a>
			        <a href="/KBOMarket/user/loginForm" class="mypage">마이페이지</a>
			    </c:if>
			    <c:if test="${sessionScope.name == '관리자'}">
				        <a href="/KBOMarket/admin/admin" class="mypage">관리자페이지</a>
				</c:if>

            </div>
            <div class="icons">
               <span class="icon-heart" onclick="location.href='/KBOMarket/order/cartForm'" style="cursor: pointer;">&#10084;</span> 
               <span class="icon-cart" onclick="location.href='/KBOMarket/order/cartForm'" style="cursor: pointer;">&#128722;</span>
            </div>
         </div>
      </div>
      <div class="team-logos">
         <a href="#" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/012_cateImg_goods.png"
            alt="TEAMKOREA"></a> <a href="#" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/011_cateImg_goods.png"
            alt="KBO"></a> <a href="/KBOMarket/goods/goodsList?teamId=1" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/006_cateImg_goods.png"
            alt="LG트윈스"></a> <a href="/KBOMarket/goods/goodsList?teamId=2" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/010_cateImg_goods.png"
            alt="KT위즈"></a> <a href="/KBOMarket/goods/goodsList?teamId=3" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/013_cateImg_goods.png"
            alt="SSG랜더스"></a> <a href="/KBOMarket/goods/goodsList?teamId=4" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/003_cateImg_goods.png"
            alt="NC다이노스"></a> <a href="/KBOMarket/goods/goodsList?teamId=5" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/002_cateImg_goods.png"
            alt="두산베어스"></a> <a href="/KBOMarket/goods/goodsList?teamId=6" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/001_cateImg_goods.png"
            alt="KIA타이거즈"></a> <a href="/KBOMarket/goods/goodsList?teamId=7" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/004_cateImg_goods.png"
            alt="롯데자이언츠"></a> <a href="/KBOMarket/goods/goodsList?teamId=8" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/009_cateImg_goods.png"
            alt="삼성라이온즈"></a> <a href="/KBOMarket/goods/goodsList?teamId=9" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/008_cateImg_goods.png"
            alt="한화이글스"></a> <a href="/KBOMarket/goods/goodsList?teamId=10" class="logos"><img
            src="https://cdn-pro-web-250-211.cdn-nhncommerce.com/keienkorea5_godomall_com/data/category/007_cateImg_goods.png"
            alt="키움히어로즈"></a> <input type="text" placeholder="Search"
            class="search-bar">
      </div>
   </header>