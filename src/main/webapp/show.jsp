<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <!--引入jqgrid的主题样式-->
    <link rel="stylesheet" href="jqgrid/css/css/cupertino/jquery-ui-1.8.16.custom.css">
    <!--引入jqgrid的全局css样式-->
    <link rel="stylesheet" href="jqgrid/css/ui.jqgrid.css">
    <!--引入jquery的js文件-->
    <script src="bootstrap/js/jquery-3.3.1.min.js"></script>
    <!--引入bootstrap的js文件-->
    <script src="bootstrap/js/bootstrap.js"></script>
    <!--引入jqgrid国际化的js文件-->
    <script src="jqgrid/js/i18n/grid.locale-cn.js"></script>
    <!--引入jqgrid的全局js样式-->
    <script src="jqgrid/js/jquery.jqGrid.src.js"></script>

    <script type="application/javascript">
        $(function () {
            $("#table").jqGrid({
                styleUI: "Bootstrap",
                url:"${pageContext.request.contextPath}/user/show",
                datatype:"json",
                autowidth:true,
                caption:"兴哥哥真帅！",
                pager:"#page", //开启分页的工具栏
                rowNum:"3",//决定每页展示的条数
                rowList:["3","6","9","12"],//下拉框选择每页展示的条数
                viewrecords:true, //是否展示总记录数
                editurl:"${pageContext.request.contextPath}/user/edit",
                colNames:["id","用户名","密码","电话","邮箱","IP地址","身份","来源","状态","操作"],
                colModel:[
                    {name:"id"},
                    {name:"username",editable:true},
                    {name:"password",editable:true},
                    {name:"iphone",editable:true},
                    {name:"email",editable:true},
                    {name:"ip",editable:true},
                    {name:"position",editable:true},
                    {name:"source",editable:true},
                    {name:"status",editable:true},
                    {name:"option",formatter:function (cellvalue,option,rowObject) {
                            return"<a class='btn btn-primary' onclick=\"del('"+rowObject.id+"')\">删除</a>&nbsp;&nbsp;&nbsp;<a class='btn btn-danger' onclick=\"update('"+rowObject.id+"')\">修改</a>"
                        }
                    }
                ]
            }).jqGrid("navGrid","#page",{edit:true});
        });




        function update(rowid) {
            //获取选中行的rowid
            if (rowid != null)
            //调用修改的方法
                $("#table").jqGrid('editGridRow', rowid, {
                    height : 400,
                    reloadAfterSubmit : true
                });
            else
                alert("请选中一行");
        }

        function del(rowid) {
            //改行的ID
            if (rowid != null)
                $("#table").jqGrid('delGridRow', rowid, {
                    reloadAfterSubmit : true
                });
            else
                alert("请选中一行");
        }

    </script>
</head>
<body>
    <table id="table"></table>
    <div id="page"></div>
</body>
</html>