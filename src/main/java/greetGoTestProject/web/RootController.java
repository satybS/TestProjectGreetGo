package greetGoTestProject.web;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;


@Controller
public class RootController {

    @GetMapping("/")
    public String root() {
        return "redirect:stars";
    }

//    //    @Secured("ROLE_ADMIN")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    @GetMapping("/users")
//    public String users() {
//        return "users";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(ModelMap model,
//                        @RequestParam(value = "error", required = false) boolean error,
//                        @RequestParam(value = "message", required = false) String message) {
//        model.put("error", error);
//        model.put("message", message);
//        return "login";
//    }

    @GetMapping("/stars")
    public String stars() {
        return "stars";
    }

//    @GetMapping("/profile")
//    public String profile() {
//        return "profile";
//    }
//
//    @PostMapping("/profile")
//    public String updateProfile(@Valid UserTo userTo, BindingResult result, SessionStatus status) {
//        if (!result.hasErrors()) {
//            try {
//                userTo.setId(AuthorizedUser.id());
//                super.update(userTo);
//                AuthorizedUser.get().update(userTo);
//                status.setComplete();
//                return "redirect:meals";
//            } catch (DataIntegrityViolationException ex) {
//                result.rejectValue("email", "exception.duplicate_email");
//            }
//        }
//        return "profile";
//    }
//
//    @GetMapping("/register")
//    public String register(ModelMap model) {
//        model.addAttribute("userTo", new UserTo());
//        model.addAttribute("register", true);
//        return "profile";
//    }
//
//    @PostMapping("/register")
//    public String saveRegister(@Valid UserTo userTo, BindingResult result, SessionStatus status, ModelMap model) {
//        if (!result.hasErrors()) {
//            try {
//                super.create(UserUtil.createNewFromTo(userTo));
//                status.setComplete();
//                return "redirect:login?message=app.registered";
//            } catch (DataIntegrityViolationException ex) {
//                result.rejectValue("email", "exception.duplicate_email");
//            }
//        }
//        model.addAttribute("register", true);
//        return "profile";
//    }
}
