package Management.controller;

import Management.controller.vo.LoginVO;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mazijin
 * @since 2018/12/11
 */
@CrossOrigin
@RestController()
@RequestMapping("/admin")
public class AdminController {
    //彩蛋
    @PostMapping(value="/login")
    public String getScore(@RequestBody LoginVO loginVO){

        return  "you win";
    }
}
