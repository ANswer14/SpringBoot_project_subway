let selectedImage = null;
let selectedImageSrc = null;
// 예제 사용
function selectImage(imgElement) {
    // 기존 선택된 이미지가 있다면 'selected' 클래스를 제거합니다.
    // console.log(imgElement.src);
    if (selectedImage) {
        selectedImage.classList.remove('selected');
    }
    // 클릭한 이미지를 선택된 이미지로 설정하고 'selected' 클래스를 추가합니다.

    imgElement.classList.add('selected');
    selectedImage = imgElement;
    selectedImageSrc = imgElement.src;
    // 프로필 이미지를 클릭한 이미지로 업데이트합니다.
    document.getElementById('selectedProfile').src = imgElement.src;
    document.getElementById('imagePath').value = selectedImageSrc;
    // console.log("후" + selectedImageSrc);
    // 모달을 닫습니다.
    hideModal();
}


function showModal() {
    document.getElementById('imageModal').style.display = 'block';
}

function hideModal() {
    document.getElementById('imageModal').style.display = 'none';
}

document.querySelector('form').addEventListener('submit', function(event) {
    // console.log("폼" + selectedImageSrc);
    if (selectedImageSrc) {
        document.getElementById('imagePath').value = selectedImageSrc;
    } else {
        document.getElementById('imagePath').value = 'http://localhost:8081/images/img_4.png'; // 기본값 설정
    }
});