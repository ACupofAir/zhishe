<template>
  <div class="detailWrapper">
    <div class="detailRate" style="text-align: left">
      <el-rate
          v-model="detailRate"
          disabled
          show-score
          text-color="#ff9900"
          score-template="{value}">
      </el-rate>
    </div>

    <el-divider><i class="el-icon-price-tag"></i></el-divider>

    <div class="detailName" style="text-align: left">
      <div style="font-size: 20px;font-weight: bold">{{detailName}}</div>
      <div v-if="isRecommend" style="margin-top: 10px; height: 45px;">
        <span style="height: 45px" ><img src="../assets/thumbYes.svg" height="45" width="45"></span>
        <span style="font-size: 17px; margin-left: 10px;">推荐</span>
      </div>
      <div v-if="!isRecommend" style="margin-top: 10px; height: 45px;">
        <span style="height: 45px;" ><img src="../assets/thumbNo.svg" height="45" width="45" style=" transform: rotate(180deg)"></span>
        <span style="font-size: 17px; margin-left: 10px;">不推荐</span>
      </div>
    </div>

    <el-divider><i class="el-icon-price-tag"></i></el-divider>

    <div class="detailComment" style="font-size: 16px">
      <div style="text-align: left; font-weight: bolder">评价者信息</div>
      <div><span>入学年份：</span><span>{{admissionTime}}</span></div>
      <div><span>年级：</span><span>{{grade}}</span></div>
      <div style="text-align: left;font-weight: bolder">宿舍信息</div>
      <div style="margin-top: 10px"><span>宿舍区：</span><span>{{dormArea}}</span></div>
      <div style="margin-top: 10px"><span>宿舍规模：</span><span>{{dormScale}}</span></div>
      <div v-for="(item, index) in rate" :key="index" style="margin-top: 10px">
        <div>
          <div style="display: inline-block">{{item.rateTitle}}：</div>
          <div style="display: inline-block"><el-rate v-model="item.rateScore"
              disabled
              show-score
              text-color="#ff9900"
              score-template="{value}">
          </el-rate></div>
        </div>
      </div>
      <div style="margin-top: 10px"><span>宿舍特色：</span>
        <span v-for="(item , index) in label" :key="index"  class="LabelItem" style="border: #99a9bf solid 2px">
        <i class="el-icon-collection-tag"></i>{{item}}
      </span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
data() {
  return {
    detailRate: 3.6,
    detailName: "东南大学九龙湖校区",
    isRecommend: false,
    admissionTime: "2019",
    grade: "大三",
    dormArea: "梅园",
    dormScale: "四人间",
    rate: [{rateTitle: "基础情况(桌椅床铺门窗等)",rateScore: 3.8},
          {rateTitle: "建筑情况(新旧和楼层布局)",rateScore: 2.5},
          {rateTitle: "位置情况(周边环境和位置)",rateScore: 3.1}],
    label:["空调","洗衣机","阳台","WIFI","独立卫浴",]
  }
}
}
</script>

<style scoped>

.detailRate{
/*border: #3c85cb solid 2px;*/
}

.detailName{
  /*border: #3c85cb solid 2px;*/

}

.detailComment{
  /*border: #3c85cb solid 2px;*/

}



/deep/ .el-rate__icon{
  font-size: 35px;
}
</style>
<!--<template>-->
<!--  <div class="comDetails">-->
<!--    <div class="overallComment">-->
<!--      <div class="campusName" style="font-weight: bolder; font-size: 40px; margin-top: 30px; text-align: center;">-->
<!--        {{campusName}}</div>-->

<!--      <div class="" style="margin-top: 30px;">-->
<!--        <el-divider content-position="center">-->
<!--          <div class="" style="font-size: 20px; font-weight: bold; margin-top: 10px;">校区总评分</div>-->
<!--        </el-divider>-->
<!--      </div>-->

<!--      <div class="totalScore" style="margin-top: 40px;">-->
<!--        <el-rate v-model="totalvalue" disabled show-score text-color="#ff9900" score-template="{value}">-->
<!--        </el-rate>-->
<!--      </div>-->

<!--      <div class="" style="margin-top: 30px;">-->
<!--        <el-divider content-position="center">-->
<!--          <div class="" style="font-size: 20px; font-weight: bold; margin-top: 10px;">宿舍推荐率</div>-->
<!--        </el-divider>-->
<!--      </div>-->

<!--      <div class="recommendRate" style="margin-top: 55px; margin-bottom: 10px; width:320px; margin-left: 215px; ">-->
<!--        <el-progress :text-inside="true" :stroke-width="20" :percentage="recommendrate" :width="50"></el-progress>-->
<!--      </div>-->

<!--    </div>-->


<!--    <div class="commentorInfo" style="margin-bottom:30px;">-->
<!--      <div>-->
<!--        <div class="">-->
<!--          <el-divider content-position="center">-->
<!--            <div class="" style="font-size: 20px; font-weight: bold; margin-top: 10px; margin-bottom: 10px;">评价者信息</div>-->
<!--          </el-divider>-->
<!--        </div>-->

<!--        <div class="Year" style="font-size: 18px; text-align: center; margin-top: 35px;">-->
<!--          入学年份：{{year}}-->
<!--        </div>-->
<!--        <div class="Grade" style="font-size: 18px; text-align: center; margin-top: 15px;">-->
<!--          年级： {{grade}}-->
<!--        </div>-->
<!--      </div>-->

<!--    </div>-->

<!--    <div class="dormInfo">-->
<!--      <div class="dormBasicInfo">-->
<!--        <div class = "" >-->
<!--        <el-divider content-position="center" >-->
<!--          <div class="" style="font-size: 20px; font-weight: bold;">宿舍信息 ({{dormScale}}人间)</div>-->
<!--        </el-divider>-->
<!--      </div>-->
<!--        <el-row :gutter="60" style="margin-top: 40px; margin-left: 20%; margin-right: 20%;">-->
<!--          <el-col :span="12">-->
<!--            <div class="" style="font-size: 17px;">宿舍基础情况</div>-->
<!--          </el-col>-->
<!--          <el-col :span="12">-->
<!--            <div class="">-->
<!--              <el-rate v-model="unitedScore" disabled show-score text-color="#ff9900" score-template="{value}">-->
<!--              </el-rate>-->
<!--            </div>-->
<!--          </el-col>-->
<!--        </el-row>-->
<!--        <el-row :gutter="60" style="margin-top: 20px; margin-left: 20%; margin-right: 20%;">-->
<!--          <el-col :span="12">-->
<!--            <div class="" style="font-size: 17px;">宿舍建筑情况</div>-->
<!--          </el-col>-->
<!--          <el-col :span="12">-->
<!--            <div class="">-->
<!--              <el-rate v-model="buildingScore" disabled show-score text-color="#ff9900" score-template="{value}">-->
<!--              </el-rate>-->
<!--            </div>-->
<!--          </el-col>-->
<!--        </el-row>-->
<!--        <el-row :gutter="60" style="margin-top: 20px; margin-bottom: 50px; margin-left: 20%; margin-right: 20%;">-->
<!--          <el-col :span="12">-->
<!--            <div class="" style="font-size: 17px;">宿舍位置情况</div>-->
<!--          </el-col>-->
<!--          <el-col :span="12">-->
<!--            <div class="">-->
<!--              <el-rate v-model="locationScore" disabled show-score text-color="#ff9900" score-template="{value}">-->
<!--              </el-rate>-->
<!--            </div>-->
<!--          </el-col>-->
<!--        </el-row>-->
<!--      </div>-->
<!--      <el-divider><i class="el-icon-price-tag" style="font-size: 20px; font-weight: bold;">特色标签</i></el-divider>-->
<!--      <div class="specialTags" style="margin-top: 50px;">-->

<!--        <div class="refrigerator tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/refrigerator.svg" height="30" width="30" alt="" title="冰箱">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasRefrigerator" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="sofa tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/sofa.svg" height="30" width="30" alt="" title="沙发">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasSofa" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="washer tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/washer.svg" height="30" width="30" alt="" title="洗衣机">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasWasher" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="airConditionor tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/air-cool.svg" height="30" width="30" alt="" title="空调">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasAirCool" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="cooker tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/cooker.svg" height="30" width="30" alt="" title="烹饪">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasCooker" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="balcony tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/balcony.svg" height="30" width="30" alt="" title="阳台">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasBalcony" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="wifi tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/wifi.svg" height="30" width="30" alt="" title="无线网覆盖">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasWifi" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="bathroom tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/bathRoom.svg" height="30" width="30" alt="" title="独立浴室">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasBathroom" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--        <div class="toilet tag">-->
<!--          <span class="tagLeft">-->
<!--            <img src="../assets/comment/Toilet.svg" height="30" width="30" alt="" title="独立卫生间">-->
<!--          </span>-->
<!--          <span class="tagRight">-->
<!--            <el-switch v-model="hasToilet" active-color="#13ce66" inactive-color="#ff4949" disabled>-->
<!--            </el-switch>-->
<!--          </span>-->
<!--        </div>-->

<!--      </div>-->

<!--    </div>-->

<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--  export default {-->
<!--    name: "comDetails",-->
<!--    data() {-->
<!--      return {-->
<!--        campusName: '东南大学（九龙湖校区）',-->
<!--        totalvalue: 4.5,-->
<!--        unitedScore: 4.2,-->
<!--        recommendrate: 82,-->
<!--        year:'2019',-->
<!--        grade: '大三',-->
<!--        buildingScore: 4.4,-->
<!--        locationScore: 3.7,-->
<!--        dormScale: 4,-->
<!--        hasRefrigerator: false,-->
<!--        hasSofa: false,-->
<!--        hasWasher: false,-->
<!--        hasAirCool: false,-->
<!--        hasCooker: false,-->
<!--        hasBalcony: false,-->
<!--        hasWifi: false,-->
<!--        hasBathroom: false,-->
<!--        hasToilet: false,-->
<!--      }-->
<!--    },-->
<!--    methods: {-->

<!--    },-->
<!--  }-->
<!--</script>-->

<!--<style scoped>-->
<!--  .comDetails {-->
<!--    display: grid;-->
<!--    grid-template-rows: 2fr 1fr 5fr;-->
<!--    grid-template-areas:-->
<!--      "overallComment"-->
<!--      "commentorInfo"-->
<!--      "dormInfo";-->
<!--    grid-gap: 0;-->
<!--    width: 100%;-->
<!--    height: 100%;-->
<!--    /* position: absolute; */-->
<!--    bottom: 0px;-->
<!--  }-->

<!--  .overallComment {-->
<!--    grid-area: overallComment;-->
<!--    width: 50%;-->
<!--    margin: 0 auto;-->
<!--    /* background-color: brown; */-->
<!--  }-->

<!--  .commentorInfo {-->
<!--    grid-area: commentorInfo;-->
<!--    width: 50%;-->
<!--    margin: 0 auto;-->
<!--    /* background-color: coral; */-->
<!--  }-->

<!--  .dormInfo {-->
<!--    grid-area: dormInfo;-->
<!--    width: 50%;-->
<!--    margin: 0 auto;-->
<!--  }-->

<!--  .campusName {-->
<!--    font-size: 2.3em;-->
<!--  }-->

<!--  .specialTags {-->
<!--    grid-area: specialTags;-->
<!--    display: grid;-->
<!--    grid-template-columns: 1fr 1fr 1fr;-->
<!--    grid-template-rows: 1fr 1fr 1fr;-->

<!--    grid-template-areas:-->
<!--      "refrigerator sofa washer"-->
<!--      "airConditionor cooker balcony"-->
<!--      "wifi bathroom toilet";-->

<!--    row-gap: 30px;-->
<!--    column-gap: 60px;-->

<!--  }-->

<!--  .tag {-->
<!--    display: grid;-->

<!--    grid-template-columns: 1fr 1fr;-->
<!--    border-radius: 8px;-->

<!--    column-gap: 80px;-->

<!--    grid-template-areas: "tagLeft tagRight";-->
<!--  }-->

<!--  .tagLeft {-->
<!--    grid-area: tagLeft;-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .tagRight {-->
<!--    grid-area: tagRight;-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .refrigerator {-->
<!--    grid-area: refrigerator;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .sofa {-->
<!--    grid-area: sofa;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .washer {-->
<!--    grid-area: washer;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .airConditionor {-->
<!--    grid-area: airConditionor;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .cooker {-->
<!--    grid-area: cooker;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .balcony {-->
<!--    grid-area: balcony;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .wifi {-->
<!--    grid-area: wifi;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .bathroom {-->
<!--    grid-area: bathroom;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->

<!--  .toilet {-->
<!--    grid-area: toilet;-->
<!--    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);-->
<!--    border-radius: 8px;-->
<!--  }-->
<!--</style>-->
