package com.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.request.SampleRequest;
import com.example.response.StudentResponse;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private StudentService studentService;

    public String firstQuery() {
        return "First Query";
    }

    public String secondQuery() {
        return "Second Query";
    }

    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String fullNameV2(SampleRequest sampleRequest) {
        return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
    }

    public StudentResponse getStudent(long id) {
        return new StudentResponse(studentService.getStudentById(id));
    }
}
