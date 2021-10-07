package model;

import java.util.Scanner;

public class People {
    private String name;
    private int dateOfBirth;
    private String job;

    public People() {
    }

    public People(String name, int dateOfBirth, String job) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void inputPeople() {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào tên");
        name = scanner.nextLine();
        System.out.println("nhập vào ngày sinh");
        dateOfBirth = input.nextInt();
        System.out.println("nhập vào nghề nghiệp");
        job = scanner.nextLine();
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", job='" + job + '\'' +
                        '}';
    }
}
