class Three{

	public static void main(String args[]){
	
		double a= 7480.748;
		int b =89;
		short c = 4567;
		byte d = 45;
		char ch = 'A';
		boolean e = true;
		
	// we can't use boolean in expression and the data type should be highest in the left side
		a =  a + b +c +d + ch ;
		System.out.println("value :"+a);
	}
}