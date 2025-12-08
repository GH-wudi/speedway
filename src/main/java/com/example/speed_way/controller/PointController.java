package com.example.speed_way.controller;

import com.example.speed_way.entity.Point;
import com.example.speed_way.repository.PointRepository;
import com.example.speed_way.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PointController {
    @Autowired
    private PointService pointService;

    public ResponseEntity<List<Point>> getAllPoints(){
        List<Point> points = pointService.getAllPoints();
        return ResponseEntity.ok(points);
    }
}
