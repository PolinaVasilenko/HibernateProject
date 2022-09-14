package com.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_data", schema = "todolist", catalog = "postgres")
public class UserData {
    private String email;
    private String userpassword;
    private String username;
    private Long id;

    @Basic
    @Column(name = "email", nullable = false, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "userpassword", nullable = false, length = -1)
    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Basic
    @Column(name = "username", nullable = false, length = -1)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(email, userData.email) &&
                Objects.equals(userpassword, userData.userpassword) &&
                Objects.equals(username, userData.username) &&
                Objects.equals(id, userData.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, userpassword, username, id);
    }
}
