<template>
  <div id="wrapper">
    <div id="first">
      <el-col :span="10">
        <div style="margin-top: 100px; text-shadow: 0 0 2px white">
          <h3 id="para1">
            欢迎来到
            <br />
            <span style="margin-left: -100px">知舍</span>
            <br />
            <span style="margin-left: 100px"> 寻你所想之舍 </span>
          </h3>
          <div style="margin-left: -20px">
            <p
              style="
                font-size: 20px;
                line-height: 36px;

                text-shadow: 0 0 2px white;
                color: #52505a;
              "
            >
              <span> 检索全国高校的宿舍 </span>

              <br />
              <span style="margin-left: -60px"> 找到你的需要 </span>
              <br />
              <span style="margin-left: -20px"> 发现最适合的宿舍 </span>
            </p>
          </div>
          <div style="margin-left: -120px; margin-top: 30px">
            <el-button type="text" class="use" @click="jump()">
              现在搜索
            </el-button>
          </div>
        </div>
      </el-col>
      <el-col :span="10">
        <div>
          <img
            src="../../assets/pub01.png"
            alt="s"
            style="
              width: 700px;
              height: 300px;
              border: 5px solid white;
              box-shadow: 0 0 5px #3c85cb;
              margin-top: 150px;
              margin-left: 60px;
            "
          />
        </div>
      </el-col>
    </div>
    <div id="second">
      <div style="margin-top: 50px; color: #3c85cb" v-on:click="toWhat">
        <el-button type="text" style="font-size: 20px"> 知舍是什么 </el-button>
        <div>
          <i class="el-icon-arrow-down" style="color: #3c85cb" />
        </div>
      </div>
      <div id="what" style="margin-top: 60px"></div>
    </div>
    <div id="third">
      <el-col :span="10" style="margin-top: 50px; margin-left: 80px">
        <div>
          <img
            src="https://gitee.com/thisisbadBao/imgrepo/raw/master/imgrepo1/20210715214908.jpeg"
            style="width:600px;height:600px；
              
              box-shadow: 0 0 5px #3c85cb;
              border: 3px solid #3c85cb;
              "
          />
        </div>
      </el-col>
      <el-col :span="10" style="margin-top: 20px">
        <el-row :gutter="200">
          <p style="font-size: 40px; margin-left: 230px; font-weight: 500">
            一个分享和查找高校住宿的平台
          </p>
        </el-row>
        <el-row
          style="
            line-height: 30px;
            margin-top: -50px;
            margin-left: 150px;
            color: #3c85cb;
          "
          :gutter="6"
        >
          我们为您提供想要了解的大学，拓宽选择之路
          <br />
          您为我们提供已经了解的大学，丰富后来住宿
        </el-row>
        <el-row :gutter="10">
          <el-col
            :span="6"
            style="margin-left: 220px"
            v-for="item in meanings"
            :key="item"
          >
            <el-row :gutter="120" style="line-height: 10px">
              <span>
                <i
                  class="el-icon-check"
                  style="color: #3c85cb; font-size: 20px"
                ></i>
              </span>
              {{ item }}
            </el-row>
          </el-col>
          <el-col :span="6">
            <!-- <el-row> -->
            <i
              class="el-icon-right"
              style="font-size: 80px; margin-left: 200px; color: #3c85cb"
            ></i>
            <!-- </el-row> -->
            <!-- <el-row style="margin-left:0px;
                    font-size:15px;
                    color:#3c85cb">
                        现在使用知舍
                    </el-row> -->
          </el-col>
        </el-row>
      </el-col>
    </div>
    <div id="fourth">
      <div style="margin-top: 10px; color: #3c85cb" v-on:click="toHow">
        <el-button type="text" style="font-size: 20px">
          怎么使用知舍
        </el-button>
        <div>
          <i class="el-icon-arrow-down" style="color: #3c85cb" />
        </div>
      </div>
      <div id="how" style="margin-top: 150px">
        <div>
          <h3 id="para2">知舍能做的事情</h3>
        </div>
        <div style="margin-top: -30px">
          <p>
            <span style="color: #5ea7ed"> 简洁的指引 </span>

            <span style="margin-left: 50px; color: #5ea7ed"> 简单的使用 </span>
          </p>
        </div>
      </div>
    </div>
    <div id="fifth">
      <div>
        <el-col
          :span="5"
          class="third_col"
          v-for="(item, index) in contents"
          :key="index"
        >
          <el-card shadow="hover">
            <div>
              <i :class="item.pic" class="grid-con-icon"></i>
            </div>
            <div style="color: #3c85cb; margin-top: 30px">
              {{ item.name }}
            </div>
            <div
              style="
                margin-top: 30px;
                margin-left: 80px;
                width: 120px;
                color: rgb(150, 150, 150);
                font-size: 20px;
              "
            >
              {{ item.des }}
            </div>
            <div style="margin-top: 80px">
              <i
                class="el-icon-caret-right"
                style="color: #3c85cb; font-size: 30px"
              ></i>
            </div>
          </el-card>
        </el-col>
      </div>
    </div>
    <div id="sixth">
      <div style="margin-top: 10px; color: #3c85cb" v-on:click="toUs">
        <el-button type="text" style="font-size: 20px">
          关于制作团队
        </el-button>
        <div>
          <i class="el-icon-arrow-down" style="color: #3c85cb" />
        </div>
      </div>
      <div id="us">
        <div
          style="
            color: #3c85cb;
            margin-top: 80px;
            font-size: 50px;
            font-weight: 300;
          "
        >
          与我们关联
        </div>
      </div>
    </div>
    <div id="seventh">
      <div style="margin-left:50px;
      margin-right:50px">
        <el-row :gutter="20">
          <el-col :span="12" >
              <div
              @mouseenter="enter(0)"
            @mouseleave="leave(0)">        
            <el-card shadow="hover" class="us1"
            style="height:220px"
            
            >
              <div>
                  <el-avatar
                    style="color: white;background-color:#5ea7ed;
                    font-size:40px"
                    class="el-icon-user"
                  />
                <div style="margin-top:20px;font-size:30px">
                    了解我们
                </div>
                <div style="margin-top:30px;font-size:15px;
                color:white"
                v-if="visible[0]">
                    河底摸鱼工作室
                    <br/>
                    人员和头发一样稀少
                </div>
              </div>
            </el-card>
            </div>
          </el-col>
          <el-col :span="12" >
              <div
              @mouseenter="enter(1)"
            @mouseleave="leave(1)">        
            <el-card shadow="hover" class="us1"
            style="height:220px"
            
            >
              <div>
                  <el-avatar
                    style="color: white;background-color:#5ea7ed;
                    font-size:40px"
                    class="el-icon-user"
                  />
                <div style="margin-top:20px;font-size:30px">
                    定位我们
                </div>
                <div style="margin-top:30px;font-size:15px;
                color:white"
                v-if="visible[1]">
                    江苏省南京市东南大学
                    <br/>
                    软件工程学院
                </div>
              </div>
            </el-card>
            </div>
          </el-col>
        </el-row>
      </div>
      <div style="margin-left:50px;
      margin-right:50px;
      margin-top:50px">
        <el-row :gutter="20">
          <el-col :span="12" >
              <div
              @mouseenter="enter(2)"
            @mouseleave="leave(2)"
            @click="move">        
            <el-card shadow="hover" class="us1"
            style="height:220px"
            
            >
              <div>
                  <el-avatar
                    style="color: white;background-color:#5ea7ed;
                    font-size:40px"
                    class="el-icon-user"
                  />
                <div style="margin-top:20px;font-size:30px">
                    联系我们
                </div>
                <div style="margin-top:30px;font-size:15px;
                color:white"
                v-if="visible[2]">
                    点击进入神秘空间
                    <br/>
                    然后找到我们
                </div>
              </div>
            </el-card>
            </div>
          </el-col> 
          <el-col :span="12" >
              <div
              @mouseenter="enter(3)"
            @mouseleave="leave(3)"
            @click="toMoney">        
            <el-card shadow="hover" class="us1"
            style="height:220px"
            
            >
              <div>
                  <el-avatar
                    style="color: white;background-color:#5ea7ed;
                    font-size:40px"
                    class="el-icon-user"
                  />
                <div style="margin-top:20px;font-size:30px">
                    打赏我们
                </div>
                <div style="margin-top:30px;font-size:15px;
                color:white"
                v-if="visible[3]">
                    轻击鼠标将下滑
                    <br/>
                    尽情投喂我们
                </div>
              </div>
            </el-card>
            </div>
          </el-col>
        </el-row>
      </div>
    
    </div>
    <div id="eighth">
        <div id ="money" style="margin-top:100px">
        <div>
          <h3 id="para2">鼓励我们的方式有很多种</h3>
        </div>
        </div>
        <el-col :span="5" style="margin-left:150px">
            <el-card shadow="never" style="border:none">
                <template #header>
                <div>
                    <i class = "el-icon-sugar" style="color:#3c85cb"></i>
                </div>
                <div style="color:#3c85cb">
                    耗费一点键盘
                </div>
                </template>

            </el-card>
        </el-col>
        <el-col :span="5" style="margin-left:150px">
            <el-card shadow="never" style="border:none">
                <template #header>
                <div>
                    <i class = "el-icon-coin" style="color:#3c85cb"></i>
                </div>
                <div style="color:#3c85cb">
                    耗费任意金钱
                </div>
                </template>
            </el-card>
        </el-col>
        <el-col :span="5" style="margin-left:150px">
            <el-card shadow="never" style="border:none">
                <template #header>
                <div>
                    <i class = "el-icon-coffee-cup" style="color:#3c85cb"></i>
                </div>
                <div style="color:#3c85cb">
                    耗费一点鼠标
                </div>
                </template>
            </el-card>
        </el-col>
    </div>
  </div>
</template>

<script>
export default {
  name: "about",
  data() {
    return {
      contents: [
        {
          pic: "el-icon-user",
          name: "后台管理",
          des: "审核来自四面八方的评论，共同维护我们的知舍",
        },
        {
          pic: "el-icon-office-building",
          name: "搜索学校",
          des: "检索你知道的学校，或者通过你需要的条件筛选",
        },
        {
          pic: "el-icon-school",
          name: "找到校区",
          des: "找到它们的校区，查看校区综合评分和基本条件",
        },
        {
          pic: "el-icon-chat-dot-square",
          name: "写下评论",
          des: "献出你的体会，帮助后来者快速地权衡利弊",
        },
      ],
      meanings: [
        "包含真实的中国高校",
        "提前了解我的准大学",
        "直接排除伪宣传学校",
        "审核之后的客观评论",
      ],
      flag: 0,
      visible:[
          {en:false},
          {en:false},
          {en:false},
          {en:false},
      ]
    };
  },
  methods: {
    toWhat() {
      //   location.href = "/";
      let el = document.getElementById("what");
      this.$nextTick(() => {
        el.scrollIntoView({ behavior: "smooth" });
      });
    },
    toHow() {
      //   location.href = "/";
      let el = document.getElementById("how");
      this.$nextTick(() => {
        el.scrollIntoView({ behavior: "smooth" });
      });
    },
    toUs() {
      //   location.href = "/";
      let el = document.getElementById("us");
      this.$nextTick(() => {
        el.scrollIntoView({ behavior: "smooth" });
      });
    },
    enter(t){
        this.visible[t].en = true;
        // console.log(this.visible[t].en);
    },
    leave(t){
        this.visible[t].en = false;
    },
    move(){
        location.href="/adminLogin"
    },
    toMoney() {
      //   location.href = "/";
      let el = document.getElementById("money");
      this.$nextTick(() => {
        el.scrollIntoView({ behavior: "smooth" });
      });
    }
  },
  mounted() {
  },
};
</script>

<style scoped>
.third_col {
  margin-left: 50px;
  margin-top: 80px;
}
.third_col:hover {
  border: 1px solid #3c85cb;
  box-shadow: 0 0 3px #3c85cb;
}
.el-card {
  /* box-shadow:0 0 2px red; */
}
.el-row {
  margin-bottom: 50px;
}
.us1{
    color:#3c85cb;
}
.us1:hover{
    background-color: #3c85cb;
    color:white;
    
}
#wrapper {
  display: grid;
  grid-template-columns: 100%;
  grid-template-rows: 2fr 1fr 2fr 1fr 2fr 1fr 2fr 2fr;
  grid-template-areas:
    "first"
    "second"
    "third"
    "fourth"
    "fifth"
    "sixth"
    "seventh"
    "eighth";
  width: 100%;
  height: 3900px;
}
#first {
  grid-area: first;
  /* border: 2px black solid; */
  background: url("../../assets/pub02.jpg");
  background-size: cover;
}
#second {
  grid-area: second;
  background-color: rgb(250, 250, 250);
  /* border: 2px black solid; */
}
#third {
  grid-area: third;
  /* border: 2px black solid; */

  background-color: rgb(253, 253, 253);
}
#fourth {
  grid-area: fourth;
  /* border: 2px black solid; */
  background-color: rgb(250, 250, 250);
}
#fifth {
  grid-area: fifth;
  /* border: 2px black solid; */
  background: url("../../assets/pub03.png");
  background-color: rgb(253, 253, 253);
  /* background: url("../../assets/bg05.jpg"); */
}
#sixth {
  grid-area: sixth;
  /* border: 2px black solid; */
}
#seventh {
  grid-area: seventh;
  /* border: 2px black solid; */
}
#eighth {
  grid-area: eighth;
  /* border: 2px black solid; */
  background-color: rgb(250, 250, 250);
}
#us {
  margin-top: 60px;
  margin-left: 50px;
  margin-right: 50px;
}
#para1 {
  color: #3c85cb;
  font-weight: 300;
  font-size: 50px;
  line-height: 60px;
}
.use {
  border: 2px solid white;
  box-shadow: 0 0 2px #3c85cb;
  padding: 12px;
  background-color: #3c85cb;
  color: white;
}
.use:hover {
  background-color: white;
  color: #3c85cb;
  border: 2px solid #3c85cb;
  box-shadow: 0 0 2px white;
}
#para2 {
  color: #3c85cb;
  font-weight: 300;
  font-size: 50px;
  line-height: 60px;
}
.grid-con-icon {
  /* margin-left: -2px; */
  font-size: 60px;
  width: 92px;
  height: 90px;
  line-height: 80px;
  color: #3c85cb;
  /* border: 1px solid #3c85cb; */
}
#para3 {
  text-align: left;
  color: #3c85cb;
  line-height: 100px;
}
</style>