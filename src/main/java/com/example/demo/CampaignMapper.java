package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CampaignMapper {

    public CampaignDto Map(Campaign campaign) {
        CampaignDto dto = new CampaignDto();
        dto.setCampaignFund(campaign.getCampaignFund());
        dto.setBidAmount(campaign.getBidAmount());
        dto.setId(campaign.getId());
        dto.setKeywords(campaign.getKeywords());
        dto.setName(campaign.getName());
        dto.setRadius(campaign.getRadius());
        dto.setStatus(campaign.isStatus());
        dto.setTown(campaign.getTown());
        return dto;
    }

    public Campaign MapReverse(CampaignDto dto) {
        Campaign campaign = new Campaign();
        campaign.setCampaignFund(dto.getCampaignFund());
        campaign.setBidAmount(dto.getBidAmount());
        campaign.setId(dto.getId());
        campaign.setKeywords(dto.getKeywords());
        campaign.setName(dto.getName());
        campaign.setRadius(dto.getRadius());
        campaign.setStatus(dto.isStatus());
        campaign.setTown(dto.getTown());
        return campaign;
    }
}
