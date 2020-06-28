package controller;

import model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView selectUser(@RequestParam("sid") String sid, @RequestParam("spassword") String spassword,
                                   Model model, HttpSession httpSession, HttpServletRequest httpRequest) throws IOException {
//        Student student = new Student();
//        student = studentService.getByStuSid(sid);
//        String a = "a";
//        if (a != null) {
//            httpSession.setAttribute("sid", sid);
//            httpSession.setAttribute("sname", a);
//            return new ModelAndView(new RedirectView("/fail.jsp"));
//        } else {
//            httpRequest.setAttribute("msg","账号或密码不正确，登录失败!");
//            return new ModelAndView(new RedirectView("/fail.jsp"));
//        }
        User user = userService.selectUserById(Integer.valueOf(sid));
        if (user != null){
            return new ModelAndView(new RedirectView("/fail.jsp"));
        }else {
            return new ModelAndView(new RedirectView("/fail.jsp"));
        }
    }
}
