package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping  // 스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러로 인식
                    // 다만 @Controller는 컴포넌트 스캔의 대상이기 때문에 Application 실행시 자동 빈등록이 되고, @RequestMapping만 할 경우 수동 빈 등록해줘야함
@ResponseBody
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();

}
