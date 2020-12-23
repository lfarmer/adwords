package uk.co.leafdevelopment.adwords.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.leafdevelopment.adwords.model.Campaign;
import uk.co.leafdevelopment.adwords.services.CampaignService;

import java.util.List;

@RestController
public class CampaignsController {

    private final CampaignService campaignService;

    @Autowired
    public CampaignsController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping(path = "/campaigns")
    public List<Campaign> getCampaigns() {
        return campaignService.getAllCampaigns();
    }

}
