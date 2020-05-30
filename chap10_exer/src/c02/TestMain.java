package c02;


public class TestMain {
	
	// 특정 클래스의 구현 클래스이거나, 특정 클래스의 서브 클래스일 경우에 extends 키워드를 사용한다.  
	// 제네릭 메서드는 타입매개변수에 대한 정의를 반환 타입 앞에 한다. 
	static <T extends Comparable<T>>T findBest(T[] a) { 
		
		// 반복문에 들어가기 전 첫번째 값을 기준으로 가장 큰 값을 찾아냄
		T best = a[0]; 
		
		for(int i = 0; i < a.length; i++) {
			// a[i]번째의 점수가 best객체의 점수보다 크다면  
			if(best.compareTo(a[i]) < 0) { 
				best = a[i]; // best 갱신
			}
		}
		
		// iteration 종료 후 가장 높은 점수인 best 객체 return 
		return best; 
	}
	
	static <T> T findScore(T[] a, String name) {
		for(T t : a) {
			// T 타입의 배열 원소인 t의 toString으로 name과, score를 전달받은다음, substring을 이용해 
			// 0번 index 부터 3번 인덱스까지 추출한다음 name과 같은지 비교
			if(t.toString().substring(0, 3).equals(name)) {
				//같다면 t를 반환
				return t;
			}
			
		}
		//찾으려하는 문자열이 없다면 null반환 
		return null;
	}
	
	public static void main(String[] args) {
		EnglishScore[] ea = {new EnglishScore("김삿갓", 77),
				new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
	
		MathScore[] ma = {new MathScore("김삿갓", 80), new MathScore("장영실", 98),
				new MathScore("홍길동", 70)};
		
		// 지역변수는 명시적으로 초기화 
		String name = null; 
	
		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));

		try {
			// name에 args의 0번째 값을 넣는다. 만약 인자가 없으면 예외 발생.
			name = args[0];
		}catch(Exception e) { // 예외종류가 만약 명령행 인자가 전달이 안되었을 경우에는 arrayoutofboundexpetion이 나오는데
			// 여러 종류의 예외나 특정종류의 예외에 대해서 단순한 처리라면 최상위의 Exception 타입을 인자로 사용 가능하다. 
			
			System.out.println("명령행 인자가 없습니다.");
			System.exit(0);
		}
		
		// 예외가 발생하지 않는 경우 
		System.out.println("영어  점수 : " + findScore(ea, name));
		System.out.println("수학  점수 : " + findScore(ma, name));
	}

}
