package day0329;

public class Numex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int[][] num=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				num[i][j]=a++;
				System.out.print(num[i][j]+"\t");
			}
			a=1;
			System.out.println();
		}
		
	}

}
