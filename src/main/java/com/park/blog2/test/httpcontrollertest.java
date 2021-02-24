package com.park.blog2.test;

import org.springframework.web.bind.annotation.RestController; // 사용자가 요청 -> 응답(Data), HTML응답하고 싶으면 @Controller
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; // 인터넷 브라우저 요청은 Get만 된다.(주소창으로 넣는방법을 말하는듯)
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class httpcontrollertest {
	
	//http://localhost:8080/http/get
	@GetMapping("/http/get")					// 데이터를 요청할때 어떤 데이터를 요청하는 방법은 쿼리스트링? 밖에 없다
	public String getTest(Member m) { //id=1&username=park&password=1234&email=ssar@nate.com 이거를 m에 넣는걸 스프링이 해준다,MesssageConverter(스프링부트)
		
		return "get요청 : " + m.getId()+ " " +m.getUsername()+" "+m.getPassword()+" "+m.getEmail();
	}
	
	//http://localhost:8080/http/post
	@PostMapping("/http/post") // 바디는 @RequestBody 붙여야 null값을안받는다// text/plain(raw데이터) application/json
	public String postTest(@RequestBody Member m) { // json으로 m으로 보내지면 MesssageConverter(스프링부트)가 알아서 변환해준다.
		
		return "post요청 : " + m.getId()+ " " +m.getUsername()+" "+m.getPassword()+" "+m.getEmail();
	}
	
	//http://localhost:8080/http/put
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put요청 : " + m.getId()+ " " +m.getUsername()+" "+m.getPassword()+" "+m.getEmail();
	}
	//http://localhost:8080/http/delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete요청";
	}
	
	}


