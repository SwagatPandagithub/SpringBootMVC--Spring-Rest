package in.ineuron.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMessageGenerator;

@Controller
public class MyController {
	
	@Autowired
	private IWishMessageGenerator service;
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String ModelAndView() {
		
		return "home";
	}
	
	
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public ModelAndView showMessage() {
		
		
		//Call service to get the message
		String msg = service.wishMessage();
		
		
		//Send the data from Controller to View
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.setViewName("display");
		
		return mav;
	}

}
