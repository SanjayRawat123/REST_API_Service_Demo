/*
 * Author Name:
 * Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package web34com.example.restFulServicedemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int sId;
    private String sName;
    private String sAddress;
    private int smark;


    public Student(int sId, String sName, String sAddress, int smark) {
        this.sId = sId;
        this.sName = sName;
        this.sAddress = sAddress;

        this.smark = smark;
    }

    public int getsId() {
        return sId;
    }

    public Student setsId(int sId) {
        this.sId = sId;
        return this;
    }

    public String getsName() {
        return sName;
    }

    public Student setsName(String sName) {
        this.sName = sName;
        return this;
    }

    public String getsAddress() {
        return sAddress;
    }

    public Student setsAddress(String sAddress) {
        this.sAddress = sAddress;
        return this;
    }

    public int getSmark() {
        return smark;
    }

    public Student setSmark(int smark) {
        this.smark = smark;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                ", smark=" + smark +
                '}';
    }
}
