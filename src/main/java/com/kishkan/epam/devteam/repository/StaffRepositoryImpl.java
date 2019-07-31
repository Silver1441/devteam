package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.StaffMember;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StaffRepositoryImpl implements StaffRepository {
    private List<StaffMember> staff = new ArrayList<>();

    public List<StaffMember> getList() {
        return staff;
    }

    public void setStaff(List<StaffMember> staff) {
        this.staff = staff;
    }
}
