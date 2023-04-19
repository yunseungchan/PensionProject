// 회원 목록을 가져오는 함수
function getMembers() {
    // 서버로부터 회원 목록을 가져오는 코드
    // ...
    const members = [
      { id: 1, name: "홍길동", email: "hong@example.com" },
      { id: 2, name: "김철수", email: "kim@example.com" },
      { id: 3, name: "이영희", email: "lee@example.com" },
    ];
    return members;
  }

  // 회원 목록을 화면에 출력하는 함수
  function showMembers(members) {
    const tbody = document.getElementById("members");
    tbody.innerHTML = "";
    members.forEach((member) => {
      const tr = document.createElement("tr");
      tr.innerHTML = `
        <td>${member.id}</td>
        <td>${member.name}</td>
        <td>${member.email}</td>
        <td>
          <button type="button" onclick="edit(${member.id})">수정</button>
          <button type="button" onclick="deleteMember(${member.id})">삭제</button>
          </td>
          `;
          tbody.appendChild(tr);
          });
          }
          // 검색 결과를 화면에 출력하는 함수
  function showSearchResult(members) {
    const tbody = document.getElementById("members");
    tbody.innerHTML = "";
    members.forEach((member) => {
      const tr = document.createElement("tr");
      tr.innerHTML = `
        <td>${member.id}</td>
        <td>${member.name}</td>
        <td>${member.email}</td>
        <td>
          <button type="button" onclick="edit(${member.id})">수정</button>
          <button type="button" onclick="deleteMember(${member.id})">삭제</button>
        </td>
      `;
      tbody.appendChild(tr);
    });
  }

  // 회원을 검색하는 함수
  function search() {
    const searchKeyword = document.getElementById("search").value;
    const members = getMembers();
    const searchResult = members.filter((member) => {
      return (
        member.name.includes(searchKeyword) ||
        member.email.includes(searchKeyword)
      );
    });
    showSearchResult(searchResult);
  }

  // 회원을 추가하는 함수
  function add() {
    const form = document.getElementById("memberForm");
    form.style.display = "block";
    form.reset();
    document.getElementById("id").value = "";
  }

  // 회원을 수정하는 함수
  function edit(id) {
    const form = document.getElementById("memberForm");
    form.style.display = "block";
    const members = getMembers();
    const member = members.find((m) => m.id === id);
    document.getElementById("id").value = member.id;
    document.getElementById("name").value = member.name;
    document.getElementById("email").value = member.email;
    document.getElementById("password").value = "";
  }

  // 회원을 삭제하는 함수
  function deleteMember(id) {
    // 서버로부터 회원을 삭제하는 코드
    // ...
    const members = getMembers();
    const filteredMembers = members.filter((member) => member.id !== id);
    showMembers(filteredMembers);
  }

  // 회원 정보를 저장하는 함수
  function save() {
    const id = document.getElementById("id").value;
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    // 서버로부터 회원 정보를 저장하는 코드
    // ...

    const members = getMembers();
    const member = { id: id || members.length + 1, name, email };
    const updatedMembers = id
      ? members.map((m) => (m.id === id ? member : m))
      : [...members, member];
    showMembers(updatedMembers);
    cancel();
  }

  // 입력 폼을 닫는 함수
  function cancel() {
    const form = document.getElementById("memberForm");
    form.style.display = "none";
  }

  // 초기 회원 목록을 출력합니다.
  showMembers(getMembers());
