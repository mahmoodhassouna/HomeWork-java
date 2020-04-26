/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigned_1;

/**
 *
 * @author Hassouna
 */
class ArtStudent extends Student {

    double midMarks, projectMarks, finalMarks;

    double calcualteGrade(double mid, double project, double finalMarks) {
        double grade = mid * 0.40 + project * 0.10 + finalMarks * 50;
        return grade;

    }

    public ArtStudent(int id, String name, String major, double grade) {
        super(id, name, major, grade);
        // TODO Auto-generated constructor stub
    }

    public ArtStudent() {
        super();
    }

}

