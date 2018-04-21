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

# Prerequisite:
    - Java 7 or above

## Installing and running Jenkins through a war file

 - Download the .war file in <link>https://jenkins.io/download/</link>. Check for Generic Java package.
 - Place the downloaded file in your directory of choice and run the command :
        cd /directory-of-your-choice
        java -jar jenkins.war