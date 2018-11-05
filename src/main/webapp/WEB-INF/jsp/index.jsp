<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html style="width: 100%;height: 100%" >
<head>
<meta charset="utf-8">

    <link rel="stylesheet" type="text/css" href="<%=basePath%>js/jquery-easyui-1.5.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>js/jquery-easyui-1.5.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>js/jquery-easyui-1.5.1/demo/demo.css">
    <link rel="stylesheet" href="<%=basePath%>css/base.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/jquery.dialog.css" />
    <link rel="stylesheet" href="<%=basePath%>css/index.css" />

<style type="text/css">
    .fitem {
        margin-bottom: 5px;
    }

    .fitem label {
        display: inline-block;
        width: 70px;
    }
    .item-one {
        width: 300px;
        padding-left: 10px;
    }
</style>
<title>客户管理系统</title>
    <script type="text/javascript">
        function fn_loginOut() {
            document.forms[0].submit();
        }

        
        
    </script>
</head>

<body>
<div id="container">

	<div id="hd">
    	<div class="hd-wrap ue-clear">
        	<div class="top-light"></div>
            <h1 class="logo"></h1>
            <div class="login-info ue-clear">
                <div class="welcome ue-clear" ><span >欢迎您,${member.mname }</span><a href="#" style="color: white" id="userName"></a></div>

            </div>
            <div class="toolbar ue-clear">
                <!-- <a class="changePsd" style="padding-right: 10px;font-size: 15px;cursor: pointer;color: white;">修改密码</a> -->
                <a href="<%=basePath%>user/index" class="home-btn">首页</a>
                 <a href="<%=basePath%>user/loginOut"  class="quit-btn exit"></a>
            </div>
        </div>
    </div>
    <div id="bd">
    	<div class="wrap ue-clear">
        	<div class="sidebar">
            	<h2 class="sidebar-header"><p>菜单栏</p></h2>
                <ul class="nav">
                  <%--  <li class="konwledge"><div class="nav-header"><a href="../javascript:;" class="ue-clear"><span>客户管理</span><i class="icon"></i></a></div></li>--%>
                </ul>
            </div>
            <div class="content">
                <iframe  href="#" name="iframe" id="iframe" width="100%" height="100%" frameborder="0"></iframe>
               <%-- <div class="login-info ue-clear">
                    <div class="welcome ue-clear"style="color: black">
                        <span>${user.userName}</span>
                    </div>
                </div>--%>
            </div>
        </div>
    </div>

    <div id="ft" class="ue-clear">
    	<div class="ft-left">
            <span>东方公司</span>
            <em>Officn&nbsp;System&nbsp;east&nbsp;MMMM</em>
        </div>
        <div class="ft-right">
            <span>Automation</span>
            <em>V2.0&nbsp;2018&nbsp;03&nbsp;21</em>6
        </div>
    </div>
</div>
<div class="exitDialogs">
	<div class="dialog-contents">
    	<%-- <div class="ui-dialog-icons"></div>
        <div class="ui-dialog-texts">
        	<p class="dialog-contents">你确定要退出系统？</p>
            <p class="tips">如果是请点击“确定”，否则点“取消”</p>
            
            <div class="buttons">
                <div style="margin-bottom: 5px;margin-top: -15px;margin-right:10px;margin-left:-10px;float: left">


                <form action="/loginOut" method="get">

                </form>
                    <input type="button"  class="button long2 ok" value="确定" />
                </div>
                <div style="margin-bottom: 5px;margin-top: -15px;float: left">


                <input type="button" class="button long2 normal" value="取消" />
                </div> --%>
            </div>
        </div>
        
    </div>
</div>
</body>
<script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>js/common.js"></script>
<script type="text/javascript" src="<%=basePath%>js/core.js"></script>
<%--<script type="text/javascript" src="../../js/jquery-easyui-1.5.1/jquery.min.js"></script>--%>
<script type="text/javascript" src="<%=basePath%>js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.dialogs.js"></script>
<script type="text/javascript" src="<%=basePath%>js/index.js"></script>
<script type="text/javascript" src="<%=basePath%>js/tools.js"></script>
<script type="text/javascript" >
    var b=false;
    window.onload=function () {
    
    
    
    
        var type1 = "<li class=\"office current\"><div class=\"nav-header\"><a id=\"index\" href=\"#\" target=\"iframe\"  class=\"ue-clear\"><span>首页</span></a> </div> </li>",
            type2 = "<li class=\"gongwen\"><div class=\"nav-header\"><a id=\"index1\" href=\"/eastCMS1_1/member/index\" target=\"iframe\" class=\"ue-clear\"><span>员工管理</span></a></div></li>",
            type3 = "<li class=\"nav-info\"><div class=\"nav-header\"><a id=\"index3\"  href=\"/eastCMS1_1/customerController/customer\" target=\"iframe\" class=\"ue-clear\"><span>客户管理</span></a></div></li>",
            type4 = "<li style='display: none;' class=\"konwledge\"><div class=\"nav-header\"><a href=\"/eastCMS1_1/user/changePsd\" target=\"iframe\" class=\"ue-clear\"><span>密码修改</span></a></div></li>",
           // type5 = "<li class=\"agency\"><div class=\"nav-header\"><a href=\"/pages/Customer-allot\" target=\"iframe\" class=\"ue-clear\"><span>移交客户</span></a></div></li>",
            type6 = "<li class=\"konwledge\"><div class=\"nav-header\"><a href=\"/eastCMS1_1/pages/Customer-knockdown\" target=\"iframe\" class=\"ue-clear\"><span>成交客户</span></a></div></li>",
            type7 = "<li class=\"email\"><div class=\"nav-header\"><a href=\"/eastCMS1_1/pages/department\" target=\"iframe\" class=\"ue-clear\"><span>部门管理</span></a></div></li>";

        var classes=$(".nav");
        $.ajax({
            url:'/eastCMS1_1/user/getRole',
            type:'POST',
            dataType:'json',
            success:function(data) {
                //管理员
                console.log(data);
                if(data.date.id==1){
                  classes.append(type1);
                  classes.append(type2);
                  classes.append(type3);
                  classes.append(type4);
                 // classes.append(type5);
                  /* classes.append(type6); */
                  classes.append(type7);
                    var a = document.getElementById("index");
                    a.href="/eastCMS1_1/pages/main";
                    a.click("return false");
                    $("#index").href="#";
                }
                //主管
                if(data.date.id==2){
                    classes.append(type1);
                    classes.append(type2);
                    classes.append(type3);
                   // classes.append(type5);
                    /* classes.append(type6); */
                    var a = document.getElementById("index");
                    a.href="/eastCMS1_1/pages/main";
                    a.click("return false");
                    $("#index1").href="#";
                }
                //业务员
                if(data.date.id==3){
                    classes.append(type1);
                    classes.append(type3);
                   /*  classes.append(type6); */
                    var a = document.getElementById("index");
                    a.href="/eastCMS1_1/pages/main";
                    a.click("return false");
                    $("#index3").href="#";
                }
        }
        });
        $.ajax({
            url:'/eastCMS1_1/user/get',
            dataType:'json',
            success:function (data) {
                $("#userName").html(data.date.mname)
            }
        });
        //密码修改
        $(".changePsd").click(function () {
	        console.dir("---1001---",$('#dg'));
	        var row = $('#dg').datagrid('getSelections');
						if (row.length == 1) {
							createwindow("密码修改", "/eastCMS1_1/user/changePsd"+row[0].mid,300,200);
						} else if (row.length > 1) {
							alert("不支持多选，请选中一个用户");
						} else {
							alert("请选中用户");
						}
					});
    }
</script>
</html>
