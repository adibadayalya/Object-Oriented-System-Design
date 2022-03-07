//Aditya Badayalya, 510819056
public class question_1 {
	
	int x = 0;
	
	static void meth(question_1 a) {
		System.out.println("Inside method meth");
		System.out.println("value of x in this object is " + a.x);
	}
	question_1(int x){
		this.x = x;
		meth(this);
	}

	public static void main(String[] args) {
		question_1 abc = new question_1(17);
		
	}

}