package top.zhanghb.mgr;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public Map<String,Object> hello(){
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        Map<String,Object> map = new HashMap<>();
        map.put("name","zhanghb");
        map.put("age",28);
        return map;
    }

    @GetMapping("/job")
    public Map<String,Object> job(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","zhanghb");
        map.put("job","java");
        return map;
    }
}
