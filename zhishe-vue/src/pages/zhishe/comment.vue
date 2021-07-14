<template>
  <div class="commentPage">
    <el-row :gutter="20">
      <el-col :span="8">
        <div class="grid-content bg-purple-dark">宿舍基础情况</div>
      </el-col>
      <el-col :span="16">
        <div class="grid-content bg-purple-light">
          <el-slider v-model="value1" :step="1" :max='5' show-stops>
          </el-slider>
        </div>
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :span="8">
        <div class="grid-content bg-purple-dark">宿舍建筑情况</div>
      </el-col>
      <el-col :span="16">
        <div class="grid-content bg-purple-light">
          <el-slider v-model="value2" :step="1" :max='5' show-stops>
          </el-slider>
        </div>
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :span="8">
        <div class="grid-content bg-purple-dark">宿舍位置情况</div>
      </el-col>
      <el-col :span="16">
        <div class="grid-content bg-purple-light">
          <el-slider v-model="value3" :step="1" :max='5' show-stops>
          </el-slider>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
  export default {
    name: "comment",
    data: () => {
      return {
        value1: 3,
        value2: 3,
        value3: 3, 
      }
    }
  }
</script>

<style scoped>
  .el-row {
    margin-bottom: 20px;
    /* box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04) */
  }

  .el-col {
    border-radius: 4px;
  }

  .bg-purple-dark {
    background: #99a9bf;
  }

  .bg-purple {
    background: #d3dce6;
  }

  .bg-purple-light {
    background: #e5e9f2;
  }

  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }

  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }

  .commentPage {
    padding-left: 20px;
    padding-right: 20px;
  }
</style>