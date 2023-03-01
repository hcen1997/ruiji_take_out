package com.ddiqq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddiqq.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
