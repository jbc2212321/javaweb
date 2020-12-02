<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    Course List
    <div id="app">
    <br>
    <a href="addcourse.jsp">Add Course</a>
    <form>
        <table border="1">
            <tr>
                <td width="150px">Course ID</td>
                <td width="100px">Course Name</td>
                <td width="150px">Course Type</td>
                <td width="150px">Course Semester</td>
                <td width="150px">Course Description</td>
            </tr>
            
            <tr>
                <td width="150px">1</td>
                <td width="100px">{{list0["name"]}}</td>
                <td width="150px">{{list0["type"]}}</td>
                <td width="150px">{{list0["semester"]}}</td>
                <td width="150px">{{list0["desc"]}}</td>
            </tr>

            <tr>
                <td width="150px">2</td>
                <td width="100px">{{list1["name"]}}</td>
                <td width="150px">{{list1["type"]}}</td>
                <td width="150px">{{list1["semester"]}}</td>
                <td width="150px">{{list1["desc"]}}</td>
            </tr>

            <tr>
                <td width="150px">3</td>
                <td width="100px">{{list2["name"]}}</td>
                <td width="150px">{{list2["type"]}}</td>
                <td width="150px">{{list2["semester"]}}</td>
                <td width="150px">{{list2["desc"]}}</td>
            </tr>

            <tr>
                <td width="150px">4</td>
                <td width="100px">{{list3["name"]}}</td>
                <td width="150px">{{list3["type"]}}</td>
                <td width="150px">{{list3["semester"]}}</td>
                <td width="150px">{{list3["desc"]}}</td>
            </tr>
        </table>
    </form>
    </div>
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/axios/0.21.0/axios.js"></script>
    <script src="https://cdn.bootcss.com/qs/6.7.0/qs.min.js"></script>
    <script >
        var app=new Vue({
            el:"#app",
            data:{
                msg:"",
                list0:"",
                list1:"",
                list2:"",
                list3:"",
            },
            mounted() {
                axios({
                    method:"get",
                    url:"http://localhost:8080/s2/get"
                }).then(res=>{
                    this.msg=res.data
                    console.log(this.msg.length)
                    switch (this.msg.length) {
                        case 0:
                            break
                        case 1:
                            this.list0=this.msg[0]
                            break
                        case 2:
                            this.list0=this.msg[0]
                            this.list1=this.msg[1]
                            break
                        case 3:
                            this.list0=this.msg[0]
                            this.list1=this.msg[1]
                            this.list2=this.msg[2]
                            break
                        case 4:
                            this.list0=this.msg[0]
                            this.list1=this.msg[1]
                            this.list2=this.msg[2]
                            this.list3=this.msg[3]
                            break
                    }
                    console.log(res.data)
                })
            },
        })
    </script>
</body>
</html>