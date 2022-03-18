package example;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 5;
		System.out.println(++i); //전위형 ++i; -> j=i;
		
		System.out.println(j--); //후위형 j=i; -> i++;
		
		System.out.println("i = " + i + ",j = " +j);
		System.out.println(i+"+"+j+"="+(i+j));
		
	}

}
