package mx.com.robert.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.com.robert.models.Employee;
import mx.com.robert.service.EmployeeService;

@Controller
public class MainController {

	@Autowired
	EmployeeService empServ;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String initialController(ModelMap model) {
		
		model.addAttribute("message", "Program with all configurations spring");
		
		Employee emp = new Employee();
		emp.setNombre("Roberto");
		emp.setApellidoPaterno("Avila");
		emp.setApellidoMaterno("Sanchez");
		emp.setDireccion("Coapita la bella");
		
		empServ.save(emp);
				
		return "index";
	}
}
