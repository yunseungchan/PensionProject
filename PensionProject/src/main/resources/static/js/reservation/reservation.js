$(function(){
  // 예약된 날짜 배열
  var bookedDates = ['2023-05-01', '2023-05-15', '2023-05-25'];
  var reservation = {
      name: '홍길동',
      phone: '010-1234-5678',
      checkin: '2023-05-01',
      checkout: '2023-05-03',
      accommodationType: 'pension'
  };
  // 체크인 날짜 변경 시 체크아웃 날짜 최소값 변경
  document.getElementById('checkin').addEventListener('change', function () {
      var checkinDate = new Date(this.value);
      var checkoutDateInput = document.getElementById('checkout');
      var checkoutDate = new Date(checkoutDateInput.value);

      if (checkoutDate <= checkinDate) {
          checkoutDate.setDate(checkinDate.getDate() + 1);
          checkoutDateInput.valueAsDate = checkoutDate;
      }

      checkoutDateInput.min = this.value;
  });

  // 예약된 날짜 비활성화
  var dateInputs = document.querySelectorAll('input[type=date]');
  for (var i = 0; i < dateInputs.length; i++) {
      var dateInput = dateInputs[i];
      dateInput.addEventListener('input', function () {
          var selectedDate = this.value;
          var selectedDateObj = new Date(selectedDate);

          for (var j = 0; j < bookedDates.length; j++) {
              var bookedDateObj = new Date(bookedDates[j]);

              if (selectedDate === bookedDates[j]) {
                  alert('이미 예약된 날짜입니다.');
                  this.value = '';
                  return;
              }

              if (selectedDateObj.getTime() === bookedDateObj.getTime()) {
                  alert('이미 예약된 날짜입니다.');
                  this.value = '';
                  return;
              }
          }
      });
  }
});