package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.DataAlert;

@ComponentScan
@Repository
public interface DataAlertDao {
public void registerUser(DataAlert Alert);
}
