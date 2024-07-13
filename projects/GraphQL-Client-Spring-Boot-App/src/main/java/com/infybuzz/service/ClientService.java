package com.infybuzz.service;

import com.infybuzz.request.CreateStudentRequest;
import graphql.kickstart.spring.webclient.boot.GraphQLRequest;
import graphql.kickstart.spring.webclient.boot.GraphQLResponse;
import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infybuzz.response.StudentResponse;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClientService {

	@Autowired
	GraphQLWebClient graphQLWebClient;

	public StudentResponse getStudent (Integer id) {

		Map<String, Object> variables = new HashMap<>();
		variables.put("id", id);

		String queryStr = "query student($id : Int) {\n" +
				"  student(id: $id) {\n" +
				"    id\n" +
				"    firstName\n" +
				"    lastName\n" +
				"    email\n" +
				"    street\n" +
				"    city\n" +
				"    learningSubjects(subjectNameFilter: ALL) {\n" +
				"      id\n" +
				"      subjectName\n" +
				"      marksObtained\n" +
				"    }\n" +
				"    fullName\n" +
				"  }\n" +
				"}";

		GraphQLRequest request = GraphQLRequest.builder()
				.query(queryStr)
				.variables(variables)
				.build();

		GraphQLResponse response = graphQLWebClient.post(request).block();

		System.out.println(queryStr);

		return response.get("student", StudentResponse.class);
	}

	public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

		Map<String, Object> variables = new HashMap<>();
		variables.put("createStudentRequest", createStudentRequest);

		String mutationStr = "mutation createStudent($createStudentRequest: CreateStudentRequest) {\n" +
				"  createStudent(createStudentRequest: $createStudentRequest) {\n" +
				"    id\n" +
				"    firstName\n" +
				"    lastName\n" +
				"    email\n" +
				"    street\n" +
				"    city\n" +
				"    learningSubjects(subjectNameFilter: ALL) {\n" +
				"      id\n" +
				"      subjectName\n" +
				"      marksObtained\n" +
				"    }\n" +
				"    fullName\n" +
				"  }\n" +
				"}";

		GraphQLRequest request = GraphQLRequest.builder()
				.query(mutationStr).variables(variables).build();

		GraphQLResponse graphQLResponse = graphQLWebClient.post(request).block();

		return graphQLResponse.get("createStudent", StudentResponse.class);
	}
}
