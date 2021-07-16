<template>
  <div class="colManagePage">

    <div class="collegeBar">
      <li v-for="college in collegeList">
        {{ college.name }}
      </li>
    </div>

    <div class="collegePart">
      <div class="collegeOutline">
        XXCollege
      </div>

      <div class="collegeDetail">

        <div class="campusList">
          left is campus list
        </div>

        <div class="commentList">
          right is the comment List
        </div>

      </div>
    </div>

  </div>
</template>

<script>
export default {
  name: "collegeManage",
  data: () => {
    return {
      collegeList: [
        {name: 'college1'},
        {name: 'college2'},
        {name: 'college3'},
        {name: 'college4'},
        {name: 'college5'},
        {name: 'college6'},
        {name: 'college7'},
      ],
    }

  }
}
</script>

<style scoped>
  .colManagePage {
    display: grid;
    grid-template-columns: 1fr 4fr;
    grid-template-areas: "collegeBar collegeDetail";

  }

  .collegeBar {
    display: gird;
    grid-area: collegeBar;
    border: saddlebrown solid;
  }

  .collegeDetail {
    display: gird;
    grid-area: collegeDetail;
    border: saddlebrown solid;
  }

</style>
