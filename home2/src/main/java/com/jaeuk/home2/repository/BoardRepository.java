package com.jaeuk.home2.repository;

import com.jaeuk.home2.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
