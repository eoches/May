package com.adobe.aem.may.batch.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
    service = EmployeeConfigurationImpl.class,
    immediate = true,
    enabled = true
)
@Designate(ocd = EmpConfiguration.class)
public class EmployeeConfigurationImpl {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeConfigurationImpl.class);

    private String empName;
    private int empId;
    private double empSal;

    @Activate
    @Modified
    public void activateOrModify(EmpConfiguration config) {
        updateConfiguration(config);
    }

    @Deactivate
    public void deactivate() {
        LOG.info("EmployeeConfigurationImpl service deactivated");
    }

    private void updateConfiguration(EmpConfiguration config) {
        this.empName = config.empName();
        this.empId = config.empId();
        this.empSal = config.empSal();

        LOG.info("Configuration - Name: {}, ID: {}, Salary: {}", empName, empId, empSal);
    }

    // Optionally add getters if you need to access these properties from elsewhere
    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public double getEmpSal() {
        return empSal;
    }
}
