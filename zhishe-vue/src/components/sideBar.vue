<template>
<div class="sideBarWrapper">
  <el-row class="tac" style="height: 100%">
  <el-col :span="23" class="sideBar" >
    <el-menu
        default-active="1"
        class="el-menu-vertical-demo"
        background-color="#3c85cb"
        text-color="#fff"
        active-text-color="#ffd04b"
        style="height: 100%">
      <router-link v-for="(item, ind) in sideItems" :key="ind" :to="item.routerIndex">
        <el-menu-item :index="ind">
            <i :class="item.icon"></i>
            <span>{{item.title}}</span>
        </el-menu-item>
      </router-link>


    </el-menu>
  </el-col>
    </el-row>
</div>
</template>

<script>

export default {
  data() {
    return {
      sideItems: [{icon: 'el-icon-paperclip', title: '首页', routerIndex: '/adminMain'},
                  {icon: 'el-icon-paperclip', title: '审核请求', routerIndex: '/check'},
                  {icon: 'el-icon-paperclip', title: '学校管理', routerIndex: '/collegeManage'},
                  {icon: 'el-icon-paperclip', title: '管理员列表', routerIndex: '/adminList'},
                  {icon: 'el-icon-paperclip', title: '日志', routerIndex: '/log'}]
    }
  }
};
</script>

<style scoped>
.sideBarWrapper{
  height: 100%;
  /*background-color: #3c85cb;*/
}
.sideBar{
  height: 100%;
}
</style>
