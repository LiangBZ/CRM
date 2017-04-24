$(document).ready(function(){
    $('#demo-fileInput-5').filer({
        limit: 3,
        maxSize: 3,
        extensions: ['jpg', 'jpeg', 'png', 'gif'],
        showThumbs: true,
        addMore: true
    });
});
