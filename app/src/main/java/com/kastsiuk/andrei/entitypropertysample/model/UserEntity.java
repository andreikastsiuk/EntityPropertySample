package com.kastsiuk.andrei.entitypropertysample.model;

import android.util.Pair;

import com.kastsiuk.andrei.entitypropertysample.common.EntityColumn;

import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;

public class UserEntity extends BaseEntity {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isAdmin;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @NonNull
    @Override
    public List<Pair<String, Object>> getProperties() {
        return Arrays.asList(
                new Pair<String, Object>(EntityColumn.UserColumn.ID, getId()),
                new Pair<String, Object>(EntityColumn.UserColumn.FIRST_NAME, getFirstName()),
                new Pair<String, Object>(EntityColumn.UserColumn.LAST_NAME, getLastName()),
                new Pair<String, Object>(EntityColumn.UserColumn.AGE, getAge()),
                new Pair<String, Object>(EntityColumn.UserColumn.IS_ADMIN, isAdmin())
        );
    }
}
