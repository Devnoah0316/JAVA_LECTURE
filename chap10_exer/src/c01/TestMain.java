package c01;


public class TestMain {
	
	static EnglishScore findBest(EnglishScore[] a) {
		// 반복문에 들어가기 전 첫번째 값을 기준으로 가장 큰 값을 찾아냄
		EnglishScore best = a[0]; 
		
		for(int i = 0; i < a.length; i++) {
			// a[i]번째의 점수가 best객체의 점수보다 크다면  
			if(best.compareTo(a[i]) < 0) { 
				best = a[i]; // best 갱신
			}
		}
	
		/*// compareTo 메서드를 오버라이드 했기 때문에 오름차순으로 Sorting 가능
		// Arrays.sort를 사용하는 경우에는 실제 배열의 순서가 바뀌기 때문에 배열의 elements순서가 중요한 경우에는 사용하는 것을 주의 할 것.
		Arrays.sort(a);  
		best = a[a.length-1]; */
		
		// iteration 종료 후 가장 높은 점수인 best 객체 return 
		return best; 
	}
	public static void main(String[] args) {
		EnglishScore[] ea = {new EnglishScore("김삿갓", 77),
				new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
	
		System.out.println("영어 최고 점수 : " + findBest(ea));

	}

}
