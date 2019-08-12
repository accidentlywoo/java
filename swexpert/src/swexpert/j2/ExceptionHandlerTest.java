package swexpert.j2;

public class ExceptionHandlerTest {
	public static void main(String[] args) {
		System.out.println("Program start...");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(num1 / num2);
		}
		/*
		 * catch (Exception e) {
			System.out.println("문제 발생!");
			//한번에 처리할 수 있지만 구체적으로 알 슈 없음
		}
		*/
		catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌 수는 없습니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("명령행 매개변수 2 개가 필요합니다.");
		}catch (NumberFormatException e) {
			System.out.println("매개변수는 정수만 허용됩니다.");
		}catch (Exception e) {
			System.out.println("프로그램 수행 중 문제 발생!");
		} finally {
			System.out.println("무조건 수행되는 로직입니다.");
		}
		System.out.println("Program end...");
	}
}
