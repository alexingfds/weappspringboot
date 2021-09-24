/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author richardson
 *
 */
@Controller
public class FormController {
	@GetMapping("")
	public String edureka() {
		return "edureka";
	}
	
	
	@PostMapping("details")
	public String viewdetails(@RequestParam("cid") int cid,
			@RequestParam("cname") String cname
			,@RequestParam("cemail") String cemail, ModelMap modelMap) {
		System.out.println("CID PARMA");
		System.out.println(cname);
		Customers user = new Customers(cid, cname, cemail);
//		user.setCid(cid);
//		user.setCname(cemail);
//		user.setCemail(cemail);
		modelMap.put("user", user);
	
		modelMap.put("cid", cid);
		modelMap.put("cname", cname);
		modelMap.put("cemail", cemail);
		return "ViewCustomerDetails";
		
//		ModelAndView mv =new ModelAndView("ViewCustomerDetails");
//		mv.addObject("user",user);
//		return mv;
	}

}
