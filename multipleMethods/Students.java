package multipleMethods;

public class Students {
	public void getStudentInfo1() {
		System.out.println( " id-004 ");
	}

	 public void getStudentInfo2() {
	   System.out.println( " id-004, name-sharmila");
     }
     public void getStudentInfo3() {
    	 System.out.println("ph-995266041,sarmila.eee@gmail.com");
     }
     public static void main(String[] args) {
    	 Students obj=new Students();
    	 obj.getStudentInfo1();
    	 obj.getStudentInfo2();
    	 obj.getStudentInfo3();
		
	}
}