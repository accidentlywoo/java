package swexpertSuper;

class Camera {
	String name;
	int sheets;
	
	public void takePicture() {
		System.out.println(name+"으로 "+sheets+"번 사진을 찍는다.");
	}
}

class PolaroidCamera extends Camera {
	int batteryGage;
}


public class OverridingTest1 {
	public static void main(String[] args) {
		PolaroidCamera camera = new PolaroidCamera();
		camera.name = "x50";
		camera.sheets = 3;
		camera.takePicture();
	}
}
