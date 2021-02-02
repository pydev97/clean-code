package com.luvina.net.LeQuyPhuc_CleanCode.repository;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT email FROM user WHERE email = :email",nativeQuery=true)
    public List<String> checkExistedEmail(@Param("email") String email);
}
