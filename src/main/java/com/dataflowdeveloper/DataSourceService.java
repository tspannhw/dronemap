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
