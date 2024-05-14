package com.example.test.controllers;

import ch.qos.logback.core.net.server.Client;
import com.example.test.entities.Client1;
import com.example.test.enums.Clientstate;
import com.example.test.services.Client1Service;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class Client1Controller {
    private Client1Service client1Service;
    @RequestMapping("/createClient1")
    public String createClient1(){
        return "CreateClient1";
    }
    @RequestMapping("saveClient1")
    public String saveClient1(@ModelAttribute("client1Vue")Client1 client1Controller){
        client1Controller.setClientstate(Clientstate.Nvclient);
        Client1 saveClient1 = client1Service.saveClient1(client1Controller);
        return  "CreateClient1";
    }
    @RequestMapping("/client1List")
    public String client1List(ModelMap modelMap){
        List<Client1> client1sController = client1Service.getAllClient1();
        modelMap.addAttribute ("client1Vue",client1sController);
        return "Clients1List";
    }
    @RequestMapping("/deleteClient1")
    public String deleteClient1(@RequestParam("id") Long id,ModelMap modelMap){
        client1Service.deleteClient1ById(id);
        return client1List(modelMap);
    }
    @RequestMapping("/editClient1")
    public String editClient1(@RequestParam("id") Long id,ModelMap modelMap){
        Client1 client1Controller = client1Service.getClient1ById(id);
        modelMap.addAttribute ( "client1View", client1Controller);
        return "EditClient1";
    }
    @RequestMapping("/updateClient1")
    public String updateClient1(@ModelAttribute("client1Vue")Client1 client1Controller){
        client1Service.updateClient1(client1Controller);
        return createClient1();
    }
}
