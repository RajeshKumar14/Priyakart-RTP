package com.app.model;

import javax.persistence.Entity;

@Entity
public class Seller {
	private int sellerId;
    private String sellerFirstName;
	private String sellerLastName;
	private String sellerEmail;
	private String sellerSecEmail;
	private String mobileNo;
	private String dob;
	private String gender;
	private String Token;
	private String Pwd;
	private String language;
	private String interest;
	private Location loc;
	private Address addr;
	private ProfilePicture proImage;
	
	public Seller() {
		super();
	}
	public Seller(int sellerId) {
		super();
		this.sellerId = sellerId;
	}
	public Seller(int sellerId, String sellerFirstName) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender, String token) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender, String token, String pwd) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender, String token, String pwd,
			String language) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender, String token, String pwd,
			String language, String interest) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
		this.interest = interest;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender, String token, String pwd,
			String language, String interest, Location loc) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
		this.interest = interest;
		this.loc = loc;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender, String token, String pwd,
			String language, String interest, Location loc, Address addr) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
		this.interest = interest;
		this.loc = loc;
		this.addr = addr;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail,
			String sellerSecEmail, String mobileNo, String dob, String gender, String token, String pwd,
			String language, String interest, Location loc, Address addr, ProfilePicture proImage) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.sellerSecEmail = sellerSecEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
		this.language = language;
		this.interest = interest;
		this.loc = loc;
		this.addr = addr;
		this.proImage = proImage;
	}
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerFirstName=" + sellerFirstName + ", sellerLastName="
				+ sellerLastName + ", sellerEmail=" + sellerEmail + ", sellerSecEmail=" + sellerSecEmail + ", mobileNo="
				+ mobileNo + ", dob=" + dob + ", gender=" + gender + ", Token=" + Token + ", Pwd=" + Pwd + ", language="
				+ language + ", interest=" + interest + ", loc=" + loc + ", addr=" + addr + ", proImage=" + proImage
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pwd == null) ? 0 : Pwd.hashCode());
		result = prime * result + ((Token == null) ? 0 : Token.hashCode());
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((interest == null) ? 0 : interest.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((proImage == null) ? 0 : proImage.hashCode());
		result = prime * result + ((sellerEmail == null) ? 0 : sellerEmail.hashCode());
		result = prime * result + ((sellerFirstName == null) ? 0 : sellerFirstName.hashCode());
		result = prime * result + sellerId;
		result = prime * result + ((sellerLastName == null) ? 0 : sellerLastName.hashCode());
		result = prime * result + ((sellerSecEmail == null) ? 0 : sellerSecEmail.hashCode());
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
		Seller other = (Seller) obj;
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
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
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
		if (sellerEmail == null) {
			if (other.sellerEmail != null)
				return false;
		} else if (!sellerEmail.equals(other.sellerEmail))
			return false;
		if (sellerFirstName == null) {
			if (other.sellerFirstName != null)
				return false;
		} else if (!sellerFirstName.equals(other.sellerFirstName))
			return false;
		if (sellerId != other.sellerId)
			return false;
		if (sellerLastName == null) {
			if (other.sellerLastName != null)
				return false;
		} else if (!sellerLastName.equals(other.sellerLastName))
			return false;
		if (sellerSecEmail == null) {
			if (other.sellerSecEmail != null)
				return false;
		} else if (!sellerSecEmail.equals(other.sellerSecEmail))
			return false;
		return true;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerFirstName() {
		return sellerFirstName;
	}
	public void setSellerFirstName(String sellerFirstName) {
		this.sellerFirstName = sellerFirstName;
	}
	public String getSellerLastName() {
		return sellerLastName;
	}
	public void setSellerLastName(String sellerLastName) {
		this.sellerLastName = sellerLastName;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerSecEmail() {
		return sellerSecEmail;
	}
	public void setSellerSecEmail(String sellerSecEmail) {
		this.sellerSecEmail = sellerSecEmail;
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
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
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
