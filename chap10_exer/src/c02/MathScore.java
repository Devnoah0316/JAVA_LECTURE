package c02;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;
	
	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(MathScore o) {
		return this.score - o.score;
	}
	
	public String toString() {
		return name + ", " + score;
	}
	
	
	
	
}
