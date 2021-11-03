package pojo;

public class History {
	private int userId;
	private int taxiId;
	private int time;
	private String pickupPoint;
	private String dropPoint;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTaxiId() {
		return taxiId;
	}
	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getPickupPoint() {
		return pickupPoint;
	}
	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}
	public String getDropPoint() {
		return dropPoint;
	}
	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}
	@Override
	public String toString() {
		return "History [userId=" + userId + ", taxiId=" + taxiId + ", time=" + time + ", pickupPoint=" + pickupPoint
				+ ", dropPoint=" + dropPoint + ", status=" + status + "]";
	}
	
}
