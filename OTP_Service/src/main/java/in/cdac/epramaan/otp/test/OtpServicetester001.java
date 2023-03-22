package in.cdac.epramaan.otp.test;

import java.sql.Timestamp;
import java.util.UUID;
import com.google.gson.Gson;
import in.cdac.epramaan.otp.crypto.CryptoUtil;
import in.cdac.epramaan.otp.model.OtpModelTest;
import in.cdac.epramaan.otp.model.OtpRequest;

public class OtpServiceTester001 {

	public static void main(String[] args) {
		
			final String secretKey = "d856b600-026d-4c3e-90ae-a834276f48c1";
			Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
			OtpModelTest otpModel = new OtpModelTest();
			otpModel.setDept_id("HYD_VAPT");
			otpModel.setMobile_number("user mobile number");
			otpModel.setEmail("your email id");
			otpModel.setOtp_mode("3");
            otpModel.setPurpose("CDAC");
			long time = System.currentTimeMillis();
			String timestamp = String.valueOf(time);
			otpModel.setTimestamp("" + timestamp);
			String transactionId = UUID.randomUUID().toString();
			otpModel.setTxn_id(transactionId);
			String data = new Gson().toJson(otpModel);
			String encryptedString = new CryptoUtil().encrypt(data, secretKey);
			OtpRequest otpRequest = new OtpRequest();
		
			otpRequest.setDept_id("HYD_VAPT");
			otpRequest.setData(encryptedString);
			String requestData = new Gson().toJson(otpRequest);
			System.out.println("Request Encrypted data=" + requestData);
		
			//copy output string and go to OtpServiceTester002.java
		
}

}
