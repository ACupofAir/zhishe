<template>
  <div>
    <div class="briefCommentWrapper" v-on:click="openComDetails">
      <div class="briefInfo">
        <span class="comRate"></span>
        <span class="isRecommend"></span>
        <span class="comDate"></span>
      </div>
      <div class="briefComment"></div>
    </div>

    <el-dialog
        :visible.sync="dialogVisible"
        width="80%">
      <comDetails></comDetails>
    </el-dialog>
  </div>

</template>

<script>
import comDetails from "@/components/comDetails";
export default {
  name: "briefComment",
  components: {comDetails},
  props: [],
  data() {
    return {
      dialogVisible: false
    }
  },
  methods: {
    openComDetails () {
      this.dialogVisible = true
    }
  }
}
</script>

<style scoped>


.briefCommentWrapper{
  height: 185px;
  width: 800px;
  /*border: #3c85cb solid 3px;*/
  box-shadow: 0 0 20px #cac6c6;
  /*margin-left: 30px;*/
}

.briefInfo{
  border: #3c85cb solid 3px;
  height: 30px;
  margin-top: 8px;

}

.briefComment{
  margin-top: 10px;
  border: #3c85cb solid 3px;
  height: 120px;
}

</style>
