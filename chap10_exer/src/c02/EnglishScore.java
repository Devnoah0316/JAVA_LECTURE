package c02;

public class EnglishScore implements Comparable<EnglishScore>{
	String name;
	int score;
	
	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name + ", " + score;
	}

	@Override
	//Comparable interface가 갖고있는 추상메서드 이므로 오버라이드 해주어야 한다. 
	public int compareTo(EnglishScore o) { 
		 // 현재 객체가 더 작으면 음수, 더 크면 양수를 같으면 0을 return.
		return this.score - o.score;
	}
	
}
