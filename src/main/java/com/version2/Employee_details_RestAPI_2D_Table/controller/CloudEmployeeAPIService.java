package com.version2.Employee_details_RestAPI_2D_Table.controller;


import com.version2.Employee_details_RestAPI_2D_Table.modle.CloudEmployee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudemployee")

public class CloudEmployeeAPIService {
    @GetMapping("{employeeId}")
    public CloudEmployee getCloudEmployeeDetails(String employeeId){
        return new CloudEmployee("E1","Arun",3000,"sales");


    }
}