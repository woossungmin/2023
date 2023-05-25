package DIP;

public class Games {
	public String title, version;
	public void Start() {
		System.out.println("게임명 : " + title);
		System.out.println("버전 : " + version);
		System.out.println(title + "을 시작합니다.\n");
	}
}
