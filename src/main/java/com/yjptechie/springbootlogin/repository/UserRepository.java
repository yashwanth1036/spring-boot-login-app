package com.yjptechie.springbootlogin.repository;

import com.yjptechie.springbootlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	@SuppressWarnings("unchecked")
	public User save(User user);
	
	User findByEmail(String email);

}
