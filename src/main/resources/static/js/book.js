var dummy = {
  ISBN: '0006',
  bookName: 'JavaScript DOM',
  author: 'jo',
  bookCount: 3
};
// var dummy = {
//   dummy: [
//     { ISBN: '0006', bookName: 'JavaScript DOM', author: 'jo', bookCount: 3 },
//     { ISBN: '0008', bookName: 'jojo奇妙冒险', author: '荒木', bookCount: 6 }
//   ]
// };

// console.log('dummy', dummy[1]);

$(document).ready(function() {
  $('#fun1').click(function() {
    $.ajax({
      dataType: 'json',
      url: '/index',
      type: 'POST',
      data: JSON.stringify(dummy),
      contentType: 'application/json; charset=utf-8',
      traditional: true,
      success: function(result) {
        console.log(result);
        // $('.show-content').html(result);
      }
    });
  });
});
