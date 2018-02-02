package cn.timdo.wei.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.timdo.wei.service.user.domain.User;

@SpringBootApplication
@RestController
public class UserApplication {
	@RequestMapping("/user")
	public User getUser() {
		return new User("user");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
