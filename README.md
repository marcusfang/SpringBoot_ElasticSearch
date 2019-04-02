SpringBoot（2.0.0.RELEASE）整合ElasticSearch（6.3.1）
1. 修改src\main\resources\application.yml文件中的cluster-nodes和cluster-name为你自己搭建的ES配置信息

2. 启动项目访问：http://localhost:8080/swagger-ui.html，操作里面的API接口，观察ES数据的变化

![es-swagger](https://github.com/marcusfang/SpringBoot_ElasticSearch/blob/master/src/main/resources/static/es-swagger.png)


为了更加精准的查看ES中的数据变化，请事先安装和部署好elasticsearch-head
![elasticsearch-head](https://github.com/marcusfang/SpringBoot_ElasticSearch/blob/master/src/main/resources/static/es.png)

Kibana:
![kibana](https://github.com/marcusfang/SpringBoot_ElasticSearch/blob/master/src/main/resources/static/kibana.png)