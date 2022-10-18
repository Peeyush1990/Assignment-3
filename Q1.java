
class Q1 {
    public static void main(String args[]) {
                String s1 = "abcg";
                String s2 = "abcf";
                
                int length = Math.min(s1.length(),s2.length());
                int bigger_string = s1.length()>s2.length()?1:2; //if one string is longer, it's lexicographically greater 
        
                for (int i = 0 ; i<length ; i++){
                    if(s1.charAt(i) !=s2.charAt(i)){
                        if(((int)s1.charAt(i)) - ((int)s2.charAt(i))>0) bigger_string = 1; 
                            // if true unicode of char in first string is greater, so it's bigger  
                        else bigger_string = 2;
                    
                        break; //break loop at first mismatch
                    }
               }
                if(bigger_string==1) System.out.println(s2+"\n"+s1);
                else System.out.println(s1+"\n"+s2);
    }
}