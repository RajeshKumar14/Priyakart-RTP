package com.app.model;

import javax.persistence.Entity;

@Entity
public class Consumer 
 {
	private int consId;
	private String consFirstName;
	private String consLastName;
	private String consEmail;
	private String mobileNo;
	private String dob;
	private String gender;
	private String Token;
	private String Pwd;
	private String language;
	private String interest;
	private Address addr;
	private ProfilePicture proImage;
	
	public Consumer() {
	}
   
	public Consumer(int consId) {
		this.consId = consId;
	}

	public Consumer(int consId, String consFirstName) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
	}

	public Consumer(int consId, String consFirstName, String consLastName) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob, String gender) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob, String gender, String token) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob, String gender, String token, String pwd) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob, String gender, String token, String pwd, String language) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob, String gender, String token, String pwd, String language, String interest) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
		this.interest = interest;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob, String gender, String token, String pwd, String language, String interest, Address addr) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
		this.interest = interest;
		this.addr = addr;
	}

	public Consumer(int consId, String consFirstName, String consLastName, String consEmail, String mobileNo,
			String dob, String gender, String token, String pwd, String language, String interest, Address addr,
			ProfilePicture proImage) {
		super();
		this.consId = consId;
		this.consFirstName = consFirstName;
		this.consLastName = consLastName;
		this.consEmail = consEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
		this.interest = interest;
		this.addr = addr;
		this.proImage = proImage;
	}

	@Override
	public String toString() {
		return "Consumer [consId=" + consId + ", consFirstName=" + consFirstName + ", consLastName=" + consLastName
				+ ", consEmail=" + consEmail + ", mobileNo=" + mobileNo + ", dob=" + dob + ", gender=" + gender
				+ ", Token=" + Token + ", Pwd=" + Pwd + ", language=" + language + ", interest=" + interest + ", addr="
				+ addr + ", proImage=" + proImage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pwd == null) ? 0 : Pwd.hashCode());
		result = prime * result + ((Token == null) ? 0 : Token.hashCode());
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((consEmail == null) ? 0 : consEmail.hashCode());
		result = prime * result + ((consFirstName == null) ? 0 : consFirstName.hashCode());
		result = prime * result + consId;
		result = prime * result + ((consLastName == null) ? 0 : consLastName.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((interest == null) ? 0 : interest.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((proImage == null) ? 0 : proImage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumer other = (Consumer) obj;
		if (Pwd == null) {
			if (other.Pwd != null)
				return false;
		} else if (!Pwd.equals(other.Pwd))
			return false;
		if (Token == null) {
			if (other.Token != null)
				return false;
		} else if (!Token.equals(other.Token))
			return false;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (consEmail == null) {
			if (other.consEmail != null)
				return false;
		} else if (!consEmail.equals(other.consEmail))
			return false;
		if (consFirstName == null) {
			if (other.consFirstName != null)
				return false;
		} else if (!consFirstName.equals(other.consFirstName))
			return false;
		if (consId != other.consId)
			return false;
		if (consLastName == null) {
			if (other.consLastName != null)
				return false;
		} else if (!consLastName.equals(other.consLastName))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (interest == null) {
			if (other.interest != null)
				return false;
		} else if (!interest.equals(other.interest))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (proImage == null) {
			if (other.proImage != null)
				return false;
		} else if (!proImage.equals(other.proImage))
			return false;
		return true;
	}

	public int getConsId() {
		return consId;
	}

	public void setConsId(int consId) {
		this.consId = consId;
	}

	public String getConsFirstName() {
		return consFirstName;
	}

	public void setConsFirstName(String consFirstName) {
		this.consFirstName = consFirstName;
	}

	public String getConsLastName() {
		return consLastName;
	}

	public void setConsLastName(String consLastName) {
		this.consLastName = consLastName;
	}

	public String getConsEmail() {
		return consEmail;
	}

	public void setConsEmail(String consEmail) {
		this.consEmail = consEmail;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public ProfilePicture getProImage() {
		return proImage;
	}

	public void setProImage(ProfilePicture proImage) {
		this.proImage = proImage;
	}
 
}
