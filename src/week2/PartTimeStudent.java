/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author arman
 */
public class PartTimeStudent extends student {
     private int num_of_courses;

    public int getNum_of_courses() {
        return num_of_courses;
    }

    public void setNum_of_courses(int num_of_courses) {
        this.num_of_courses = num_of_courses;
    }

    public PartTimeStudent(int num_of_courses, int std, String sname){
        super(std, sname);
        this.num_of_courses = num_of_courses;
    }
}
