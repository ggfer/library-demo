function testAjax(yourData) {
  $.ajax({
    type: 'get', // 以get方式发起请求
    url: '/hello?helloDataName=' + yourData, // 将你的请求参数以问号拼接到url中进行参数传递
    success(data) {
      return 'asdif';
      // data为返回值
      // 成功后的回调方法
    }
  });
}

// // 前台传值方法
// function testAjax() {
//   $.ajax({
//     type: 'post', // 以post方式发起请求
//     url: '/hello', // 你的请求链接
//     data: {
//       // 提交数据
//       username: 'admin', // 前者为字段名，后者为数据
//       password: 'admin'
//     },
//     success(data) {
//       console.log('success -> data', data);
//       // data为返回值
//       // 成功后的回调方法
//     }
//   });
// }
