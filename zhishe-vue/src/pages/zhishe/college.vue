<template>
  <div class="collegePage">


    <div class="campusViews">

      <div class="collegePicture">
        <el-image :src="pictureURL" fit="cover" class="collegePic"></el-image>
      </div>

      <div class="selection" id="collegeName" v-if="isCollegeFind">
        <div class="collegeName"  style="font-weight: bolder; font-size: 40px; margin-top: 30px; text-align: center;">
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
            <div style="text-align: center; font-weight: bold">各项得分</div>
            <div v-for="(item, index) in rate" :key="index" class="basicScore">
              <span id="basicScoreTitle">{{item.rateTitle}}</span>
              <el-rate
                  v-model="item.rateScore"
                  disabled
                  score-template="{value}"
                  text-color="#ff9900"
                  show-score
                  id="basicStar">
              </el-rate>
            </div>
          </div>
          <div class="campusLabel">
            <div style="text-align: center; font-weight: bold">特色标签</div>
            <div v-for="(item , index) in label" :key="index" class="LabelItem" style="border: #339af0 solid 1px; border-radius: 10px; margin-left: 10px; padding: 5px;box-shadow: 0 0 10px #cac6c6;">
              <i class="el-icon-collection-tag"></i>
              {{item}}
            </div>
          </div>
          <div class="gradeDistribution">
            <div style="text-align: center; font-weight: bold">年级分布</div>

          </div>
        </div>

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
    <div id="gradeChart" :style="{ width: '550px', height: '400px' }"
    style="position: absolute; top: 1000px" v-show="isCollegeFind"></div>

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
      rate: [{rateTitle: "基础情况", rateScore: 0}, {rateTitle: "建筑情况", rateScore: 0}, {rateTitle: "位置情况", rateScore: 0}],
      label: [],


      pictureURL: "https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210715214908.jpeg",
      collegeName: "",
      collegeAddress: "",
      totalComment: "",
      totalCampus: "",
      briefCampus: [],
      campusId: "",
      currentCollege: "",
      isCollegeFind: false,
    }
  },

  mounted() {

    document.title=this.currentCollege


    let echarts = require("echarts");

    let myChart = echarts.init(document.getElementById("gradeChart"));
    myChart.setOption({
      legend: {
        top: 'bottom'
      },

      series: [
        {
          name: '面积模式',
          type: 'pie',
          radius: [12, 110],
          center: ['45%', '50%'],
          roseType: 'area',
          itemStyle: {
            borderRadius: 8
          },
          data: [
            {value: 40, name: '大一'},
            {value: 38, name: '大二'},
            {value: 32, name: '大三'},
            {value: 30, name: '大四'},
            {value: 28, name: '大五'},
            {value: 26, name: '研究生'},
            {value: 22, name: '博士生'},
          ],
          color: ["rgb(254, 67, 101)",
            "rgb(252,157,154)", "rgb(249,205,173)",
            "rgb(220,220,189)", "rgb(181,225,205)",
            "#70a1ff", "#daadf7"],
        },
      ],
    })


  },


  created() {
    this.currentCollege = this.$route.params.collegeName;
    //去后端请求数据，查询学校存不存在
    let responseData = null
    let _this = this
    this.$axios
        .get('/college/find/' + this.currentCollege)
        .then(async function (response) {
          responseData = response.data
          console.log(responseData)

          if (responseData.address === undefined) {
            console.log("college not found")
            _this.$router.push('/college/notFound')
          }
          else {
            _this.collegeName = responseData.name
            _this.collegeAddress = responseData.address
            _this.totalComment = responseData.commentNum
            _this.totalCampus = responseData.campusNum
            _this.isCollegeFind = true
            let campusList = []
            await _this.$axios
                .get('/campus/findList/' + _this.currentCollege)
                .then(async response =>{
                  for (let item of response.data){
                    campusList.push(item.name.split('-')[1])
                  }
                })
            await _this.findCampus(campusList)
            _this.rate[0].rateScore = _this.rate[0].rateScore  *1000 / Number(_this.totalCampus) /1000
            _this.rate[1].rateScore = _this.rate[1].rateScore  / Number(_this.totalCampus)
            _this.rate[2].rateScore = _this.rate[2].rateScore  / Number(_this.totalCampus)
            _this.rate[0].rateScore = Number(_this.rate[0].rateScore.toFixed(1))
            _this.rate[1].rateScore = Number(_this.rate[1].rateScore.toFixed(1))
            _this.rate[2].rateScore = Number(_this.rate[2].rateScore.toFixed(1))
          }
    })
    .catch(failRes => {
      console.log(failRes.data)
    })
  },

  methods: {
    async findCampus (campusList) {
      let _this = this
      for(let item of campusList){
        if(item !== null){
          await _this.$axios
              .get('/campus/find/' + _this.currentCollege + '-' + item)
              .then(async response =>{
                console.log(response.data)
                await _this.findLabel(_this.currentCollege+'-'+item)
                if(response.data.schoolName === _this.currentCollege && response.data.state === true){
                  let campusName = response.data.name.split('-')
                  _this.rate[0].rateScore  = _this.rate[0].rateScore  + response.data.facilitiesScore
                  _this.rate[1].rateScore  = _this.rate[1].rateScore  + response.data.architectureScore
                  _this.rate[2].rateScore  = _this.rate[2].rateScore  +response.data.surroundingScore

                  _this.briefCampus.push({
                    id: campusName[1],
                    rate: response.data.score,
                    comNum: response.data.commentNum,
                    routerUrl: '/campus/' + response.data.name,
                    url: 'https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210716160403.svg'
                  })
                }
              })
        }
      }
    },

    async findLabel (campus) {
      let _this = this
      await this.$axios
          .get('/comment/' + campus)
          .then(response =>{
            for(let com of response.data){
              if(com.refrigerator && _this.label.indexOf("冰箱") < 0) _this.label.push("冰箱")
              if(com.sofa && _this.label.indexOf("沙发") < 0) _this.label.push( "沙发")
              if(com.washingMachine && _this.label.indexOf("洗衣机") < 0) _this.label.push("洗衣机")
              if(com.airConditioner && _this.label.indexOf("空调") < 0) _this.label.push("空调")
              if(com.cooking && _this.label.indexOf("烹饪") < 0) _this.label.push("烹饪")
              if(com.outdoorBalcony && _this.label.indexOf("阳台") < 0) _this.label.push("阳台")
              if(com.wifi && _this.label.indexOf("WIFI") < 0) _this.label.push("WIFI")
              if(com.restroom && _this.label.indexOf("独立卫浴") < 0) _this.label.push("独立卫浴")
              if(com.studyroom && _this.label.indexOf("自习室") < 0) _this.label.push("自习室")
            }
          })
    },


  }
};
</script>

<style scoped>
::v-deep .el-rate__icon {
  font-size: 28px;
}


.LabelItem:hover{
  background-color: #a5d8ff;
  color: white;
}

.campusList {
  margin-left: 50px;

}

.briefCampusInfo {
  margin-top: 20px;
}


/*---年级分布----*/
.gradeDistribution {
  margin-top: 20px;
  height: 340px;
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
