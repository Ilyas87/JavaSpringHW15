package org.itstep.hw15.controller;

import org.itstep.hw15.db.DbManager;
import org.itstep.hw15.entity.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index(Model model) {
        List<Car> cars = DbManager.getCars();
        model.addAttribute("cars", cars);
        return "index";
    }

    @PostMapping(value = "addcar")
    public String addCar(@RequestParam(name = "model") String model,
                         @RequestParam(name = "brand") String brand,
                         @RequestParam(name = "engineVolume") Double engineVolume,
                         @RequestParam(name = "price") Integer price) {
        Car car = new Car(null, model, brand, engineVolume, price);
        DbManager.addCar(car);
        return "redirect:/";
    }
}
