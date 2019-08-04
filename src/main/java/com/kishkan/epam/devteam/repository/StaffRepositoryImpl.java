package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.StaffMember;

import java.util.List;

public class StaffRepositoryImpl implements StaffRepository {

    private List<StaffMember> staff;

    public StaffRepositoryImpl(List<StaffMember> staff) {
        this.staff = staff;
    }

    public List<StaffMember> getList() {
        return staff;
    }

    public StaffMember getById(int id) {
        for (StaffMember staffMember : staff) {
            if (staffMember.getId() == id) {
                return staffMember;
            }
        }
        return null;
    }

    public void setStaff(List<StaffMember> staff) {
        this.staff = staff;
    }
}
