package String;

public class RevereAString {

	public static void main(String[] args) {
		
		String s = "  a good   example   ";
		
		char ch[] = s.toCharArray();
        int len = ch.length;
        
        String re_s = "";
        
        for(int i = len-1; i>=0; i--)
        {
        	
            if(ch[i]==' ')
            {
            	
                continue;
            }
            else
            {
                char temp_ch[] = new char[len];
                int j=0;
                while(i>=0 && ch[i] != ' ' )
                {
                    temp_ch[j] = ch[i];
                    i--;
                    j++;
                }
                for(int k=j-1; k>=0; k--)
                {
                    re_s += temp_ch[k];
                }
                re_s += " ";
                
            }
        }
        System.out.print(re_s.trim());

	}

}
