package in.cdac.epramaan.otp.test;

import in.cdac.epramaan.otp.crypto.CryptoUtil;

public class OtpServiceTester004 {

	public static void main(String[] args) {

		final String secretKey = "d856b600-026d-4c3e-90ae-a834276f48c1";
		String encContent = "enter response string here which is received from verify otp url";
		String decContent = new CryptoUtil().decrypt(encContent, secretKey);
		System.out.println("Decrypted response=" + decContent);
	}

}
