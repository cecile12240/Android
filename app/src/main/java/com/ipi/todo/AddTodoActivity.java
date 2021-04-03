package com.ipi.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

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

        button_add = findViewById(R.id.button_add);
        button_cancel = findViewById(R.id.button_cancel);



        // creation du spinner :
        spinner = findViewById(R.id.spinner);

        // Initializing a String Array
        ArrayList<String> urgency;
        urgency = new ArrayList<>();
        urgency.add("high");
        urgency.add("normal");
        urgency.add("low");

        // la liste a besoin d'un adaptateur pour les transformer en element de mon spinner:

        // injection dans le spinner
    }


    /*@Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // sauvegarder les valeurs dans le bundle, mais je suis pas sure d'avoir compris
        super.onSaveInstanceState(savedInstanceState);
    }*/

}