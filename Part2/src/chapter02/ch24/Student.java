package chapter02.ch24;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        StringBuffer sb = new StringBuffer();

        int totalScore = 0;

        for (Subject subject : subjectList) {

            totalScore += subject.getScorePoint();
            sb.append("학생 ").append(studentName).append("의 ").append(subject.getName())
                    .append(" 과목 성적은 ").append(subject.getScorePoint()).append("입니다.").append('\n');
        }
        sb.append("학생 ").append(studentName).append("의 총점은 ").append(totalScore).append(" 입니다.");

        System.out.println(sb);
    }
}
