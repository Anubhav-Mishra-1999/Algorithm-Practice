import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String plaintext = sc.nextLine();
        int key = sc.nextInt();
        String ciphertext = "";
        char cc;
        if(key>26){
            key = key%26;
        }
        for(int i=0; i < plaintext.length();i++) 
        {
            cc = plaintext.charAt(i);
             
            if(cc >= 'a' && cc <= 'z') 
            {
             cc = (char) (cc + key);
              if(cc > 'z') { 
                cc = (char) (cc+'a'-'z'-1);
             }
             ciphertext = ciphertext +cc;
            }
            
            else if(cc >= 'A' && cc <= 'Z') {
             cc = (char) (cc + key);   
             if(cc > 'Z') {
                 cc = (char) (cc+'A'-'Z'-1);
             } 
             ciphertext = ciphertext + cc;
            }
            else {
             ciphertext = ciphertext + cc;   
            }
        
    }
    System.out.println(" ciphertext : " + ciphertext);
  }
}