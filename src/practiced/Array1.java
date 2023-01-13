package practiced;

public class Array1 {
	
	//array: To store similar datatypes1 vales in array variable
			//array start zero index
			//size n; n - 1; 5-1= 4 (n is size of array)
			
			//Disadvantage:
			//Size is fixed
			//Store only similar data types

	public static void main(String[] args) {
		int i[] = new int [8];
		i[0] = 44;
		i[1] = 26;
		i[2] = 54;
		i[3] = 65;
		i[4] = 86;
		i[5] = 68;
		i[6] = 93;
		i[7] = 65;
		
		System.out.println(i.length);
	for(int a=0; a<=7; a++) {
		System.out.println(i[a]);
	}
   String str[] = new String[5];
   str[0] = "ajay";
	str[1] = "vijay";
	str[2] = "rajveer";
	str[3] = "Tarush";
	str[4] = "Shivkanya";
	System.out.println(str.length);
	for(int s=0; s<=4; s++) {
		System.out.println(str[s]);
	}
	double z[] = new double[4];
	z[0] = 22.33;
	z[1] = 43.5;
	z[2] = 56.35;
	z[3] = 57.84;
	
	double sum=0;
	for(int c=0; c<=3; c++) {
		sum=sum+z[c];
	}
	System.out.println(sum);
	
	char m[] = new char[4];
	m[0] = 'K';
	m[1] = 'o';
	m[2] = 'm';
	m[3] = 'l';

	for(int w=0; w<=3; w++) {
		System.out.println(m[w]);
	}
	
	}

}
