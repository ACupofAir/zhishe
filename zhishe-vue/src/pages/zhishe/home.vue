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
  border: #42b983 solid 5px;
  position: absolute;
  right: 1px;
  left: 1px;
  top: 5px;
  bottom: 2px;
}

.footer {
  grid-area: footer;
  border: #222222 solid 5px;
  position: absolute;
  right: 1px;
  left: 1px;
  top: 1px;
  bottom: 5px;
}

.content{
  grid-area: content;
  border: #222222 solid 5px;
  position: fixed;
  bottom: 50px;
  top: 60px;
  right: 5px;
  left: 5px;
}

.wrapper {
  display: grid;
  grid-gap: 5px;
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
  position: fixed;
  top: 0;
  /*right: 0;*/
  /*bottom: 0;*/
}
.box {
  color: #222222;    /*字体颜色*/
  border-radius: 5px;
  font-size: 150%;
}
</style>
