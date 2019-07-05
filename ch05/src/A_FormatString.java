
public class A_FormatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 20;
		double height = 178.2;
		String name = "Hong Gil Dong";
		System.out.printf("name : %s \n", name); //이름 출력 v1(printf)
		System.out.println("name : "+name); // 이름출력 v2(println)
		System.out.print("name : " +name+"\n"); // 이름출력  v3(print)
		
		System.out.printf("age: %d \nheight: %e \n\n",age,height);
		
		System.out.printf("%d - %o - %x \n\n", 77,77,77);
		System.out.printf("%g \n",0.00014);
		System.out.printf("%g \n",0.000014);
		
	}

}
