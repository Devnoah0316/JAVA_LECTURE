package c01;


public class TestMain {
	
	static EnglishScore findBest(EnglishScore[] a) {
		// �ݺ����� ���� �� ù��° ���� �������� ���� ū ���� ã�Ƴ�
		EnglishScore best = a[0]; 
		
		for(int i = 0; i < a.length; i++) {
			// a[i]��°�� ������ best��ü�� �������� ũ�ٸ�  
			if(best.compareTo(a[i]) < 0) { 
				best = a[i]; // best ����
			}
		}
	
		/*// compareTo �޼��带 �������̵� �߱� ������ ������������ Sorting ����
		// Arrays.sort�� ����ϴ� ��쿡�� ���� �迭�� ������ �ٲ�� ������ �迭�� elements������ �߿��� ��쿡�� ����ϴ� ���� ���� �� ��.
		Arrays.sort(a);  
		best = a[a.length-1]; */
		
		// iteration ���� �� ���� ���� ������ best ��ü return 
		return best; 
	}
	public static void main(String[] args) {
		EnglishScore[] ea = {new EnglishScore("���", 77),
				new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 99) };
	
		System.out.println("���� �ְ� ���� : " + findBest(ea));

	}

}
