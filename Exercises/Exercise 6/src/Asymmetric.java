//Demonstrate asymmetric encryption and decryption of message sent between Alice and Bob
//Use RSA-2048 encryption ECB / PKCS1 Padding

import java.security.*;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class Asymmetric {
    static String original_msg= "Hi Bob! This is Alice. How are you?";
    public static void main(String[] args) throws Exception {
        String message_a = Asymmetric.original_msg;

        // Generating public and private keys using RSA
        Map<String, Object> keys = getRSAKeys();
        PrivateKey private_key = (PrivateKey) keys.get("private");
        PublicKey public_key = (PublicKey) keys.get("public");

        System.out.println("Original message sent by Alice: " + message_a);
        String encryptedmsg = encryptMessage(message_a, private_key);
        System.out.println("Encrypted message : " + encryptedmsg);
        String descryptedmsg = decryptMessage(encryptedmsg, public_key);
        System.out.println("Decrypted message received by Bob : " + descryptedmsg);

    }

    // Get RSA keys with key size : 2048.
    private static Map<String,Object> getRSAKeys() throws Exception {
        KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
        keygen.initialize(2048);
        KeyPair keys = keygen.generateKeyPair();
        PrivateKey private_key = keys.getPrivate();
        PublicKey public_key = keys.getPublic();

        Map<String, Object> key_map = new HashMap<String, Object>();
        key_map.put("private", private_key);
        key_map.put("public", public_key);
        return key_map;

    }

    // Decrypt using RSA public key
    private static String decryptMessage(String message, PublicKey public_key) throws Exception {
        // create Alice Cipher object
        Cipher Alice = Cipher.getInstance("RSA");
        Alice.init(Cipher.DECRYPT_MODE, public_key);
        return new String(Alice.doFinal(Base64.getDecoder().decode(message)));
    }

    // Encrypt using RSA private key
    private static String encryptMessage(String message, PrivateKey private_key) throws Exception {
        Cipher Bob = Cipher.getInstance("RSA");
        Bob.init(Cipher.ENCRYPT_MODE, private_key);
        return Base64.getEncoder().encodeToString(Bob.doFinal(message.getBytes()));
    }

}