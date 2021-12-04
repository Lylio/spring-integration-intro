![](https://github.com/Lylio/image-repo/blob/master/logos/spring-integration.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)

# Spring Integration Introduction

### Description
An introduction to the **Spring Integration** module by building an app on the premise:

"... _an app that facilitates integration between a filesystem and a database_... _we need to enter records to a database 
and the client would only give us a pipe-delimited file. Our intent is to consume this file, read the records and write 
it to a database_."

### Tech Stack
- Spring Boot (JDK 11)
- Spring Integration
- H2 database

### Setup & Launch

1. Create an empty 'in' folder in the tmp directory: `/tmp/in`

When the app is running, this directory will be polled every 10 seconds - pasting .txt files into this directory will trigger 
the file's data to be consumed, transformed and persisted into the H2 database. These text files should contain ID, name and phone number data in the format:
```
4 | Arthur Crumble | 07987654765  
5 | Sally Rock | 01316765876  
6 | Peter Envelope | 07987657531
```
#### Maven Launch
1. `mvn spring-boot:run`
2. Drop a text file into the `in` folder as explained above
3. Open the H2 database at http://localhost:8080/h2
```
url: jdbc:h2:mem:integration
username: int
password: int
```
#### Acknowlegements
Based on the Springorama article [_Spring Integration: A hands on introduction_](https://springorama.wordpress.com/2018/04/19/spring-integration-a-hands-on-introduction/).
