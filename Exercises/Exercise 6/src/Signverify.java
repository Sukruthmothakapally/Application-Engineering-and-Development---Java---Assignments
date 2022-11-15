//Demonstrate signing a message and validating the signature using RSA-2048 keys between Alice and Bob

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class Signverify {
    public static void main(String... argv) throws Exception {

        //Fetch the original message from Asymmetric class
        Asymmetric a = new Asymmetric();
        String msg = a.original_msg;
        System.out.println("Alice's original message : " + msg);

        //Generating public and private keys using RSA
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048, new SecureRandom());
        KeyPair pair = generator.generateKeyPair();

        //Sign the message
        Signature private_sign = Signature.getInstance("SHA256withRSA");
        private_sign.initSign(pair.getPrivate());
        private_sign.update(msg.getBytes(StandardCharsets.UTF_8));

        byte[] signature = private_sign.sign();

        //Verify the signature
        Signature public_sign = Signature.getInstance("SHA256withRSA");
        public_sign.initVerify(pair.getPublic());
        public_sign.update(msg.getBytes(StandardCharsets.UTF_8));
        boolean verified = public_sign.verify(signature);
        System.out.println("Signature verified ? (True or False) : " + verified);

        //Encrypt the message using public key
        Cipher Alice = Cipher.getInstance("RSA");
        Alice.init(Cipher.ENCRYPT_MODE, pair.getPublic());
        System.out.println("encrypted message : "+Base64.getEncoder().encodeToString(Alice.doFinal(msg.getBytes())));

        byte[] cipher_msg = Alice.doFinal(msg.getBytes());

        //Decrypt the message using private key
        Cipher Bob = Cipher.getInstance("RSA");
        Bob.init(Cipher.DECRYPT_MODE, pair.getPrivate());

        String decrypt_msg = new String(Bob.doFinal(cipher_msg), StandardCharsets.UTF_8);

        System.out.println("Decrypted message received by Bob : "+decrypt_msg);
    }
}