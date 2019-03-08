package spring;

public class MemberInfoPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;
	
	/*
	 * 스프링 설정에서는 설정 메서드를 기준으로 프로퍼티 이름을 정한다.
	 * 즉, <property name="memberDao" ...> 설정을 사용한다.
	 */
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}
