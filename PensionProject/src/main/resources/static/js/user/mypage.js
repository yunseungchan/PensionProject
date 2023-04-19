// 예약 취소 버튼 클릭 이벤트
document.querySelectorAll(".cancelBtn").forEach(function (btn) {
    btn.addEventListener("click", function (event) {
      if (confirm("정말로 예약을 취소하시겠습니까?")) {
        // 예약 취소 코드
        event.target.closest("tr").remove();
        // 예약 취소 알림 메시지
        alert("예약이 취소되었습니다.");
      }
    });
  });