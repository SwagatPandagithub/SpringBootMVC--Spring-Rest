package in.ineuron.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.ineuron.service.IWishMessageService;

@Controller
public class MyController {

	@Autowired
	IWishMessageService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showMessage() {

		return "home";
	}
/*
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String showView(Model model) {

		String msg = service.generateWish();
		System.out.println(msg);
		model.addAttribute("message", msg);
		return "display";
	}
*/
	
/*
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String showView(Map<String, Object> map) {

		String msg = service.generateWish();
		System.out.println(msg);
		map.put("message", msg);
		return "display";
	}
	
*/
	

	//When the return type is void the view name is the url pattern given in the request scope
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public void showView(Map<String, Object> map) {

		String msg = service.generateWish();
		System.out.println(msg);
		map.put("message", msg);
	}
/*
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String showView(HttpServletResponse response) throws IOException {

		String msg = service.generateWish();
		response.setContentType("html/text");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Hello user :: "+msg+"</h1>");
		
		return null;
	}
	
*/
	
}
