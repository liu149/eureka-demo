**阿里云maven仓库**

https://repomanage.rdc.aliyun.com/my/repo?spm=0.0.0.0.Fhzjha



**pubish**

将zip tar publish到maven 仓库



**引入gradle 插件，可以通过gradlew jar打一个可执行jar包**

```
org.springframework.boot
```



**docker**

通过Dockerfile构建image

```shell
cd eureka-demo/docker
docker build -t eureka:v1.0 .
docker run -d --name eureka-v1.0 -p 8000:8000 eureka:v1.0
```

*访问localhost:8000*

也可以通过docker-compose -d up启动