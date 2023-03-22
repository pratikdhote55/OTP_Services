package in.cdac.epramaan.otp.model;

import java.util.UUID;

import com.google.gson.annotations.SerializedName;

public class OtpModelTest {
    
    @SerializedName("dept_id")
    public String dept_id;
    
    @SerializedName("txn_id")
    public String txn_id;
  
    @SerializedName("timestamp")
    public String timestamp;
   
    @SerializedName("purpose")
    public String purpose;
    
    @SerializedName("email")
    public String email;
   
    @SerializedName("otp_mode")
    public String otp_mode;
   
   
    @SerializedName("mobile_number")
    public String mobile_number;
    
    @SerializedName("signature")
    public String signature;


	public String getSignature() {
		return signature;
	}


	public void setSignature(String signature) {
		this.signature = signature;
	}


	public String getDept_id() {
		return dept_id;
	}


	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}


	public String getTxn_id() {
		return txn_id;
	}


	public void setTxn_id(String txn_id) {
		this.txn_id = txn_id;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getOtp_mode() {
		return otp_mode;
	}


	public void setOtp_mode(String otp_mode) {
		this.otp_mode = otp_mode;
	}


	public String getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}


	@Override
	public String toString() {
		return "OtpModelTest [dept_id=" + dept_id + ", txn_id=" + txn_id + ", timestamp=" + timestamp + ", purpose="
				+ purpose + ", email=" + email + ", otp_mode=" + otp_mode + ", mobile_number=" + mobile_number
				+ ", signature=" + signature + "]";
	}
   

}
