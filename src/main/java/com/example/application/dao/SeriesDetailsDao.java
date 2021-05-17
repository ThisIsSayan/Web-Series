package com.example.application.dao;

import com.example.application.model.SeriesDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesDetailsDao extends JpaRepository<SeriesDetails, Integer>
{
}
