/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author FPT SHOP
 */
public class Account {
private int account_id;
private String username;
private String password;
private String phone;
private boolean is_verify;
private int role_id;
private String email;
private boolean gender;
private String full_name;
private String avatar;
private Date createAt;

    public Account() {
    }

    public Account(int account_id, String username, String password, String phone, boolean is_verify, int role_id, String email, boolean gender, String full_name, String avatar) {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.is_verify = is_verify;
        this.role_id = role_id;
        this.email = email;
        this.gender = gender;
        this.full_name = full_name;
        this.avatar = avatar;
    }

    public Account(int account_id, String username, String password, String phone, boolean is_verify, int role_id, String email, boolean gender, String full_name, String avatar, Date createAt) {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.is_verify = is_verify;
        this.role_id = role_id;
        this.email = email;
        this.gender = gender;
        this.full_name = full_name;
        this.avatar = avatar;
        this.createAt = createAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isIs_verify() {
        return is_verify;
    }

    public void setIs_verify(boolean is_verify) {
        this.is_verify = is_verify;
    }
    public boolean getIs_verify() {
        return is_verify;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Account{" + "account_id=" + account_id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", is_verify=" + is_verify + ", role_id=" + role_id + ", email=" + email + ", gender=" + gender + ", full_name=" + full_name + ", avatar=" + avatar + '}';
    }
    
    

    
}
