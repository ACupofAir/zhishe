<template>
  <div>
    <el-page-header @back="goBack" content="学校详情页面"> </el-page-header>

  </div>
</template>



<script>
export default {
  name: "college",
  methods: {
    goBack() {
      console.log("go back");
    },
  },
};
</script>

<style scoped>

</style>
