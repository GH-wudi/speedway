package com.example.speed_way.service;

import com.example.speed_way.entity.Point;
import com.example.speed_way.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {
    @Autowired
    private PointRepository pointRepository;

    public List<Point> getAllPoints() {
        return pointRepository.findAll();
    }
}
