package com.ammacollege.details.model;
import javax.persistence.*;

	@Entity
	@Table(name="Fees_details")
	public class FeesDetails {
		@Id
		@Column(name = "fee_id")
		public int feeId;

		@Column(name = "reg_no")
		public String regNo;
		
		@Column(name = "fees")
		public String fees;
		
		@Column(name = "fees_paid")
		public boolean feesreceived;

		public int getFeeId() {
			return feeId;
		}

		public void setFeeId(int feeId) {
			this.feeId = feeId;
		}

		public String getRegNo() {
			return regNo;
		}

		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}

		public String getFees() {
			return fees;
		}

		public void setFees(String fees) {
			this.fees = fees;
		}

		public boolean isFeesreceived() {
			return feesreceived;
		}

		public void setFeesreceived(boolean feesreceived) {
			this.feesreceived = feesreceived;
		}
	

}
