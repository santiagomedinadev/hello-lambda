# Hello-Lambda
This project is a basic java app that will run in AWS.

## Key Points
1. We don't need an entry point (`public static void main{...}`) for this application because when you upload your jar to aws lambda you have to set your entry point method.
2. Run `mvn clean package` this command will create a `jar file` of your application in `../target/hello-lambda-1.0-SNAPSHOT.jar`.
3. Go to:
   1. AWS Lambda.
   2. Select `Create function`.
   3. Fill the form (Function name: HelloLambda, Runtime: Java 17, Architecture: arm64).
   4. Click on `Create Function` button.
4. In the HelloLambda windows:
   1. In the `Code source` section click on `Upload from` button and select `.zip or .jar file`.
   2. Select your `hello-lambda-1.0-SNAPSHOT.jar` file.
   3. In the `Runtime settings` section click on `Edit` button.
   4. Copy the path of our entry point application in the `Hendler` section, in our case this will be dev.santiagomedina.HelloLambda::handleRequest.
   5. Click on `Save` button.
5. In this point we are ready to test our function. Go to `Test` tab and click on the `Test` button.

## Hello-Lambda 2.0
Modify the method `handleRequest` in the `HelloLambda` class to:
```java
    public class HelloLambda {
        public String handleRequest(String name){
            return "Hello, " + name + "!";
        }
    }
```
Follow the `Key Points` steps until the step (5), before to click on the `Test` button, scroll down in the `Event JSON` section, delete the default data and write a random `String`, scroll up and clikc on the `Test` button.

Check the result. 😎
