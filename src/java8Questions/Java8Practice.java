package java8Questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Practice {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1,"Rohit",30,"Male","Mechanical engineer","Mumbai",122, Arrays.asList("921344324","46547657657","456565476")),
                new Student(1,"Aman",20,"Male","sound engineer","Mumbai",22, Arrays.asList("921344m","46657657")),
                new Student(1,"shubham",30,"Male","cs engineer","patna",2, Arrays.asList("239213444","134657657","44565476")),
                new Student(1,"swati",23,"FeMale","civil engineer","delhi",62, Arrays.asList("7561344324","657657657","455655476")),
                new Student(1,"supriya",26,"FeMale","it engineer","gurugram",73, Arrays.asList("9213443254"))
        ).collect(Collectors.toList());

     List<Student> students =   studentList.stream().filter(student -> student.getRank()>50 && student.getRank()<100).collect(Collectors.toList());
      //  System.out.println(students);

        // student stay in mumbai sorted byname revese order
        List<Student> studentCity =  studentList.stream().filter(student -> student.getCity().equalsIgnoreCase("Mumbai")).sorted(
                Comparator.comparing(Student::getName,Comparator.reverseOrder())).collect(Collectors.toList());
     //   System.out.println(studentCity);

        // find all department name

        List<String> studentdeaprtment =  studentList.stream().map(Student::getDept)
                .collect(Collectors.toList());
     //   System.out.println(studentdeaprtment);

        // find all contact number
        List<String> studentCOntact = studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());
       // System.out.println(studentCOntact);

        // grop student by department

        Map<String, List<Student>> studentMap =  studentList.stream().collect(Collectors.groupingBy(Student::getDept));
       // System.out.println(studentMap);

        Map<String, Long> studentMap1 =  studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting()));
       // System.out.println(studentMap1);

        //avg age

        Map<String,Double> avgStudent =   studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
      //  System.out.println(avgStudent);

        // hieghst rank in each department

     Map<String, Optional<Student>>  stMap =  studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(stMap);
    }
}
