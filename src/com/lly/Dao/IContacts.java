package com.lly.Dao;

import com.lly.entity.ContactsUser;

import java.util.ArrayList;

public interface IContacts {
    Integer addUser(ContactsUser con);
    Integer checkUsername(String username,String password);
    ArrayList getLinkman();
}
