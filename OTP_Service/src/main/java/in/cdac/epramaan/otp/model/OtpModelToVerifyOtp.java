package in.cdac.epramaan.otp.model;

import java.util.UUID;

import com.google.gson.annotations.SerializedName;

public class OtpModelToVerifyOtp {
    
    @SerializedName("dept_id")
    public String dept_id;
    
    @SerializedName("txn_id")
    public String txn_id;
  
    @SerializedName("otp_value")
    public String otp_value;
    
    @SerializedName("timestamp")
    public String timestamp;
    
    @SerializedName("otp_as_hash")
    public String otp_as_hash;

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

	public String getOtp_value() {
		return otp_value;
	}

	public void setOtp_value(String otp_value) {
		this.otp_value = otp_value;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getOtp_as_hash() {
		return otp_as_hash;
	}

	public void setOtp_as_hash(String otp_as_hash) {
		this.otp_as_hash = otp_as_hash;
	}

	@Override
	public String toString() {
		return "OtpModelToVerifyOtp [dept_id=" + dept_id + ", txn_id=" + txn_id + ", otp_value=" + otp_value
				+ ", timestamp=" + timestamp + ", otp_as_hash=" + otp_as_hash + "]";
	}
    
    
    






    
    
    
    

}
