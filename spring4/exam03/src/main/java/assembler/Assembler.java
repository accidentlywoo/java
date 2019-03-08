package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {
	
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler() {
		memberDao = new MemberDao();
		regSvc = new MemberRegisterService(memberDao);
		pwdSvc = new ChangePasswordService(memberDao);
	}
	/* 만약 MemberDao 클래스가 아니라 MemberDao 클래스를 상속받은 CachedMemberDao 클래스를 사용해야 한다면,
	 * Assembler에서 객체를 초기화해주는 부분의 코드만 변경해주면 된다.
	 * public Assembler(){
	 * 	memberDao = new CachedMemberDao();
	 * 	regSvc = new MemberRegisterService(memberDao);
	 * 	pwdSvc = new ChangePasswordService(memberDao)
	 * }
	 */
	
	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getRegSvc() {
		return regSvc;
	}

	public ChangePasswordService getPwdSvc() {
		return pwdSvc;
	}

	public MemberRegisterService getMemberRegisterService() {
		// TODO Auto-generated method stub
		return null;
	}

	public ChangePasswordService getChangePasswordService() {
		// TODO Auto-generated method stub
		return null;
	}
}
