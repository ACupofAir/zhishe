<template>
  <div class="checkWrapper">

    <div class="searchHeader">

      <div class="searchtable" style="margin-left:28px; width: 400px;">
        <el-input placeholder="请输入内容" v-model="input" class="input-with-select" style="margin-top: 25px;">
          <el-select v-model="select" slot="prepend" placeholder="请选择">
            <el-option label="评论编号" value="1"></el-option>
            <el-option label="学校" value="2"></el-option>
            <el-option label="校区" value="3"></el-option>
            <el-option label="是否新添加" value="4"></el-option>
            <el-option label="联系方式" value="5"></el-option>
            <el-option label="当前状态" value="6"></el-option>
          </el-select>
          <el-button slot="append" icon="el-icon-search"></el-button>
        </el-input>
      </div>

      <div class="searchbutton">
        <el-row>
          <div class="" style="margin-right:65%; margin-top: 30px;">
            <el-button type="primary" plain style="margin-right: 50px;">查询</el-button>
            <el-button type="info" plain>重置</el-button>
          </div>
        </el-row>
      </div>
    </div>

    <div class="checkList">
      <el-table :data="tableData" border style="width: 100%;" :stripe="isStripe">
        <el-table-column fixed prop="id" label="评论编号" width="155">
        </el-table-column>
        <el-table-column prop="campus" label="校区" width="165">
        </el-table-column>
        <el-table-column prop="isNewCampus" label="是否新添加校区" width="135">
        </el-table-column>
        <el-table-column prop="isNewSchool" label="是否新添加学校" width="135">
        </el-table-column>
        <el-table-column prop="email" label="联系邮箱" width="245">
        </el-table-column>
        <el-table-column prop="state" label="当前状态" width="155">
        </el-table-column>
        <el-table-column fixed="right" label="操作" width="170">
          <template slot-scope="scope">
            <el-button size="mini" @click="editComment(scope.$index)">编辑</el-button>
            <el-button size="mini" type="success"  @click="postComment(scope.$index)" v-if="tableData[scope.$index].state === '未发布'">发布</el-button>
            <el-button size="mini" type="success"  @click="CancelPostComment(scope.$index)" v-if="tableData[scope.$index].state === '已发布'">取消发布</el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>

  </div>


</template>

<script>
export default {
  name: "check",
  methods: {
    editComment () {

    },

    postComment (index) {
      let _this = this
      this.tableData[index].state = '已发布'
      console.log(this.tableData[index].id)
      this.$axios
          .post('/comment/updateState',
          {
            comment_id: _this.tableData[index].id,
            comment_state: 1
          })
      .then(response =>{
        console.log(response)
      })
      .catch(failResponse =>{
        console.log(failResponse.data)
      })
    },

    CancelPostComment (index) {
      this.tableData[index].state = '未发布'
    }
  },
  data() {
    return {
      input: '',
      select: '',
      tableData: [],
      isStripe: true,
    }
  },


  created() {
    let responseData = null
    let _this = this
    this.$axios
      .get('/comment/list/')
      .then(function (response) {
        responseData = response.data
        console.log(responseData)
        for(let item of responseData){
          _this.tableData.push({
            id: item.id,

            campus: item.campus,

            dorm: item.dorm,

            location: item.location,

            year: item.year,

            grade: item.grade,

            scale: item.scale,

            recommend: item.recommend,

            email: item.email,

            facilities: item.facilities,

            architecture: item.architecture,

            surrounding: item.surrounding,

            score: item.score,

            photo: item.photo,

            briefComment: item.briefComment,

            airConditioner: item.airConditioner,

            sofa: item.sofa,

            outdoorBalcony: item.outdoorBalcony,

            washingMachine: item.washingMachine,

            refrigerator: item.refrigerator,

            cooking: item.cooking,

            wifi: item.wifi,

            restroom: item.restroom,

            timeStamp: item.timeStamp,

            studyroom: item.studyroom,

            state: item.state? '已发布':'未发布',

            isNewSchool: item.isNewSchool? '是':'否',

            isNewCampus: item.isNewCampus? '是':'否',

            isChecked: item.isChecked,
          })
        }
        _this.tableData = _this.tableData.reverse()
        // console.log(_this.tableData)
      })
      .catch(failRes => {
        console.log(failRes.data)
        console.log("12321")
      })
  }
}
</script>

<style scoped>
.searchHeader {
  box-shadow: 0 0 20px #cac6c6;
  height: 150px;
  margin-top: 0px;

}

.checkList {
  margin-top: 15px;
  box-shadow: 0 0 20px #cac6c6;
  height: 500px;
}

.el-select .el-input {
  width: 130px;
}

.input-with-select .el-input-group__prepend {
  background-color: #fff;
}
</style>
