package in.cdac.epramaan.otp.test;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

import com.google.gson.Gson;

import in.cdac.epramaan.otp.crypto.CryptoUtil;
import in.cdac.epramaan.otp.model.OtpModelToVerifyOtp;
import in.cdac.epramaan.otp.model.OtpRequest;
import in.cdac.epramaan.otp.util.ConvertSHA2;

public class OtpServiceTester003 {

	public static void main(String[] args) {

		final String secretKey = "d856b600-026d-4c3e-90ae-a834276f48c1";

		OtpModelToVerifyOtp verifyOtp = new OtpModelToVerifyOtp();
		verifyOtp.setDept_id("HYD_VAPT");

		verifyOtp.setTxn_id("enter transaction id here");
		verifyOtp.setOtp_value("enter otp here");

		Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
		long time = System.currentTimeMillis();
		String timestamp = String.valueOf(time);
		verifyOtp.setTimestamp("" + timestamp);
		String otpvalue = verifyOtp.getOtp_value();
		ConvertSHA2 convertSHA2 = new ConvertSHA2();

		try {
			String otp_as_hash = convertSHA2.convertStringToSHA2(otpvalue);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("exception while creating hash : " + e);
		}

		String data = new Gson().toJson(verifyOtp);

		String encryptedString = new CryptoUtil().encrypt(data, secretKey);

		OtpRequest verifyOtprequest = new OtpRequest();
		verifyOtprequest.setDept_id("HYD_VAPT");
		verifyOtprequest.setData(encryptedString);
		String requestData = new Gson().toJson(verifyOtprequest);
		System.out.println("Request Encrypted data=" + requestData);
		
		//copy encrypted data, hit verify otp url and copy response from postman and go to file OtpServiceTester004
	}

}
