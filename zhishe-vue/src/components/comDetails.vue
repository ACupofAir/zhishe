<!-- <template>
  <div>
    <div class="pageHeader">
      <el-page-header @back="goBack" content="校区页面">
      </el-page-header>
    </div>

    <div class="campusName">
      东南大学
    </div>

    <div>
      <el-divider content-position="center">校区总评分</el-divider>
    </div>

    <div class="totalScore">
      <el-rate v-model="totalvalue" disabled show-score text-color="#ff9900" score-template="{value}">
      </el-rate>
    </div>

    <div>
      <el-divider content-position="center">宿舍推荐率</el-divider>
    </div>

    <div class="recommendRate">
      <el-progress :text-inside="true" :stroke-width="20" :percentage="60" :width="50"></el-progress>
    </div>

    <div>
      <el-divider content-position="center">评价者信息</el-divider>
    </div>

    <div class="commentorInfo">
      <el-form ref="form" :model="form" label-width="80px" width="50">
        <el-form-item label="入学年份" >
          <el-input v-model="year"></el-input>
        </el-form-item>
        <el-form-item label="年级">
          <el-input v-model="grade"></el-input>
        </el-form-item>
      </el-form>
    </div>

  </div>
</template>

<script>
  export default {
    name: "comDetails",
    data() {
      return {
        totalvalue: 4.5,
        year: '',
        grade: '',
      }
    },
    methods: {
      goBack() {
        console.log("go back");
      },
    },
  }
</script>

<style scoped>
  .campusName {
    font-size: 2.3em;
  }
</style> -->

<template>
  <div class="comDetails">

    <div class="pageHeader">
      <el-page-header @back="goBack" content="校区页面">
      </el-page-header>
    </div>

    <div class="overallComment">
      <div class="campusName">
        东南大学(九龙湖校区)
      </div>
  
      <div>
        <el-divider content-position="center">校区总评分</el-divider>
      </div>
  
      <div class="totalScore">
        <el-rate v-model="totalvalue" disabled show-score text-color="#ff9900" score-template="{value}">
        </el-rate>
      </div>

      <div>
        <el-divider content-position="center">宿舍推荐率</el-divider>
      </div>
  
      <div class="recommendRate">
        <el-progress :text-inside="true" :stroke-width="20" :percentage="60" :width="50"></el-progress>
      </div>
      
    </div>


    <div class="commentorInfo">
      <div>
        <el-divider content-position="center">评价者信息</el-divider>
        <div class="Year">
          入学年份：2019
        </div>
        <div class="Grade">
          年级：    大三
        </div>
      </div>

    </div>

    <div class="dormInfo">
    </div>

  </div>
</template>

<script>
  export default {
    name: "comDetails",
    data() {
      return {
        totalvalue: 4.5,
      }
    },
    methods: {
      goBack() {
        console.log("go back");
      },
    },
  }
</script>

<style scoped>
  .comDetails {
    display: grid;
    grid-template-columns: 100%;
    grid-template-rows: 1fr 4.5fr 4fr 10fr;
    grid-template-areas:
      "pageHeader"
      "overallComment"
      "commentorInfo"
      "dormInfo";
    grid-gap: 0;
    width: 100%;
    height: 100%;
    position: absolute;
    bottom: 0px;
    right: 0px;
    left: 0px;
  }

  .pageHeader {
    margin-top: 5px;
    font-weight: bold;
    grid-area: pageHeader;
    /* background-color: blueviolet; */
  }

  .overallComment {
    grid-area: overallComment;
    width:50%;
    margin:0 auto;
    /* background-color: brown; */
  }

  .commentorInfo {
    grid-area: commentorInfo;
    width:50%;
    margin:0 auto;
    /* background-color: coral; */
  }

  .dormInfo {
    grid-area: dormInfo;
    background-color: cornflowerblue;
  }
  .campusName {
    font-size: 2.3em;
  }
</style>