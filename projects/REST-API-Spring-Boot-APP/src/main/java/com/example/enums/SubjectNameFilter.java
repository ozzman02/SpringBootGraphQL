package com.example.enums;

public enum SubjectNameFilter {
    ALL("All"),
    JAVA("Java"),
    REACT("React"),
    ANGULAR("Angular"),
    SPRING("Spring"),
    HIBERNATE("Hibernate"),
    MAVEN("Maven"),
    AWS("AWS"),
    KUBERNETES("Kubernetes"),
    GIT("Git"),
    BASH("Bash"),
    QA_AUTOMATION("QA Automation");

    private final String subjectName;

    SubjectNameFilter(String subjectName) {
        this.subjectName = subjectName;
    }

    public String valueOfSubjectName() {
        return this.subjectName;
    }
}
