<template>
  <div class="colManagePage">
  
    <div class="collegeBar">
      <el-col :span="24">
        <h5 style="text-align: center;">学校列表</h5>
        <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
          background-color="#545c64" text-color="#fff" active-text-color="#ffd04b" style="width: 180px;">
          <el-menu-item v-for="college in collegeList" index="college.name">
            <i class="el-icon-s-home"></i>
            <span slot="title">{{college.name}}</span>
          </el-menu-item>
        </el-menu>
      </el-col>
      </el-row>
    </div>
  
  
    <div class="collegeDetail">

      <div class="collegeDetailTitle">
        <h2>{{curCollege}}</h2>

      </div>
  
      <div class="collegeDetailCampus">

      </div>

    </div>
  
  </div>

</template>

<script>
  export default {
    name: "collegeManage",
    data: () => {
      return {
        collegeList: [
          { name: 'college1' },
          { name: 'college2' },
          { name: 'college3' },
          { name: 'college4' },
          { name: 'college5' },
          { name: 'college6' },
          { name: 'college7' },
        ],
        curCollege: " ",
      }

    },

    created () {
    }
  }
</script>

<style scoped>
  .colManagePage {
    display: grid;
    grid-template-columns: 1fr 6fr;
    grid-template-areas: "collegeBar collegeDetail";

    column-gap: 10px;

  }

  .collegeBar {
    grid-area: collegeBar;

    border-radius: 9px;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
  }

  .collegeDetail {
    display: grid;
    grid-area: collegeDetail;

    row-gap: 10px;

    grid-template-areas: 
      "collegeDetailTitle"
      "collegeDetailCampus";
  }

  .collegeDetailTitle {
    display: grid;
    grid-area: collegeDetailTitle;
    border-radius: 9px;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
  }

  .collegeDetailCampus {
    display: grid;
    grid-area: collegeDetailCampus;
    border-radius: 9px;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
  }

</style>