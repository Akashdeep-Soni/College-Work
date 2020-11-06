package String;

public class ReverseAStringInstructor {

	public static void main(String[] args) {

		String s = " a good  example   ";
		
		int i = s.length()-1;
        String ans = "";
        
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ') i--;
            int j = i;
            
            if(i<0) break;
            
            while(i>=0 && s.charAt(i)!=' ') i--;
            
            if(ans.isEmpty())
            ans = ans.concat(s.substring(i+1,j+1));
            else
            ans += " "+s.substring(i+1,j+1);

        }
        
        System.out.println(ans);

	}

}
