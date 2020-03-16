// var dummy = [[图书编号=0001,图书名称=JavaScript高级程序设计, 作者=Nicholas,图书数量=0], [图书编号=0002,图书名称=Head First jQuery, 作者=Ryan,图书数量=0], [图书编号=0003,图书名称=JavaScript DOM编程艺术, 作者=Jeremy,图书数量=0]]
var dummy = [
  { ISBN: '0006', bookName: 'JavaScript DOM', author: 'jo', bookCount: 3 },
  { ISBN: '0008', bookName: 'jojo奇妙冒险', author: '荒木', bookCount: 6 }
];
// console.log('dummy', dummy[1]);
console.log(dummy);
$(document).ready(function() {
  $('#fun1').click(function() {
    $.ajax({
      url: '/index',
      type: 'POST',
      data: dummy,
      success: function(result) {
        $('.show-content').html(result);
      }
    });
  });
});
