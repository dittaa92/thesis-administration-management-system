package hu.pte.ttk.tams.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable { // serializable = sorba rendezhető
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long userID;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column
    private String ehaCode;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String emailAddress;

    @Column
    private String workPlace;

    @Column
    private String rank;

    @Column
    private String major;

    @Column
    private String specialization;

    @Column
    private String course;

    protected User() {}

    public User(String userName, String password, String ehaCode, String lastName, String firstName, String emailAddress,
                String workPlace, String rank, String major, String specialization, String course) {
        //super();
        this.userName = userName;
        this.password = password;
        this.ehaCode = ehaCode;
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.workPlace = workPlace;
        this.rank = rank;
        this.major = major;
        this.specialization = specialization;
        this.course = course;
    }

    public Long getUserID() {
        return this.userID;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEhaCode() {
        return this.ehaCode;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getWorkPlace() {
        return this.workPlace;
    }

    public String getRank() {
        return this.rank;
    }

    public String getMajor() {
        return this.major;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public String getCourse() {
        return this.course;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEhaCode(String ehaCode) {
        this.ehaCode = ehaCode;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
