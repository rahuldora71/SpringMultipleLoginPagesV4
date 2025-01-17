package net.codejava.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CollegeRepository extends JpaRepository<College, String> {
//    @Query("select u from College u where u.email=:email")
//    public College getCollegeByUserName(@Param("email") String email);


    public College findByEmail(String email);
    public College findByName(String name);
}
