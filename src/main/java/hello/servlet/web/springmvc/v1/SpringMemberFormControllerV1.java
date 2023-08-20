package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Controller 스프링 빈으로 자동 등록 -> 내부에 @Component 선언되어있어서 컴포넌트 스캔 대상이 되기 때문
 * 스프링 MVC에서 어노테이션 기반 컨트롤러로 인식
 * @RequestMapping 요청 정보 매핑
 * 해당 URL 호출 시 메소드 호출
 * 어노테이션 기반으로 동작하기 때문에 메소드명은 자유롭게 지어도 된다.
 * @return ModelAndView
 * 모델, 뷰 정보 담아서 반환
 * <p>
 * **
 * RequestMappingHandlerMapping 은 스프링 빈 중에서 @RequestMapping, @Controller 어노테이션이
 * 클래스 레벨에 붙은 경우에 매핑 정보로 인식
 */
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }

}
