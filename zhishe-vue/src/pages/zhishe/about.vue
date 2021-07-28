<template>
    <div id = "wrapper">
        <div id = "first">

        </div>
        <div id = "second">

        </div>
        <div id = "third">

        </div>
        <div id = "fourth">

        </div>
        <div id = "fifth">
            <div style="color:#3c85cb;margin-top:80px">
                与我们关联
            </div>
            <div id = "us" >

            
            <el-row :gutter="20">
                <el-col :span = "12">
                    <el-card shadow = "hover">
                        <div>
                            <div>
                                <el-avatar style="color:white;
                                background-color:#3c85cb"  icon="el-icon-user"></el-avatar>
                            </div>
                            <div style="color:#3c85cb">
                                加入我们
                            </div>
                            <div>
                               <el-link style="color:#3c85cb" href="https://element.eleme.io" target="_blank">默认链接</el-link>
                            </div>
                        </div>
                    </el-card>
                </el-col>
                <el-col :span = "12">
                    <el-card shadow = "hover">
                        <div>
                            <div>
                                <el-avatar style="color:white;
                                background-color:#3c85cb"  icon="el-icon-user"></el-avatar>
                            </div>
                            <div style="color:#3c85cb">
                                加入我们
                            </div>
                            <div>
                               <el-link style="color:#3c85cb" href="https://element.eleme.io" target="_blank">默认链接</el-link>
                            </div>
                        </div>
                    </el-card>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span = "12">
                    <el-card 
                    style="background: transparent;
                    border:none">
                        <div>
                            <div>
                                <el-avatar style="color:white;
                                background-color:#3c85cb"  icon="el-icon-user"></el-avatar>
                            </div>
                            <div style="color:#3c85cb">
                                加入我们
                            </div>
                            <div>
                               <el-link style="color:#3c85cb" href="https://element.eleme.io" target="_blank">默认链接</el-link>
                            </div>
                        </div>
                    </el-card>
                </el-col>
                <el-col :span = "12">
                    <el-card shadow = "hover">
                        <div>
                            <div>
                                <el-avatar style="color:white;
                                background-color:#3c85cb"  icon="el-icon-user"></el-avatar>
                            </div>
                            <div style="color:#3c85cb">
                                加入我们
                            </div>
                            <div>
                               <el-link style="color:#3c85cb" href="https://element.eleme.io" target="_blank">默认链接</el-link>
                            </div>
                        </div>
                    </el-card>
                </el-col>
            </el-row>
            </div>
        </div>
        <div id = "sixth">

        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>
.el-row {
  margin-bottom: 50px;
}
#wrapper{
    display: grid;
    grid-template-columns: 100%;
    grid-template-rows: 2fr 1fr 2fr 1fr 2fr 1fr;
    grid-template-areas: 
    "first"
    "second"
    "third"
    "fourth"
    "fifth"
    "sixth";
    width: 100%;
    height: 2700px;
}
#first{
    grid-area: first;
    border: 2px black solid;
}
#second{
    grid-area: second;
    border: 2px black solid;
}
#third{
    grid-area: third;
    border: 2px black solid;
}
#fourth{
    grid-area: fourth;
    border: 2px black solid;
}
#fifth{
    grid-area: fifth;
    border: 2px black solid;
    background: url("../../assets/bg05.jpg");
}
#sixth{
    grid-area: sixth;
    border: 2px black solid;
}
#us{
    margin-top:60px;
    margin-left: 50px;
    margin-right: 50px;
    
}
</style>