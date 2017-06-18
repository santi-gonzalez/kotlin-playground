package net.sgonzalez.kplayground.instrumentation.java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptoUtils {
  private static final String MD5 = "MD5";

  public static String md5(final String s) {
    try {
      MessageDigest digest = java.security.MessageDigest.getInstance(MD5);
      digest.update(s.getBytes());
      byte messageDigest[] = digest.digest();
      StringBuilder hexString = new StringBuilder();
      for (byte aMessageDigest : messageDigest) {
        StringBuilder hash = new StringBuilder(Integer.toHexString(0xFF & aMessageDigest));
        while (hash.length() < 2) hash.insert(0, "0");
        hexString.append(hash);
      }
      return hexString.toString();
    } catch(NoSuchAlgorithmException exception) {
      exception.printStackTrace();
    }
    return "";
  }
}
