package com.barstad.projectc44.Resources;

import com.barstad.projectc44.dtos.EmployeeReferences;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("projectc44")
@Produces(MediaType.APPLICATION_JSON)
public class Projectc44Resource {

    @GET
    public EmployeeReferences retrieveEmployeeReferences() {
        EmployeeReferences employeeReferences = new EmployeeReferences();
        List<String> list = new ArrayList<>();
        list.add("TEST");
        employeeReferences.setEntries(list);
        return employeeReferences;
    }

}
