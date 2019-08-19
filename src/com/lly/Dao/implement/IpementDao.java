package com.lly.Dao.implement;

import com.lly.Dao.IContacts;
import com.lly.entity.ContactsUser;
import com.lly.utils.DBClose;
import com.lly.utils.DBUtils;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

public class IpementDao implements IContacts {
    @Override
    public Integer addUser(ContactsUser con) {
        return null;
    }

    @Override
    public Integer checkUsername(String username, String password) {
         Connection conn =null;
        PreparedStatement ps = null;
        int count = 0;
        ResultSet ret = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select count(*) from c_user where username= ? and password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            ret = ps.executeQuery();
            if(ret.next()){
                count = ret.getInt(1);
                return count;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBClose.closeAll(ret,ps,conn);
        }
        return count;
    }

    @Override
    @Test
    public ArrayList getLinkman() {
        Connection conn = null;
        Statement st = null;
        ResultSet ret = null;
        ArrayList<ContactsUser> list = new ArrayList();
        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            ret = st.executeQuery("select username,phone,adress from c_user where isdelete=1");
            while (ret.next()){
                String name = ret.getString(1);
                int phone = ret.getInt(2);
                String adress = ret.getString(3);
                ContactsUser user = new ContactsUser(name,phone,adress);
                list.add(user);
                for(ContactsUser users:list){
                    System.out.println(user.toString());

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBClose.closeAll(ret,st,conn);
        }
       return list;
    }


}
