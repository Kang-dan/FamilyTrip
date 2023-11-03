package com.ssafy.enjoytrip.food.model;

public class FoodDto {
	String title;
	String address;
	String image;
	int areaCode;
	int foodCode;
	double mapy;
	double mapx;
	double distance;
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public int getFoodCode() {
		return foodCode;
	}
	public void setFoodCode(int foodCode) {
		this.foodCode = foodCode;
	}
	public double getMapy() {
		return mapy;
	}
	public void setMapy(double mapy) {
		this.mapy = mapy;
	}
	public double getMapx() {
		return mapx;
	}
	public void setMapx(double mapx) {
		this.mapx = mapx;
	}
	@Override
	public String toString() {
		return "FoodDto [title=" + title + ", address=" + address + ", image=" + image + ", areaCode=" + areaCode
				+ ", foodCode=" + foodCode + ", mapy=" + mapy + ", mapx=" + mapx + "]";
	}
	
}
