package com.boot.durid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "datasource")
public class DuridProperties {
	
	private String driver;
    private String url;
    private String username;
    private String password;
    private int maxActive;
    private int initialSize;
    private int maxWait;
    private int minIdle;
    private boolean removeAbandoned;
    private int removeAbandonedTimeout;
    private String connectionProperties;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;

}
//spring.datasource.continue-on-error=false # Do not stop if an error occurs while initializing the database.
//spring.datasource.data= # Data (DML) script resource references.
//spring.datasource.data-username= # User of the database to execute DML scripts (if different).
//spring.datasource.data-password= # Password of the database to execute DML scripts (if different).
//spring.datasource.dbcp2.*= # Commons DBCP2 specific settings
//spring.datasource.driver-class-name= # Fully qualified name of the JDBC driver. Auto-detected based on the URL by default.
//spring.datasource.generate-unique-name=false # Generate a random datasource name.
//spring.datasource.hikari.*= # Hikari specific settings
//spring.datasource.initialize=true # Populate the database using 'data.sql'.
//spring.datasource.jmx-enabled=false # Enable JMX support (if provided by the underlying pool).
//spring.datasource.jndi-name= # JNDI location of the datasource. Class, url, username & password are ignored when set.
//spring.datasource.name=testdb # Name of the datasource.
//spring.datasource.password= # Login password of the database.
//spring.datasource.platform=all # Platform to use in the schema resource (schema-${platform}.sql).
//spring.datasource.schema= # Schema (DDL) script resource references.
//spring.datasource.schema-username= # User of the database to execute DDL scripts (if different).
//spring.datasource.schema-password= # Password of the database to execute DDL scripts (if different).
//spring.datasource.separator=; # Statement separator in SQL initialization scripts.
//spring.datasource.sql-script-encoding= # SQL scripts encoding.
//spring.datasource.tomcat.*= # Tomcat datasource specific settings
//spring.datasource.type= # Fully qualified name of the connection pool implementation to use. By default, it is auto-detected from the classpath.
//spring.datasource.url= # JDBC url of the database.
//spring.datasource.username= # Login user of the database.
//spring.datasource.xa.data-source-class-name= # XA datasource fully qualified name.
//spring.datasource.xa.properties= # Properties to pass to the XA data source.
