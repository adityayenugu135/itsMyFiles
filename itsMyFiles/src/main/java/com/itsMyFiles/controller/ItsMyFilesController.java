package com.itsMyFiles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItsMyFilesController {

	@GetMapping("/hello")
	public String get() {
		return "Hello World";
	}
}
