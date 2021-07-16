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
          年级： 大三
        </div>
      </div>

    </div>

    <div class="dormInfo">
      <div class="dormBasicInfo">
        <el-divider content-position="center">宿舍信息 ({{dormScale}}人间)</el-divider>
        <el-row :gutter="60" style="margin-top: 20px; margin-left: 20%; margin-right: 20%;">
          <el-col :span="12">
            <div class="">宿舍基础情况</div>
          </el-col>
          <el-col :span="12">
            <div class="">
              <el-rate v-model="unitedScore" disabled show-score text-color="#ff9900" score-template="{value}">
              </el-rate>
            </div>
          </el-col>
        </el-row>
        <el-row :gutter="60" style="margin-top: 20px; margin-left: 20%; margin-right: 20%;">
          <el-col :span="12">
            <div class="">宿舍建筑情况</div>
          </el-col>
          <el-col :span="12">
            <div class="">
              <el-rate v-model="buildingScore" disabled show-score text-color="#ff9900" score-template="{value}">
              </el-rate>
            </div>
          </el-col>
        </el-row>
        <el-row :gutter="60" style="margin-top: 20px; margin-bottom: 50px; margin-left: 20%; margin-right: 20%;">
          <el-col :span="12">
            <div class="">宿舍位置情况</div>
          </el-col>
          <el-col :span="12">
            <div class="">
              <el-rate v-model="locationScore" disabled show-score text-color="#ff9900" score-template="{value}">
              </el-rate>
            </div>
          </el-col>
        </el-row>
      </div>
      <el-divider><i class="el-icon-price-tag">特色标签</i></el-divider>
      <div class="specialTags" style="margin-top: 50px;">

        <div class="refrigerator tag">
          <span class="tagLeft">
            <img src="../assets/comment/refrigerator.svg" height="30" width="30" alt="" title="冰箱">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasRefrigerator" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="sofa tag">
          <span class="tagLeft">
            <img src="../assets/comment/sofa.svg" height="30" width="30" alt="" title="沙发">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasSofa" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="washer tag">
          <span class="tagLeft">
            <img src="../assets/comment/washer.svg" height="30" width="30" alt="" title="洗衣机">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasWasher" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="airConditionor tag">
          <span class="tagLeft">
            <img src="../assets/comment/air-cool.svg" height="30" width="30" alt="" title="空调">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasAirCool" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="cooker tag">
          <span class="tagLeft">
            <img src="../assets/comment/cooker.svg" height="30" width="30" alt="" title="烹饪">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasCooker" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="balcony tag">
          <span class="tagLeft">
            <img src="../assets/comment/balcony.svg" height="30" width="30" alt="" title="阳台">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasBalcony" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="wifi tag">
          <span class="tagLeft">
            <img src="../assets/comment/wifi.svg" height="30" width="30" alt="" title="无线网覆盖">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasWifi" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="bathroom tag">
          <span class="tagLeft">
            <img src="../assets/comment/bathRoom.svg" height="30" width="30" alt="" title="独立浴室">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasBathroom" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

        <div class="toilet tag">
          <span class="tagLeft">
            <img src="../assets/comment/Toilet.svg" height="30" width="30" alt="" title="独立卫生间">
          </span>
          <span class="tagRight">
            <el-switch v-model="hasToilet" active-color="#13ce66" inactive-color="#ff4949" disabled>
            </el-switch>
          </span>
        </div>

      </div>

    </div>

  </div>
</template>

<script>
  export default {
    name: "comDetails",
    data() {
      return {
        totalvalue: 4.5,
        unitedScore: 4.2,
        buildingScore: 4.4,
        locationScore: 3.7,
        dormScale: 4,
        hasRefrigerator: false,
        hasSofa: false,
        hasWasher: false,
        hasAirCool: false,
        hasCooker: false,
        hasBalcony: false,
        hasWifi: false,
        hasBathroom: false,
        hasToilet: false,
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
    /* position: absolute; */
    bottom: 0px;
  }

  .pageHeader {
    margin-top: 5px;
    font-weight: bold;
    grid-area: pageHeader;
    /* background-color: blueviolet; */
  }

  .overallComment {
    grid-area: overallComment;
    width: 50%;
    margin: 0 auto;
    /* background-color: brown; */
  }

  .commentorInfo {
    grid-area: commentorInfo;
    width: 50%;
    margin: 0 auto;
    /* background-color: coral; */
  }

  .dormInfo {
    grid-area: dormInfo;
    width: 50%;
    margin: 0 auto;
  }

  .campusName {
    font-size: 2.3em;
  }

  .specialTags {
    grid-area: specialTags;
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    grid-template-rows: 1fr 1fr 1fr;

    grid-template-areas:
      "refrigerator sofa washer"
      "airConditionor cooker balcony"
      "wifi bathroom toilet";

    row-gap: 30px;
    column-gap: 60px;

  }

  .tag {
    display: grid;

    grid-template-columns: 1fr 1fr;
    border-radius: 8px;

    column-gap: 80px;

    grid-template-areas: "tagLeft tagRight";
  }

  .tagLeft {
    grid-area: tagLeft;
    border-radius: 8px;
  }

  .tagRight {
    grid-area: tagRight;
    border-radius: 8px;
  }

  .refrigerator {
    grid-area: refrigerator;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .sofa {
    grid-area: sofa;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .washer {
    grid-area: washer;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .airConditionor {
    grid-area: airConditionor;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .cooker {
    grid-area: cooker;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .balcony {
    grid-area: balcony;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .wifi {
    grid-area: wifi;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .bathroom {
    grid-area: bathroom;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .toilet {
    grid-area: toilet;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }
</style>