# First set up these three in computer:
1. JAVA_HOME
2. PATH
3. CLASSPATH

- To use JDBC, download postgres jdbc driver.
- Move it apache/tomcat/lib folder.
- Set <strong>CLASSPATH</strong> to this folder.
 So our new classpath will be: 
     C:\apache-tomcat-8.5.12\lib\servlet-api.jar;C:\apache-tomcat-8.5.12\lib\postgresql-42.0.0.jar;C:\apache-tomcat-8.5.12\lib\jsp-api.jar;

 - Check DB and create database mentioned in the java files.
    * Table names: Credit, users and registration. Create these three tables in postgres database. public schema.
    * Enter sample data into Credit TABLE ONLY. 
    * Later you can enter data into USERS and Registration table via registering in the website.


## Setting the TOMCAT with Jenkins

- Paste the jenkins.war file in Tomcat/webapps
- Run the server by ./startup.bat in Tomcat/bin

