package com.kishkan.epam.devteam.dto;

import java.util.List;

public class Target {
    private int id;
    private String description;
    private StaffMember manager;
    private boolean isFinished;
    private List<StaffMember> executors;
    private List<Task> tasks;
}
