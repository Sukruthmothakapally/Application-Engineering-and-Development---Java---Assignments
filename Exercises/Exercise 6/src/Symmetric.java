//Demonstrate symmetric encryption and decryption of message sent between Alice and Bob -
//using AES-256 encryption with GCM/NoPadding cipher

import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Symmetric
{
    static String message = "Hi Bob! This is Alice. How are you?";
    public static final int AES_size = 256;
    public static final int IV_len = 12;
    public static final int Tag_len = 15;

    public static void main(String[] args) throws Exception
    {
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        keygen.init(AES_size);

        // Generating a Key
        SecretKey key = keygen.generateKey();
        byte[] IV = new byte[IV_len];
        SecureRandom rand = new SecureRandom();
        rand.nextBytes(IV);

        System.out.println("Alice's original message : " + message);
        byte[] encryptedmsg = encrypt(message.getBytes(), key, IV);
        System.out.println("Encrypted message : " + Base64.getEncoder().encodeToString(encryptedmsg));
        String decryptedmsg = decrypt(encryptedmsg, key, IV);
        System.out.println("Decrypted message received by Bob : " + decryptedmsg);
    }

    public static byte[] encrypt(byte[] message, SecretKey key, byte[] IV) throws Exception
    {
        // create Alice Cipher object
        Cipher Alice = Cipher.getInstance("AES/GCM/NoPadding");

        // Create SecretKeySpec
        SecretKeySpec spec = new SecretKeySpec(key.getEncoded(), "AES");

        // Create GCMParameterSpec
        GCMParameterSpec gcmspec = new GCMParameterSpec(Tag_len * 8, IV);

        // Initialize cipher to encrypt mode
        Alice.init(Cipher.ENCRYPT_MODE, spec, gcmspec);

        // Perform Encryption
        byte[] encryptmsg = Alice.doFinal(message);

        return encryptmsg;
    }

    public static String decrypt(byte[] message, SecretKey key, byte[] IV) throws Exception
    {
        // Create Bob Cipher object
        Cipher Bob = Cipher.getInstance("AES/GCM/NoPadding");

        // Create SecretKeySpec
        SecretKeySpec spec = new SecretKeySpec(key.getEncoded(), "AES");

        // Create GCMParameterSpec
        GCMParameterSpec gcmspec = new GCMParameterSpec(Tag_len * 8, IV);

        // Initialize cipher to decrypt mode
        Bob.init(Cipher.DECRYPT_MODE, spec, gcmspec);

        // Perform Decryption
        byte[] decryptmsg = Bob.doFinal(message);

        return new String(decryptmsg);
    }
}