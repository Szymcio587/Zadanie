package com.example.demo.Controllers;

import com.example.demo.CampaignService;
import com.example.demo.CampaignDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ShowController {

    private CampaignService service;

    public ShowController(CampaignService service) {
        this.service = service;
    }

    @GetMapping("/show")
    String Show(Model model) {
        ArrayList<CampaignDto> items = service.GetAllCampaigns();
        model.addAttribute("items", items);
        return "show";
    }
}
