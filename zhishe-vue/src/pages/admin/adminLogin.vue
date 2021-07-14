<template>
  <div id="container">
    <div id="upSpace"></div>
    <div id="middle">
      <div id="middleSpace">
        <div id="loginText">登录</div>
        <div id="account">
          <el-input
            placeholder="管理员账号"
            prefix-icon="el-icon-user-solid"
            v-model="input1"
            class="inputAccount"
          >
          </el-input>
        </div>
        <div id="password">
          <el-input
            placeholder="管理员密码"
            prefix-icon="el-icon-key"
            v-model="input2"
            show-password
            class="inputPassword"
          >
          </el-input>
        </div>
        <div id="buttonArea">
          <div id="login">
            <el-row>
              <el-button type="primary" round v-on:click="log_in">
                登录
              </el-button>
            </el-row>
          </div>
          <div id="register">
            <el-row>
              <el-button type="primary" round>注册</el-button>
            </el-row>
          </div>
        </div>
        <div id="loginService">
          <p id="serveText">如果想要了解更多，那么请联系我们~</p>
          <div id="textButton">
            <el-button type="text"> 找到我们 </el-button>
          </div>
        </div>
      </div>
    </div>
    <div id="downSpace"></div>
  </div>
</template>

<script>
export default {
  name: "adminLogin",
  data() {
    return {
      input1: "",
      input2: "",
    };
  },
  methods: {
    log_in() {
      if (input1 == "rains" && input2 == "123") console.log(0);
    },
  },
};
</script>

<style scoped>
#container {
  background-color: rgb(250, 250, 250);
  display: grid;
  grid-template-columns: 100%;
  grid-template-rows: 2fr 5fr 2fr;
  grid-template-areas:
    "upSpace"
    "middle"
    "downSpace";
  width: 100%;
  height: 768px;
  position: absolute;
  left: 0px;
  right: 0px;
  background: url("../../assets/bg01.jpg");
  background-size: cover;
}
#upSpace {
  grid-area: upSpace;
  position: absolute;
}
#middle {
  grid-area: middle;
  position: absolute; 
  top: 0px;
  bottom: 0px;
  left: 0px;
  right: 0px;
  /* display: grid;
  grid-template-columns: 100%;
  grid-template-rows: 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    "loginText"
    "account"
    "password"
    "buttonArea"
    "loginService";
  position: absolute; 
  top: 0px;
  bottom: 0px;
  left: 0px;
  right: 0px;
  border: wheat solid 2px; */
}
#middleSpace{
  display: grid;
  grid-template-columns: 100%;
  grid-template-rows: 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    "loginText"
    "account"
    "password"
    "buttonArea"
    "loginService";
  position: absolute;
  top: 0px;
  bottom: 0px;
  left: 0px;
  right: 0px;
  /* border: black solid 2px; */
}
#loginText {
  grid-area: loginText;
  /* border: wheat solid 2px; */
  width: 200px;
  height: 60px;
  position: absolute;
  top: 25px;
  bottom: 0px;
  left: 450px;
  right: 0px;
  /* border: wheat solid 2px; */
  font-size: 30px;
}
/* #texts{
  border: wheat solid 2px;
  position: absolute ;
  width:200px;
  height:60px;
  top:20px;
  bottom:0px;
  left:200px;
  right:0px;
  font-size: 30px;
} */
#account {
  grid-area: account;
  /* background-color: rgb(250, 250, 250); */
  position: absolute;
  top: 0px;
  bottom: 0px;
  left: 500px;
  right: 435px;
  /* border: wheat solid 2px; */
  /* width: 600px; */
  
  
}
.inputAccount >>> input {
  background-color: rgb(238, 230, 228);
  /* color: rgb(245, 245, 245); */
}
#password {
  grid-area: password;
  /* background-color: rgb(250, 250, 250); */
  /* color: rgb(245, 245, 245); */
  /* border: wheat solid 2px; */
  position: absolute;
  top: 0px;
  bottom: 0px;
  left: 500px;
  right: 435px;
  /* width:600px; */
  /* border: wheat solid 2px; */
}
.inputPassword >>> input {
  background-color: rgb(238, 230, 228);
}

#buttonArea {
  grid-area: buttonArea;
  /* border: wheat solid 2px; */
  position: absolute;
  top:0px;
  bottom:0px;
  left:0px;
  right:0px;
  /* width:100px; */
  /* left:685px; */
  /* top:25px; */
}

#login {
  /* border: wheat solid 2px; */
  position: absolute;
  top: 25px;
  bottom: 0px;
  left: 0px;
  right: 450px;
  /* width:100px; */
  /* border: wheat solid 2px; */
}

#register {
  /* border: wheat solid 2px; */
  position: absolute;
  top: 25px;
  bottom: 0px;
  left: 585px;
  right: 0px;
  /* width:100px; */
  /* border: wheat solid 2px; */
}
#loginService {
  grid-area: loginService;
  /* border: wheat solid 2px; */
  position: absolute;
  top:0px;
  bottom:0px;
  left:0px;
  right:0px;
  /* width:300px; */
  /* height:50px; */
  /* left:500px;
  top:20px; */
  /* color:white;
  box-shadow: 30 0 40px black;
  font-size: 16px; */
}
#serveText {
  color: white;
  text-shadow: 0 0 2px black;
  position: absolute;
  /* height:50px; */
  /* width: 300px; */
  left: 0px;
  top: 1px;
  bottom:0px;
  right:120px;
}
#textButton {
  position: absolute;
  height: 50px;
  left: 350px;
  top: 10px;
  bottom:0px;
  right:0px;
  /* border: wheat solid 2px; */
}
#downSpace {
  grid-area: downSpace;
  position: absolute;
  /* border: wheat solid 2px; */
  /* background: url("../../assets/loginFoot.jpg");
  background-position-x: -160px;
  background-position-y: -50px; */
  /* background-position-x: -50px; */
  /* background-size: cover; */
}
</style>
