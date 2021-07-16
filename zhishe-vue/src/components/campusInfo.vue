<template>
    <div class="campusInfoWrapper">
        <div class="briefInfo"></div>
        <div class="briefComment"></div>
    </div>
</template>

<script>
    export default {
        name: "campusInfo"
    }
</script>

<style scoped>
    .campusInfoWrapper {
        height: 185px;
        width: 800px;
        /*border: #3c85cb solid 3px;*/
        box-shadow: 0 0 20px #cac6c6;
        /*margin-left: 30px;*/
    }

    .briefInfo {
        /*border: #3c85cb solid 3px;*/
        height: 30px;
        margin-top: 8px;

    }

    .briefComment {
        margin-top: 10px;
        /*border: #3c85cb solid 3px;*/
        height: 120px;
    }
</style>
