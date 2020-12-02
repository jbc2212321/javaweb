<%@ page import="com.alibaba.fastjson.JSONArray" %><%--
  Created by IntelliJ IDEA.
  User: 78240
  Date: 2020/11/23
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello Jsp</h1>
<div id="app">
    <p>{{msg}}</p>
    <button @click="">点</button>
    <User name="form1">
        <input type="hidden" name="hide" v-model="msg">
    </User>
    <% String jsonArray = request.getParameter("hide");
        out.print("-------------");
        out.print(jsonArray);
    %>
</div>

<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/axios/0.21.0/axios.js"></script>
<script>
    var app=new Vue({
        el:"#app",
        data:{
            msg:"尝试一下中文"
        },
        mounted(){
            axios({
                method:"get",
                url:"http://localhost:8080/s1/util"
            }).then(res=>{
                this.msg=res.data
                console.log(res)
            })
            var frm = document.getElementById( "form1" ); // 获取表单
            frm.submit(); // 对表单进行提交
        },
        methods:{
            an:function () {
                axios.get({
                    url:"/s1/util"
                }).then(res=>{
                    this.msg=res.data
                    console.log(res)
                    console.log("??????")
                })
            }
        }
    })
</script>
</body>
</html>
