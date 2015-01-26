<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>exam</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/login.css">
<body>
	<div class="pg-container narrow-footer ">
		<div class="pg-container-content">

			<div id="pg-login">
				<div class="container_12">
					<div class="content clearfix">
						<div class="right-con">
							<div class="loginbox ui-box-white-bg">
								<form class="ui-form" method="post" action="login" id="login">
									<fieldset>
										<legend>登录</legend>
										<div class="top-msg mb10">
											<label class="error" id="allError"></label>
										</div>
										<div class="ui-form-item">
											<label class="ui-label">手机号/邮箱</label> <input
												class="ui-input input-icon input-bg-gray" name="username"
												id="j_username" type="text"> <span
												class="icon input-icon-head-gray"></span>
										</div>
										<div class="ui-form-item">
											<label class="ui-label">密码</label> <input
												class="ui-input input-icon input-bg-gray" id="J_pass_input"
												name="j_password" type="password"> <span
												class="icon input-icon-lock-gray"></span>
										</div>

										<div class="ui-form-item">
											<span style="background-position: 0px -33px;"
												class="ui-select"><input name="rememberme"
												id="rememberme" checked="checked" type="checkbox"></span> <label
												for="rememberme">记住用户名</label> <a class="findpsw" href="#">忘记密码</a>
										</div>
										<div class="ui-form-item text-center">
											<p class="bottom-msg mb10"></p>
											<input class="ui-button-rrd-blue ui-button-rrd-blue-large"
												value="立即登录" type="submit">
										</div>
										<div class="ui-form-item text-center">
											<p class="go-reg">
												没有账号？ <a href="#">免费注册</a>
											</p>
										</div>
									</fieldset>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>