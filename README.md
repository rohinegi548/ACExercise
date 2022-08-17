# AC Exercise - Demo of API Tests - Sample Framework
- This framework contains API Tests structure written based on <b>Cucumber-BDD (Gherkin)</b> pattern
- <b>SanboxApiValidation.feature file under com.api.features package</b> contains Feature definition which includes the Validation scenario (containing all steps)
- <b>stepDefinitions.java file under com.api.stepdefinitions package</b> contains the implemented methods/functions which are mapped to the steps writtern in above feature file. It also contains <b> Hooks.java class </b> which is a kind of ability to run something before or after scenarios based on any defined tags.
- <b>com.api.runner package contains 'TestRunner' class</b> which contains the cucumberoptions to map - features, stepdefinitions, plugin for report and any other option to generate step definition methods/functions.
- <b>com.api.resources package</b> contains several classes and files to generate logs, enums for API endpoint resources, Request specification utilities, property files and config file for log4j. <b>ApiGlobal.properties file </b> contains the base URI for API. <b> ApiResStatCodes.java</b> contains the API endpoint resource path based on HTTP methods that are called in step definition methods.
- allure-resources folder contains file generated during execution of tests to create report

# Pre-requisite
- Java, maven, and allure should be installed on system and should be configured on PATH

# Basic structure can be seen in below screenshot
<img width="203" alt="image" src="https://user-images.githubusercontent.com/16361259/185194021-a359db57-230e-4845-a1f8-5d03ee8ea26d.png">



# Some important information about files and folders
- <b>POM.xml</b> contains all dependencies, plugin, report plugins etc and main entry point of execution of <b>Apitests.xml</b> TestNG file.
- <b>runallure.bat file</b> is used in maven plugin to fire based on <b>'verify'</b> goal to generate consolidated allure report for tests.
- <b>logs folder</b> will contain - "All.logs", "APIExecution.logs" files which contains some sample logs I've captured while executing the tests (generated log files you can access in directory i've added for your reference). I've just shown an overview to generate logs.
<img width="959" alt="image" src="https://user-images.githubusercontent.com/16361259/185196001-383b936f-f6ea-4101-8117-7cfb88a92ff5.png">
<img width="955" alt="image" src="https://user-images.githubusercontent.com/16361259/185196228-caa16e1f-dd4e-4774-93e9-a68fd86bf781.png">
<img width="957" alt="image" src="https://user-images.githubusercontent.com/16361259/185196310-6165f7ad-4c04-4721-a16d-d6c6f7c28b01.png">
<img width="952" alt="image" src="https://user-images.githubusercontent.com/16361259/185196402-cdc1e52f-bf81-42bd-89db-158e94ff2ecb.png">

- <b>reports folder</b> is the container of generated reports including Allure and other Cucumber reports. You'll be able to see on server only but don't worry all is in place you just need to go through below steps. Logs have been printed on console and allure report as well 

-> To run this on your system, clone the repo and install all pre-requisites and navigate to repository directory and open cmd and fire command - <b>mvn clean test verify</b>. This will fork maven to clean the required directories, compile and test, then generating reports for you and open report folder in browser.

- I've included a Execution video link (https://drive.google.com/file/d/1wSJx9GUU9N0H7GvEsSE_0A2t5xrWrH0o/view?usp=sharing) in email as well which will show you a kind of demo starting from the execution and report generation, wasn't able to attach here due to size limit.

- Some screenshots from generated report
<img width="953" alt="image" src="https://user-images.githubusercontent.com/16361259/185194636-f24bcaac-928d-4fb5-a107-397b5327a34c.png">

![image](https://user-images.githubusercontent.com/16361259/185194741-58927f71-7935-48a3-b894-e33d5914f10c.png)

![image](https://user-images.githubusercontent.com/16361259/185194810-31107517-9ea1-4203-b5b1-f87c88ad1dd5.png)

![image](https://user-images.githubusercontent.com/16361259/185194868-a32ddbb8-0dd4-4516-b472-c37f6dc9baf4.png)

![image](https://user-images.githubusercontent.com/16361259/185194915-cd961128-f0a1-490e-9ec6-e2ad553233a1.png)

![image](https://user-images.githubusercontent.com/16361259/185194964-60ad1495-c21c-4518-805f-100636185836.png)

![image](https://user-images.githubusercontent.com/16361259/185195021-cc17d450-2338-4438-9727-738fa76bd1ff.png)

![image](https://user-images.githubusercontent.com/16361259/185195129-04895365-3744-43ea-85a8-8bcd6579cc9f.png)

![image](https://user-images.githubusercontent.com/16361259/185195153-25575199-1d71-4a2d-8764-5420755939b6.png)

![image](https://user-images.githubusercontent.com/16361259/185195209-ea09a301-55f9-4b69-acb6-f0f597810872.png)

![image](https://user-images.githubusercontent.com/16361259/185195329-93a939e7-51ff-4e36-ba80-30e1b744b6f1.png)

![image](https://user-images.githubusercontent.com/16361259/185195387-b88e2abc-1c6f-4deb-a5e0-96fee354faf5.png)

![image](https://user-images.githubusercontent.com/16361259/185195430-cde18f4d-b64d-43d1-88de-95fce2ec3de8.png)

<img width="949" alt="image" src="https://user-images.githubusercontent.com/16361259/185195507-e0ecf7e1-f3b5-4430-b07e-d577f4d93ef1.png">

