package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	// przy wej�ciu na stron� wywo�uje si� ta metoda
	//wszystko b�dzie sz�o do page.jsp bo zmapowali�my przez /, /home i /index
	@RequestMapping(value = {"/", "/home", "/index"}) // w RequestMapping dodaje si� �cie�k�
	public ModelAndView index() {  // jest odniesieniem do tej metody i kt�ra obs�uguje wszystkie zapytania http
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC"); //tworz� greeting i przekazuj� do view,
		return mv;
//kontroler przekazuje zapytanie do strony jsp(page.jsp)		
		
	}
	
	//value=greeting jest request param i b�dzie wchodzi� w formie query string(ten za "?") i
	//tego parametru b�dzie greeting
	//b�dziemy przypisywa� to do zmiennej greeting (String greeting), zmienn� t� b�dziemy 
	//przekazywa� do object attribute value w metodzie addObject(czyli 2 parametr)
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){
		if (greeting==null) {
			greeting = "Hello there";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/

	//greeting jest w {} wi�c jest dynamiczna w URL i b�dzie dost�pna w zmiennej greeting
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
