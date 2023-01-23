package com.betaplan.eva.savetravels.controllers;

import com.betaplan.eva.savetravels.models.Travel;
import com.betaplan.eva.savetravels.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@Controller
public class TravelController {
    @Autowired
    private TravelService travelService;

    @GetMapping("/expenses")
    public String index(@ModelAttribute("travel") Travel travel, Model model){
        List<Travel> travels=travelService.getAllTravels();
        model.addAttribute("allTravels",travels);
        return "index";
    }


    @PostMapping("/create/expenses")
    public String createArt(@Valid @ModelAttribute("travel")Travel travel, @NotNull BindingResult results){
        if (results.hasErrors()){
            return "index";
        }
        travelService.createTravel(travel);
        return "redirect:/expenses";
    }
    @GetMapping("/details/{id}")
    public String traveDetails(@PathVariable Long id ,Model model){
       Travel travel= travelService.details(id);
        model.addAttribute("travel",travel);
        return "details";
    }
    @GetMapping("/edit/{id}")
    public String editArt(@PathVariable Long id , Model model){
        Travel travel =travelService.details(id);
        model.addAttribute("travel",travel);
        return "edit";
    }
    @PutMapping("/update/{id}")
    public String updateArt( @Valid @ModelAttribute("travel")Travel travel, @NotNull BindingResult results,@PathVariable Long id){
        if(results.hasErrors()){
            return "edit";
        }
        travelService.update(travel);
        return "redirect:/expenses";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteArt(@PathVariable Long id){
    travelService.delete(id);
    return "redirect:/expenses";
    }


}
