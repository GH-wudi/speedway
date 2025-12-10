package com.example.speed_way.controller;

import com.example.speed_way.dto.PointDTO;
//import com.example.speed_way.entity.Point;
import com.example.speed_way.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/points")
@CrossOrigin(origins = "*")// 允许所有前端跨域请求
public class PointController {
    private final PointService pointService;

    @Autowired
    public PointController(PointService pointService) {
        this.pointService = pointService;
    }

    @GetMapping
    public ResponseEntity<List<PointDTO>> getAllPoints() {
        // Service 已经处理好了转换逻辑，直接返回即可
        List<PointDTO> points = pointService.getAllPoints();
        return ResponseEntity.ok(points);
    }
}
