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
import model.Item;

import java.sql.SQLException;

public class itemAddController {
    public AnchorPane root;
    public TextField txtItemcode;
    public TextField txtName;
    public TextField txtDescription;
    public TextField txtPrice;
    public Button btnItemAdd;

    public void btnItemAddOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Item i1=new Item(
                txtItemcode.getText(),txtName.getText(),txtDescription.getText(),txtPrice.getText());

        if(AddItem(i1)){
            new Alert(Alert.AlertType.CONFIRMATION,"Add Item").show();
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again").show();
        }
    }
    boolean AddItem(Item i) throws SQLException, ClassNotFoundException {
        return new ItemController().AddItem(i);

    }
    }

