package com.xchagger.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xchagger.domain.ExampleDomain;

@Controller
@RequestMapping("/example")
public class ExampleController {

	@RequestMapping(value = "/{pk}", method = RequestMethod.GET)
	@ResponseBody
	public ExampleDomain getExample(@PathVariable(value = "pk") Long pk) {
		// fake dao lookup
		ExampleDomain exampleDomain = new ExampleDomain();
		exampleDomain.setPk(pk);
		exampleDomain.setMember1("mem" + pk);
		exampleDomain.setMember2("mem" + pk);
		return exampleDomain;
	}

	/**
	 * http://localhost:8080/spring-rest/example/save
	 * 
	 * Content-Type: application/json
	 * 
	 * {"pk":2,"member1":"mem2","member2":"mem2"}
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public ExampleDomain saveExample(@RequestBody ExampleDomain exampleDomain) {
		// fake persistence
		exampleDomain.setMember1(exampleDomain.getMember1() + " persisted");
		exampleDomain.setMember2(exampleDomain.getMember2() + " persisted");
		return exampleDomain;
	}
}