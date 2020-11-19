FROM java:8
VOLUME /tmp
ADD target/dockerLearn.jar dockerLearn.jar
RUN sh -c 'touch /dockerLearn.jar'
ENV JAVA_OPTS=""
EXPOSE 9191
#指定执行启动spring boot小项目     ENTRYPOINT 为容器启动后执行的命令
ENTRYPOINT ["java","-jar","/dockerLearn.jar"]
