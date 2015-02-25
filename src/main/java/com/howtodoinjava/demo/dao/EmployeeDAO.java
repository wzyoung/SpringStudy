package com.howtodoinjava.demo.dao;
import java.util.List;

import com.howtodoinjava.demo.model.EmployeeVO;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
}