package com.example.speed_way.service;

import com.example.speed_way.dto.PointDTO;
import com.example.speed_way.entity.Point;
import com.example.speed_way.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PointService {
    private final PointRepository pointRepository;
    // 构造器注入 (Spring 推荐方式)
    @Autowired
    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }
    // 增加DTO层后,将返回值从 List<Point> 改为 List<PointDTO>
    public List<PointDTO> getAllPoints() {
        List<Point> entities = pointRepository.findAll();

//        // 将 Entity 列表转换为 DTO 列表
        return entities.stream()
                .map(entity -> new PointDTO(entity.getLatitude(), entity.getLongitude(),entity.getName(),entity.getAddress()))
                .collect(Collectors.toList());
    }
}
