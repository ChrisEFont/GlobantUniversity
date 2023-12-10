package com.eggnews.eggnews.repository;

import com.eggnews.eggnews.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chris
 */
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
    
    @Query("SELECT u FROM AppUser u WHERE u.email = :email")
    public AppUser findByEmail(@Param("email")String email);   
    
}
