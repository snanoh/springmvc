package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        System.out.println("name = " + name); // 서버별로 남길 수 없기 때문에 사용 x

        //log.trace("trace log="+ name); 연산이 들어가기 때문에 사용 x
        log.trace("trace log={}", name);
        log.debug("debug log={}", name); // 개발 서버
        log.info("info log={}", name); // 보통 운영 서버 셋팅
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
