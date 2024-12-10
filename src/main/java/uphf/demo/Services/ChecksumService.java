package uphf.demo.Services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.stereotype.Service;


@Service
public class ChecksumService {

    public String calculateChecksum(String input, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[] hash = messageDigest.digest(input.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
