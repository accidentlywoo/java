package proxyProject.proxyProject;

public interface Printable {
	public void setPrinterName(String name); // 이름 설정
	public String getPrinterName();//이름 획득
	public void print(String string); //문자열 표시
}
