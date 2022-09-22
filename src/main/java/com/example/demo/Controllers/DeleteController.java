package com.example.demo.Controllers;

import com.example.demo.CampaignService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {

    private CampaignService service;

    public DeleteController(CampaignService service) {
        this.service = service;
    }

    @GetMapping("/delete")
    String Open() {
        return "delete";
    }

    @PostMapping("/delete_campaign")
    String Delete(@RequestParam Long id) {
        if(service.DeleteCampaign(id))
            return "success";
        else
            return "delete";
    }
}
