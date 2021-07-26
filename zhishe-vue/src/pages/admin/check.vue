<template>
  <div class="checkWrapper">

    <div class="searchHeader">

      <div class="searchtable" style="margin-top: 30px; margin-left:28px; width: 400px;">
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
      <el-table :data="tableData" border style="width: 100%; height:600">
        <el-table-column fixed prop="id" label="评论编号" width="155">
        </el-table-column>
        <el-table-column prop="college" label="学校" width="165">
        </el-table-column>
        <el-table-column prop="campus" label="校区" width="165">
        </el-table-column>
        <el-table-column prop="isNew" label="是否新添加" width="135">
        </el-table-column>
        <el-table-column prop="email" label="联系邮箱" width="245">
        </el-table-column>
        <el-table-column prop="state" label="当前状态" width="155">
        </el-table-column>
        <el-table-column fixed="right" label="操作" width="170">
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
      input: '',
      select: '',
      tableData: [{
        id: '000001',
        college: '东南大学',
        campus: '九龙湖校区',
        isNew: '是',
        email: '123456789@qq.com',
        state: '审核通过',
      },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
        {
          id: '000001',
          college: '东南大学',
          campus: '九龙湖校区',
          isNew: '是',
          email: '123456789@qq.com',
          state: '审核通过',
        },
      ]
    }
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
