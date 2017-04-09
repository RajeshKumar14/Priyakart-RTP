package com.app.model;

import javax.persistence.Entity;

@Entity
public class Location {
	private int locId;
	private String locName;
	private String locType;
	private String locDist;
	private String locState;
	private String locCountry;
	private String locPinCode;
	private String locDate;
	private String locUpdateDate;
	public Location() {
		super();
	}
	public Location(int locId) {
		super();
		this.locId = locId;
	}
	public Location(int locId, String locName) {
		super();
		this.locId = locId;
		this.locName = locName;
	}
	public Location(int locId, String locName, String locType) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
	}
	public Location(int locId, String locName, String locType, String locDist) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
		this.locDist = locDist;
	}
	public Location(int locId, String locName, String locType, String locDist, String locState) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
		this.locDist = locDist;
		this.locState = locState;
	}
	public Location(int locId, String locName, String locType, String locDist, String locState, String locCountry) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
		this.locDist = locDist;
		this.locState = locState;
		this.locCountry = locCountry;
	}
	public Location(int locId, String locName, String locType, String locDist, String locState, String locCountry,
			String locPinCode) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
		this.locDist = locDist;
		this.locState = locState;
		this.locCountry = locCountry;
		this.locPinCode = locPinCode;
	}
	public Location(int locId, String locName, String locType, String locDist, String locState, String locCountry,
			String locPinCode, String locDate) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
		this.locDist = locDist;
		this.locState = locState;
		this.locCountry = locCountry;
		this.locPinCode = locPinCode;
		this.locDate = locDate;
	}
	public Location(int locId, String locName, String locType, String locDist, String locState, String locCountry,
			String locPinCode, String locDate, String locUpdateDate) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
		this.locDist = locDist;
		this.locState = locState;
		this.locCountry = locCountry;
		this.locPinCode = locPinCode;
		this.locDate = locDate;
		this.locUpdateDate = locUpdateDate;
	}
	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locName=" + locName + ", locType=" + locType + ", locDist=" + locDist
				+ ", locState=" + locState + ", locCountry=" + locCountry + ", locPinCode=" + locPinCode + ", locDate="
				+ locDate + ", locUpdateDate=" + locUpdateDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locCountry == null) ? 0 : locCountry.hashCode());
		result = prime * result + ((locDate == null) ? 0 : locDate.hashCode());
		result = prime * result + ((locDist == null) ? 0 : locDist.hashCode());
		result = prime * result + locId;
		result = prime * result + ((locName == null) ? 0 : locName.hashCode());
		result = prime * result + ((locPinCode == null) ? 0 : locPinCode.hashCode());
		result = prime * result + ((locState == null) ? 0 : locState.hashCode());
		result = prime * result + ((locType == null) ? 0 : locType.hashCode());
		result = prime * result + ((locUpdateDate == null) ? 0 : locUpdateDate.hashCode());
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
		Location other = (Location) obj;
		if (locCountry == null) {
			if (other.locCountry != null)
				return false;
		} else if (!locCountry.equals(other.locCountry))
			return false;
		if (locDate == null) {
			if (other.locDate != null)
				return false;
		} else if (!locDate.equals(other.locDate))
			return false;
		if (locDist == null) {
			if (other.locDist != null)
				return false;
		} else if (!locDist.equals(other.locDist))
			return false;
		if (locId != other.locId)
			return false;
		if (locName == null) {
			if (other.locName != null)
				return false;
		} else if (!locName.equals(other.locName))
			return false;
		if (locPinCode == null) {
			if (other.locPinCode != null)
				return false;
		} else if (!locPinCode.equals(other.locPinCode))
			return false;
		if (locState == null) {
			if (other.locState != null)
				return false;
		} else if (!locState.equals(other.locState))
			return false;
		if (locType == null) {
			if (other.locType != null)
				return false;
		} else if (!locType.equals(other.locType))
			return false;
		if (locUpdateDate == null) {
			if (other.locUpdateDate != null)
				return false;
		} else if (!locUpdateDate.equals(other.locUpdateDate))
			return false;
		return true;
	}
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLocType() {
		return locType;
	}
	public void setLocType(String locType) {
		this.locType = locType;
	}
	public String getLocDist() {
		return locDist;
	}
	public void setLocDist(String locDist) {
		this.locDist = locDist;
	}
	public String getLocState() {
		return locState;
	}
	public void setLocState(String locState) {
		this.locState = locState;
	}
	public String getLocCountry() {
		return locCountry;
	}
	public void setLocCountry(String locCountry) {
		this.locCountry = locCountry;
	}
	public String getLocPinCode() {
		return locPinCode;
	}
	public void setLocPinCode(String locPinCode) {
		this.locPinCode = locPinCode;
	}
	public String getLocDate() {
		return locDate;
	}
	public void setLocDate(String locDate) {
		this.locDate = locDate;
	}
	public String getLocUpdateDate() {
		return locUpdateDate;
	}
	public void setLocUpdateDate(String locUpdateDate) {
		this.locUpdateDate = locUpdateDate;
	}
	
}
