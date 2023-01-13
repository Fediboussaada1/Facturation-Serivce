package tn.enicarthage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BillsController {

	@Autowired
	BillRepository billR;
	
	@RequestMapping(value = {"/saveBill"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String insertFacture(@ModelAttribute("b") Bill b, Model model)
	{
		System.out.println("\n "+b+"\n");
		billR.save(b);
		return"redirect:http://localhost:8888/FACTURATION-SERVICE/BillAdd.html";
	}
	
	@RequestMapping(value = "/getBills", method = RequestMethod.GET)
    public ModelAndView getFactures() {
    	ModelAndView mv= new ModelAndView(); 
        mv.addObject("factures", billR.findAll());
        mv.setViewName("BillsTab.html");
        return mv;
    }
	
	@RequestMapping(value = {"/deleteBill"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String deleteBill(@ModelAttribute("b") Bill c, Model model)
	{
		System.out.println("Delete bill");
		billR.delete(c);
		return"redirect:http://localhost:8888/FACTURATION-SERVICE/getBills";
	}
	
}
