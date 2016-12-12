package com.dataflowdeveloper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("DataSourceService")
public class DataSourceService {

	Logger logger = LoggerFactory.getLogger(DataSourceService.class);

	@Autowired
	public Connection connection;

	// default to empty
	public DroneData defaultValue() {
		return new DroneData();
	}

	// querylimit
	@Value("${querylimit}")
	private String querylimit;

	private static String STATIC_HEADER="<html>\n<head>\n<title>Drone</title>\n</head>\n<body>\n";
	private static String STATIC_FOOTER="\n</body>\n</html>\n";
	
	/**
	 * html page
	 * @param tweetid
	 * @return String
	 */
	public String getDroneImages() {
		StringBuilder out = new StringBuilder(4096);		
		String sql = "";
		try {
			if ( connection == null) { 
				logger.error("Null connection");
				return STATIC_HEADER + "No data" + STATIC_FOOTER;
			}
            sql = "select datekey, fileName, gPSAltitude, gPSLatitude, gPSLongitude, orientation,geolat,geolong,inception from dronedata1 order by datekey asc";
            out.append(STATIC_HEADER);
			PreparedStatement ps = connection
					.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				try {
					out.append("<br><br>\n<table width=100%><tr><td valign=top><img src=\"");
					out.append("http://tspanndev10.field.hortonworks.com:50070/webhdfs/v1/drone/").append(res.getString("fileName")).append("?op=OPEN\"></td>");
					out.append("<td valign=top>Date: ").append(res.getString("datekey"));
					out.append("\n<br>Lat: ").append(res.getString("geolat"));
					out.append("\n<br>Long: ").append(res.getString("geolong"));
					out.append("\n<br>Altitude: ").append(res.getString("gPSAltitude"));
					out.append("\n<br>Lat: ").append(res.getString("gPSLatitude"));
					out.append("\n<br>Long: ").append(res.getString("gPSLongitude"));
					out.append("\n<br>Inception: ").append(res.getString("inception"));
					out.append("\n<br>Orientation: ").append(res.getString("orientation"));
//					out.append("\n<br>Sentiment:").append(res.getString("sentiment"));
//					out.append("\n<br>Simple Sentiment:").append(res.getString("stanfordsentiment"));
					out.append("\n<br><br>\n</td></tr></table>\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in search", e);
		}
		
		out.append(STATIC_FOOTER);
		return out.toString();
	}
	
	/**
	 * html page
	 * @param tweetid
	 * @return String
	 */
	public String getDroneImage(String fileName) {
		StringBuilder out = new StringBuilder(256);		
		String sql = "";
		try {
			if ( connection == null || fileName == null) { 
				logger.error("Null connection");
				return STATIC_HEADER + "No data" + STATIC_FOOTER;
			}
            sql = "select datekey, fileName, gPSAltitude, gPSLatitude, gPSLongitude, orientation,geolat,geolong,inception from dronedata1 where fileName=?";
            out.append(STATIC_HEADER);
			PreparedStatement ps = connection
					.prepareStatement(sql);
			ps.setString(1, fileName);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				try {
					out.append("<br><br>\n<table width=100%><tr><td valign=top><img src=\"");
					out.append("http://tspanndev10.field.hortonworks.com:50070/webhdfs/v1/drone/").append(res.getString("fileName")).append("?op=OPEN\"></td>");
					out.append("<td valign=top>Date: ").append(res.getString("datekey"));
					out.append("\n<br>Lat: ").append(res.getString("geolat"));
					out.append("\n<br>Long: ").append(res.getString("geolong"));
					out.append("\n<br>Altitude: ").append(res.getString("gPSAltitude"));
					out.append("\n<br>Lat: ").append(res.getString("gPSLatitude"));
					out.append("\n<br>Long: ").append(res.getString("gPSLongitude"));
					out.append("\n<br>Inception: ").append(res.getString("inception"));
					out.append("\n<br>Orientation: ").append(res.getString("orientation"));
//					out.append("\n<br>Sentiment:").append(res.getString("sentiment"));
//					out.append("\n<br>Simple Sentiment:").append(res.getString("stanfordsentiment"));
					out.append("\n<br><br>\n</td></tr></table>\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in search", e);
		}
		
		out.append(STATIC_FOOTER);
		return out.toString();
	}
	
	/**
	 * 
	 * @param query
	 *            - search msg
	 * @return List of Twitter2
	 */
	public List<DroneData> search(String query) {

		List<DroneData> data = new ArrayList<>();
		String sql = "";
		try {
			logger.error("Query: " + query);
			logger.error("Limit:" + querylimit);
			if ( connection == null ) { 
				logger.error("Null connection");
				return data;
			}
//			if ( query == null || query.trim().length() <= 0 ) { 
				query = "";
				sql = "select datekey, fileName, gPSAltitude, gPSLatitude, gPSLongitude, orientation,geolat,geolong,inception from dronedata1";
//			}
//			else {
//				query = "%" + query.toUpperCase() + "%";
//				sql = "select datekey, fileName, gPSAltitude, gPSAltitude, gPSLongitude, orientation,geolat,geolong,inception from dronedata1 WHERE upper(inception) like ? LIMIT ?";
//			}

			PreparedStatement ps = connection
					.prepareStatement(sql);
			if ( query.length() > 1 ) { 
				ps.setString(1, query);
				ps.setInt(2, Integer.parseInt(querylimit));
			}
			ResultSet res = ps.executeQuery();
			DroneData drone = null;
			while (res.next()) {
				drone = new DroneData();
				drone.setDatekey(res.getString("datekey"));
				drone.setFileName(res.getString("fileName"));
				drone.setGeolat("geolat");
				drone.setGeolong("geolong");
				drone.setgPSAltitude("gPSAltitude");
				drone.setgPSLatitude("gPSAltitude");
				drone.setgPSLongitude("gPSLongitude");
				drone.setInception("inception");
				drone.setOrientation("orientation");
				data.add(drone);
			}

			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
			logger.error("Size=" + data.size());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in search", e);
		}

		return data;
	}
}
