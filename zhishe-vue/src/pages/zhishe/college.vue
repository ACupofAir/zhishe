<template>
  <div class="collegePage">
    <div class="campusViews">
      <div class="collegePicture">
        <el-image :src="pictureURL" fit="cover" class="collegePic"> </el-image>
      </div>

      <div class="selection">
        <div class="collegeName" style="font-weight: bold; font-size: 40px">{{collegeName}}</div>
        <div class="collegeAddress" style="color: #99a9bf">{{collegeAddress}}</div>
        <div class="commentsNumber" style="font-size: 16px; margin-top: 10px">共{{totalComment}}条学生评价</div>
        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>
        <div class="sort">
          <div style="font-weight: bold">排序</div>
          <el-radio-group v-model="radio1" >
            <div class="rankItem" v-for="(item, index) in rankName" :key="index">
                <el-radio  :label="index">{{item.name}}</el-radio>
            </div>
          </el-radio-group>
        </div>
        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>
        <div class="grade">
          <div style="font-weight: bold">匹配的年级</div>
          <el-radio-group v-model="radio2">
            <div class="gradeItem" v-for="(item, index) in gradeName" :key="index">
              <el-radio  :label="index">{{item.name}}</el-radio>
            </div>
          </el-radio-group>
        </div>
        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>
      </div>
      <div class="views">
        <div>4个校区符合你的要求</div>
        <div class="campusList">
          <briefComment v-for="(item, index) in briefCampus" :key="index"></briefComment>
        </div>
      </div>
    </div>

    <div class="cannotFind">
      找不到你想要的校区?
      <el-link type="primary" @click="$router.push('/comment')"> 点击这里</el-link>
    </div>

  </div>
</template>


<script>
import briefComment from "@/components/briefComment";
  export default {
    name: "college",
    components: {briefComment},
    data() {
      return {
        radio1: 1,
        radio2: 1,

        rankName: [{name: "校区名称"}, {name: "最多评价"},{name: "最高评分"}],
        gradeName: [{name: "所有年级"}, {name: "大一"},{name: "大二"},{name: "大三"},
                    {name: "大四"},{name: "大五"},{name: "研究生"}],


        pictureURL: "https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210715214908.jpeg",
        collegeName: "东南大学",
        collegeAddress: "江苏,南京",
        totalComment: "995",
        campus: [{campusName: "东南大学"}],
        briefCampus: [{id: 1},{id:2},{id: 1},{id:2}],
      }
    }
  };
</script>

<style scoped>
.campusList{
  margin-left: 50px;
}



.gradeItem{
  margin-top: 15px;
}
.rankItem{
  margin-top: 15px;
}
.grade{
  margin-top: 10px;
}
.sort{
  margin-top: 10px;
}

.collegePic{
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
    /*border: #3c85cb solid 2px;*/
  }

  .collegePicture{
    grid-area: collegePicture;
    /*border: #3c85cb solid 2px;*/
    height: 200px;
  }

  .cannotFind {
    font-size: 1.0em;
    font-weight: bold
  }

</style>
