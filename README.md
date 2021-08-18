# herokuDeploy
All steps to deploy our app:

1. build react app (npm run build)
2. insert into the static app
3. add files into the Spring boot app:
4. 
"system.properties":
java.runtime.version=11
"Procfile":
web: java $JAVA_OPTS -jar target/*.jar -Dserver.port=$PORT $JAR_OPTS

4.add heroku plugin and postgreSQL driver
5.open heroku user
6. add new app
7. install postgre and enter "settings"
8. set application properties in the Java app
9. upload to github
10.deploy from git hub to your app
