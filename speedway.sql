CREATE TABLE IF NOT EXISTS points (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    latitude DECIMAL(10, 8) NOT NULL COMMENT '纬度',
    longitude DECIMAL(11, 8) NOT NULL COMMENT '经度',
    name VARCHAR(100) NOT NULL,
    address VARCHAR(255),
    INDEX idx_location (latitude, longitude)
    )