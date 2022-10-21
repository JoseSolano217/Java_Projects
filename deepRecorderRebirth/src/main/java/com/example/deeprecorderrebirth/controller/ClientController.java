package com.example.deeprecorderrebirth.controller;

import com.example.deeprecorderrebirth.entity.Client;
import com.example.deeprecorderrebirth.models.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/listClient")
    public String list(Model model){
        model.addAttribute("name", "List clients");
        model.addAttribute("client", clientService.findAll());
        return "listClient";

    }

    @GetMapping(value = "/createClient")
    public String addClient(Model model){
        model.addAttribute("client", new Client());
        model.addAttribute("title","Create client");
        return "createClient";

    }
    @PostMapping(value = "/createClient")
    public String saveClient(@Valid Client client, BindingResult result, Model model){
        if (result.hasErrors()){
            return "createClient";
    }
        clientService.save(client);
        return "redirect:/listClient";
    }
}
