<%@ page import="java.util.List" %>
<%@ page import="servlet.Changguan" %><%--
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
<% List<Changguan>changguanList = (List<Changguan>) session.getAttribute("cglist"); %>
<div id="app">

    <el-table
            :data="tableData"
            style="width: 100%">
<%--            <% for (int i = 0; i <changguanList.size() ; i++) { %>--%>


        <el-table-column
                label="编号"
                width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px">
                    <%out.print(changguanList.get(0).getCount());%>
<%--                        {{scope.row.count}}--%>
                </span>
            </template>
        </el-table-column>

        <el-table-column
                label="场馆名称"
                width="180">
            <template slot-scope="scope">
                <el-popover trigger="hover" placement="top">
                    <p>姓名: <%out.print(changguanList.get(0).getCgName());%></p>
                    <div slot="reference" class="name-wrapper">
                        <el-tag size="medium"><%out.print(changguanList.get(0).getCgName());%></el-tag>
                    </div>
                </el-popover>
            </template>
        </el-table-column>

        <el-table-column
                label="联系人"
                width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px"><%out.print(changguanList.get(0).getUserName());%></span>
            </template>
        </el-table-column>

        <el-table-column
                label="联系人电话"
                width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px"><%out.print(changguanList.get(0).getPhone());%></span>
            </template>
        </el-table-column>

        <el-table-column
                label="所在地区"
                width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px"><%out.print(changguanList.get(0).getAddress());%></span>
            </template>
        </el-table-column>

        <el-table-column
                label="详细地址"
                width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px"><%out.print(changguanList.get(0).getDescAddress());%></span>
            </template>
        </el-table-column>
<%--       <%}%>--%>

        <el-table-column label="操作">
            <template slot-scope="scope">
               <a href="editchangguan.jsp"><el-button
                        size="mini"
                        @click="handleEdit(scope.$index, scope.row)">编辑</el-button></a>
                <el-button
                        size="mini"
                        type="danger"
                        @click="handleDelete(scope.$index, scope.row)">删除</el-button>
            </template>
        </el-table-column>
    </el-table>
</div>
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/axios/0.21.0/axios.js"></script>
<script src="https://cdn.bootcss.com/qs/6.7.0/qs.min.js"></script>
<script>
    var app =new Vue({
        el:"#app",
        data:{
            tableData: [{
                count: 0,
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                count: 0,
                name: '王小虎',
                address: '上海市普陀区金沙江路 1517 弄'
            }, {
                count: 0,
                name: '王小虎',
                address: '上海市普陀区金沙江路 1519 弄'
            }, {
                count: 0,
                name: '王小虎',
                address: '上海市普陀区金沙江路 1516 弄'
            },{
                count: 0,
                name: '王小虎',
                address: '上海市普陀区金沙江路 1516 弄'
            }]
        },
        methods:{
            handleEdit(index, row) {
                console.log(index, row);
            },
            handleDelete(index, row) {
                console.log(index, row);
            }
        }
    })
</script>
</body>
</html>
