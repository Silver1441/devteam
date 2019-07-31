package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.StaffMember;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StaffRepository {
    List<StaffMember> getList();
}
