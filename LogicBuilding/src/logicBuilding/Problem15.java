package logicBuilding;
// Remove duplicate Character  from a String 
public class Problem15 {
	public static void main(String[] arg) {
		String s = "Ramjan";  // Taking String 
		String r ="";   // New String after removing duplicate 
		
		// Loop For removing duplicate 
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if(r.indexOf(ch) < 0){
				r = r + ch;
			}
		}
		 // final output
		System.out.println(r);
	}

}
