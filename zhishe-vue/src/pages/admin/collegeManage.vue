<template>
  <div class="colManagePage">
    <div class="collegeBar">
      <el-col :span="24">
        <h5 style="text-align: center;">学校列表</h5>
        <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
          background-color="#2c3e50" text-color="#fff" active-text-color="#ffd04b" style="width: 180px;">
          <el-menu-item v-for="(college, index) in collegeList" :key="index" :index="index.toString()"
            style="text-align: left;">
            <i class="el-icon-s-home"></i>
            <span slot="title">{{college.name}}</span>
          </el-menu-item>
        </el-menu>
      </el-col>
    </div>

    <div class="collegeDetail">

      <div class="collegeDetailTitle">
        <span class="box">
          <el-avatar class="boxLeft" :size="100" :src="circleUrl"></el-avatar>
          <span class="boxRight">
            <el-row style="margin-bottom: 20px;">
              <span style="font-size: 30px; font-weight: bold;">
                {{curCollege}}
              </span>
              <el-row style="margin-bottom: 20px;">
                <i class="el-icon-location-outline" style="font-weight: bold;">校区数量 {{curCollegeCampusNum}}</i>
              </el-row>
              <el-row>
                <i class="el-icon-chat-dot-round" style="font-weight: bold;">评论数量 {{curCollegeCommentNum}}</i>
              </el-row>
            </el-row>
          </span>
        </span>

      </div>

      <div class="collegeDetailCampus">
        <div class="campusBar">
          <el-col :span="24">
            <h5 style="text-align: center;">校区列表</h5>
            <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
              background-color="#545c64" text-color="#fff" active-text-color="#ffd04b" style="width: 180px;">
              <el-menu-item v-for="(campus, index) in campusList" :key="index" :index="index.toString()"
                style="text-align: left;">
                <i class="el-icon-location"></i>
                <span slot="title">{{campus.name}}</span>
              </el-menu-item>
            </el-menu>
          </el-col>
          </el-row>
        </div>
        <!-- TODO: Here need a v-for to display all the comments  -->
        <div class="commentList">
          Here should be comment list
        </div>
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
        campusList: [
          { name: 'campus1' },
          { name: 'campus2' },
          { name: 'campus3' },
        ],
        // TODO: here should be a data-binding
        curCollege: "东南大学",
        curCollegeCampusNum: 4,
        curCollegeCommentNum: 244,
      }

    },

    created() {
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
    column-gap: 20px;

    grid-template-columns: 1fr 6fr;
    grid-template-areas: "campusBar commentList";


    border-radius: 9px;
  }

  .campusBar {
    grid-area: campusBar;

    border-radius: 9px;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
  }

  .commentList {
    grid-area: commentList;

    border-radius: 9px;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
  }

  .box {
    display: grid;
    grid-area: box;

    grid-template-columns: 1fr 5fr;
    grid-template-areas: "boxLeft boxRight";
  }

  .boxLeft {
    grid-area: boxLeft;

  }

  .boxRight {
    grid-area: boxRight;

  }
</style>