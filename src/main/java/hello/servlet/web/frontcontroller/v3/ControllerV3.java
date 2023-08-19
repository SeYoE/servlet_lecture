package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    // 이제 컨트롤러는 서블릿 기술(HttpServletReq, Res) 를 몰라도 동작
    ModelView process(Map<String, String> paramMap);
}
