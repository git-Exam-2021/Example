/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package controller;

import db.DbConnection;
import model.Item;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemController {
    public boolean AddItem(Item i) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DbConnection.getInstance().getConnection().prepareStatement("INSERT INTO item VALUES(?,?,?,?)");
        stm.setObject(1,i.getItemcode());
        stm.setObject(2,i.getItemname());
        stm.setObject(3,i.getDescription());
        stm.setObject(4,i.getUnitprice());


        return stm.executeUpdate()>0;

    }
}
