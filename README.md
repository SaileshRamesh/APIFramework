
# API Automation with Rest Assured JAVA

Problem Statement: The team RCB has submitted it's team for upcoming match, the details of the match in JSON format, we will be writing a test that validates that the team has only four foreign players and there is at least one wicket keeper




## Documentation
* [Installations](https://github.com/selenium-cucumber/selenium-cucumber-java/blob/master/doc/installation.md)
* [Predefined Steps](https://github.com/selenium-cucumber/selenium-cucumber-java/blob/master/doc/canned_steps.md)

## Features

- **Maven** Project with all the framework dependencies
- Implemented **JUnit** Runner to run the framework
- **Utilities** for reusable Selenium methods
- **Extent reports** to capture test results 



## Instructions

- **JDK 1.8+** (make sure Java class path is set)
- **Maven** (make sure .m2 class path is set)
- Plugins for **JUnit, Cucumber, Natural in Eclipse/intelliJ**
- Fork/Clone repository or **download** zip and set it up in your local workspace.
- You can run the test locally simply by pasting the feature tag in **TestRunner.java** file
- Go to your project directory from terminal and hit following commands
```bash
mvn test 
mvn test -Dcucumber.Options="--tags @Regression" (to select specific tag)
```

## To Run on Jenkins
- Provide the project Git source URL or you can downlaod/fork the project directory and give the path while creating the job.
- Select Invoke Top level maven targets under Build section
```bash
test
test -Dcucumber.Options="--tags @Regression"
```
## Project Structure

![This is an image](https://user-images.githubusercontent.com/46919369/224008639-9e8b801d-0d07-40ed-aa89-d3088925cc81.PNG)


## Reports

- The Extent Reports are stored `test-output/SparkReport` folder

