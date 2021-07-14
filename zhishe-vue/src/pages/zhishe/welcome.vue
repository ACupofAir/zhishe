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
        <div id = 'sloganContent'>
        <!-- <p id = 'sloganText'>
          知舍，寻所想之舍
        </p> -->
          <img src="../../assets/slogan.png" alt="slogan"/>
        </div>
      </div>
      <div id = 'search'>

       <!-- <div class="demo-input-suffix">
         <el-input
          placeholder="请选择日期"
          suffix-icon="el-icon-date"
          v-model="input1">
         </el-input>
         <el-input
          placeholder="请输入内容"
          prefix-icon="el-icon-search"
          v-model="input2">
         </el-input>
       </div>   -->
        <div id = 'searchInput'>
          <el-input
            placeholder="搜索你的学校"
            suffix-icon="el-icon-search"
            v-model="input"
            v-on:keyup.enter.native = "submit"
            >
          </el-input>
          <!-- <input type="text" v-on:keyup.enter = "submit"/> -->
        </div>
      </div>  

    </div>

  </div>

  <div id='middler'>

  </div>
  
  <div id='downer'>
    <div id = 'downContainer'>
      <div id = 'downerLabel'>
        <div id = 'labelText'>
          选择你喜欢的宿舍特点
        </div>
        <div id = 'labelContent'>
          <!-- <el-checkbox-group v-model="checkboxGroup">
          <el-checkbox-button v-for="feature in features" :label="feature" :key="feature">
            {{feature}}</el-checkbox-button>
          </el-checkbox-group> -->
          <!-- <div> -->
            <el-checkbox-group v-model = "checkboxGroup" v-on:click = "change()">
              <!-- <Label msg = "健身房"/> -->
              <el-checkbox label="空调" border></el-checkbox>
              <!-- <el-checkbox label="沙发" border></el-checkbox> -->
              <el-checkbox label="洗衣机" border></el-checkbox>
              <el-checkbox label="可烹饪" border></el-checkbox>
              <el-checkbox label="室外阳台" border></el-checkbox>
              <el-checkbox label="独立卫浴" border></el-checkbox>
            </el-checkbox-group>
          <!-- </div> -->
          <!-- <div style="margin-top: 30px">
            <el-checkbox-group v-model="checkboxGroup1">
              <el-checkbox label="可烹饪" border></el-checkbox>
              <el-checkbox label="室外阳台" border></el-checkbox>
              <el-checkbox label="独立卫浴" border></el-checkbox>
            </el-checkbox-group>
          </div> -->
        </div>
      </div>
      <div id = 'downerRank'>
        <div id = 'rankText'>
          最符合条件的学校
        </div>
        <div id = 'rankContent'>
          <record v-for="(item, index) in collegeAndRate" :key="index"
        :msg = item.college :value = item.rate
        ></record>
        </div>
        <!-- <record v-for="(item, index) in collegeAndRate" :key="index"
        :msg = item.college :value = item.rate
        ></record> -->
        <!-- <div id = 'rankContent1'>
          <record msg = "东南大学" value = "3.9" />
        </div>
        <div id = 'rankContent2'>
          <record msg = "南京大学" value = "3.8" />
        </div>
        <div id = 'rankContent3'>
          <record msg = "哈尔滨工业大学" value = "1.0" />
        </div>
        <div id = 'rankContent4'>
          <record msg = "华中科技大学" value = "4.0" />
        </div>
        <div id = 'rankContent5'>
          <record msg = "天津大学" value = "3.7" />
        </div> -->
      </div>
    </div>
  </div>

</div>
</template>

<script>
// const featureOptions = ['空调', '沙发', '洗衣机'];
import Label from '../../components/searchLabel.vue'
import Record from '../../components/rankRecord.vue'
export default {
  name: "welcome",
  components:{
    Label,
    Record,
  },
  data() {
    return {
      input: '',
      checkboxGroup: [],
      // features: featureOptions,
      // label1: String = "空调",
      // value: 3.7,
      // colors:['#3c85cb', '#3c85cb', '#3c85cb'],
      collegeAndRate: [
      {college:'东南大学', rate:'3.9'},
      {college:'南京大学', rate:'3.8'},
      {college:'哈尔滨工业大学', rate:'1.8'},
      {college:'华中科技大学', rate:'4.0'},
      {college:'天津大学', rate:'3.7'}]
    }
  },
  methods:{
    change(){
     
    },
    submit(){
      console.log(1);
    }
  }
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
  /* background-color: #ffffff; */
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
  /* background-color: aquamarine;  */
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
  background-color: rgb(245, 245, 245);
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
  /* background-color:#3c85cb; */
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
  top:10px;
  right:0px;
  left:-240px;
}

#markMark{
  position: absolute;
  bottom: 0px;
  top:15px;
  right:0px;
  left:-115px;
}

#slogan{
  grid-area: slogan;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
  /* background-color: white;  */
} 

#sloganContent{
  /* word-spacing: 10px;
  font-size: 15px; */
  text-align: center;
  /* background-color: white; */
  /* text-shadow: 2px; */
  position: absolute;
  bottom: 0px;
  top:40px;
  right:0px;
  left:0px;
}

/* #sloganText{
  word-spacing: 10px;
  font-size: 15px;
  /* text-align: center;
  background-color: white; 
  text-shadow: 2px; 
} */

#search{
  grid-area: search;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
  /* background-color: black; */
  text-align:center;
 
}

#searchInput{
  position: absolute;
  bottom: 0px;
  top:60px;
  right:325px;
  left:325px;
  /* background-color: black ; */
}

#downContainer{
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-rows: 100%;
  grid-template-areas:
  "downerLabel downerRank";
  width: 100%;
  height: 600px;
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#downerLabel{
  grid-area: downerLabel;
  /* background-color: #3c85cb; */
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#downerRank{
  grid-area: downerRank;
  /* background-color: aquamarine; */
  position: absolute;
  bottom: 0px;
  top:0px;
  right:0px;
  left:0px;
}

#labelText{
  color: #3c85cb;
  font-size: 35px;
  text-align: center;
  /* background-color: black; */
  position: absolute;
  bottom: 0px;
  top:50px;
  right:0px;
  left:0px;
}
#labelContent{
  position: absolute;
  bottom: 0px;
  top:200px;
  right:150px;
  left:150px;
  /* width:400px; */
  /* margin-top: 30px; */
  line-height: 60px;
  /* background-color: #3c85cb; */
}
#rankText{
  color: #3c85cb;
  font-size: 35px;
  text-align: center;
  height: 50px;
  position: absolute;
  bottom: 0px;
  top:50px;
  right:0px;
  left:0px;
}
/* #rankContent1{
  position: absolute;
  height: 50px;
  bottom: 0px;
  top:140px;
  right:0px;
  left:0px;
}
#rankContent2{
  position: absolute;
  bottom: 0px;
  top:190px;
  right:0px;
  left:0px;
}
#rankContent3{
  position: absolute;
  bottom: 0px;
  top:240px;
  right:0px;
  left:0px;
}
#rankContent4{
  position: absolute;
  bottom: 0px;
  top:290px;
  right:0px;
  left:0px;
}
#rankContent5{
  position: absolute;
  bottom: 0px;
  top:340px;
  right:0px;
  left:0px;
} */
#rankContent{
  position: absolute;
  bottom: 0px;
  top:140px;
  right:0px;
  left:0px;
  /* border: #3c85cb solid 2px; */
  line-height: 50px;
}

</style>
