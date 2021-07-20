<template>
  <div class="collegePage">


    <div class="campusViews">

      <div class="collegePicture">
        <el-image :src="pictureURL" fit="cover" class="collegePic"></el-image>
      </div>

      <div class="selection" v-if="isCollegeFind">
        <div class="collegeName" style="font-weight: bolder; font-size: 40px; margin-top: 30px; text-align: center;">
          {{currentCollege}}
        </div>
        <div class="collegeAddress"
             style="font-size: 25px; color: rgb(5, 138, 182); margin-top:16px; text-align: center;">
          {{collegeAddress}}
        </div>
        <div class="commentsNumber"
             style="font-weight: bold; font-size: 24px; margin-top: 35px; margin-bottom: 30px; text-align:center;">
          共{{totalComment}}条学生评价
        </div>
        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>

        <div class="statisticWrapper">
          <div class="campusScore">
            各项得分
            <div v-for="(item, index) in rate" :key="index" class="basicScore">
              <span id="basicScoreTitle">{{item.rateTitle}}</span>
              <el-rate
                  v-model="item.rateScore"
                  disabled
                  id="basicStar">
              </el-rate>
            </div>
          </div>
          <div class="campusLabel">
            <div>特色标签</div>
            <div v-for="(item , index) in label" :key="index" class="LabelItem">
              <i class="el-icon-collection-tag"></i>
              {{item.labelName}}
            </div>
          </div>
          <div class="gradeDistribution">
            <div style="border: #3c85cb solid 2px; border-radius: 10px">年级分布</div>
          </div>
        </div>


        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>
      </div>

      <div class="views" v-if="isCollegeFind">
        <div class="campusNumber"
             style="font-weight: bold; font-size: 28px; margin-top: 37px; margin-bottom:40px; text-align: left; margin-left: 60px;">
          {{totalCampus}}个校区符合你的要求
        </div>
        <div class="campusList">
          <router-link v-for="(item, index) in briefCampus" :key="index" :to="item.routerUrl">
            <campusInfo class="briefCampusInfo"
                        :campusBriefPhotoURL="item.url"
                        :campusName="item.id"
                        :campusRate="item.rate"
                        :campusComNum="item.comNum"
            ></campusInfo>
          </router-link>
        </div>
      </div>

    </div>

    <div class="cannotFindCampus" style="font-size:25px; margin-top: 20px; margin-bottom: 20px;" v-if="isCollegeFind">
      找不到你想要的校区?
      <el-link type="primary" @click="$router.push('/comment')"
               style="font-size :23px;font-weight: bold;color:rgb(5, 138, 182); margin-bottom:3px;"> 点击这里
      </el-link>
    </div>

    <!--    当没有找到学校时-->
    <div class="cannotFindCampus" style="font-size:25px; margin-top: 20px; margin-bottom: 20px;" v-if="!isCollegeFind">
      <div style="font-weight: lighter; font-size: 30px">没有找到 <span style="font-weight: bold">{{currentCollege}}</span>
      </div>
      找不到你想要的学校?
      <el-link type="primary" @click="$router.push('/comment')"
               style="font-size :23px;font-weight: bold;color:rgb(5, 138, 182); margin-bottom:3px;"> 点击这里
      </el-link>
    </div>
  </div>
</template>


<script>
import campusInfo from "@/components/campusInfo";

export default {
  name: "college",
  components: {campusInfo},
  data() {
    return {
      rate: [{rateTitle: "基础情况", rateScore: 3.8}, {rateTitle: "建筑情况", rateScore: 4.5}, {
        rateTitle: "位置情况",
        rateScore: 3.1
      }],
      label: [{labelName: "独立卫浴"}, {labelName: "自习室"}, {labelName: "WIFI"},
        {labelName: "冰箱"}, {labelName: "沙发"}, {labelName: "洗衣机",},
        {labelName: "空调"}, {labelName: "烹饪"}, {labelName: "阳台"}],


      pictureURL: "https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210715214908.jpeg",
      collegeName: "",
      collegeAddress: "",
      totalComment: "",
      totalCampus: "",
      briefCampus: [
      //     {
      //   id: "九龙湖校区",
      //   rate: 3.9,
      //   comNum: 302,
      //   routerUrl: '/campus/九龙湖校区',
      //   url: "https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210716160403.svg"
      // },
      //   {
      //     id: "四牌楼校区",
      //     rate: 4.5,
      //     comNum: 491,
      //     routerUrl: '/campus/四牌楼校区',
      //     url: "https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210716160403.svg"
      //   }
        ],
      campusId: "",


      // collegeList: [{id: "东南大学"}, {id: "南京大学"}],
      currentCollege: "",

      isCollegeFind: false,
    }
  },
  created() {
    this.currentCollege = this.$route.params.collegeName;




    //去后端请求数据，查询学校存不存在
    let responseData = null
    let _this = this
    this.$axios
        .get('/college/find/' + this.currentCollege)
        .then(function (response) {
        responseData = response.data
          console.log(responseData)


          console.log(response.data)
          _this.collegeName = response.data.name
          _this.collegeAddress = response.data.address
          _this.totalComment = response.data.commentNum
          _this.totalCampus = response.data.campusNum
          _this.briefCampus.push({
            id: responseData.campus1,
            rate: 3.6,
            comNum: responseData.commentNum,
            routerUrl: '/campus/' + responseData.campus1,
            url: 'https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210716160403.svg'
          })
          _this.isCollegeFind = true
          if (responseData.name === "") {
            console.log("ff")
          }

    })
    .catch(failRes => {
      console.log(failRes.data)
    })



  }

};
</script>

<style scoped>
.campusList {
  margin-left: 50px;

}

.briefCampusInfo {
  margin-top: 20px;
}



/*---年级分布----*/
.gradeDistribution {
  margin-top: 20px;
  height: 200px;
  /*border: #2c3e50 solid 2px;*/
}


/*----------*/

/*----标签---*/
.campusLabel {
  margin-top: 30px;
}

.LabelItem {
  display: inline-block;
  margin-top: 10px;
  margin-left: 20px;
  margin-bottom: 10px;
}

/*----------*/

/*----统计-----*/

.statisticWrapper {
  font-size: 17px;
}

.basicScore {
  margin-top: 20px;
}

#basicScoreTitle {
  display: inline-block;
}

#basicStar {
  display: inline-block;
  margin-left: 16px;
}

/*---------*/

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

.cannotFindCampus {
  font-size: 1.0em;
  font-weight: bold
}
</style>
