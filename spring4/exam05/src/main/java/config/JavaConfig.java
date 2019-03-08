package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;

@Configuration
public class JavaConfig {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	/* = <bean id="memberDao" class="spring.MemberDao">
	*	</bea>
	*/
	@Bean
	public MemberRegisterService memberRegSvc() {
		//다른 빈 객체를 의존으로 주입할 경우, 해당 빈 객체의 메서드를 호출해서 의존 객체를 구한다.
		return new MemberRegisterService(memberDao());
		// (memberDao()) == ref="memberDao"
	}
	
	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}

}
