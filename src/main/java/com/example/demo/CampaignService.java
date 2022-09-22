package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CampaignService {

    private CampaignRepository repository;
    private CampaignMapper mapper;

    public CampaignService(CampaignRepository repository, CampaignMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    Optional<CampaignDto> GetOfferById(Long id) {
        return repository.findById(id)
                .map(mapper::Map);
    }

    public void AddCampaign(CampaignDto dto) {
        repository.save(mapper.MapReverse(dto));
    }

    public ArrayList<CampaignDto> GetAllCampaigns() {
        ArrayList<CampaignDto> items = new ArrayList<>();
        repository.findAll().forEach(n -> {
            items.add(mapper.Map(n));
        });
        return items;
    }

    public boolean DeleteCampaign(Long id) {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean EditCampaign(CampaignDto dto) {
        if(repository.findById(dto.getId()).isPresent()) {
            repository.deleteById(dto.getId());
            repository.save(mapper.MapReverse(dto));
            return true;
        }
        return false;
    }
}
