# SpringCloud学习笔记

### application.properties配置
~~~yml
spring.datasource.username=123
spring.datasource.password=123
spring.datasource.url=jdbc:mysql://localhost:3306/springcloud?charset=utf-8
spring.datasource.driver=com.mysql.cj.jdbc.Driver
spring.mvc.async.request-timeout=5000

mybatis.type-aliases-package=com.twip.springcloud.entities
mybatis.mapper-locations=classpath:mapper/*.xml

server.port=8001
~~~

### 横向通信
~~~java
@RestController
public class OrderController {
    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create" , payment, CommonResult.class);
    }
    
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,CommonResult.class);
    }
}
~~~

### 横向通信RestTemplate配置
~~~java
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
~~~