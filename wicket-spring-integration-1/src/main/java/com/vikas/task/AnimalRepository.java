package com.vikas.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animals, Long> {

}
