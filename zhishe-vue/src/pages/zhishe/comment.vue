<template>
  <div class="commentPage">
    <!-- Three score items -->
    <div class="threeScores">
      <el-row :gutter="20">
        <el-col :span="8">
          <div class="">宿舍基础情况</div>
        </el-col>
        <el-col :span="16">
          <div class="">
            <el-slider v-model="basicInfoScore" :step="1" :max='5' show-stops>
            </el-slider>
          </div>
        </el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="8">
          <div class="">宿舍建筑情况</div>
        </el-col>
        <el-col :span="16">
          <div class="">
            <el-slider v-model="buildingScore" :step="1" :max='5' show-stops>
            </el-slider>
          </div>
        </el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="8">
          <div class="">宿舍位置情况</div>
        </el-col>
        <el-col :span="16">
          <div class="">
            <el-slider v-model="locationScore" :step="1" :max='5' show-stops>
            </el-slider>
          </div>
        </el-col>
      </el-row>
    </div>



    <!-- Four ckeck boxes -->
    <div class="fourChecks">

      <div class="yearIn checkBox">
        <span class="checkBoxLeft">入住年份</span>
        <div class="checkBoxRight">
          <el-date-picker v-model="yearIn" type="year" placeholder="选择年"></el-date-picker>
        </div>
      </div>

      <div class="grade checkBox">
        <span class="checkBoxLeft">你的年级</span>
        <div class="checkBoxRight">
          <el-input-number v-model="gradeNum" :step="1" step-strictly min="0" max="5"></el-input-number>
        </div>
      </div>

      <div class="scale checkBox">
        <span class="checkBoxLeft">住宿规模</span>
        <div class="checkBoxRight">
          <el-input-number v-model="scale" :step="1" step-strictly min="0" max="5"></el-input-number>
        </div>
      </div>

      <div class="isRecommend checkBox">
        <span class="checkBoxLeft">是否推荐</span>
        <div class="checkBoxRight">
          <el-switch v-model="isRecommend" active-color="#13ce66" inactive-color="#ff4949">
          </el-switch>
        </div>
      </div>
    </div>



    <!-- specialTags -->
    <div class="specialTags">

      <div class="refrigerator tag">
        <span class="tagLeft">
          <img src="../../assets/comment/refrigerator.svg" height="30" width="30" alt="" title="冰箱">
        </span>
        <span class="tagRight">
          <el-switch v-model="hasRefrigerator" active-color="#13ce66" inactive-color="#ff4949">
          </el-switch>
        </span>
      </div>

      <div class="sofa tag">
        <span class="tagLeft">
          <img src="../../assets/comment/sofa.svg" height="30" width="30" alt="" titel="沙发">
        </span>
        <span class="tagRight">
          <el-switch v-model="hasSofa" active-color="#13ce66" inactive-color="#ff4949">
          </el-switch>
        </span>
      </div>

      <div class="washer tag">
        <span class="tagLeft">
          <img src="../../assets/comment/washer.svg" height="30" width="30" alt="" title="洗衣机">
        </span>
        <span class="tagRight">
          <el-switch v-model="hasWasher" active-color="#13ce66" inactive-color="#ff4949">
          </el-switch>
        </span>
      </div>

      <div class="airConditionor tag">
        <span class="tagLeft">
          <img src="../../assets/comment/air-cool.svg" height="30" width="30" alt="" title="空调">
        </span>
        <span class="tagRight">
          <el-switch v-model="hasAirCool" active-color="#13ce66" inactive-color="#ff4949">
          </el-switch>
        </span>
      </div>

      <div class="cooker tag">
        <span class="tagLeft">
          <img src="../../assets/comment/cooker.svg" height="30" width="30" alt="" title="烹饪">
        </span>
        <span class="tagRight">
          <el-switch v-model="hasCooker" active-color="#13ce66" inactive-color="#ff4949">
          </el-switch>
        </span>
      </div>

      <div class="balcony tag">
        <span class="tagLeft">
          <img src="../../assets/comment/balcony.svg" height="30" width="30" alt="" title="阳台">
        </span>
        <span class="tagRight">
          <el-switch v-model="hasBalcony" active-color="#13ce66" inactive-color="#ff4949">
          </el-switch>
        </span>
      </div>
    </div>




    <!-- shortComment -->
    <div class="shortComment">
      <el-input type="textarea" :rows="5" placeholder="请输入你在宿舍的住宿体验，不要少于15个字符~" v-model="shortComment">
      </el-input>
    </div>


    <!-- cameraAndMail -->
    <div class="cameraAndMail">
      <span class="uploadImg">
        <el-upload class="upload-demo" drag action="https://jsonplaceholder.typicode.com/posts/" multiple>
          <i class="el-icon-upload"></i>
          <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
          <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过500kb</div>
        </el-upload>

      </span>
      <span class="submitEmail">
          <el-form-item label="email" prop="email" :rules="[
              { required: false, message: '若需反馈请填写邮箱'},
            ]">
            <el-input type="age" v-model.number="numberValidateForm.age" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="submitForm('numberValidateForm')">提交</el-button>
            <el-button @click="resetForm('numberValidateForm')">重置</el-button>
          </el-form-item>
        </el-form>

      </span>

    </div>

    </div>
</template>

<script>
  export default {
    name: "comment",
    data: () => {
      return {
        basicInfoScore: 3,
        buildingScore: 3,
        locationScore: 3,
        value2: 3,
        value3: 3,
        yearIn: "",
        gradeNum: "",
        scale: "",
        isRecommend: true,
        hasRefrigerator: false,
        hasSofa: false,
        hasWasher: false,
        hasAirCool: false,
        hasCooker: false,
        hasBalcony: false,
        shortComment: "",
        numberValidateForm: {
          email: ''
        }
      }
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            alert('submit!');
          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style scoped>
  .el-row {
    margin-bottom: 20px;
    /* box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04) */
  }

  .el-col {
    border-radius: 4px;
  }

  .bg-purple-dark {
    background: #99a9bf;
  }

  .bg-purple {
    background: #d3dce6;
  }

  .bg-purple-light {
    background: #e5e9f2;
  }

  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }

  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }

  .commentPage {
    display: grid;
    padding-left: 320px;
    padding-right: 320px;
    row-gap: 120px;

    grid-template-areas:
      "threeScores"
      "fourChecks"
      "specialTags"
      "shortComment"
      "cameraAndMail";

  }


  .threeScores {
    grid-area: threeScores;

  }

  .fourChecks {
    grid-area: fourChecks;
    display: grid;
    grid-template-columns: 1fr 1fr;
    grid-template-rows: 1fr 1fr;

    grid-template-areas:
      "yearIn grade"
      "scale isRecommend";

    row-gap: 20px;
    column-gap: 80px;
  }

  .specialTags {
    grid-area: specialTags;
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    grid-template-rows: 1fr 1fr;

    grid-template-areas:
      "refrigerator sofa washer"
      "airConditionor cooker balcony";

    row-gap: 20px;
    column-gap: 60px;

  }
  .tag {
    display: grid;

    grid-template-columns: 1fr 1fr;
    border-radius: 8px;

    column-gap: 80px;

    grid-template-areas: "tagLeft tagRight";
  }

  .tagLeft {
    grid-area: tagLeft;
    border-radius: 8px;
  }

  .tagRight {
    grid-area: tagRight;
    border-radius: 8px;
  }

  .refrigerator {
    grid-area: refrigerator;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .sofa {
    grid-area: sofa;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .washer {
    grid-area: washer;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .airConditionor {
    grid-area: airConditionor;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .cooker {
    grid-area: cooker;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .balcony {
    grid-area: balcony;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .shortComment {
    grid-area: shortComment;

    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .cameraAndMail {
    grid-area: cameraAndMail;
    display: grid;

    grid-template-columns: 1fr 1fr;
    grid-template-areas: "uploadImg submitEmail";
    column-gap: 70px;

  }

  .uploadImg {
    grid-area: uploadImg;

    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .submitEmail {
    grid-area: submitEmail;

    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .checkBox {
    display: grid;
    grid-template-columns: 1fr 1fr;

    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
    grid-template-areas: "checkBoxLeft checkBoxRight";
  }

  .checkBoxLeft {
    grid-area: checkBoxLeft;
    border-bottom-left-radius: 8px;
    border-top-left-radius: 8px;
    background-color: #0488D1;
  }

  .checkBoxRight {
    grid-area: checkBoxRight;
    border-bottom-right-radius: 8px;
    border-top-right-radius: 8px;
  }



  .yearIn {
    grid-area: yearIn;

  }

  .grade {
    grid-area: grade;
  }

  .scale {
    grid-area: scale;
  }

  .isRecommend {
    grid-area: isRecommend;
  }
</style>
