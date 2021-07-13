<template>
  <div class="wrapper">
    <div class="box header">
      <Header></Header>
    </div>
    <div class="box content">
      <router-view/>
    </div>
    <div class="box footer">
      知舍
    </div>
  </div>
</template>

<script>
import Header from "@/components/header";
export default {
  name: "home",
  components: {
    Header
  }
}
</script>

<style scoped>

.header {
  grid-area: header;
  /*border: #42b983 solid 5px;*/
  position: absolute;
  right: 0px;
  left: 0px;
  top: 0px;
  bottom: 0px;
}

.footer {
  grid-area: footer;
  /*border: #222222 solid 5px;*/
  position: absolute;
  right: 0px;
  left: 0px;
  top: 0px;
  bottom: 0px;
}

.content{
  grid-area: content;
  /*border: #222222 solid 5px;*/
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
}

.wrapper {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-rows: 60px auto 50px;
  grid-template-areas:
    "header header header"
    "content content content"
    "footer  footer  footer";
  color: #444;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: absolute;
  top: 0;
  left: 0;
}
.box {
  color: #222222;    /*字体颜色*/
  border-radius: 5px;
  font-size: 150%;
}
</style>
