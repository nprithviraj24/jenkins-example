Steps:

- Git clone
- Follow the prerequisites
- Start jenkins server -httpPort=CustomPort (say 8080)
- Start Tomcat (can't run on 8080 port, change the port)
- Add a TestCase by traversing to locahost:8080
- Add a TestCase:
    - New Item ->   FreeStyle Project -> Build (tab) 
        -> Invoke top-level Maven target -> Goalls: test -> Set path to POM file
- Run the Test Test
- Can even schedule it.
- Explain what's happening     