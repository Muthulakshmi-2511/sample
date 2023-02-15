package week2.day2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"Ranjith","Murali","Indhu","Deepa"};
		for(int i=0;i<name.length;i++)
		{
		System.out.println(name[i]);
		}
	}
}
int[] num= {1,4,5,2,6,3,9,7,8};

Arrays.sort(num);


System.out.println("sorted num : "+num[1]);


for (int i = 0; i < num.length; i++) {
    System.out.println(num[i]);
}
