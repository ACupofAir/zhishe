<template>
    <div id = "wrapper">
        <div id = "first">

        </div>
        <div id = "second">
            <div>
                <p id = "slogan1">知舍，寻所想之舍</p>
            </div>
            <div>
                <p id = "slogan2">
                    与未来分享你的宿舍
                </p>
            </div>
        </div>
        <div id = "third">

        </div>
        <div id = "fourth">

        </div>
        <div id = "fifth">

        </div>
        <div id = "sixth">

        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>
#wrapper{
    display: grid;
    grid-template-rows: 2fr 1fr 2fr 1fr 2fr 1fr;
    grid-template-columns: 100%;
    grid-template-areas: 
    "first"
    "second"
    "third"
    "fourth"
    "fifth"
    "sixth";
    width: 100%;
    height: 1800px;
}
#first{
    /* border: 2px black solid; */
    background: url("../../assets/bg05.jpg");
}
#second{
    /* border: 2px black solid; */
    background-color: rgb(250,250,250);
    box-shadow: 0px 0px 2px #3c85cb;
}
#third{
    /* border: 2px black solid; */
}
#fourth{
    /* border: 2px black solid; */
}
#fifth{
    /* border: 2px black solid; */
}
#sixth{
    /* border: 2px black solid; */
}
#slogan1{
    color: #3c85cb;
    /* text-align: left; */
    font-size: 35px;

}
</style>