package com.jaeuk.home.repository;

import com.jaeuk.home.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
