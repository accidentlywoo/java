package swexpert.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class FileWriterAppendTest {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("./src/logFile.txt",true);
			
			Calendar calendar = Calendar.getInstance();
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int min = calendar.get(Calendar.MINUTE);
			int sec = calendar.get(Calendar.SECOND);
			String time = hour + "시" + min + "분" + sec + "초";
			String logMsg = time + "에 발생된 로그 메시지\n";
			writer.write(logMsg);
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
