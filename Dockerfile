FROM tomcat:8.0.20-jre8

COPY /target/customerorders-svc.war /usr/local/tomcat/webapps/customerorders-svc.war

