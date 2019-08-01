package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.StaffMember;

import java.util.List;

public interface StaffRepository {
    List<StaffMember> getList();
}
