# TSB Exercise - Demo of UI (Login, Search) and API Test Scenarios
This framework contains UI Tests structure written based on Fluent Page Object pattern and API Tests based on Cucumber-BDD pattern

# Pre-requisite
- Java, maven, and allure should be installed on system and should be configured on PATH

# Basic structure can be seen in below screenshot
<img width="223" alt="image" src="https://user-images.githubusercontent.com/16361259/184479462-8bfa5588-b90b-43bf-8936-d911c1e321fc.png">

# Some important information about files and folders
- POM.xml contains all dependencies, plugin, report plugins etc and main entry point of execution of Uitests.xml and Apitests.xml TestNG files
- runallure.bat file is used in maven plugin to fire based on 'verify' goal to generate consolidated allure report of both UI and API tests
- logs folder will contain - "All.logs" and "APIExecution.logs" files which contains detail logs captured while executing the tests (generated log files you can access in directory i've added for your reference)
- reports folder is the container of generated reports [Allure report and other types of cucumber reports, json report]

-> To run this on your system, clone the repo and install all pre-requisites and navigate to repository directory and open cmd and fire command - <b>mvn clean test verify</b>. This will fork maven to clean the required directories, compile and test then generating reports for you.

- I've included a Execution video link in email which will show you a kind of demo starting from the execution and report generation, wasn't able to attach here due to size limit. Also, since I had issues with trademe sandbox for APIs(Scottie Henderson, already aware, so based on recommendation, I used other platform to showcase API use cases and framework details - hope you'll consider it)

- Some screenshots from generated reports (i've included only one report screenshot here, other you may find in reports folder and in video)
![image](https://user-images.githubusercontent.com/16361259/184479999-9fec1ee2-5b7a-43dd-bb66-54f88d6bec6f.png)
![image](https://user-images.githubusercontent.com/16361259/184480012-8b51404d-4ead-4021-9ffb-b250d8edc5c1.png)
![image](https://user-images.githubusercontent.com/16361259/184480034-7136ce9e-a7e7-49d0-b9cc-d28d05d9f872.png)
![image](https://user-images.githubusercontent.com/16361259/184480055-688d98b8-5c4d-42e0-94b4-4942c024fcb4.png)

