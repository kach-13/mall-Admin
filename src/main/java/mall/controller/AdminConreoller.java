package mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("redis")
public class AdminConreoller {
    @Autowired
    private RedisTemplate<String,Object> restTemplate;
    @GetMapping("setRedis")
   public void smain(String[] args) {
        restTemplate.opsForValue().set("name" ,"zhangsan",20, TimeUnit.SECONDS);//设置Redis有效时间
    }
}
