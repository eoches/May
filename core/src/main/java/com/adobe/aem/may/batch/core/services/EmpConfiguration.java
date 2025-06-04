package com.adobe.aem.may.batch.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Employee Configuration")
public @interface EmpConfiguration {

    @AttributeDefinition(
        name = "Employee Name",
        description = "Name from A-Z",
        defaultValue = "A"
    )
    String empName();

    @AttributeDefinition(
        name = "Employee ID",
        description = "Employee ID",
        defaultValue = "100"
    )
    int empId();

    @AttributeDefinition(
        name = "Employee Salary",
        description = "Employee Salary",
        defaultValue = "10000"
    )
    double empSal();
}
