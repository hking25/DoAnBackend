package com.example.case6.repository;

import com.example.case6.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOderDetailRepo extends JpaRepository<OrderDetail, Long> {
}
