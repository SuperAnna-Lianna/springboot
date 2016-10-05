webjars 是一个jar包 ，以Jar形式为Web项目提供资源文件。

why webjars？
一般来说，我们都是采用手工的形式将js文件拷贝到webapps下，并且 js文件在 页面中引用的时候地址一般是这样的
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>>
这样做的问题就是
1.人工方式拷贝可能会产生版本误差，拷贝版本错误，前端页面就无法正确展示。
2.在路径中把版本号写死，后期想要升级就需要大量的改动版本界面代码。不合理。

所以，org.webjar包将人们常用的js、anglarjs、bootstrap等文件统一管理起来，打包成jar包，发布到maven仓库中。 以Jar形式为Web项目提供资源文件

how to use Webjars？
1.pom文件引入jar包
2.WebJars 将js, css 等资源文件放到 classpath:/META-INF/resources/webjars/ 中  ,引入方式为<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.js"></script>
3.可以实现 版本号版本号统一管理
3.1  pom文件
        <dependency>
              <groupId>org.webjars</groupId>
              <artifactId>webjars-locator</artifactId>
          </dependency>
3.2  写一个WebJarsController，使其自动获取版本号


ps:处理静态资源大型网站肯定不是Java服务器，基本都是用apache或者nginx等来处理静态处理，性能更好。对于小网站，可以直接使用WebJars。
