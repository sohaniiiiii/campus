package SE.CampusMgmtSyatem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "LAB INTERNAL Hello World!" );
        // file->import->smart import->clone url->paste the url->next->next->finish
        // right click->go to pom.xml then solve the errors then save it and 
        // again right click prj then click on runas
        // war ->run on server and jar ->clean install test then run as administrator
        // now open in server

        // click on prj nd then show in local terminal then git bash
        // git init
        // git config --global user.name "" nf user.email ""
        // git add .
        // git commit -m ""
        // git remote add origin "url"
        // git remote set-url origin "url"
        // git push -u origin

        // docker open cheyy
        // next run windows as administrator
        // docker login
        // cd move to prj folder
        // notepad Dockerfile
        // docker build -t name:tag .
        // docker run -d -p 8080:8080(or 8009) name:tag
        // docker tag name:tag user_name/name:tag
        // docker build -t shashanksoma0103/docker1:trial .
        //docker push shashanksoma0103/docker1:trial
        // docker push user_name/name:tag
        // docker-compose up -d
//---------------------------------------compose---------------------------------
//         version: "3.9"
// services:
//   hospital-app:
//     image: shashank0103/docker1:trail # your Docker Hub image
//     container_name: hospital-app
//     ports:
//       - "7079:7007" # host:container port
//     depends_on:
//       - mongodb
//     restart: always

//   mongodb:
//     image: mongo:6.0
//     container_name: hospital-mongo
//     ports:
//       - "27017:27017"
//     volumes:
//       - mongo-data:/data/db
//     restart: always

// volumes:
//   mongo-data: {}
//-------------------webdev dockerfile--------------------------------------------------------------------------
// FROM tomcat:9.0
// COPY target/*.war /usr/local/tomcat/webapps/
// EXPOSE 7007
// CMD ["catalina.sh","run"]
//---------------------------------------------------------pom.xml------------------------------------------------------------
// <project xmlns="http://maven.apache.org/POM/4.0.0"
//          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
//                              http://maven.apache.org/maven-v4_0_0.xsd">

//   <modelVersion>4.0.0</modelVersion>

//   <groupId>SE</groupId>
//   <artifactId>Food-System</artifactId>
//   <packaging>war</packaging>
//   <version>0.0.1-SNAPSHOT</version>
//   <name>FoodSystem Maven Webapp</name>
//   <url>http://maven.apache.org</url>

//   <dependencies>
//     <!-- ✅ JUnit for testing -->
//     <dependency>
//       <groupId>junit</groupId>
//       <artifactId>junit</artifactId>
//       <version>4.13.2</version>
//       <scope>test</scope>
//     </dependency>

//     <!-- ✅ MySQL Connector for database connection -->
//     <dependency>
//       <groupId>mysql</groupId>
//       <artifactId>mysql-connector-java</artifactId>
//       <version>8.0.33</version>
//     </dependency>
//   </dependencies>

//   <build>
//     <finalName>Food-System-xyz</finalName>
//   </build>

// </project>

// --------------------------------java docker file--------------------------------
// FROM openjdk:17-jdk-slim
// WORKDIR /app
// COPY target/*.jar app.jar
// EXPOSE 8080
// ENTRYPOINT ["java","-jar","app.jar"]

     }
 }
