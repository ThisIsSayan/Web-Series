package com.example.application.service;

import com.example.application.dao.SeriesDetailsDao;
import com.example.application.model.SeriesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebServiceImpl implements WebService
{
    @Autowired
    SeriesDetailsDao seriesDetailsDao;

    @Override
    public void addSeriesService(SeriesDetails seriesDetails)
    {
        seriesDetailsDao.save(seriesDetails);
    }

    @Override
    public List<SeriesDetails> allSeriesService()
    {
        return seriesDetailsDao.findAll();
    }

    @Override
    public List<SeriesDetails> seriesByIdService(int id)
    {
        List<SeriesDetails> allSeries = seriesDetailsDao.findAll();
        List<SeriesDetails> resSeries = new ArrayList<>();
        for (SeriesDetails sd : allSeries)
        {
            if(sd.getId() == id)
            {
                resSeries.add(sd);
            }
        }
        return resSeries;
    }

    @Override
    public List<SeriesDetails> seriesByNameService(String name)
    {
        List<SeriesDetails> allSeries = seriesDetailsDao.findAll();
        List<SeriesDetails> resSeries = new ArrayList<>();
        for (SeriesDetails sd : allSeries)
        {
            if(sd.getName().equals(name))
            {
                resSeries.add(sd);
            }
        }
        return resSeries;
    }

    @Override
    public void updateSeriesService(SeriesDetails seriesDetails)
    {
        seriesDetailsDao.save(seriesDetails);
    }

    @Override
    public boolean deleteSeriesService(int id) {
        try{
            seriesDetailsDao.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
