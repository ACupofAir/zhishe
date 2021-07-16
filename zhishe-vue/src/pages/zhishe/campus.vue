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
        <el-divider class="titleDivider"><i class="el-icon-price-tag"></i></el-divider>
      </div>
      <div class="campusPhoto">
        <el-image :src="pictureURL" fit="cover" class="campusPic"> </el-image>
      </div>
    </div>
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
        <div v-for="(item , index) in label" :key="index"  class="LabelItem">
          <i class="el-icon-collection-tag"></i>
          {{item.labelName}}
        </div>
      </div>
      <div class="gradeDistribution">
        <div style="border: #3c85cb solid 2px; border-radius: 10px">年级分布</div>
      </div>
    </div>
    <div class="campusCommentWrapper">
      <briefComment v-for="(comItem, index) in briefComment" :key="index" class="briefCommentArea"></briefComment>
    </div>
  </div>

</template>

<script>
import briefComment from "@/components/briefComment";
export default {
  name: "campus",
  components: {briefComment},
  data: () => {
    return {
      pictureURL: "https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210715214908.jpeg",


      campusRate: 3.7,
      rate: [{rateTitle: "基础情况",rateScore: 3.8}, {rateTitle: "建筑情况",rateScore: 4.5}, {rateTitle: "位置情况",rateScore: 3.1}],
      label: [{labelName:"独立卫浴"},{labelName:"自习室"}, {labelName:"WIFI"},
        {labelName:"冰箱"},{labelName:"沙发"},{labelName:"洗衣机",},
        {labelName:"空调"},{labelName:"烹饪"},{labelName:"阳台"}],
      briefComment: [{id: 1},{id:2},{id: 1},{id:2}],



      campusList: [{ id: "九龙湖校区" }, { id: "四牌楼校区" }],
      toCampus: null,
    }
  },
  methods: {

  },

  created() {
    this.toCampus = this.campusList.find(x => x.id === this.$route.params.id)
  }
}
</script>

<style scoped>

/*简评*/
.briefCommentArea{
  /*border: #3c85cb solid 2px;*/
  margin-top: 20px;
  margin-left: 120px;
  margin-bottom: 15px;
}



/*---年级分布----*/
.gradeDistribution{
  margin-top: 20px;
  height: 200px;
  /*border: #2c3e50 solid 2px;*/
}


/*----------*/

/*----标签---*/
.campusLabel{
  margin-top: 30px;
}

.LabelItem{
  display: inline-block;
  margin-top: 10px;
  margin-left: 20px;
  margin-bottom: 10px;
}

/*----------*/

/*----统计-----*/

.statisticWrapper{
  font-size: 17px;
}
.basicScore{
  margin-top: 20px;
}

#basicScoreTitle{
  display: inline-block;
}

#basicStar{
  display: inline-block;
  margin-left: 16px;
}

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
  margin-top: 45px;
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

.titleDivider{
  margin-top: 110px;
}


.campusNameWrapper{
  grid-area: campusNameWrapper;
  /*border: #2c3e50 solid 2px;*/
}

.campusPhoto{
  grid-area: campusPhoto;
}
.campusPic{
  height: 230px;
  border-radius: 10px;
}


#campusToCollege{
  position: absolute;
  left: 5px;
  margin-top: 10px;
}



/*整体布局*/
  .campusWrapper{
    display: grid;
    grid-template-columns: 320px 1fr;
    grid-template-rows: 230px auto;
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
    /*border: #99a9bf solid 2px;*/
    margin-top: 20px;
  }

  .campusCommentWrapper{
    grid-area: campusCommentWrapper;
    /*border: #99a9bf solid 2px;*/

  }
</style>
