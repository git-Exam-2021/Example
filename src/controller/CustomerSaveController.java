/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Customer;

import java.sql.SQLException;

public class CustomerSaveController {
    public AnchorPane root;
    public TextField txtCid;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;
    public Button btnAdd;

    public void btnAddOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Customer c1=new Customer(txtCid.getText(),txtName.getText(),txtAddress.getText(),txtSalary.getText());
        if(saveCustomer(c1)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..").show();
        }else
            new Alert(Alert.AlertType.WARNING,"Try again..").show();

    }
    boolean saveCustomer(Customer c) throws SQLException, ClassNotFoundException {
        return new CustomerController().saveCustomer(c);
    }
    }

