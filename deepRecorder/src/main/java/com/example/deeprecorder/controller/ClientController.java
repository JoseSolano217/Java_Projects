package com.example.deeprecorder.controller;

import com.example.deeprecorder.entity.Client;
import com.example.deeprecorder.models.service.IClientService;
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
        model.addAttribute("Name", "List Clients");
        model.addAttribute("Client", clientService.findAll());
        return "listClient";
    }

    @GetMapping(value = "/createClient")
    public String createClient(Model model){
        model.addAttribute("client", new Client());
        model.addAttribute("title","Yes");
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
