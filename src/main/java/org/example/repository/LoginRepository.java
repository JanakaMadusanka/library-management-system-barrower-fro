package org.example.repository;

import org.example.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity,Long>{
    Boolean existsByEmailAndPassword(String email, String password);
}
