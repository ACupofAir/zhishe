<template>
<div id='container'>
  <div id='upper'>
    <div id = 'upContainer'>
    <div id = 'mark'>
      <div id = 'markLogo'>
        <img src="../../assets/logo.png" alt="mark"/>
      </div>
      <!-- <img src="../../assets/logo.png" alt="mark"/> -->
      <div id = 'markMark'>
        <img src="../../assets/mark.png" alt="mark"/>
      </div>
      <!-- <img src="../../assets/mark.png" alt="mark"/> -->
    </div>
    <div id = 'slogan'>

    </div>
    <div id = 'search'>

    </div>
    </div>
  </div>
  <div id='middler'>

  </div>
  <div id='downer'>

  </div>
</div>
</template>

<script>
export default {
  name: "welcome"
}
</script>

<style scoped>
#container{
  display: grid;
  grid-template-columns: 100%;
  grid-template-rows: 4fr 1fr 4fr;
  grid-template-areas:
  "upper"
  "middler"
  "downer";
  grid-gap: 0;
  width: 100%;
  height: 1350px;
  background-color: beige;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#upper{
  grid-area: upper;
  /* width: 100%;
  height: 600px; */
  background-color: aquamarine; 
  background: url("../../assets/arch.jpg");
  background-size: cover;
  position: absolute;
  bottom: 0px;  
  top:0px;
  right:0px;
  left:0px;
}

#middler{
  grid-area: middler;
  /* width: 100%;
  height: 150px; */
  background-color: thistle;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#downer{
  grid-area: downer;
  /* width: 100%;
  height: 600px; */
  background-color: aqua;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#upContainer{
  display: grid;
  grid-template-columns: 100%;
  grid-template-rows: 1fr 2fr 3fr;
  grid-template-areas:
  "mark"
  "slogan"
  "search";
  width: 100%;
  height: 600px;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#mark{
  grid-area: mark;
  position: absolute;
  bottom: 0px;
  top:32px;
  right:0px;
  left:32px;
  /* background-color: aqua; */
  width: 300px;
  height: 50px;
}

#markLogo{
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#markMark{
  position: absolute;
  bottom: 0px;
  top:5px;
  right:0px;
  left:45px;
}

#slogan{
  grid-area: slogan;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
  background-color: white;
}

#search{
  grid-area: search;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
  background-color: black;
}
</style>
