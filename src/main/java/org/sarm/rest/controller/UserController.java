package org.sarm.rest.controller;

import org.sarm.rest.modal.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/getuserinfo")
	public @ResponseBody User getUserDetails() {

		User user = new User();
		user.setEmail("sarm@gmail.com");
		user.setFirstName("Wind");
		user.setLastName("Sarm");
		user.setUserId(1001L);
		return user;
	}
}
