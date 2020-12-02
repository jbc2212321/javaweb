<%--
  Created by IntelliJ IDEA.
  User: 78240
  Date: 2020/11/25
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
</head>
<body>
<div id="app">
    <el-form label-width="100px" class="demo-ruleForm">
        <el-form-item label="场馆名称" prop="name">
            <el-input v-model="cgName"></el-input>
        </el-form-item>

        <el-form-item label="联系电话" prop="name">
            <el-input v-model="phone"></el-input>
        </el-form-item>

        <el-form-item label="联系人" prop="name">
            <el-input v-model="userName"></el-input>
        </el-form-item>

        <el-form-item label="所在地区" prop="region">
            <el-select v-model="address" placeholder="请选择活动区域">
                <el-option label="湖南省/长沙市/岳麓区" value="yuelu"></el-option>
                <el-option label="湖南省/长沙市/天心区" value="tianxing"></el-option>
                <el-option label="湖南省/长沙市/雨花区" value="yuhua"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="详细地址" prop="desc">
            <el-input type="textarea" v-model="descAddress"></el-input>
        </el-form-item>

        <el-form-item label="场馆简介" prop="desc">
            <el-input type="textarea" v-model="desc"></el-input>
        </el-form-item>
        <el-form-item>
            <a href="changguanlist.jsp"><el-button type="primary" @click="submitForm">立即创建</el-button></a>
            <el-button @click="resetForm">重置</el-button>
        </el-form-item>
    </el-form>
</div>
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/axios/0.21.0/axios.js"></script>
<script src="https://cdn.bootcss.com/qs/6.7.0/qs.min.js"></script>
<script>
    var app =new  Vue({
        el:"#app",
        data:{
            count:1,
            cgName: '',
            phone: '',
            userName: '',
            address: '',
            descAddress: '',
            desc: '',
        },
        methods: {
            submitForm:function () {
                var qs = Qs
                // 配置post的请求头
                axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded'
                axios.post('http://localhost:8080/s3/edit',qs.stringify({
                    count:this.count,
                    cgName: this.cgName,
                    phone: this.phone,
                    userName: this.userName,
                    address: this.address,
                    descAddress: this.descAddress,
                })).then(res=>{
                    console.log(res.data)
                })
            }
        }
    })
</script>
</body>
</html>
