# Jenkins

### Different phases of Jenkins

Jenkins is a continuos integration and continuos deployment application, which have different phases
   - Changes to an existing application (exe, website, app).
   - Building Artifacts
   - Post build steps are triggered which are usually automated
   - Report about latest changes are sent back to developing team.

### The problem CI and CD tools solve

Generally, in huge projects lot of changes are made to a single application on a single day. To track the progress as well as running of the system in a consistent way we need an automated tool that tracks any changes to code at any instance of time. It automates the testing and deployment that makes it easy to track any inconsistencies in the code. 
    Takes the latest code and trigger a build and any post build actions will notify the user about the state of the new code.

### Prerequisite:

- Java 7 or above in the system.
- Tomcat 5 or above.
- System Variables with
    * <strong>JAVA_HOME:</strong> C:\Program Files\Java\jdk<version>
    * <strong>JRE_HOME:</strong> C:\Program Files\Java\jre<version>

## Installing and running Jenkins through a war file

 - Download the .war file in <link>https://jenkins.io/download/</link>. Check for Generic Java package.
 - Place the downloaded file in your directory of choice and run the command from terminal/powershell/cmd:
    * cd <strong>/directory/of/your/choice</strong>
    * java -jar jenkins.war
    * Ctrl+C to stop the server.

    PS: Please note the admin password which will be displayed in powershell
 - Open localhost:8080 in your favourite browser and paste the password. Further, install the plugins of your    choice. 
 - Copy the <strong>jenkins.war</strong> file from <strong>/directory/of/your/choice</strong> and place it in <strong>/directory/to/tomcat/webapps</strong>
 - Run the Tomcat server and then check: localhost:8080/jenkins (only if you haven't changed the Tomcat portnumber)
 - For running standalone jenkins on custom port:
    * <strong>cd /directory/of/your/choice</strong> 
    * And then run <strong>java -jar jenkins.war --httpPort=9090</strong>. Since by default Tomcat and Jenkins run on 8080 port.

 #### Jenkins on Tomcat

- Starting all applications can run in a single server if we can deploy Jenkins in conventional server like Tomcat.
- Run the tomcat by <strong>/directory/to/tomcat/bin</strong> and run the command:
        * <strong>./startup.bat</strong> for starting the server
        * <strong>./shutdown.bat</strong> for stopping the server

#### Changing the HOME directory of Jenkins
- Goto Users/<system-user>
- Search for <strong>.jenkins</strong>
- Set <strong>JENKINS_HOME</strong> Path in System Variables withe path to the <strong>/directory/of/your/choice</strong>
- Reasons:
    * Jenkins Home Directory contains:
        1. All configurations
        2. Plugins
        3. Jobs details
        4. Logs
    * Why:
        - Scalability of project might force us to move jenkins home dir to a location that has enough disk space. 
        - Project requirements.
- <strong>localhost:8080/restart</strong> if the port is 8080.

#### Moving to Command Line Interface 
- Consumes less memory than UI.
- CI is much easier this way.
- Steps:
    * Manage Jenkins in localhost:8080 after starting the port.
    * <strong>http:/localhost:8080/cli</strong> and download <strong>jenkins-cli.jar</strong> file.
    * Run the following command in that directory where we have the jenkins-cli.jar 
        - java -jar jenkins-cli.jar -s http://localhost:8080/ -auth user:password


### Roles (Creating, Managing and Assigning)
- <strong>http:/localhost:8080</strong> -> Manage Jenkins -> Manage Users -> Create User
- Configure a user by following the link: http://localhost:8080/user/username/configure
- Create and manage user roles Roles Strategy Plugin - download - restart jenkins
- Manage Jenkins - Configure Global Security - Authorisation - Role Based Strategy
- Create Roles and Assign roles to users by the same plugin
