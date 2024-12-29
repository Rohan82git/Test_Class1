package practice;

public class PracticeClass1 {

	public static void main(String[] args) {
		PracticeClass1 p = new PracticeClass1();
		int a =p.main("aa1 kan 33k s4h 5a7 89");
		System.out.println(a);
	}
	int main(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				count++;
			}
		}return count;
	}
}
