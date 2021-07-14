<template>
  <div class="wrapper">
    <div class="box header">
      <Header></Header>
    </div>
    <div class="box content">
      <router-link to="/campus">Campus</router-link>
      <router-view/>
    </div>
    <div class="box footer">
      <Footer></Footer>
    </div>
  </div>
</template>

<script>
import Header from "@/components/header";
import Footer from "@/components/footer";
export default {
  name: "home",
  components: {
    Header, Footer
  }
}
</script>

<style scoped>

.header {
  grid-area: header;
  border: #42b983 solid 5px;
  height: 60px;
  /*position: absolute;*/
  /*right: 0px;*/
  /*left: 0px;*/
  /*top: 0px;*/
  /*bottom: 0px;*/
}

.footer {
  grid-area: footer;
  border: #222222 solid 2px;
  height: 50px;
  /*position: absolute;*/
  /*right: 0px;*/
  /*left: 0px;*/
  /*top: 0px;*/
  /*bottom: 0px;*/
}

.content{
  grid-area: content;
  border: #222222 solid 2px;
  /*position: absolute;*/
  /*bottom: 0px;*/
  /*top: 0px;*/
  /*right: 0px;*/
  /*left: 0px;*/
  height: auto;
}

.wrapper {
  /*display: grid;*/
  /*grid-template-columns: 1fr 1fr 1fr;*/
  /*grid-template-rows: 60px auto 50px;*/
  /*grid-template-areas:*/
  /*  "header header header"*/
  /*  "content content content"*/
  /*  "footer  footer  footer";*/
  color: #444;
  height: 100%;
  width: 100%;
  position: absolute;
  top: 0;
  left: 0;
  overflow: auto;
}
.box {
  color: #222222;    /*字体颜色*/
  border-radius: 5px;
  font-size: 150%;
}
</style>
