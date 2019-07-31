package com.kishkan.epam.devteam.config;

import com.kishkan.epam.devteam.dto.StaffMember;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("developer-list")
public class StaffMockProperties {
    private List<StaffMember> staffMembers = new ArrayList<>();

    public List<StaffMember> getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(List<StaffMember> staffMembers) {
        this.staffMembers = staffMembers;
    }
}
