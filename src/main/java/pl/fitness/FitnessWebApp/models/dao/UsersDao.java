package pl.fitness.FitnessWebApp.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.fitness.FitnessWebApp.models.Users;

@Transactional
@Repository
public interface UsersDao extends CrudRepository<Users, Integer> {
	
	public List<Users> findAll();
	
	public Users findByUserId(Integer userId);

}
