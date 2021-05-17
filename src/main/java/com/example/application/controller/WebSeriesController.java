package com.example.application.controller;

import com.example.application.model.SeriesDetails;
import com.example.application.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebSeriesController
{
    @Autowired
    WebService webService;

    @PostMapping("/addSeries")
    public void addSeries(@RequestBody SeriesDetails seriesDetails)
    {
        webService.addSeriesService(seriesDetails);
    }

    @GetMapping("/series")
    public List<SeriesDetails> allSeries()
    {
        return webService.allSeriesService();
    }

    @GetMapping("/series/id/{id}")
    public List<SeriesDetails> seriesById(@PathVariable("id") int id)
    {
        return webService.seriesByIdService(id);
    }

    @GetMapping("/series/name/{name}")
    public List<SeriesDetails> seriesByName(@PathVariable("name") String name)
    {
        return webService.seriesByNameService(name);
    }

    @PutMapping("/update")
    public void updateSeries(@RequestBody SeriesDetails seriesDetails)
    {
        webService.updateSeriesService(seriesDetails);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSeries(@PathVariable("id") int id)
    {
        if(webService.deleteSeriesService(id))
            return "Series Removed!"+ id;
        else
            return "Cant delete";
    }

}
