<template>
  <div class="headerWrapper">
    <div class="iconWrapper">
      <dvi class="logoWrapper">
        <img src="../assets/logo.png" id="logo">
        <img src="../assets/zhishelogo.png" id="zhishelogo">
      </dvi>
    </div>
    <div class="searchWrapper">

    </div>
  </div>
</template>

<script>
export default {
  name: "header"
}
</script>

<style scoped>
/*样式*/
.logoWrapper{
  position: absolute;
  top: 8px;
  left: 30px;
}
#logo{
  position: absolute;
  left: 10px;
  right: 2px;
}
#zhishelogo{
  position: absolute;
  top: 5px;
  left: 57px;
}


/*布局*/
  .iconWrapper{
    grid-area: icon;
    border: aqua solid 3px;
    width: 200px;
    position: absolute;
    right: 2px;
    left: 2px;
    top: 1px;
    bottom: 1px;
  }

  .searchWrapper{
    grid-area: search;
    border: aquamarine solid 3px;
    width: 700px;
    position: absolute;
    right: 2px;
    /*left: 300px;*/
    top: 0px;
    bottom: 0px;
  }

  .headerWrapper{
    display: grid;
    grid-gap: 5px;
    grid-template-columns: 1fr 5fr;
    grid-template-areas:
          "icon search";
    height: 100%;
    box-shadow: 0 0 45px #cac6c6;
    position: absolute;
    right: 0px;
    left: 0px;
    top: 0px;
    bottom: 0px;
  }

</style>
