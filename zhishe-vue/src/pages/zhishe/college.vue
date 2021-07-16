<template>
  <div class="collegePage">

    <div>
      {{to}}
    </div>





    <div class="campusViews">

      <div class="collegePicture">
        <el-image :src="pictureURL" fit="cover" class="collegePic"> </el-image>
      </div>

      <div class="selection">
        <div class="collegeName" style="font-weight: bolder; font-size: 40px; margin-top: 30px; text-align: center;">
          {{collegeName}}</div>
        <div class="collegeAddress" style="font-size: 25px; color: rgb(5, 138, 182); margin-top:16px; text-align: center;">
          {{collegeAddress}}</div>
        <div class="commentsNumber"
          style="font-weight: bold; font-size: 24px; margin-top: 35px; margin-bottom: 30px; text-align:center;">
          共{{totalComment}}条学生评价</div>
        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>

        <div class="sort">
          <div style="font-weight: bold; margin-bottom: 5px; margin-top: 5px;">排序</div>
          <el-radio-group v-model="radio1">
            <div class="rankItem" v-for="(item, index) in rankName" :key="index">
              <el-radio :label="index">{{item.name}}</el-radio>
            </div>
          </el-radio-group>
        </div>

        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>

        <div class="grade">
          <div style="font-weight: bold; margin-bottom: 5px; margin-top: 5px">匹配的年级</div>
          <el-radio-group v-model="radio2">
            <div class="gradeItem" v-for="(item, index) in gradeName" :key="index">
              <el-radio :label="index">{{item.name}}</el-radio>
            </div>
          </el-radio-group>
        </div>

        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>
      </div>

      <div class="views">
        <div class="campusNumber"
          style="font-weight: bold; font-size: 28px; margin-top: 37px; margin-bottom:40px; text-align: left; margin-left: 60px;">
          {{totalCampus}}个校区符合你的要求</div>
        <div class="campusList">
            <router-link v-for="(item, index) in briefCampus" :key="index" to="/campus" >
              <campusInfo  class = "briefCampusInfo"></campusInfo>
            </router-link>
        </div>
      </div>

    </div>

    <div class="cannotFind" style="font-size:25px; margin-top: 20px; margin-bottom: 20px;">
      找不到你想要的校区?
      <el-link type="primary" @click="$router.push('/comment')"
        style="font-size :23px;font-weight: bold;color:rgb(5, 138, 182); margin-bottom:3px;"> 点击这里</el-link>
    </div>

  </div>
</template>


<script>
  import campusInfo from "@/components/campusInfo";
  export default {
    name: "college",
    components: { campusInfo },
    data() {
      return {
        radio1: 0,
        radio2: 0,

        rankName: [{ name: "校区名称" }, { name: "最多评价" }, { name: "最高评分" }],
        gradeName: [{ name: "所有年级" }, { name: "大一" }, { name: "大二" }, { name: "大三" },
        { name: "大四" }, { name: "大五" }, { name: "研究生" }],


        pictureURL: "https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210715214908.jpeg",
        collegeName: "东南大学",
        collegeAddress: "江苏,南京",
        totalComment: "995",
        totalCampus: "5",
        campus: [{ campusName: "东南大学" }],
        briefCampus: [{ id: "九龙湖校区" }, { id: "四牌楼校区" }],
        campusId: "",


        collegeList: [{id: "dong"},{id: "南京大学"}],
        currentCollege: null,
      }
    },
    created() {
      this.currentCollege = this.collegeList.find(x => x.id === this.$route.params.id);
    }

  };
</script>

<style scoped>
  .campusList {
    margin-left: 50px;

  }
  .briefCampusInfo{
    margin-top: 20px;
  }
  .gradeItem {
    margin-top: 15px;
  }

  .rankItem {
    margin-top: 15px;
  }

  .grade {
    margin-top: 10px;
    margin-left: 80px;
  }

  .sort {
    margin-top: 10px;
    margin-left: 80px;
  }

  .collegePic {
    height: 320px;
  }

  .campusViews {
    display: grid;
    grid-template-rows: 320px auto;
    grid-template-columns: 3fr 7fr;
    grid-template-areas:
      "collegePicture collegePicture"
      "selection views";
    width: 100%;
    height: 100%;
    font-size: 19px;
  }

  .selection {
    grid-area: selection;
    /*border: #3c85cb solid 2px;*/
    text-align: left;
    padding-left: 50px;
  }

  .views {
    grid-area: views;
    margin-left: 30px;
    /*border: #3c85cb solid 2px;*/
  }

  .collegePicture {
    grid-area: collegePicture;
    /*border: #3c85cb solid 2px;*/
    height: 200px;
    width: 100%;
  }

  .cannotFind {
    font-size: 1.0em;
    font-weight: bold
  }
</style>
