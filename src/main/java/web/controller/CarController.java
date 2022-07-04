package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model, @RequestParam("count") int count) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Toyota", "Mark II", 105));
		cars.add(new Car("Toyota", "Mark X", 125));
		cars.add(new Car("Toyota", "Vista", 105));
		cars.add(new Car("Toyota", "Land Cruiser", 100));
		cars.add(new Car("Toyota", "Land Cruiser", 200));
		List<Car> processedList = CarService.getListCars(cars, count);
		model.addAttribute("cars", processedList);
		return "cars";
	}
	
}