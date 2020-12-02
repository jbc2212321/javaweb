<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<%--    --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
</head>
<body>
    <div id="app">
    <el-form  label-width="80px">
    <el-form-item>
        <el-input v-model="id" placeholder="course ID"></el-input>
    </el-form-item>
    <el-form-item>
        <el-input v-model="name" placeholder="course name"></el-input>
    </el-form-item>
    <el-form-item>
        <el-select v-model="type" placeholder="CourseType">
        <el-option label="Public course" value="1"></el-option>
        <el-option label="Compulsory course" value="2"></el-option>
        <el-option label="Elective course" value="3"></el-option>
        </el-select>
    </el-form-item>
    <el-form-item label="Semester">
        <el-radio-group v-model="semester">
        <el-radio label="Fall" value="fall"></el-radio>
        <el-radio label="Spring" value="spring"></el-radio>
        </el-radio-group>
    </el-form-item>
    <el-form-item label="活动形式">
        <el-input type="textarea" v-model="desc"></el-input>
    </el-form-item>
    <el-form-item>
        <a href="courselist.jsp"><el-button type="primary" @click="onSubmit">ADD COURSE</el-button></a>
    </el-form-item>
    </el-form>
    </div>
</body>
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/axios/0.21.0/axios.js"></script>
<script src="https://cdn.bootcss.com/qs/6.7.0/qs.min.js"></script>
        <script>
            var Main = {
        data() {
        return {
            id: '',
            name: '',
            type: '',
            semester: '',
            desc:''
        }
        },
        methods: {
        onSubmit() {
            var qs = Qs
            // 配置post的请求头
            axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded'
            console.log('submit!');
            // axios({
            //     method:"get",
            //     url:"http://localhost:8080/s2/add",
            //     data:{
            //         id: this.id,
            //         name: this.name,
            //         type: this.type,
            //         semester: this.semester,
            //         desc:this.desc,
            //     },
            //
            // }).then(res=>{
            //     console.log(res.data)
            // })

            axios.post('http://localhost:8080/s2/add',qs.stringify({
                id: this.id,
                name: this.name,
                type: this.type,
                semester: this.semester,
                desc:this.desc,
            })).then(res=>{
                console.log(res.data)
            })

        }
        }
    }
        var Ctor = Vue.extend(Main)
        new Ctor().$mount('#app')
    </script>
</html>