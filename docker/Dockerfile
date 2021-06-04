#docker build -t eureka:v1.0 .
#localhost:8000
FROM rtfpessoa/ubuntu-jdk8
COPY libs/eureka-demo-1.0.jar /opt/
EXPOSE 8000/tcp
WORKDIR /opt/
CMD java -jar eureka-demo-1.0.jar