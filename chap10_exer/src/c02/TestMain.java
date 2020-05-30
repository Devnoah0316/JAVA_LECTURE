package c02;


public class TestMain {
	
	// Ư�� Ŭ������ ���� Ŭ�����̰ų�, Ư�� Ŭ������ ���� Ŭ������ ��쿡 extends Ű���带 ����Ѵ�.  
	// ���׸� �޼���� Ÿ�ԸŰ������� ���� ���Ǹ� ��ȯ Ÿ�� �տ� �Ѵ�. 
	static <T extends Comparable<T>>T findBest(T[] a) { 
		
		// �ݺ����� ���� �� ù��° ���� �������� ���� ū ���� ã�Ƴ�
		T best = a[0]; 
		
		for(int i = 0; i < a.length; i++) {
			// a[i]��°�� ������ best��ü�� �������� ũ�ٸ�  
			if(best.compareTo(a[i]) < 0) { 
				best = a[i]; // best ����
			}
		}
		
		// iteration ���� �� ���� ���� ������ best ��ü return 
		return best; 
	}
	
	static <T> T findScore(T[] a, String name) {
		for(T t : a) {
			// T Ÿ���� �迭 ������ t�� toString���� name��, score�� ���޹�������, substring�� �̿��� 
			// 0�� index ���� 3�� �ε������� �����Ѵ��� name�� ������ ��
			if(t.toString().substring(0, 3).equals(name)) {
				//���ٸ� t�� ��ȯ
				return t;
			}
			
		}
		//ã�����ϴ� ���ڿ��� ���ٸ� null��ȯ 
		return null;
	}
	
	public static void main(String[] args) {
		EnglishScore[] ea = {new EnglishScore("���", 77),
				new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 99) };
	
		MathScore[] ma = {new MathScore("���", 80), new MathScore("�念��", 98),
				new MathScore("ȫ�浿", 70)};
		
		// ���������� ��������� �ʱ�ȭ 
		String name = null; 
	
		System.out.println("���� �ְ� ���� : " + findBest(ea));
		System.out.println("���� �ְ� ���� : " + findBest(ma));

		try {
			// name�� args�� 0��° ���� �ִ´�. ���� ���ڰ� ������ ���� �߻�.
			name = args[0];
		}catch(Exception e) { // ���������� ���� ����� ���ڰ� ������ �ȵǾ��� ��쿡�� arrayoutofboundexpetion�� �����µ�
			// ���� ������ ���ܳ� Ư�������� ���ܿ� ���ؼ� �ܼ��� ó����� �ֻ����� Exception Ÿ���� ���ڷ� ��� �����ϴ�. 
			
			System.out.println("����� ���ڰ� �����ϴ�.");
			System.exit(0);
		}
		
		// ���ܰ� �߻����� �ʴ� ��� 
		System.out.println("����  ���� : " + findScore(ea, name));
		System.out.println("����  ���� : " + findScore(ma, name));
	}

}
