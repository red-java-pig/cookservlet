<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>AjaxTest</title>
</head>
<body>
<span>所有英雄 :</span>
<input type="button" value="查询" id="sender">

<script>
var xmlhttp;
$('#sender').click(function(){
        var url="listHero";
alert("提交成功，请在Tomcat控制台查看服务端接收到的数据");
        $.get(

                url,
                function(data) {
                     alert("提交成功，请在Tomcat控制台查看服务端接收到的数据");
         });

    });

</script>
</body>
</html>