package JavaBasic;

public class Array {

	public static void main(String[] args) {
		int i[] = new int [7];
		i[0]=200;
		i[1]=300;
		i[2]=400;
		i[3]=680;
		i[4]=575;
		i[5]=800;
		i[6]=960;
		
		int sum=0;
		System.out.println(i.length);
		for(int a=0; a<i.length; a++) {
			sum=sum+i[a];
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

}
