<template>
  <div class="checkWrapper">

    <div class="searchHeader">

      <div class="searchtable" style="margin-top: 30px; margin-left:15%; width: 800px;">
        <el-input placeholder="请输入内容" v-model="searchInput" class="input-with-select" style="margin-top: 25px;">
          <el-select v-model="select" slot="prepend" placeholder="请选择">
            <el-option label="地址" value="1"></el-option>
            <el-option label="学校" value="2"></el-option>
            <el-option label="校区" value="3"></el-option>
          </el-select>
          <el-button slot="append" icon="el-icon-search"></el-button>
        </el-input>
      </div>

      <div class="searchbutton">
        <el-row>
          <div class="" style="margin-right:0%; margin-top: 30px;">
            <el-button type="primary" plain style="margin-right: 50px;">查询</el-button>
            <el-button type="info" plain style="margin-right: 50px;">重置</el-button>
            <el-button type="primary" plain style="margin-right: 50px;">添加</el-button>
          </div>
        </el-row>
      </div>
    </div>

    <div class="checkList">
      <el-table :data="tableData" border style="width: 100%; height:600">
        <el-table-column prop="schoolName" label="学校" width="265">
        </el-table-column>
        <el-table-column prop="name" label="校区" width="265">
        </el-table-column>
        <el-table-column prop="address" label="地址" width="265">
        </el-table-column>
        <el-table-column fixed="right" label="操作" width="370">
          <template slot-scope="scope">
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">Edit</el-button>
            <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">Delete</el-button>
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
      handleClick(row) {
        console.log(row);
      }
    },

    data() {
      return {
        searchInput: '',
        select: '',
        tableData: [],
      }
    },

    created() {
      let responseData = null
      let _this = this
      this.$axios
        .get('/campus/list/')
        .then(function (response) {
          responseData = response.data
          _this.tableData = responseData
          console.log(_this.tableData)
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
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }



  .checkList {
    margin-top: 15px;
    box-shadow: 0 0 20px #cac6c6;
    height: 500px;
    box-shadow: 0 9px 9px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    border-radius: 8px;
  }

  .el-select .el-input {
    width: 130px;
  }

  .input-with-select .el-input-group__prepend {
    background-color: #fff;
  }
</style>