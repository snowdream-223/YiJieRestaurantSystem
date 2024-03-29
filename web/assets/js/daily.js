function reset() {
    //添加菜品重置
    document.getElementById("upload").value = "";
    $("#fileError").text("");
    document.getElementById("price").value = "";
    $("#priceError").text("");
    document.getElementById("dishName").value = "";
    $("#dishNameError").text("");
    document.getElementById("type").value = "0";
    $("#typeError").text("");

    //添加桌位重置
    $("#addDeskError").text("");
    $("#deskCode").val("");

    //添加用户重置
    $("#addUserCodeError").text("");
    $("#userCode").val("");
    $("#addUserNameError").text("");
    $("#userName").val("");
    $("#addUserPassWordError").text("");
    $("#userPassWord").val("");
    $("#addUserPhoneError").text("");
    $("#phone").val("");
    $("#addUserIdentityError").text("");
    $("#identity").val("");

}

$(function () {

    /*一级菜单*/
    $("#dishMenu1").click(function () {
        $("#dishMenu10").stop(true, true).slideToggle();
        $("#dishMenu20").hide();
        $("#dishMenu30").hide();
        $("#dishMenu40").hide();
        reset();
    });
    $("#dishMenu2").click(function () {
        $("#dishMenu20").stop(true, true).slideToggle();
        $("#dishMenu10").hide();
        $("#dishMenu30").hide();
        $("#dishMenu40").hide();
        reset();
    });
    $("#dishMenu3").click(function () {
        $("#dishMenu30").stop(true, true).slideToggle();
        $("#dishMenu10").hide();
        $("#dishMenu20").hide();
        $("#dishMenu40").hide();
        reset();
    });
    $("#dishMenu4").click(function () {
        $("#dishMenu40").stop(true, true).slideToggle();
        $("#dishMenu10").hide();
        $("#dishMenu20").hide();
        $("#dishMenu30").hide();
        reset();
    });

    /*菜品维护二级菜单*/
    $("#dishMenu21").click(function () {
        $("#dishMenu211").siblings().hide();
        $("#dishMenu211").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu22").click(function () {
        $("#dishMenu212").siblings().hide();
        $("#dishMenu212").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu23").click(function () {
        $("#dishMenu213").siblings().hide();
        $("#dishMenu213").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu24").click(function () {
        $("#dishMenu214").siblings().hide();
        $("#dishMenu214").stop(true, true).slideToggle();
        reset();
    });
    /*桌位维护二级菜单*/
    $("#dishMenu11").click(function () {
        $("#dishMenu111").siblings().hide();
        $("#dishMenu111").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu12").click(function () {
        $("#dishMenu112").siblings().hide();
        $("#dishMenu112").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu13").click(function () {
        $("#dishMenu113").siblings().hide();
        $("#dishMenu113").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu14").click(function () {
        $("#dishMenu114").siblings().hide();
        $("#dishMenu114").stop(true, true).slideToggle();
        reset();
    });
    /*账号维护二级菜单*/
    $("#dishMenu31").click(function () {
        $("#dishMenu311").siblings().hide();
        $("#dishMenu311").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu32").click(function () {
        $("#dishMenu312").siblings().hide();
        $("#dishMenu312").stop(true, true).slideToggle();
        reset();
    });
    /*	$("#dishMenu33").click(function(){
            $("#dishMenu313").siblings().hide();
            $("#dishMenu313").stop(true,true).slideToggle();
            reset();
        });*/
    $("#dishMenu34").click(function () {
        $("#dishMenu314").siblings().hide();
        $("#dishMenu314").stop(true, true).slideToggle();
        reset();
    });
    /*供应商维护二级菜单*/
    $("#dishMenu41").click(function () {
        $("#dishMenu411").siblings().hide();
        $("#dishMenu411").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu42").click(function () {
        $("#dishMenu412").siblings().hide();
        $("#dishMenu412").stop(true, true).slideToggle();
        reset();
    });
    $("#dishMenu43").click(function () {
        reset();
    });
    $("#dishMenu44").click(function () {
        $("#dishMenu414").siblings().hide();
        $("#dishMenu414").stop(true, true).slideToggle();
        reset();
    });

    /*查找菜品*/
    /*	$("#searchDish").click(function(){
            $("#searchDishResult").stop(true,true).slideToggle();
        });*/
    /*	$("#searchDish1").click(function(){
            $("#changeDish").stop(true,true).slideToggle();;
        });
        /!*查找桌位*!/
        $("#searchTab").click(function(){
            $("#searchTabResult").stop(true,true).slideToggle();
        });
        $("#searchTab1").click(function(){
            $("#changeTab").stop(true,true).slideToggle();;
        });
        /!*查找账号*!/
        $("#searchUser").click(function(){
            $("#searchUserResult").stop(true,true).slideToggle();
        });
        $("#searchUser1").click(function(){
            $("#changeUser").stop(true,true).slideToggle();;
        });
        /!*查找供应商*!/
        $("#searchGongying").click(function(){
            $("#searchGongyingResult").stop(true,true).slideToggle();
        });
        $("#searchGongying1").click(function(){
            $("#changeGongying").stop(true,true).slideToggle();;
        });*/
});