package com.ddiqq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddiqq.entity.Employee;
import com.ddiqq.mapper.EmployeeMapper;
import com.ddiqq.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
        implements EmployeeService {
}
