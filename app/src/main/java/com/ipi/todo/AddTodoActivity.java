package com.ipi.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddTodoActivity extends AppCompatActivity {

    // 1 ici je déclare mes éléments, ils correspondent à ceux présents dans la vue.
    EditText text_todo;
    Spinner spinner;
    Button button_add;
    Button button_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);

        // 2 mais j'ai des doutes qu'ils soient tous à mettre ici...
        text_todo = findViewById(R.id.text_todo);
        text_todo.setText("URGENCY");
        spinner = findViewById(R.id.spinner);
        button_add = findViewById(R.id.button_add);
        button_add.setText("10");
        button_cancel = findViewById(R.id.button_cancel);
        button_cancel.setText("je suis un bouton!");

    }

    /*@Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // sauvegarder les valeurs dans le bundle, mais je suis pas sure d'avoir compris
        super.onSaveInstanceState(savedInstanceState);
    }*/

}