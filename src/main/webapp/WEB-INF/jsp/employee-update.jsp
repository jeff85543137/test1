<%--
  Created by IntelliJ IDEA.
  User: liujingtao
  Date: 2017/10/18
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html style="height: 100%;width: 100%">
<head>
<title>Title</title>
<link rel="stylesheet" type="text/css"
	href="../../js/jquery-easyui-1.5.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../../js/jquery-easyui-1.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="../../js/jquery-easyui-1.5.1/demo/demo.css">
<script type="text/javascript" src="../../js/jquery.js"></script>
<%--<script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>--%>

<script type="text/javascript"
	src="../../js/jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="../../js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>

</head>
<body>
	<form id="from" action="/eastCMS/member/update" method="post"
		target="hidden_frame">
		<div class="ftitle">员工信息:</div>
		<input id="mid" name="mid" style="display: none;"/>
		<div class="fitem">
			<span class="item-two"> <label>组别:</label> <input id="dname"
				width="50px;" size="20" name="dname" missingMessage="不能为空"
				validType="CHS" data-options="required:true" style="height: 25px;">
			</span>
		</div>
		<div class="fitem">
			<span class="item-one"> <label>权限:</label> <input
				id="redescribe" size="20" name="redescribe" missingMessage="不能为空"
				validType="CHS" data-options="required:true" style="height: 25px;">
			</span> <span class="item-two"> <label>性别:</label> <input
				type="radio" class="msex" id="sex0" name="msex" value="0" checked>男
				<input type="radio" class="msex" id="sex1" name="msex" value="1">女
			</span>
		</div>
		<div class="fitem">
			<span class="item-one"> <label>姓名:</label> <input name="mname"
				id="mname" class="easyui-validatebox textbox" missingMessage="不能为空"
				required="true" style="height: 25px;">
			</span> <span class="item-two"> <label>手机:</label> <input
				name="mphone" id="mphone" class="easyui-validatebox textbox"
				missingMessage="不能为空" validType="mobile" required="true"
				style="height: 25px;">
			</span>
		</div>
		<div class="fitem">
			<span class="item-one"> <label>QQ:</label> <input name="mqq"
				id="mqq" class="easyui-validatebox textbox" validType="qq"
				style="height: 25px;">
			</span>
		</div>
		<div class="fitem">
			<span class="item-one"> <label>微信号:</label> <input
				name="mweixin" id="mweixin" class="easyui-validatebox textbox"
				style="height: 25px;">
			</span>
		</div>
		<div class="fitem"></div>
		<div class="fitem">
			<label class="item-one">身份证:</label> <input name="mcard" size="56"
				id="mcard" class="easyui-validatebox textbox" missingMessage="不能为空"
				validType="idcard" required="true" style="height: 25px;">
		</div>
		<div class="fitem">
			<label class="item-one">住址:</label> <input name="maddress"
				id="maddress" class="easyui-validatebox textbox" size="56"
				style="height: 25px;">
		</div>


	</form>
	<iframe name='hidden_frame' id="hidden_frame" style='display: none'></iframe>
	<script type="text/javascript">
		$.extend($.fn.validatebox.defaults.rules, {
			//验证汉字
			CHS : {
				validator : function(value) {
					return /^[\u0391-\uFFE5]+$/.test(value);
				},
				message : '只能输入汉字'
			},
			idcard : {// 验证身份证
				validator : function(value) {
					return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
				},
				message : '身份证号码格式不正确'
			},
			length : {
				validator : function(value, param) {
					var len = $.trim(value).length;
					return len >= param[0] && len <= param[1];
				},
				message : "输入内容长度必须介于{0}和{1}之间."
			},
			mobile : {// 验证手机号码
				validator : function(value) {
					return /^(13|15|18|17)\d{9}$/i.test(value);
				},
				message : '手机号码格式不正确'
			},
			qq : {// 验证QQ,从10000开始
				validator : function(value) {
					return /^[1-9]\d{4,9}$/i.test(value);
				},
				message : 'QQ号码格式不正确'
			}
		});
		
		
	
		

		var data_url = '/eastCMS/member/getList';
		var rows = $("#dg").datagrid("getSelections");
		console.log(rows);
		var sugx = rows[0].sugx;
		//添加分组的下拉框
		var groupsMap = {};
		$.ajax({
			url : '/eastCMS/department/getAll',
			processData : false,
			dataType : 'json',
			success : function(msg) {
				groupsMap = msg.date;
				groupsMap.forEach(function(value, index, array) {
					if (rows[0].departmentid == value.did) {
						value["selected"] = true;
					}
				});
				//            msg.date[0].selected=true;
				console.log(groupsMap);
				$('#dname').combobox({
					valueField : 'did',
					textField : 'dname',
					data : groupsMap
				});
			}
		});
		var permissionsMap = {};
		$.ajax({
			url : '/eastCMS/role/getAll',
			dataType : 'json',
			processData : false,
			success : function(msg) {
				permissionsMap = msg.date;
				permissionsMap.forEach(function(value, index, array) {
					value["text"] = value["redescribe"];
					if (rows[0].id == value.id) {
						value["selected"] = true;
					}
				});
				console.log(permissionsMap);
				$('#redescribe').combobox({
					valueField : 'id',
					textField : 'redescribe',
					data : permissionsMap
				})
			}
		});
		
		
		$("#mid").val(rows[0].mid);
		$("#dname").val(rows[0].dname);
		$("#redescribe").val(rows[0].redescribe);
		$("#mname").val(rows[0].mname);
		$("#mphone").val(rows[0].mphone);
		$("#mqq").val(rows[0].mqq);
		$("#mcard").val(rows[0].mcard);
		$("#maddress").val(rows[0].maddress);
		$("#mweixin").val(rows[0].mweixin);
		if (rows[0].msex == 0) {
			$('input:radio[name=msex]')[0].checked = true;
		} else {
			$('input:radio[name=msex]')[1].checked = true;
		}

		$('#hidden_frame').load(function() {
			var text = $(this).contents().find("body").text();
			// 根据后台返回值处理结果
			try {
				var j = $.parseJSON(text);
				$.messager.alert('提示', j.msg);
				tbdata(data_url, 1, 30);
			} catch (e) {

			}

		});
	</script>
</body>
</html>
