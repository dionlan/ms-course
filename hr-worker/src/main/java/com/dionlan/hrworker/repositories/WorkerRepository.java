package com.dionlan.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dionlan.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>  {

}
