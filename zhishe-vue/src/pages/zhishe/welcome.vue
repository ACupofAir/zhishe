<template>
  <div id="container">
    <div id="upper">
      <div id="upContainer">
        <div id="mark">
          <div id="markLogo">
            <img src="../../assets/logo.png" alt="mark" v-on:click="toLogin" />
          </div>

          <!-- <img src="../../assets/logo.png" alt="mark"/> -->
          <div id="markMark">
            <img src="../../assets/mark.png" alt="mark" />
          </div>
          <!-- <img src="../../assets/mark.png" alt="mark"/> -->
        </div>
        <div id="slogan">
          <div id="sloganContent">
            <img src="../../assets/slogan.png" alt="slogan" />
          </div>
        </div>
        <div id="search">
          <div id="searchInput">
            <el-input
              placeholder="搜索你的学校"
              suffix-icon="el-icon-search"
              v-model="input"
              v-on:keyup.enter.native="submit"
            >
            </el-input>
            <!-- <input type="text" v-on:keyup.enter = "submit"/> -->
          </div>
        </div>
      </div>
    </div>

    <div id="middler"></div>

    <div id="downer">
      <div id="downContainer">
        <div id="downerLabel">
          <div id="labelText">选择你喜欢的宿舍特点</div>
          <div id="labelContent">
            <el-checkbox-group v-model="checkboxGroup" v-on:click="change()">
              <Label
                v-for="(item, index) in labelNames"
                :key="index"
                :msg="item.name"
                class="labelBox"
              ></Label>
            </el-checkbox-group>
          </div>
        </div>
        <div id="downerRank">
          <div id="rankText">最符合条件的学校</div>
          <div id="rankContent">
            <record
              v-for="(item, index) in collegeAndRate"
              :key="index"
              :msg="item.college"
              :value="item.rate"
            ></record>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Label from "../../components/searchLabel.vue";
import Record from "../../components/rankRecord.vue";
export default {
  name: "welcome",
  components: {
    Label,
    Record,
  },
  data() {
    return {
      input: "",
      checkboxGroup: [],
      collegeAndRate: [
        { college: "东南大学", rate: "3.9" },
        { college: "南京大学", rate: "3.8" },
        { college: "哈尔滨工业大学", rate: "1.8" },
        { college: "华中科技大学", rate: "4.0" },
        { college: "天津大学", rate: "3.7" },
      ],
      labelNames: [
        { name: "健身房" },
        { name: "空调" },
        { name: "洗衣机" },
        { name: "可烹饪" },
        { name: "室外阳台" },
        { name: "独立卫浴" },
        { name: "自习室" },
      ],
    };
  },
  methods: {
    change() {},
    submit() {
      // console.log(this.input);
      if (this.input != "") {
        location.href = "/college";
      } else {
        this.$message({
          message: "请输入内容",
          type: "warning",
        });
      }
    },
    toLogin() {
      location.href = "/adminLogin";
    },
  },
};
</script>

<style scoped>
#container {
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
  top: 0px;
  right: 0px;
  left: 0px;
}

#upper {
  grid-area: upper;
  /* width: 100%;
  height: 600px; */
  /* background-color: aquamarine;  */
  background: url("../../assets/arch.jpg");
  background-size: cover;
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
}

#middler {
  grid-area: middler;
  /* width: 100%;
  height: 150px; */
  background-color: rgb(245, 245, 245);
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
}

#downer {
  grid-area: downer;
  /* width: 100%;
  height: 600px; */
  /* background-color:#3c85cb; */
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
}

#upContainer {
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
  top: 0px;
  right: 0px;
  left: 0px;
}

#mark {
  grid-area: mark;
  position: absolute;
  bottom: 0px;
  top: 32px;
  right: 0px;
  left: 32px;
  /* background-color: aqua; */
  width: 300px;
  height: 50px;
}

#markLogo {
  position: absolute;
  bottom: 0px;
  top: 10px;
  right: 220px;
  left: 5px;
  width: 40px;
  /* background-color: aqua; */
  /* border: wheat solid 2px; */
}

#markMark {
  position: absolute;
  bottom: 0px;
  top: 15px;
  right: 150px;
  left: 50px;
  width: 80px;
  /* background-color: aqua; */
}

#slogan {
  grid-area: slogan;
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
  /* background-color: white;  */
}

#sloganContent {
  /* word-spacing: 10px;
  font-size: 15px; */
  text-align: center;
  /* background-color: white; */
  /* text-shadow: 2px; */
  position: absolute;
  bottom: 0px;
  top: 40px;
  right: 0px;
  left: 0px;
}

#search {
  grid-area: search;
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
  /* background-color: black; */
  text-align: center;
}

#searchInput {
  position: absolute;
  bottom: 0px;
  top: 60px;
  right: 325px;
  left: 325px;
  /* background-color: black ; */
}

#downContainer {
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-rows: 100%;
  grid-template-areas: "downerLabel downerRank";
  width: 100%;
  height: 600px;
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
}

#downerLabel {
  grid-area: downerLabel;
  /* background-color: #3c85cb; */
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
}

#downerRank {
  grid-area: downerRank;
  /* background-color: aquamarine; */
  position: absolute;
  bottom: 0px;
  top: 0px;
  right: 0px;
  left: 0px;
}

#labelText {
  color: #3c85cb;
  font-size: 35px;
  text-align: center;
  /* background-color: black; */
  position: absolute;
  bottom: 0px;
  top: 50px;
  right: 0px;
  left: 0px;
}
#labelContent {
  position: absolute;
  bottom: 0px;
  top: 200px;
  right: 150px;
  left: 150px;
  /* width:400px; */
  /* margin-top: 30px; */
  line-height: 60px;
  /* background-color: #3c85cb; */
}
#rankText {
  color: #3c85cb;
  font-size: 35px;
  text-align: center;
  height: 50px;
  position: absolute;
  bottom: 0px;
  top: 50px;
  right: 0px;
  left: 0px;
}

#rankContent {
  position: absolute;
  bottom: 0px;
  top: 140px;
  right: 0px;
  left: 0px;
  /* border: #3c85cb solid 2px; */
  line-height: 50px;
}

.labelBox {
  display: inline-block;
  margin-left: 30px;
}
</style>
