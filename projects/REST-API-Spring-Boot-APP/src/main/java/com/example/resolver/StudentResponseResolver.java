package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.entity.Subject;
import com.example.enums.SubjectNameFilter;
import com.example.response.StudentResponse;
import com.example.response.SubjectResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    /* This is an Edge */
    public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse,
                                                     SubjectNameFilter subjectNameFilter) {
        List<SubjectResponse> learningSubjects = new ArrayList<>();
        if (studentResponse.getStudent().getLearningSubjects() != null) {
            for (Subject subject: studentResponse.getStudent().getLearningSubjects()) {
                if (subjectNameFilter.valueOfSubjectName()
                        .equalsIgnoreCase("All")) {
                    learningSubjects.add(new SubjectResponse(subject));
                }
                if (subjectNameFilter.valueOfSubjectName()
                        .equalsIgnoreCase(subject.getSubjectName())) {
                    learningSubjects.add(new SubjectResponse(subject));
                }
            }
        }
        return learningSubjects;
    }

    public String getFullName(StudentResponse studentResponse) {
        return studentResponse.getFirstName().concat(" ").concat(studentResponse.getLastName());
    }

}
