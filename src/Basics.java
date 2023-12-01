
public class Basics {
	public static void main(String[] args) {
		
		//immutable
		String s=new String("Archana");
		//s.concat("mahajan");
		System.out.println(s);//Archana
		String s0=s.concat("Kalaskar");
		s=s.concat("pune");
		System.out.println(s);
		System.out.println(s0);
		
		
		String s1=new String("max");
		String s2=new String("max");
		String s3="max";
		String s4="max";
	}

}
