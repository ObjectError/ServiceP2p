<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="">
	    <meta name="author" content="">
	    <!-- Le styles -->
	    <script type="text/javascript" src="/ServiceP2p/ntps/assets/js/jquery.js"></script>
	    <link rel="stylesheet" href="/ServiceP2p/ntps/assets/css/style.css">
	    <link rel="stylesheet" href="/ServiceP2p/ntps/assets/css/loader-style.css">
	    <link rel="stylesheet" href="/ServiceP2p/ntps/assets/css/bootstrap.css">
	    <link rel="stylesheet" href="/ServiceP2p/ntps/assets/css/profile.css">
	
	    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
	    <!--[if lt IE 9]>
	        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	        <![endif]-->
	    <!-- Fav and touch icons -->
	    <link rel="shortcut icon" href="/ServiceP2p/ntps/assets/ico/minus.png">
	</head>
	
	<body> 
    <!-- Preloader -->
    <div id="preloader">
        <div id="status">&nbsp;</div>
    </div>
    <!-- TOP NAVBAR -->
    <nav role="navigation" class="navbar navbar-static-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button data-target="#bs-example-navbar-collapse-1" data-toggle="collapse" class="navbar-toggle" type="button">
                    <span class="entypo-menu"></span>
                </button>
                <button class="navbar-toggle toggle-menu-mobile toggle-left" type="button">
                    <span class="entypo-list-add"></span>
                </button>

                <div id="logo-mobile" class="visible-xs">
                   <h1>WEB管理<span>v1.2</span></h1>
                </div>

            </div>


            <!-- Collect the nav links, forms, and other content for toggling -->
            <div id="bs-example-navbar-collapse-1" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <ul style="margin: 11px 0 0 9px;" role="menu" class="dropdown-menu dropdown-wrap">
                        </ul>
                    </li>
                    <li><a><i data-toggle="tooltip" data-placement="bottom" title="Help" style="font-size:20px;" class="icon-help tooltitle"></i></a>
                    </li>

                </ul>
                <div >    
                  
                </div>

                <ul style="margin-right:0;" class="nav navbar-nav navbar-right">
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <img alt="" class="admin-pic img-circle" src="/ServiceP2p/ntps/assets/img/307327_205.jpg">欢迎你，admin <b class="caret"></b>
                        </a>
                        <ul style="margin-top:14px;" role="menu" class="dropdown-setting dropdown-menu">
                            <li>
                                <a href="/ServiceP2p/ntps/profile.jsp">
                                    <span class="entypo-user"></span>&#160;&#160;个人信息</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="/ServiceP2p/ntps/login.jsp">
                                    <span class="entypo-picasa"></span>&#160;&#160; 登入</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="fontawesome-magic"></span>&#160;&#160;主题更改</a>
                        <ul role="menu" class="dropdown-setting dropdown-menu">

                            <li class="theme-bg">
                                <div id="button-bg"></div>
                                <div id="button-bg2"></div>
                                <div id="button-bg3"></div>
                                <div id="button-bg5"></div>
                                <div id="button-bg6"></div>
                                <div id="button-bg7"></div>
                                <div id="button-bg8"></div>
                                <div id="button-bg9"></div>
                                <div id="button-bg10"></div>
                                <div id="button-bg11"></div>
                                <div id="button-bg12"></div>
                                <div id="button-bg13"></div>
                            </li>
                        </ul>
                    </li>
                    <li class="hidden-xs">
                        <a class="toggle-left" href="#">
                            <span style="font-size:20px;" class="entypo-list-add"></span>
                        </a>
                    </li>
                </ul>

            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- /END OF TOP NAVBAR -->

    <!-- SIDE MENU -->
    <div id="skin-select">
        <div id="logo">
         <h1>CloudSoft<span>v1.2</span></h1>
        </div>

        <a id="toggle">
            <span class="entypo-menu"></span>
        </a>
        <div class="dark">
            <form action="#">
                <span>
                    <input type="text" name="search" value="" class="search rounded id_search" placeholder="Search Menu..." autofocus="">
                </span>
            </form>
        </div>

        <div class="search-hover">
            <form id="demo-2">
                <input type="search" placeholder="Search Menu..." class="id_search">
            </form>
        </div>




        <div class="skin-part">
            <div id="tree-wrap">
                <div class="side-bar">
                 

                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="design-kit"></span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip ajax-load" href="/ServiceP2p/ntps/index.jsp" title="Dashboard">
                                <i class="icon-window"></i>
                                <span>首页</span>

                            </a>
                        </li>

                       <li>
                            <a class="tooltip-tip" href="#" title="Tables">
                                <i class="icon-view-thumb"></i>
                                <span>表单</span>
                            </a>
                            <ul>
                                
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/bank/list" title="Table Dynamic"><i class="entypo-menu"></i><span>银行卡表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/user/list" title="Table Dynamic"><i class="entypo-menu"></i><span>用户表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/income/list" title="Table Dynamic"><i class="entypo-menu"></i><span>收益表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/cash/list" title="Table Dynamic"><i class="entypo-menu"></i><span>提现表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/detail/list" title="Table Dynamic"><i class="entypo-menu"></i><span>账单明细表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/initiativeTender/list" title="Table Dynamic"><i class="entypo-menu"></i><span>主动投标表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/transfer/list" title="Table Dynamic"><i class="entypo-menu"></i><span>转账表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/repayment/list" title="Table Dynamic"><i class="entypo-menu"></i><span>自动还款表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/loans/list" title="Table Dynamic"><i class="entypo-menu"></i><span>放款表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/userBindCard/list" title="Table Dynamic"><i class="entypo-menu"></i><span>用户绑卡表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/admin/list" title="Table Dynamic"><i class="entypo-menu"></i><span>管理员表</span></a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a class="tooltip-tip" href="#" title="Extra Pages">
                                <i class="icon-document-new"></i>
                                <span>其它的页面</span>
                            </a>
                            <ul>
                                 <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/ntps/profile.jsp" title="Profile Page"><i class="icon-user"></i><span>资料页面</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2" href="/ServiceP2p/ntps/404/404.jsp" title="404 Error Page"><i class="icon-thumbs-down"></i><span>404 错误页面</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2" href="/ServiceP2p/ntps/404/500.jsp" title="500 Error Page"><i class="icon-thumbs-down"></i><span>500 错误页面</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2" href="/ServiceP2p/ntps/404/lock-screen.jsp" title="Lock Screen"><i class="icon-lock"></i><span>锁屏</span></a>
                                </li>
                            </ul>
                        </li>


                    </ul>

                    <ul id="menu-showhide" class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="component"></span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>


                        <li>
                            <a class="tooltip-tip" href="#" title="UI Element">
                                <i class="icon-monitor"></i>
                                <span>界面元素</span>
                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/ntps/element/element.jsp" title="Element"><i class="icon-attachment"></i><span>元素</span></a>
                                </li>
                                <li><a class="tooltip-tip2 ajax-load" href="/ServiceP2p/ntps/element/button.jsp" title="Button"><i class="icon-view-list-large"></i><span>按钮</span> <div class="noft-blue-number">10</div></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/ntps/element/calendar.jsp" title="Calender"><i class="icon-calendar"></i><span>日历</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/ntps/element/tree.jsp" title="Tree View"><i class="icon-view-list"></i><span>树视图</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/ntps/element/grids.jsp" title="Grids"><i class="icon-menu"></i><span>网格</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="/ServiceP2p/ntps/element/chart.jsp" title="Chart"><i class="icon-graph-pie"></i><span>图表</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip ajax-load" href="/ServiceP2p/ntps/element/typhography.jsp" title="Typhoghrapy">
                                        <i class="icon-information"></i>
                                        <span>字体</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                         <li>
                            <a class="tooltip-tip ajax-load" href="/ServiceP2p/ntps/icon.jsp" title="Icons">
                                <i class="icon-preview"></i>
                                <span>图标</span>
                                <div class="noft-blue" style="display: inline-block; float: none;">289</div>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- END OF SIDE MENU -->



    <!--  PAPER WRAP -->
    <div class="wrap-fluid">
        <div class="container-fluid paper-wrap bevel tlbr">

            <!-- CONTENT -->
            <!--TITLE -->
            <div class="row">
                <div id="paper-top">
                    <div class="col-sm-3">
                        <h2 class="tittle-content-header">
                            <i class="icon-media-record"></i> 
                            <span>个人中心</span>
                        </h2>

                    </div>

                    <div class="col-sm-7">
                        <div class="devider-vertical visible-lg"></div>
                        <div class="tittle-middle-header">

                            <div class="alert">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                <span class="tittle-alert entypo-info-circled"></span>
                                Welcome back,&nbsp;
                                <strong>Dave mattew!</strong>&nbsp;&nbsp;Your last sig in at Yesterday, 16:54 PM
                            </div>


                        </div>

                    </div>
                    <div class="col-sm-2">
                        <div class="devider-vertical visible-lg"></div>
                    </div>
                </div>
            </div>
            <!--/ TITLE -->

            <!-- BREADCRUMB -->
            <ul id="breadcrumb">
                <li>
                    <span class="entypo-home"></span>
                </li>
                <li><i class="fa fa-lg fa-angle-right"></i>
                </li>
                <li><a href="#" title="Sample page 1">个人中心</a>
                </li>

                <li class="pull-right">
                    <div class="input-group input-widget">

                        <input style="border-radius:15px" type="text" placeholder="Search..." class="form-control">
                    </div>
                </li>
            </ul>

            <!-- END OF BREADCRUMB -->

            <div class="content-wrap">
                <!-- PROFILE -->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="well profile">
                            <div class="col-sm-12">
                                <div class="col-xs-12 col-sm-4 text-center">

                                    <ul class="list-group">
                                        <li class="list-group-item text-left">
                                            <span class="entypo-user"></span>&nbsp;&nbsp; 详细信息</li>
                                        <li class="list-group-item text-center">
                                            <img src="assets/img/307327_205.jpg" alt="" class="img-circle img-responsive img-profile">

                                        </li>
                                        <li class="list-group-item text-center">
                                            <span class="pull-left">
                                                <strong>评分</strong>
                                            </span>


                                            <div class="ratings">

                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star-o"></span>
                                                </a>

                                            </div>


                                        </li>

                                        <li class="list-group-item text-right">
                                            <span class="pull-left">
                                                <strong>加入时间</strong>
                                            </span>2.13.2014</li>
                                        <li class="list-group-item text-right">
                                            <span class="pull-left">
                                                <strong>最后一次登录</strong>
                                            </span>Yesterday</li>
                                        <li class="list-group-item text-right">
                                            <span class="pull-left">
                                                <strong>昵称</strong>
                                            </span>themesmile</li>

                                    </ul>

                                </div>
                                <div class="col-xs-12 col-sm-8 profile-name">
                                    <h2>勇峰峰
                                        <span class="pull-right social-profile">
                                            <i class="entypo-facebook-circled"></i>  <i class="entypo-twitter-circled"></i>  <i class="entypo-linkedin-circled"></i>  <i class="entypo-github-circled"></i>  <i class="entypo-gplus-circled"></i>
                                        </span>
                                    </h2>
                                    <hr>

                                    <dl class="dl-horizontal-profile">
                                        <dt>Id</dt>
                                        <dd>eko.sulis</dd>

                                        <dt>姓名</dt>
                                        <dd>Eko Sulistyo</dd>

                                        <dt>邮箱</dt>
                                        <dd>eko.sulistyo@yahoo.com</dd>

                                        <dt>电话</dt>
                                        <dd>081 725 xxx</dd>

                                        <dt>注册时间</dt>
                                        <dd>02 Dec 2014</dd>

                                        <dt>最后一次登录时间</dt>
                                        <dd>02 Apr 2014</dd>

                                        <dt>关闭</dt>
                                        <dd>Web Designer / UI</dd>

                                        <dt>爱好</dt>
                                        <dd>Read, out with friends, listen to music, draw and learn new things</dd>

                                        <dt>特长</dt>
                                        <dd>
                                            <span class="tags">html5</span>
                                            <span class="tags">css3</span>
                                            <span class="tags">jquery</span>
                                            <span class="tags">bootstrap3</span>
                                        </dd>

                                    </dl>


                                    <hr>

                                    <h5>
                                        <span class="entypo-arrows-ccw"></span>&nbsp;&nbsp;近期活动</h5>

                                    <div class="table-responsive">
                                        <table class="table table-hover table-striped table-condensed">

                                            <tbody>
                                                <tr>
                                                    <td><i class="pull-right fa fa-edit"></i> Today, 1:00 - Jeff Manzi liked your post.</td>
                                                </tr>
                                                <tr>
                                                    <td><i class="pull-right fa fa-edit"></i> Today, 12:23 - Mark Friendo liked and shared your post.</td>
                                                </tr>
                                                <tr>
                                                    <td><i class="pull-right fa fa-edit"></i> Today, 12:20 - You posted a new blog entry title "Why social media is".</td>
                                                </tr>
                                                <tr>
                                                    <td><i class="pull-right fa fa-edit"></i> Yesterday - Karen P. liked your post.</td>
                                                </tr>
                                                <tr>
                                                    <td><i class="pull-right fa fa-edit"></i> 2 Days Ago - Philip W. liked your post.</td>
                                                </tr>
                                                <tr>
                                                    <td><i class="pull-right fa fa-edit"></i> 2 Days Ago - Jeff Manzi liked your post.</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>

                                </div>

                            </div>
                            <div class="col-xs-12 divider text-center">
                                <div class="col-xs-12 col-sm-4 emphasis">
                                    <h2>
                                        <strong>20,7K</strong>
                                    </h2>
                                    <p>
                                        <small>关注</small>
                                    </p>
                                    <button class="btn btn-success btn-block">
                                        <span class="fa fa-plus-circle"></span>&nbsp;&nbsp;关注他</button>
                                </div>
                                <div class="col-xs-12 col-sm-4 emphasis">
                                    <h2>
                                        <strong>245</strong>
                                    </h2>
                                    <p>
                                        <small>关注者</small>
                                    </p>
                                    <button class="btn btn-info btn-block">
                                        <span class="fa fa-user"></span>&nbsp;&nbsp;查看资料</button>
                                </div>
                                <div class="col-sm-4 emphasis">
                                    <h2>
                                        <strong>43</strong>
                                    </h2>
                                    <p>
                                        <small>喜欢</small>
                                    </p>
                                    <button class="btn btn-default btn-block">
                                        <span class="fa fa-user"></span>&nbsp;&nbsp;喜欢</button>
                                </div>
                            </div>
                        </div>
                    </div>




                    <div class="row">


                        <div class="col-sm-12">
                            <!-- BLANK PAGE-->

                            <div style="margin:-20px 15px;" class="nest" id="Blank_PageClose">
                                <div class="title-alt">
                                    <h6>
                                        编辑个人资料</h6>
                                    <div class="titleClose">
                                        <a class="gone" href="#Blank_PageClose">
                                            <span class="entypo-cancel"></span>
                                        </a>
                                    </div>
                                    <div class="titleToggle">
                                        <a class="nav-toggle-alt" href="#Blank_Page_Content">
                                            <span class="entypo-up-open"></span>
                                        </a>
                                    </div>

                                </div>

                                <div class="body-nest" id="Blank_Page_Content">
                                    <div class="row">

                                        <!-- left column -->
                                        <div class="col-md-3">
                                            <div class="text-center">
                                                <img src="http://placehold.it/150" class="avatar img-circle" alt="avatar">
                                                <h6>上传图片</h6>

                                                <div class="input-group">
                                                    <span class="input-group-btn">
                                                        <span class="btn btn-primary btn-file">
                                                            浏览
                                                            <input type="file" multiple="">
                                                        </span>
                                                    </span>
                                                    <input type="text" class="form-control">
                                                </div>

                                            </div>
                                        </div>

                                        <!-- edit form column -->
                                        <div class="col-md-9 personal-info">
                                            <div class="alert alert-info alert-dismissable">
                                                <a class="panel-close close" data-dismiss="alert">×</a> 
                                                <i class="fa fa-coffee"></i>
												这是一个
                                                <strong>警报</strong>.使用此来向用户显示重要消息。
                                            </div>
                                            <h3>个人信息</h3>

                                            <form class="form-horizontal" role="form">
                                                <div class="form-group">
                                                    <label class="col-lg-3 control-label">名:</label>
                                                    <div class="col-lg-8">
                                                        <input class="form-control" value="Jane" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-3 control-label">姓:</label>
                                                    <div class="col-lg-8">
                                                        <input class="form-control" value="Bishop" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-3 control-label">公司:</label>
                                                    <div class="col-lg-8">
                                                        <input class="form-control" value="" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-3 control-label">邮箱:</label>
                                                    <div class="col-lg-8">
                                                        <input class="form-control" value="janesemail@gmail.com" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-3 control-label">时区:</label>
                                                    <div class="col-lg-8">
                                                        <div class="ui-select">
                                                            <select id="user_time_zone" class="form-control">
                                                                <option value="Hawaii">(GMT-10:00) Hawaii
                                                                <option value="Alaska">(GMT-09:00) Alaska
                                                                <option value="Pacific Time (US &amp; Canada)">(GMT-08:00) Pacific Time (US &amp; Canada)
                                                                <option value="Arizona">(GMT-07:00) Arizona
                                                                <option value="Mountain Time (US &amp; Canada)">(GMT-07:00) Mountain Time (US &amp; Canada)
                                                                <option value="Central Time (US &amp; Canada)" selected="selected">(GMT-06:00) Central Time (US &amp; Canada)
                                                                <option value="Eastern Time (US &amp; Canada)">(GMT-05:00) Eastern Time (US &amp; Canada)
                                                                <option value="Indiana (East)">(GMT-05:00) Indiana (East)
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-md-3 control-label">用户名:</label>
                                                    <div class="col-md-8">
                                                        <input class="form-control" value="janeuser" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-md-3 control-label">密码:</label>
                                                    <div class="col-md-8">
                                                        <input class="form-control" value="11111122333" type="password">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-md-3 control-label">确认密码:</label>
                                                    <div class="col-md-8">
                                                        <input class="form-control" value="11111122333" type="password">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-md-3 control-label"></label>
                                                    <div class="col-md-8">
                                                        <input class="btn btn-primary" value="确定" type="button">
                                                        <span></span>
                                                        <input class="btn btn-default" value="取消" type="reset">
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- END OF BLANK PAGE -->

                    </div>
                </div>
                <!-- END OF PROFILE -->


                <!-- /END OF CONTENT -->



                <!-- FOOTER -->
                <div class="footer-space"></div>
                <div id="footer">
                    <div class="devider-footer-left"></div>
                    <div class="time">
                        <p id="spanDate">
                        <p id="clock">
                    </div>
                    <div class="copyright">Make with Love
                        <span class="entypo-heart"></span>Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a> All Rights Reserved</div>
                    <div class="devider-footer"></div>

                </div>
                <!-- / END OF FOOTER -->


            </div>
        </div>
        <!--  END OF PAPER WRAP -->

        <!-- RIGHT SLIDER CONTENT -->
        <div class="sb-slidebar sb-right">
            <div class="right-wrapper">
                <div class="row">
                    <h3>
                        <span><i class="entypo-gauge"></i>&nbsp;&nbsp;MAIN WIDGET</span>
                    </h3>
                    <div class="col-sm-12">

                        <div class="widget-knob">
                            <span class="chart" style="position:relative" data-percent="86">
                                <span class="percent"></span>
                            </span>
                        </div>
                        <div class="widget-def">
                            <b>Distance traveled</b>
                            <br>
                            <i>86% to the check point</i>
                        </div>

                        <div class="widget-knob">
                            <span class="speed-car" style="position:relative" data-percent="60">
                                <span class="percent2"></span>
                            </span>
                        </div>
                        <div class="widget-def">
                            <b>The average speed</b>
                            <br>
                            <i>30KM/h avarage speed</i>
                        </div>


                        <div class="widget-knob">
                            <span class="overall" style="position:relative" data-percent="25">
                                <span class="percent3"></span>
                            </span>
                        </div>
                        <div class="widget-def">
                            <b>Overall result</b>
                            <br>
                            <i>30KM/h avarage Result</i>
                        </div>
                    </div>
                </div>
            </div>

            <div style="margin-top:0;" class="right-wrapper">
                <div class="row">
                    <h3>
                        <span><i class="entypo-chat"></i>&nbsp;&nbsp;CHAT</span>
                    </h3>
                    <div class="col-sm-12">
                        <span class="label label-warning label-chat">Online</span>
                        <ul class="chat">
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/20.jpg">
                                    </span><b>Dave Junior</b>
                                    <br><i>Last seen : 08:00 PM</i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/21.jpg">
                                    </span><b>Kenneth Lucas</b>
                                    <br><i>Last seen : 07:21 PM</i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/22.jpg">
                                    </span><b>Heidi Perez</b>
                                    <br><i>Last seen : 05:43 PM</i>
                                </a>
                            </li>


                        </ul>

                        <span class="label label-chat">Offline</span>
                        <ul class="chat">
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/23.jpg">
                                    </span><b>Dave Junior</b>
                                    <br><i>Last seen : 08:00 PM</i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/women/24.jpg">
                                    </span><b>Kenneth Lucas</b>
                                    <br><i>Last seen : 07:21 PM</i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/25.jpg">
                                    </span><b>Heidi Perez</b>
                                    <br><i>Last seen : 05:43 PM</i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/women/25.jpg">
                                    </span><b>Kenneth Lucas</b>
                                    <br><i>Last seen : 07:21 PM</i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span>
                                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/26.jpg">
                                    </span><b>Heidi Perez</b>
                                    <br><i>Last seen : 05:43 PM</i>
                                </a>
                            </li>


                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- END OF RIGHT SLIDER CONTENT-->


        <!-- MAIN EFFECT -->
        <script type="text/javascript" src="assets/js/preloader.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.js"></script>
        <script type="text/javascript" src="assets/js/app.js"></script>
        <script type="text/javascript" src="assets/js/load.js"></script>
        <script type="text/javascript" src="assets/js/main.js"></script>


		</div>
		
	</body>
</html>