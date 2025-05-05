package Introductory_concept_encapsulation.Encapsulation_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRecord {
    private String studentId;
    private String studentName;
    private List<Integer> grades;

public StudentRecord(String studentId, String studentName){
    this.studentId = studentId;
    this.studentName = studentName;
    this.grades = new ArrayList<>();

}
public String getStudentId(){
    return studentId;
}

public String getStudentName(){
    return studentName;

}
public void setStudentName(String studentName){
    if ((studentName!= null) && (!studentName.isEmpty())) {
        this.studentName = studentName;
        
    } else {
        throw new IllegalArgumentException("Grade must be between 0 and 100");
    }
    
}

public List<Integer> getGrades(){
    return Collections.unmodifiableList(grades);
}
public void addGrade(int grade){
    if(grade>0 && grade<=100){
        this.grades.add(grade);
    }
    else{
        throw new IllegalArgumentException("Grade must be between 0 and 100");
    }
}

public double getAverage(){
    double avg = 0.0;

    if(grades.isEmpty()){
        return 0.0;
    }
    for(int g:grades){

        avg+=g;
    }
    
    return avg/grades.size();
}

public int getHighestGrade(){
    if(grades.isEmpty()){
        return -1;
    }
    int highestgrade = grades.get(0);
    for(int g:grades){
        if(g > highestgrade){
            highestgrade = g;
        }
    }

    return highestgrade;
}

@Override
public String toString(){
    return String.format("StudentRecord[id=%s, name=%s, grades=%s, avg=%.1f]",
    studentId,
    studentName,
    grades,
    getAverage()
    );
}



}



