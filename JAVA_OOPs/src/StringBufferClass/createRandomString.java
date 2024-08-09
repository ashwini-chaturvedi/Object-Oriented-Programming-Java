package StringBufferClass;
import java.util.Random;
public class createRandomString {
    public String randomString(int size){
        Random rand=new Random();
        StringBuffer sb1=new StringBuffer();
       for(int i=0;i<size;i++){
           int randomChar=97+(int)(rand.nextFloat()*26);
           sb1.append((char)randomChar);
       }
        return sb1.toString();
    }
}
