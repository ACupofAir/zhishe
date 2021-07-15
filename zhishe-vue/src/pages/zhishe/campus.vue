<template>
  <div class="campusWrapper">
    <div class="titleWrapper">
      <div class="campusNameWrapper">
        <router-link to="/"><el-button round id="campusToCollege">返回</el-button></router-link>
        <div class="campusName">九龙湖校区</div>
        <div class="campusRate">
          <el-rate
              v-model="campusRate"
              disabled
              show-score
              text-color="#ff9900"
              score-template="{value}">
          </el-rate>
        </div>
        <div class="rateAndUpload">
          <router-link to="/comment">
            <el-popover
                placement="top-start"
                width="50"
                trigger="hover"
                content="写评价">
              <el-button type="primary" icon="el-icon-edit" circle slot="reference" id="rateButton"></el-button>
            </el-popover>
          </router-link>

          <el-popover
              placement="top-start"
              width="50"
              trigger="hover"
              content="上传图片"
              >
            <el-button type="success" icon="el-icon-picture-outline" circle slot="reference" id="uploadButton"></el-button>
          </el-popover>
        </div>
      </div>
      <div class="campusPhoto"></div>
    </div>
    <div class="statisticWrapper">
        各项得分
      <div class="campusScore">
        <div class="basicScore"></div>
        <div class="buildingScore"></div>
        <div class="positionScore"></div>
      </div>
      <div class="campusLabel">
        特色标签
        <div class="refrigeratorLabel"></div>
        <div class="sofaLabel"></div>
        <div class="washerLabel"></div>
        <div class="airLabel"></div>
        <div class="cookLabel"></div>
        <div class="balconyLabel"></div>
      </div>
      <div class="gradeDistribution">
        年级分布
      </div>
    </div>
    <div class="campusCommentWrapper">

    </div>
  </div>
</template>

<script>
export default {
  name: "campus",
  data: () => {
    return {
      campusRate: 3.7,
    }
  }
}
</script>

<style scoped>
/*----统计-----*/




/*---------*/

#rateButton{
  position: absolute;
  top: 10px;
  left: 80px;
}

#uploadButton{
  position: absolute;
  top: 10px;
  right: 80px;
}

.campusName{
  margin-top: 15px;
}

.campusRate{
  margin-top: 15px;
}

.rateAndUpload{
  /*border: #2c3e50 solid 2px;*/
  width: 320px;
  height: 50px;
  margin-top: 15px;
  position: absolute;
}


.campusNameWrapper{
  grid-area: campusNameWrapper;
  /*border: #2c3e50 solid 2px;*/
}

.campusPhoto{
  grid-area: campusPhoto;
  /*border: #2c3e50 solid 2px;*/
  background: url("https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210714170601.png");
  background-size: cover;
}

#campusToCollege{
  position: absolute;
  left: 5px;
  margin-top: 10px;
}



/*整体布局*/
  .campusWrapper{
    display: grid;
    grid-gap: 0px;
    grid-template-columns: 320px 1fr;
    grid-template-rows: 160px 500px;
    grid-template-areas:
      "titleWrapper titleWrapper"
      "statisticWrapper campusCommentWrapper";
  }


  .titleWrapper{
    grid-area: titleWrapper;
    /*border: #99a9bf solid 2px;*/

    display: grid;
    grid-template-columns: 320px 1fr;
    grid-template-areas: "campusNameWrapper campusPhoto";
  }

  .statisticWrapper{
    grid-area: statisticWrapper;
    border: #99a9bf solid 2px;
  }

  .campusCommentWrapper{
    grid-area: campusCommentWrapper;
    border: #99a9bf solid 2px;

  }
</style>
