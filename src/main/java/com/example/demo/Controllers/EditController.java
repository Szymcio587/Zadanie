package com.example.demo.Controllers;

import com.example.demo.CampaignDto;
import com.example.demo.CampaignService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditController {

    private CampaignService service;

    public EditController(CampaignService service) {
        this.service = service;
    }

    @GetMapping("/edit")
    String Open() {
        return "edit";
    }

    @PostMapping("/edit_campaign")
    String Edit(@RequestParam Long id, @RequestParam String name, @RequestParam int bid, @RequestParam int radius,
                @RequestParam int funds, @RequestParam String town, boolean status, String keywords) {
        CampaignDto dto = new CampaignDto(name, town, bid, radius, funds, status, keywords);
        if(service.EditCampaign(dto, id))
            return "success";
        else
            return "edit";
    }
}
