package com.sakura.jpa.repository;

import com.sakura.jpa.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author DM
 * @version 1.0
 * @description 咖啡数据库操作接口
 * @date 2022/06/19
 */
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}
