package com.example.application.service;

import com.example.application.model.SeriesDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface WebService
{
    public void addSeriesService(SeriesDetails seriesDetails);
    public List<SeriesDetails> allSeriesService();
    public List<SeriesDetails> seriesByIdService(int id);
    public List<SeriesDetails> seriesByNameService(String name);
    public void updateSeriesService(SeriesDetails seriesDetails);
    public boolean deleteSeriesService(int id);

}
