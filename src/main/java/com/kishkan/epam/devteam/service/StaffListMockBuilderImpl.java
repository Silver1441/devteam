package com.kishkan.epam.devteam.service;

import com.kishkan.epam.devteam.config.StaffMockProperties;
import com.kishkan.epam.devteam.repository.StaffRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffListMockBuilderImpl implements StaffListBuilder {

    @Autowired
    StaffMockProperties staffMockProperties;

    @Autowired
    StaffRepositoryImpl staffRepository;

    public void buildStaffRepository() {
        staffRepository.setStaff(staffMockProperties.getStaffMembers());
    }
}
