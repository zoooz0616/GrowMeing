package com.growmeing.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	// 메인화면
		/**
		 * @author : dabin
		 * @date : 2024. 4. 5.
		 * @parameter : model
		 * @return : string
		 */
		@GetMapping("")
		public String main() {
			return "admin/main";
		}
}
