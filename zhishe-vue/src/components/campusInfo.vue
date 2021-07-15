<template>
    <div class="campusInfo">
        <el-column>
            <el-row :span="30" v-for="(o, index) in 6" :key="o" :offset="index > 0 ? 10 : 0">
                <el-card :body-style="{ padding: '10px' }">
                    <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
                        class="image">
                    <div style="padding: 10px;">
                        <span>东南大学</span>
                        <div class="bottom clearfix">
                            <el-button type="text" class="button">查看详情</el-button>
                        </div>
                    </div>
                </el-card>
            </el-row>
        </el-column>

    </div>
</template>

<script>
    export default {
        name: "campusInfo",
    }
</script>

<style scoped>

    .bottom {
        margin-top: 5px;
        line-height: 12px;
    }

    .button {
        padding: 0;
        float: right;
    }

    .image {
        width: 120px;
        height: 120px;
        margin-top:20px;
        margin-left:5px;
        display: block;
    }

    .clearfix:before,
    .clearfix:after {
        display: table;
        content: "";
    }

    .clearfix:after {
        clear: both
    }
</style>