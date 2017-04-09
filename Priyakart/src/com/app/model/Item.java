package com.app.model;
import javax.persistence.Entity;

@Entity
public class Item {
	private int itemId;
	private String itemName;
	private String itemType;
	private String itemSubType;
	private String itemBrand;
	private double itemMrp;
	private String transactinDateAndTime;
	private int marginDiscount;
	private double vendorMargin;
	private double rebateValue;
	private double specialServiceCost;
	private double vat;
	private String details;
	private String service;
	private int avaliableQuantity;
	private String shipmentMode;
	private String modeOfPayment;
	private int sellerId;
	private String status;
	private String itemSalesPrice;
	private String totalAmount;
	public Item() {
		super();
	}
	public Item(int itemId) {
		super();
		this.itemId = itemId;
	}
	public Item(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	public Item(int itemId, String itemName, String itemType) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, int avaliableQuantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, int avaliableQuantity,
			String shipmentMode) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, int avaliableQuantity,
			String shipmentMode, String modeOfPayment) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, int avaliableQuantity,
			String shipmentMode, String modeOfPayment, int sellerId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.sellerId = sellerId;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, int avaliableQuantity,
			String shipmentMode, String modeOfPayment, int sellerId, String status) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.sellerId = sellerId;
		this.status = status;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, int avaliableQuantity,
			String shipmentMode, String modeOfPayment, int sellerId, String status, String itemSalesPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.sellerId = sellerId;
		this.status = status;
		this.itemSalesPrice = itemSalesPrice;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, int marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, int avaliableQuantity,
			String shipmentMode, String modeOfPayment, int sellerId, String status, String itemSalesPrice,
			String totalAmount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.sellerId = sellerId;
		this.status = status;
		this.itemSalesPrice = itemSalesPrice;
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType + ", itemSubType="
				+ itemSubType + ", itemBrand=" + itemBrand + ", itemMrp=" + itemMrp + ", transactinDateAndTime="
				+ transactinDateAndTime + ", marginDiscount=" + marginDiscount + ", vendorMargin=" + vendorMargin
				+ ", rebateValue=" + rebateValue + ", specialServiceCost=" + specialServiceCost + ", vat=" + vat
				+ ", details=" + details + ", service=" + service + ", avaliableQuantity=" + avaliableQuantity
				+ ", shipmentMode=" + shipmentMode + ", modeOfPayment=" + modeOfPayment + ", sellerId=" + sellerId
				+ ", status=" + status + ", itemSalesPrice=" + itemSalesPrice + ", totalAmount=" + totalAmount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avaliableQuantity;
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((itemBrand == null) ? 0 : itemBrand.hashCode());
		result = prime * result + itemId;
		long temp;
		temp = Double.doubleToLongBits(itemMrp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((itemSalesPrice == null) ? 0 : itemSalesPrice.hashCode());
		result = prime * result + ((itemSubType == null) ? 0 : itemSubType.hashCode());
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		result = prime * result + marginDiscount;
		result = prime * result + ((modeOfPayment == null) ? 0 : modeOfPayment.hashCode());
		temp = Double.doubleToLongBits(rebateValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sellerId;
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((shipmentMode == null) ? 0 : shipmentMode.hashCode());
		temp = Double.doubleToLongBits(specialServiceCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((totalAmount == null) ? 0 : totalAmount.hashCode());
		result = prime * result + ((transactinDateAndTime == null) ? 0 : transactinDateAndTime.hashCode());
		temp = Double.doubleToLongBits(vat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vendorMargin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Item other = (Item) obj;
		if (avaliableQuantity != other.avaliableQuantity)
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (itemBrand == null) {
			if (other.itemBrand != null)
				return false;
		} else if (!itemBrand.equals(other.itemBrand))
			return false;
		if (itemId != other.itemId)
			return false;
		if (Double.doubleToLongBits(itemMrp) != Double.doubleToLongBits(other.itemMrp))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemSalesPrice == null) {
			if (other.itemSalesPrice != null)
				return false;
		} else if (!itemSalesPrice.equals(other.itemSalesPrice))
			return false;
		if (itemSubType == null) {
			if (other.itemSubType != null)
				return false;
		} else if (!itemSubType.equals(other.itemSubType))
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		if (marginDiscount != other.marginDiscount)
			return false;
		if (modeOfPayment == null) {
			if (other.modeOfPayment != null)
				return false;
		} else if (!modeOfPayment.equals(other.modeOfPayment))
			return false;
		if (Double.doubleToLongBits(rebateValue) != Double.doubleToLongBits(other.rebateValue))
			return false;
		if (sellerId != other.sellerId)
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (shipmentMode == null) {
			if (other.shipmentMode != null)
				return false;
		} else if (!shipmentMode.equals(other.shipmentMode))
			return false;
		if (Double.doubleToLongBits(specialServiceCost) != Double.doubleToLongBits(other.specialServiceCost))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalAmount == null) {
			if (other.totalAmount != null)
				return false;
		} else if (!totalAmount.equals(other.totalAmount))
			return false;
		if (transactinDateAndTime == null) {
			if (other.transactinDateAndTime != null)
				return false;
		} else if (!transactinDateAndTime.equals(other.transactinDateAndTime))
			return false;
		if (Double.doubleToLongBits(vat) != Double.doubleToLongBits(other.vat))
			return false;
		if (Double.doubleToLongBits(vendorMargin) != Double.doubleToLongBits(other.vendorMargin))
			return false;
		return true;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemSubType() {
		return itemSubType;
	}
	public void setItemSubType(String itemSubType) {
		this.itemSubType = itemSubType;
	}
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public double getItemMrp() {
		return itemMrp;
	}
	public void setItemMrp(double itemMrp) {
		this.itemMrp = itemMrp;
	}
	public String getTransactinDateAndTime() {
		return transactinDateAndTime;
	}
	public void setTransactinDateAndTime(String transactinDateAndTime) {
		this.transactinDateAndTime = transactinDateAndTime;
	}
	public int getMarginDiscount() {
		return marginDiscount;
	}
	public void setMarginDiscount(int marginDiscount) {
		this.marginDiscount = marginDiscount;
	}
	public double getVendorMargin() {
		return vendorMargin;
	}
	public void setVendorMargin(double vendorMargin) {
		this.vendorMargin = vendorMargin;
	}
	public double getRebateValue() {
		return rebateValue;
	}
	public void setRebateValue(double rebateValue) {
		this.rebateValue = rebateValue;
	}
	public double getSpecialServiceCost() {
		return specialServiceCost;
	}
	public void setSpecialServiceCost(double specialServiceCost) {
		this.specialServiceCost = specialServiceCost;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getAvaliableQuantity() {
		return avaliableQuantity;
	}
	public void setAvaliableQuantity(int avaliableQuantity) {
		this.avaliableQuantity = avaliableQuantity;
	}
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getItemSalesPrice() {
		return itemSalesPrice;
	}
	public void setItemSalesPrice(String itemSalesPrice) {
		this.itemSalesPrice = itemSalesPrice;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
}
