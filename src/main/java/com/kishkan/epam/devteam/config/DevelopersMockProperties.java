package com.kishkan.epam.devteam.config;

import com.kishkan.epam.devteam.dto.Developer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("developer-list")
public class DevelopersMockProperties {
    private List<Developer> developers = new ArrayList<>();

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "DevelopersMockProperties{" +
                "developers=" + developers +
                '}';
    }
}
