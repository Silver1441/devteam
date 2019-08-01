package com.kishkan.epam.devteam.config;

import com.kishkan.epam.devteam.repository.StaffRepository;
import com.kishkan.epam.devteam.repository.StaffRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public StaffRepository staffRepository(StaffMockProperties properties) {
        return new StaffRepositoryImpl(properties.getStaffMembers());
    }
}
