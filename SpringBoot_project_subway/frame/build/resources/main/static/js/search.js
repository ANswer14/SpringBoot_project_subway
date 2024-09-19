$('#searchInput').on('input', function() {
    var query = $('#searchInput').val();

    console.log(query);

    if (query.trim() === '') {
        $('#stationList').empty();
        return;
    }

    $.ajax({
        type: 'GET',
        url: '/goSearch/stations',
        data: { search: query},
        dataType: 'json',
        success: function (data) {
            console.log(data);
            $('#stationList').empty();

            data.forEach(function(station) {
                $('#stationList').append('<li>' + station.stationName + '</li>');
            });
        },
        error: function(err) {
            console.log('오류: ', err);
            alert('오류가 발생했습니다.');
        }
    });
});

$('#stationList').on('click', 'li', function() {
    console.log("클릭");
    var stationName = $(this).text();
    console.log(stationName);
    $('#searchInput').val(stationName);
    $('#staionList').empty();
})