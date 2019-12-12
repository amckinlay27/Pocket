package com.lambton.pocket.adamMckinlay.pocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PocketController {
	@Autowired
	private PageCounter pageCounter;
	
	
	/*Main Mapping*/
	@GetMapping(value = {"/", "/index.html"})
	public String showHome(Model model) {
		pageCounter.increment();
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "index";
	}
	
	@GetMapping("/login.html")
	public String loginPage(Model model, Users user) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "login";
	}
	
	@GetMapping("/community.html")
	public String communityPage(Model model, Users user) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "community";
	}
	
	
	/*Personal Mapping*/
	@GetMapping("/personal/accounts.html")
	public String personalAccountPage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/personal/accounts.html";
	}
	
	@GetMapping("/personal/investing.html")
	public String investingPage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/personal/investing.html";
	}
	
	@GetMapping("/personal/mortgage.html")
	public String mortgagePage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/personal/mortgage.html";
	}
	
	@GetMapping("/personal/retirement.html")
	public String retirementPage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/personal/retirement.html";
	}
	
	@GetMapping("/personal/student.html")
	public String studentPage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/personal/student.html";
	}
	
	
	/*Business Mapping*/
	@GetMapping("/business/accounts.html")
	public String businessAccountPage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/business/accounts.html";
	}
	
	@GetMapping("/business/agriculture.html")
	public String agriculturePage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/business/agriculture.html";
	}
	
	@GetMapping("/business/entrepreneur.html")
	public String entrepreneurPage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/business/entrepreneur.html";
	}
	
	@GetMapping("/business/services.html")
	public String servicesPage(Model model) {
		model.addAttribute("views", this.pageCounter.getPageCount());
		return "/business/services.html";
	}
}
