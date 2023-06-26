package Chapter5.ch10리스트;

public class MemberArrayListTest {
  public static void main(String[] args) {
    MemberArrayList memberArrayList = new MemberArrayList();

    Member memberLee = new Member(1001, "이지훈");
    Member memberSon = new Member(1002, "손지훈");
    Member memberPark = new Member(1003, "박지훈");
    Member memberHong = new Member(1004, "홍지훈");

    memberArrayList.addMember(memberLee);
    memberArrayList.addMember(memberSon);
    memberArrayList.addMember(memberPark);
    memberArrayList.addMember(memberHong);
    
    memberArrayList.showAllMember();
    memberArrayList.removeMember(memberHong.getMemberId());
  }
}
