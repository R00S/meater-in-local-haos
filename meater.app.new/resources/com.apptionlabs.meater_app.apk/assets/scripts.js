function setTemperatureScale(scale) {
    var elements = document.getElementsByClassName('temp');
    for (var i=0; i<elements.length; i++) {
        var val = elements[i].childNodes[0].nodeValue;
        elements[i].childNodes[0].nodeValue = convertToScale(val, scale);
    }
    var images = document.getElementsByClassName('temp_image');
    for (var i=0; i<images.length; i++) {
        var val = images[i].src;
        images[i].src = images[i].src.replace('celsius',scale);
    }
}
function convertToScale(value,scale) {
    if (scale == 'celsius') {
        return value;
    }
    return Math.round((value * 1.8)+32);
}