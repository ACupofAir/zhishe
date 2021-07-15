<template>
  <div class="collegePage">
    <div class="pageHeader">
      <el-page-header @back="goBack" content="学校详情页面">
      </el-page-header>
    </div>

    <div class="collegePicture">
      <img src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg" id="psc" width=100% height="200">
    </div>

    <div>
      <el-divider><i class="el-icon-mobile-phone"></i></el-divider>
    </div>

    <div class="campusViews">
      <div class="selection">
        <div class="collegeName"> 东南大学</div>
        <div class="collegeAddress"> 江苏--南京</div>
        <div>
          <el-divider><i class="el-icon-mobile-phone"></i></el-divider>
        </div>
        <div class="commentsNumber"> 1300条学生评价</div>
        <div>
          <el-divider><i class="el-icon-mobile-phone"></i></el-divider>
        </div>
        <div class="sort">
          <el-row>排序</el-row>
          <el-radio-group v-model="radio" size="medium">
            <el-row>
              <el-radio :label="1">校区名称</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="2">最多评价</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="3">最高评分</el-radio>
            </el-row>
          </el-radio-group>
        </div>

        <div>
          <el-divider><i class="el-icon-mobile-phone"></i></el-divider>
        </div>

        <div class="grade">
          <el-row>匹配的年级</el-row>
          <el-radio-group v-model="radio" size="medium">
            <el-row>
              <el-radio :label="4">所有年级</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="5">大一</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="6">大二</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="7">大三</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="8">大四</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="9">大五</el-radio>
            </el-row>
            <el-row>
              <el-radio :label="10">研究生</el-radio>
            </el-row>
          </el-radio-group>
        </div>
      </div>

      <div class="views">
        <div>
          4个校区符合你的要求
        </div>
        <div class="campusList">

        </div>
      </div>

    </div>

    <div class="cannotFind">
      找不到你想要的校区?
      <el-link type="primary"> 点击这里</el-link>
    </div>

  </div>
</template>


<script>
  export default {
    name: "college",
    methods: {
      goBack() {
        console.log("go back");
      },
    },
    data() {
      return {
        radio: 1
      };
      return {
        value: 3.7
      }
    }


  };
</script>

<style scoped>
  .pageHeader {
    margin-top: 5px;
    font-weight: bold
  }

  .campusViews {

    display: grid;
    grid-template-rows: 500px;
    grid-template-columns: 3fr 7fr;
    grid-template-areas:
      "selection views";
    width: 100%;
    height: 100%;
  }

  .selection {
    grid-area: selection;
  }

  .collegeName {
    font-size: 1.6em;
    font-weight: bold
  }

  .collegeAddress {
    font-size: 1.0em;
  }

  .commentsNumber {
    font-size: 1.0em;
  }

  .views {
    grid-area: views;
    /* background-color: slateblue; */
  }

  .cannotFind {
    font-size: 1.0em;
    font-weight: bold
  }

  .sort {
    text-align: left;
    margin-left: 130px;
    font-weight: bold
  }

  .grade {
    text-align: left;
    margin-left: 130px;
    font-weight: bold
  }
  
  
</style>