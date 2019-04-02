SpringBoot整合ElasticSearch
1. 修改src\main\resources\application.yml文件中的cluster-nodes和cluster-name为你自己搭建的ES配置信息

2. 启动项目访问：http://localhost:8080/swagger-ui.html，操作里面的API接口，观察ES数据的变化

![elasticsearch-head](https://raw.githubusercontent.com/hongmaju/light7Local/master/img/productShow/20170518152848.png)


为了更加精准的查看ES中的数据变化，请事先安装和部署好elasticsearch-head
![elasticsearch-head](https://raw.githubusercontent.com/hongmaju/light7Local/master/img/productShow/20170518152848.png)