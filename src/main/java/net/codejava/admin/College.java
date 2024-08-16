package net.codejava.admin;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import net.codejava.customer.Librarian;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity

public class College {
    @Id
    private String collegeId= UUID.randomUUID().toString();
    @NotBlank(message = "Enter College Name")
    private String name;
    @NotBlank(message = "Enter College Email")
    private String email;
    private String role = "COLLEGE";
    @NotBlank(message = "Enter College Code")
    @Column(unique = true)
    private String collegeCode;
    @NotBlank(message = "Enter Strong Password")
    private String password;
//    @NotBlank(message = "Select College Logo")
    private String logo;
//    @NotBlank(message = "Select College Cover Photo")
    private String coverPhoto;
    private String description;
    @NotBlank(message = "Enter College Address")
    private String address;
    @NotBlank(message = "Enter College City")
    private String city;
    @NotBlank(message = "Enter College District")
    private String District;
    @NotBlank(message = "Enter College State")
    private String state;
    @NotBlank(message = "Enter College area Zip")
    private String zip;
    @NotBlank(message = "Enter College Phone no.")
    private String phone;
    private String website;
    private String contactName;
    private String contactTitle;
    private String contactPhone;
    private String contactEmail;
    private String collegeStatus;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,  mappedBy = "college")
    private List<Librarian> librarian=new ArrayList<>();

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public @NotBlank(message = "Enter College Name") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Enter College Name") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Enter College Email") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Enter College Email") String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public @NotBlank(message = "Enter College Code") String getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(@NotBlank(message = "Enter College Code") String collegeCode) {
        this.collegeCode = collegeCode;
    }

    public @NotBlank(message = "Enter Strong Password") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Enter Strong Password") String password) {
        this.password = password;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @NotBlank(message = "Enter College Address") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Enter College Address") String address) {
        this.address = address;
    }

    public @NotBlank(message = "Enter College City") String getCity() {
        return city;
    }

    public void setCity(@NotBlank(message = "Enter College City") String city) {
        this.city = city;
    }

    public @NotBlank(message = "Enter College District") String getDistrict() {
        return District;
    }

    public void setDistrict(@NotBlank(message = "Enter College District") String district) {
        District = district;
    }

    public @NotBlank(message = "Enter College State") String getState() {
        return state;
    }

    public void setState(@NotBlank(message = "Enter College State") String state) {
        this.state = state;
    }

    public @NotBlank(message = "Enter College area Zip") String getZip() {
        return zip;
    }

    public void setZip(@NotBlank(message = "Enter College area Zip") String zip) {
        this.zip = zip;
    }

    public @NotBlank(message = "Enter College Phone no.") String getPhone() {
        return phone;
    }

    public void setPhone(@NotBlank(message = "Enter College Phone no.") String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(String collegeStatus) {
        this.collegeStatus = collegeStatus;
    }

    public List<Librarian> getLibrarian() {
        return librarian;
    }

    public void setLibrarian(List<Librarian> librarian) {
        this.librarian = librarian;
    }

    public College() {
    }

    public College(String collegeId, String name, String email, String role, String collegeCode, String password, String logo, String coverPhoto, String description, String address, String city, String district, String state, String zip, String phone, String website, String contactName, String contactTitle, String contactPhone, String contactEmail, String collegeStatus, List<Librarian> librarian) {
        this.collegeId = collegeId;
        this.name = name;
        this.email = email;
        this.role = role;
        this.collegeCode = collegeCode;
        this.password = password;
        this.logo = logo;
        this.coverPhoto = coverPhoto;
        this.description = description;
        this.address = address;
        this.city = city;
        District = district;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.website = website;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.collegeStatus = collegeStatus;
        this.librarian = librarian;
    }
//    @OneToMany(mappedBy = "college")
//    private List<Books> books;
}
