package com.barstad.projectc44.dtos;

import java.util.ArrayList;
import java.util.List;

public class EmployeeReferences {

    private List<String> entries = new ArrayList<String>();

    public List<String> getEntries() {
        return entries;
    }

    public void setEntries(List<String> entries) {
        this.entries = entries;
    }
}
