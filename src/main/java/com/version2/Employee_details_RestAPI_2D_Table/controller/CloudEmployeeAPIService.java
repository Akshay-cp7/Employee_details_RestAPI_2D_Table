package com.version2.Employee_details_RestAPI_2D_Table.controller;

import com.version2.Employee_details_RestAPI_2D_Table.modle.CloudEmployee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cloudemployee")
public class CloudEmployeeAPIService {

    private static final Map<String, CloudEmployee> employees = new HashMap<>();

    static {
        employees.put("E1", new CloudEmployee("E1", "Arun", 3000, "sales"));
        employees.put("E2", new CloudEmployee("E2", "Amal", 4000, "sales"));
        employees.put("E3", new CloudEmployee("E3", "Vimal", 2000, "HR"));
    }

    @GetMapping("/{employeeId}")
    public CloudEmployee getCloudEmployeeDetails(@PathVariable String employeeId){
        return employees.get(employeeId);
    }
}
