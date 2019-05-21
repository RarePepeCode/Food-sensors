# Food-sensors

#Steps for setting up Angular project
1. Install node.js (v10.15.3, others should work, but you never know)
2. Enter fallowing commands in Visual Studio Code terminal at /Food-sensors/front-end directory:
  (nmp install @angular/cli@7.3.9) (press Enter to all an questions) 
   and (npm install) (yes, they are seperate commands)
3. Luach server with command ng serve
4. Open web application with loaclhost:4200
5. ???
6. profit

#Steps for setting up JAVA Rest server
1. Set JAVA_HOME at jdk_11.*.* folder in system environments variables
2. Install Apache Maven 3.6.0 or higher
3. Import mvn project with Intellj selecting \Food-sensors\rest-service\pom.xml
4. Open console terminal at \Food-sensors\rest-service
5. Enter command (mvn rest-boot:run) to lauch server
6. Open loaclhost:8081/greeting for example of a rest service
7. Rest

#Tasks
 -Create postgreSQL database and connect it to JAVA rest service. 
 Config Food-sensors\rest-service/pom.xml and C:\Food-sensors\rest-service/src/main/resources/application.properties 
 for rest server to work with database (you can change postgreSQL version or even thw whole database.
 -Create API for front-end with back-end use courses.service as example