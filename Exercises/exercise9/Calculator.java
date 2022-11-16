package com.example.exercise9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Calculator extends Application {

    private TextField textField = new TextField();
    private long num1 = 0;
    private String op = "";
    private boolean start = true;

    @Override
    public void start(Stage primaryStage) throws Exception {

        textField.setFont(Font.font(20));
        textField.setPrefHeight(50);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setEditable(false); //to prevent user from typing into the result box

        StackPane stackpane = new StackPane();
        stackpane.setPadding(new Insets(5));
        stackpane.getChildren().add(textField);

        TilePane tile = new TilePane();
        tile.setHgap(12);
        tile.setVgap(12);
        tile.setAlignment(Pos.TOP_CENTER);
        tile.getChildren().addAll(
                //to add elements in the first row
                buttons_num("1"),
                buttons_num("2"),
                buttons_num("3"),
                buttons_op("+"),
                //to add elements in the second row
                buttons_num("4"),
                buttons_num("5"),
                buttons_num("6"),
                buttons_op("-"),
                //to add elements in the third row
                buttons_num("7"),
                buttons_num("8"),
                buttons_num("9"),
                buttons_op("*"),
                //to add elements in the last row
                buttons_num("0"),
                buttons_clr("C"),
                buttons_op("="),
                buttons_op("/")
        );


        BorderPane root = new BorderPane();
        root.setTop(stackpane);

        root.setCenter(tile);

        Scene scene = new Scene(root, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    //create buttons for numbers
    private Button buttons_num (String ch) {
        Button button = new Button(ch);
        button.setFont(Font.font(20));
        button.setPrefSize(50,50);
        //when the number is clicked, below method will be called
        button.setOnAction(this::processNums);

        return button;
    }
    //create buttons for operators
    private Button buttons_op (String ch) {
        Button button = new Button(ch);
        button.setFont(Font.font(20));
        button.setPrefSize(50,50);
        //when the operator is clicked, below method will be called
        button.setOnAction(this::processOps);

        return button;
    }
    //create button for clear
    private Button buttons_clr (String ch) {
        Button button = new Button(ch);
        button.setFont(Font.font(20));
        button.setPrefSize(50,50);
        //when clear button is pressed, below method will clear the result
        button.setOnAction(e->{
            textField.setText("");
            op="";
            start=true;
        });
        return button;
    }
    //Event handling - to handle events in numbers and operators
    private void processNums(ActionEvent e) {
        if(start){
            textField.setText("");
            start=false;
        }
        //to get the value of the number when clicked on it
        String value = ((Button)e.getSource()).getText();
        //placing the value in the textfield - result
        textField.setText(textField.getText()+value);
    }
    private void processOps(ActionEvent e) {
        //to get the value of the number when clicked on it
        String value = ((Button)e.getSource()).getText();

        if (!value.equals("=")){
            if (!op.isEmpty())
                return;
            num1 = Long.parseLong(textField.getText());
            op=value;
            textField.setText("");
        }
        else{
           if (op.isEmpty())
               return;
           long num2=Long.parseLong(textField.getText());
           float result = Calculate(num1,num2,op);
           textField.setText(String.valueOf(result));
           start=true;
           op="";
        }
    }
    private float Calculate(long num1,long num2, String op){
        //use switch case to select different types of operators
        switch(op){
            case "+": return num1+num2;
            case "-": return num1-num2;
            case "*": return num1*num2;
            case "/": if (num2==0) //check for divide by 0
                return 0;
            return num1/num2;
            default: return 0;

        }
    }

    public static void main(String[] args){
        launch(args);
    }
}