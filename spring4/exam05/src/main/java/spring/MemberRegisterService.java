package spring;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	@Resource(name="memberDao")
	private MemberDao memberDao;
	
	//@Autowired(required=false) 생성자에 적용된 @Autowired 삭제
	public MemberRegisterService(MemberDao memberDao) {
		System.out.println("MemberRegisterService 주입:" + memberDao);
		this.memberDao = memberDao;
	}
	
	public MemberRegisterService() {
	}
	
	public void regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) {
			throw new AlreadyExistingMemberException("dup email"+req.getEmail());
		}
		Member newMember = new Member(req.getEmail(),req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}
}
