
public class AcceptArray {

	
	public static void acceptArray(String[] names) {
        for(int i = 0; i < names.length; ++i) {
            System.out.println(names[i].toUpperCase());
        }
	
	}   
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        	System.out.println(" array in uppercase:");
            String[] arr = new String[]{"vivek", "harshit", "okay"};
            acceptArray(arr);
        }
        
        
        

}

