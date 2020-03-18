var nav = document.querySelector('nav'); // 获取元素
window.onscroll = function() {
  //绑定滚动事件函数  注意点:必须有滚动条才能触发
  //获取document的滚动距离    ||兼容写法
  var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
  if (scrollTop >= 300) {
    //当滚动距离>=300时,让nav动态设置class为sty的样式
    // console.log(scrollTop);
    nav.className = 'sty';
  } else {
    nav.className = ''; //清除动态设置的样式
  }
};
