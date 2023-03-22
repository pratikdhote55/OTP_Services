package in.cdac.epramaan.otp.test;

import in.cdac.epramaan.otp.crypto.CryptoUtil;

public class OtpServiceTester002 {

	public static void main(String[] args) {

		final String secretKey = "d856b600-026d-4c3e-90ae-a834276f48c1";
		String encContent = "enter your response string here";
		String decContent = new CryptoUtil().decrypt(encContent, secretKey);
		System.out.println("Decrypted response=" + decContent);
		
		//copy transaction id from decrypted response and go to file OtpServiceTester003.java
	}

}
