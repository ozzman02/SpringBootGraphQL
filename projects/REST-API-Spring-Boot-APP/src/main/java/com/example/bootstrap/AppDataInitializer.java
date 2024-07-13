package com.example.bootstrap;

import com.example.entity.Address;
import com.example.entity.Student;
import com.example.entity.Subject;
import com.example.repository.AddressRepository;
import com.example.repository.StudentRepository;
import com.example.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
@RequiredArgsConstructor
public class AppDataInitializer implements CommandLineRunner {

    private final AddressRepository addressRepository;

    private final StudentRepository studentRepository;

    private final SubjectRepository subjectRepository;


    @Override
    public void run(String... args) throws Exception {

        if (addressRepository.count() == 0 && studentRepository.count() == 0
                && subjectRepository.count() == 0) {

            Address address1 = new Address();
            address1.setCity("Fengle");
            address1.setStreet("98721 Annamark Trail");

            Address address2 = new Address();
            address2.setCity("Mogi Guaçu");
            address2.setStreet("92632 Delaware Pass");

            Address address3 = new Address();
            address3.setCity("Xinxing");
            address3.setStreet("889 Bunker Hill Court");

            Address address4 = new Address();
            address4.setCity("Rydułtowy");
            address4.setStreet("69 Porter Park");

            Address address5 = new Address();
            address5.setCity("Kilkenny");
            address5.setStreet("52710 Toban Center");

            Address address6 = new Address();
            address6.setCity("Skënderbegas");
            address6.setStreet("234 Barnett Place");

            Address address7 = new Address();
            address7.setCity("Sanyang");
            address7.setStreet("2348 Walton Way");

            Address address8 = new Address();
            address8.setCity("Kota Kinabalu");
            address8.setStreet("20109 Eastwood Junction");

            Address address9 = new Address();
            address9.setCity("Salaberry-de-Valleyfield");
            address9.setStreet("5 Veith Circle");

            Address address10 = new Address();
            address10.setCity("Shuanggang");
            address10.setStreet("802 Hovde Terrace");

            Subject subject1 = new Subject();
            subject1.setSubjectName("Java");
            subject1.setMarksObtained(80.00);

            Subject subject2 = new Subject();
            subject2.setSubjectName("React");
            subject2.setMarksObtained(80.00);

            Subject subject3 = new Subject();
            subject3.setSubjectName("Angular");
            subject3.setMarksObtained(80.00);

            Subject subject4 = new Subject();
            subject4.setSubjectName("Spring");
            subject4.setMarksObtained(80.00);

            Subject subject5 = new Subject();
            subject5.setSubjectName("Hibernate");
            subject5.setMarksObtained(80.00);

            Subject subject6 = new Subject();
            subject6.setSubjectName("Maven");
            subject6.setMarksObtained(80.00);

            Subject subject7 = new Subject();
            subject7.setSubjectName("AWS");
            subject7.setMarksObtained(80.00);

            Subject subject8 = new Subject();
            subject8.setSubjectName("Kubernetes");
            subject8.setMarksObtained(80.00);

            Subject subject9 = new Subject();
            subject9.setSubjectName("Git");
            subject9.setMarksObtained(80.00);

            Subject subject10 = new Subject();
            subject10.setSubjectName("Bash");
            subject10.setMarksObtained(80.00);

            Student student1 = new Student();
            student1.setFirstName("Filippo");
            student1.setLastName("Balsdon");
            student1.setEmail("fbalsdon0@elpais.com");
            student1.setAddress(address1);
            subject1.setStudent(student1);
            student1.setLearningSubjects(Collections.singletonList(subject1));

            Student student2 = new Student();
            student2.setFirstName("Bronson");
            student2.setLastName("McCaughren");
            student2.setEmail("bmccaughren1@hao123.com");
            student2.setAddress(address2);
            subject2.setStudent(student2);
            student2.setLearningSubjects(Collections.singletonList(subject2));

            Student student3 = new Student();
            student3.setFirstName("Carr");
            student3.setLastName("Norton");
            student3.setEmail("cnorton2@cbc.ca");
            student3.setAddress(address3);
            subject3.setStudent(student3);
            student3.setLearningSubjects(Collections.singletonList(subject3));

            Student student4 = new Student();
            student4.setFirstName("Wadsworth");
            student4.setLastName("Kittel");
            student4.setEmail("wkittel3@newyorker.com\t");
            student4.setAddress(address4);
            subject4.setStudent(student4);
            student4.setLearningSubjects(Collections.singletonList(subject4));

            Student student5 = new Student();
            student5.setFirstName("Natala");
            student5.setLastName("Bonsey");
            student5.setEmail("nbonsey4@yahoo.com\t");
            student5.setAddress(address5);
            subject5.setStudent(student5);
            student5.setLearningSubjects(Collections.singletonList(subject5));

            Student student6 = new Student();
            student6.setFirstName("Tally");
            student6.setLastName("Hurdman");
            student6.setEmail("thurdman5@mediafire.com\t");
            student6.setAddress(address6);
            subject6.setStudent(student6);
            student6.setLearningSubjects(Collections.singletonList(subject6));

            Student student7 = new Student();
            student7.setFirstName("Karry");
            student7.setLastName("Plumer");
            student7.setEmail("kplumer6@wsj.com");
            student7.setAddress(address7);
            subject7.setStudent(student7);
            student7.setLearningSubjects(Collections.singletonList(subject7));

            Student student8 = new Student();
            student8.setFirstName("Brandie");
            student8.setLastName("Pohlak");
            student8.setEmail("bpohlak7@deviantart.com");
            student8.setAddress(address8);
            subject8.setStudent(student8);
            student8.setLearningSubjects(Collections.singletonList(subject8));

            Student student9 = new Student();
            student9.setFirstName("Stacey");
            student9.setLastName("Dolley");
            student9.setEmail("sdolley8@arizona.edu");
            student9.setAddress(address9);
            subject9.setStudent(student9);
            student9.setLearningSubjects(Collections.singletonList(subject9));

            Student student10 = new Student();
            student10.setFirstName("Ingeberg");
            student10.setLastName("Dobby");
            student10.setEmail("idobby9@freewebs.com");
            student10.setAddress(address10);
            subject10.setStudent(student10);
            student10.setLearningSubjects(Collections.singletonList(subject10));

            studentRepository.saveAll(Arrays.asList(student1, student2, student3, student4, student5,
                    student6, student7, student8, student9, student10));
        }



    }
}
