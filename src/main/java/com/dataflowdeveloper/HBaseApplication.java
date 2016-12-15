package com.dataflowdeveloper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class HBaseApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HBaseApplication.class, args);
	}

	@Configuration
	@Profile("default")
	static class LocalConfiguration {
		Logger logger = LoggerFactory.getLogger(LocalConfiguration.class);

	    @Value("${purl}")
	    private String databaseUri;
	    	    
		@Bean
		public Connection connection() {
		        Connection con = null;
				try {
					con = DriverManager.getConnection(databaseUri);
				} catch (SQLException e) {
					e.printStackTrace();
					logger.error("Connection fail: ", e);
				}
	
			//dataSource.setDriverClassName("org.apache.phoenix.jdbc.PhoenixDriver");
			logger.error("Initialized hbase connection");
			
			return con;
		}
	}
}
