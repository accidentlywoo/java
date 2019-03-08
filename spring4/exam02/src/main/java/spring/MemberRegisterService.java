package spring;

import java.rmi.AlreadyBoundException;
import java.util.Date;

public class MemberRegisterService {
	private MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	/*public MemberRegisterService(MemberDao memberDao) {
	 *	this.memberDao = memberDao;
	 *}
	 * 의존 객체를 직접 생성하지 않는다. 생성자를 통해서 의존 객체를 전달받는다.
	 * 즉, 생성자를 통해 MemberRegisterService가 의존하고 있는 MeberDao 객체를 주입 받는 것이다.
	 * 의존 객체를 직접 구하지 않고 생성자를 통해서 전달받기 때문에, 이 코드는 DI(의존주입) 패턴을 따르고 있다.
	 */
	
	public void regist(RegisterRequest req) throws AlreadyExistingMemberException {
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) {
			throw new AlreadyExistingMemberException("dup email"+req.getEmail());
		}
		
		Member newMember = new Member(req.getEmail(),req.getPassword(),req.getName(),new Date());
		
		memberDao.insert(newMember);
	}
}
