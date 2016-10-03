package com.dataflowdeveloper;

import java.io.Serializable;

public class DroneData implements Serializable{

	private static final long serialVersionUID = 5457110266746842302L;
	private String datekey;
	private String fileName; 
	private String gPSAltitude; 
	private String gPSLatitude; 
	private String gPSLongitude; 
	private String orientation;
	private String geolat;
	private String geolong;
	private String inception;
	public String getDatekey() {
		return datekey;
	}
	public void setDatekey(String datekey) {
		this.datekey = datekey;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getgPSAltitude() {
		return gPSAltitude;
	}
	public void setgPSAltitude(String gPSAltitude) {
		this.gPSAltitude = gPSAltitude;
	}
	public String getgPSLatitude() {
		return gPSLatitude;
	}
	public void setgPSLatitude(String gPSLatitude) {
		this.gPSLatitude = gPSLatitude;
	}
	public String getgPSLongitude() {
		return gPSLongitude;
	}
	public void setgPSLongitude(String gPSLongitude) {
		this.gPSLongitude = gPSLongitude;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public String getGeolat() {
		return geolat;
	}
	public void setGeolat(String geolat) {
		this.geolat = geolat;
	}
	public String getGeolong() {
		return geolong;
	}
	public void setGeolong(String geolong) {
		this.geolong = geolong;
	}
	public String getInception() {
		return inception;
	}
	public void setInception(String inception) {
		this.inception = inception;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DroneData [datekey=");
		builder.append(datekey);
		builder.append(", fileName=");
		builder.append(fileName);
		builder.append(", gPSAltitude=");
		builder.append(gPSAltitude);
		builder.append(", gPSLatitude=");
		builder.append(gPSLatitude);
		builder.append(", gPSLongitude=");
		builder.append(gPSLongitude);
		builder.append(", orientation=");
		builder.append(orientation);
		builder.append(", geolat=");
		builder.append(geolat);
		builder.append(", geolong=");
		builder.append(geolong);
		builder.append(", inception=");
		builder.append(inception);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @param datekey
	 * @param fileName
	 * @param gPSAltitude
	 * @param gPSLatitude
	 * @param gPSLongitude
	 * @param orientation
	 * @param geolat
	 * @param geolong
	 * @param inception
	 */
	public DroneData(String datekey, String fileName, String gPSAltitude, String gPSLatitude, String gPSLongitude,
			String orientation, String geolat, String geolong, String inception) {
		super();
		this.datekey = datekey;
		this.fileName = fileName;
		this.gPSAltitude = gPSAltitude;
		this.gPSLatitude = gPSLatitude;
		this.gPSLongitude = gPSLongitude;
		this.orientation = orientation;
		this.geolat = geolat;
		this.geolong = geolong;
		this.inception = inception;
	}
	/**
	 * 
	 */
	public DroneData() {
		super();
	}
	
	
	
}
