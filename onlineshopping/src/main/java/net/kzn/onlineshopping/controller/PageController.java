package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	// przy wejœciu na stronê wywo³uje siê ta metoda
	//wszystko bêdzie sz³o do page.jsp bo zmapowaliœmy przez /, /home i /index
	@RequestMapping(value = {"/", "/home", "/index"}) // w RequestMapping dodaje siê œcie¿kê
	public ModelAndView index() {  // jest odniesieniem do tej metody i która obs³uguje wszystkie zapytania http
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC"); //tworzê greeting i przekazujê do view,
		return mv;
//kontroler przekazuje zapytanie do strony jsp(page.jsp)		
		
	}
	
	//value=greeting jest request param i bêdzie wchodziæ w formie query string(ten za "?") i
	//tego parametru bêdzie greeting
	//bêdziemy przypisywaæ to do zmiennej greeting (String greeting), zmienn¹ t¹ bêdziemy 
	//przekazywaæ do object attribute value w metodzie addObject(czyli 2 parametr)
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){
		if (greeting==null) {
			greeting = "Hello there";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/

	//greeting jest w {} wiêc jest dynamiczna w URL i bêdzie dostêpna w zmiennej greeting
	//dla metody
	/*@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		if (greeting==null) {
			greeting = "Hello there";
		}
		
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/




}
