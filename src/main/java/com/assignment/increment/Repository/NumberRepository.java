package com.assignment.increment.Repository;

import com.assignment.increment.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<Number, Integer> {
}
