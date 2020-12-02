package com.cg.traineeManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.traineeManagement.model.Trainee;

@Repository
public interface TraineeRepository extends CrudRepository<Trainee, Integer> {

	Trainee findByTraineeId(int traineeId);

	Trainee findByTraineeName(String traineeName);

	Trainee save(int traineeId);

	

	



	

	

}
