<template>
  <div class="campusWrapper">
    <div class="campusNavWrapper">
      <el-button round id="campusToCollege">返回</el-button>
    </div>
    <div class="titleWrapper">
      <div class="campusNameWrapper">
        <div class="campusName">九龙湖校区</div>
        <div class="campusRate">
          <el-rate
          v-model="campusRate"
          disabled
          show-score
          text-color="#ff9900"
          >
          </el-rate>
        </div>
        <div class="rateAndUpload">
          {{campusRateee}}
        </div>
      </div>
      <div class="campusPhoto"></div>
    </div>
    <div class="statisticWrapper">

    </div>
    <div class="campusCommentWrapper">

    </div>
  </div>
</template>

<script>
export default {
  name: "campus",
  date () {
    return {
      campusRate: 3
    }
  }
}
</script>

<style scoped>

.campusNameWrapper{
  grid-area: campusNameWrapper;
  border: #2c3e50 solid 2px;
}

.campusPhoto{
  grid-area: campusPhoto;
  border: #2c3e50 solid 2px;
  background: url("https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210714170601.png");
  background-size: cover;
}

#campusToCollege{
  position: absolute;
  left: 5px;
  margin-top: 5px;
}



/*整体布局*/
  .campusWrapper{
    display: grid;
    grid-gap: 0px;
    grid-template-columns: 320px 1fr;
    grid-template-rows: 50px 160px 500px;
    grid-template-areas:
      "campusNavWrapper campusNavWrapper"
      "titleWrapper titleWrapper"
      "statisticWrapper campusCommentWrapper";
  }

  .campusNavWrapper{
    grid-area: campusNavWrapper;
    /*border: #99a9bf solid 2px;*/
  }

  .titleWrapper{
    grid-area: titleWrapper;
    border: #99a9bf solid 2px;

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
