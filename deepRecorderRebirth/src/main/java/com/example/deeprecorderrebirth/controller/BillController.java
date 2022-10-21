package com.example.deeprecorderrebirth.controller;


import com.example.deeprecorderrebirth.entity.Bill;
import com.example.deeprecorderrebirth.models.services.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class BillController {

    @Autowired
    private IBillService iBillService;

    @GetMapping("/listBill")
    public String list(Model model){
        model.addAttribute("name", "List bills");
        model.addAttribute("bill", iBillService.findAll());
        return "listBill";

    }

    @GetMapping(value = "/createBill")
    public String addBill(Model model){
        model.addAttribute("bill", new Bill());
        model.addAttribute("title","Create bill");
        return "createBill";

    }
    @PostMapping(value = "/createBill")
    public String saveClient(@Valid Bill bill, BindingResult result, Model model){
        if (result.hasErrors()){
            return "createBill";
        }
        iBillService.save(bill);
        return "redirect:/listBill";
    }

    @PostMapping(value = "/deleteBill/{id}")
    public String delete(@PathVariable(value = "id") Long id, RedirectAttributes flash) {
        if (id > 0) {
            iBillService.remove(id);
            flash.addFlashAttribute("Success", "Bill eliminated successfuly");
        }
        return "redirect:/listBill";
    }

    @RequestMapping("/createBill/{id}")
}
