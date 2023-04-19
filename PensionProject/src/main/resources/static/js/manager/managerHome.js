
  // 삭제하는 함수
  function cancel() {
    const members = getMembers();
    const filteredMembers = members.filter((member) => member.id !== id);
    showMembers(filteredMembers);
  }
