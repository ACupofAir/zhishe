<template>
  <div>
    <div class="briefCommentWrapper" v-on:click="openComDetails">
      <div class="briefInfo"></div>
      <div class="briefComment"></div>
    </div>

    <el-dialog
        title="提示"
        :visible.sync="dialogVisible"
        width="30%">
      <span>这是一段信息</span>
    </el-dialog>
  </div>

</template>

<script>
export default {
  name: "briefComment",
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
  width: 900px;
  /*border: #3c85cb solid 3px;*/
  box-shadow: 0 0 20px #cac6c6;
  /*margin-left: 30px;*/
}

.briefInfo{
  /*border: #3c85cb solid 3px;*/
  height: 30px;
  margin-top: 8px;

}

.briefComment{
  margin-top: 10px;
  /*border: #3c85cb solid 3px;*/
  height: 120px;
}

</style>
