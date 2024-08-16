package net.codejava.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import net.codejava.admin.College;

import java.util.UUID;

@Entity
public class Librarian {
    @Id
    private String librarianId= UUID.randomUUID().toString();

    public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public @NotBlank(message = "Enter Librarian Name!") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Enter Librarian Name!") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Enter Librarian Email!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Enter Librarian Email!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Enter Staff Id!") String getStaffId() {
        return staffId;
    }

    public void setStaffId(@NotBlank(message = "Enter Staff Id!") String staffId) {
        this.staffId = staffId;
    }

    public @NotBlank(message = "Enter a string password !") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Enter a string password !") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Enter phone no.") String getPhone() {
        return phone;
    }

    public void setPhone(@NotBlank(message = "Enter phone no.") String phone) {
        this.phone = phone;
    }

    public @NotBlank(message = "Enter correct address") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Enter correct address") String address) {
        this.address = address;
    }

    public @NotBlank(message = "Enter Librarian City") String getCity() {
        return city;
    }

    public void setCity(@NotBlank(message = "Enter Librarian City") String city) {
        this.city = city;
    }

    public @NotBlank(message = "Enter Librarian District") String getDistrict() {
        return District;
    }

    public void setDistrict(@NotBlank(message = "Enter Librarian District") String district) {
        District = district;
    }

    public @NotBlank(message = "Enter Librarian State") String getState() {
        return state;
    }

    public void setState(@NotBlank(message = "Enter Librarian State") String state) {
        this.state = state;
    }

    public @NotBlank(message = "Enter Librarian area Zip") String getZip() {
        return zip;
    }

    public void setZip(@NotBlank(message = "Enter Librarian area Zip") String zip) {
        this.zip = zip;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(String collegeCode) {
        this.collegeCode = collegeCode;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getLibrarianStatus() {
        return librarianStatus;
    }

    public void setLibrarianStatus(String librarianStatus) {
        this.librarianStatus = librarianStatus;
    }

    public Librarian() {
    }

    public Librarian(String librarianId, String role, String name, String email, String staffId, String password, String phone, String address, String city, String district, String state, String zip, String profilePhoto, String collegeCode, College college, String librarianStatus) {
        this.librarianId = librarianId;
        this.role = role;
        this.name = name;
        this.email = email;
        this.staffId = staffId;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.city = city;
        District = district;
        this.state = state;
        this.zip = zip;
        this.profilePhoto = profilePhoto;
        this.collegeCode = collegeCode;
        this.college = college;
        this.librarianStatus = librarianStatus;
    }

    private String role= "LIBRARIAN";
    @NotBlank(message = "Enter Librarian Name!")
    private String name;

    @NotBlank(message = "Enter Librarian Email!")
    @Column(unique = true)
    private String email;
    @NotBlank(message = "Enter Staff Id!")
    private String staffId;
    @NotBlank(message = "Enter a string password !")
    private String password;
    @NotBlank(message = "Enter phone no.")
    private String phone;
    @NotBlank(message = "Enter correct address")
    private String address;
    @NotBlank(message = "Enter Librarian City")
    private String city;
    @NotBlank(message = "Enter Librarian District")
    private String District;
    @NotBlank(message = "Enter Librarian State")
    private String state;
    @NotBlank(message = "Enter Librarian area Zip")
    private String zip;
    private String profilePhoto;
    private String collegeCode;
    @ManyToOne
    private College college;
    private String librarianStatus;

}
