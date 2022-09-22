package com.example.demo.Controllers;

import com.example.demo.Campaign;
import com.example.demo.CampaignDto;
import com.example.demo.CampaignService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

    private CampaignService service;

    public AddController(CampaignService service) {
        this.service = service;
    }

    @GetMapping("/add")
    String Open() {
        return "add";
    }

    @PostMapping("/add_campaign")
    String Add(@RequestParam String name, @RequestParam int bid, @RequestParam int radius, @RequestParam int funds,
               @RequestParam String town, boolean status, String keywords) {
        CampaignDto dto = new CampaignDto(name, town, bid, radius, funds, status, keywords);
        service.AddCampaign(dto);
        return "success";
    }
}
