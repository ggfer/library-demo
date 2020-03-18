var dummy = {
  ISBN: '0006',
  bookName: 'JavaScript DOM',
  author: '卓戈',
  bookCount: 3
};

var dummys = [
  { ISBN: '0006', bookName: 'JavaScript DOM', author: 'jo', bookCount: 3 },
  { ISBN: '0008', bookName: 'jojo奇妙冒险', author: '荒木', bookCount: 6 }
];

$(document).ready(function() {
  $('#fun1').click(function() {
    $.ajax({
      dataType: 'json',
      url: '/saveAll',
      type: 'POST',
      data: JSON.stringify(dummys),
      contentType: 'application/json; charset=utf-8',
      traditional: true,
      success: function(result) {
        $('.show-content').html('done.');
      },
      error: function(result) {
        $('.show-content').html('error.');
      }
    });
  });
});

$(document).ready(function() {
  $('#fun2').click(function() {
    $.ajax({
      dataType: 'json',
      url: '/save',
      type: 'POST',
      data: JSON.stringify(dummy),
      contentType: 'application/json; charset=utf-8',
      traditional: true,
      success: function(result) {
        $('.show-content').html('done.');
      },
      error: function(result) {
        $('.show-content').html('error.');
      }
    });
  });
});

$(document).ready(function() {
  $('#fun3').click(function() {
    console.log('fun3 clicked');
    $.ajax({
      dataType: 'json',
      url: '/findAll',
      type: 'POST',
      contentType: 'application/json; charset=utf-8',
      traditional: true,
      success: function(result) {
        console.log(result);
        $('.show-content').html(JSON.stringify(result));
      },
      error: function(result) {
        $('.show-content').html('error.');
      }
    });
  });
});

var id = 1;
$(document).ready(function() {
  $('#fun4').click(function() {
    console.log('fun4 clicked');
    $.ajax({
      url: '/findOne/' + id,
      type: 'POST',
      contentType: 'application/json; charset=utf-8',
      traditional: true,
      success: function(result) {
        console.log(result);
        $('.show-content').html(JSON.stringify(result));
      },
      error: function(result) {
        $('.show-content').html('error.');
      }
    });
  });
});

/**
 * GET Below
 */
//

$(document).ready(function() {
  $('#fun7').click(function() {
    console.log('fun7 clicked');
    $.ajax({
      dataType: 'json',
      url: '/findAll',
      type: 'GET',
      contentType: 'application/json; charset=utf-8',
      traditional: true,
      success: function(result) {
        console.log(result);
        $('.show-content').html(JSON.stringify(result));
      },
      error: function(result) {
        $('.show-content').html('error.');
      }
    });
  });
});

$(document).ready(function() {
  $('#fun8').click(function() {
    console.log('fun8 clicked');
    $.ajax({
      url: '/findOne/' + id,
      type: 'GET',
      contentType: 'application/json; charset=utf-8',
      traditional: true,
      success: function(result) {
        console.log(result);
        $('.show-content').html(JSON.stringify(result));
      },
      error: function(result) {
        $('.show-content').html('error.');
      }
    });
  });
});
