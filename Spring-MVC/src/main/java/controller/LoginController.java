package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


// Used to instanciate object of this class
// methods in this class are called on client request
@Controller
public class LoginController {
	
	@RequestMapping("/hi")
	public String openLoginForm() {
		return "login";
	}
	
	@RequestMapping(path="/login" ,method = RequestMethod.POST)
	@ResponseBody
	public String getLogin(@RequestParam("t1") String un,@RequestParam("t2") String pw) {
		return "Welcome"+un;
	}

}
