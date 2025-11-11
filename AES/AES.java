import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES {
  public static void main(String args[]) throws Exception {
      String message = "Hello World";
      String key = "6736726738737523";
      
      SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(),"AES");
      Cipher cipher = Cipher.getInstance("AES");
      cipher.init(Cipher.ENCRYPT_MODE,secretKey);
      byte[] encrypted = cipher.doFinal(message.getBytes());
      System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));

      cipher.init(Cipher.DECRYPT_MODE,secretKey);
      byte[] decrypted = cipher.doFinal(encrypted);
      System.out.println("Decrypted: " + new String(decrypted));
  }
}
