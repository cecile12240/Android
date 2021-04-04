package com.ipi.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.ipi.todo.POJO.Todo;

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

        // Initialisation d'une liste en string : (un tableau qui stock une liste)
        ArrayList<String> urgency;
        urgency = new ArrayList<>();
        urgency.add("high");
        urgency.add("normal");
        urgency.add("low");

        // la liste a besoin d'un adaptateur pour les transformer en element de mon spinner:
        final ArrayAdapter<String> spinnerArrayAdapter;
        spinnerArrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, urgency);

        // injection dans le spinner (je lui dis : prend mon spinner.donne lui un adaptateur(celui que j'ai créé qui s'appelle spinnerArrayAdaptater))
        spinner.setAdapter(spinnerArrayAdapter);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // récuperer la string du text_todo
                String strText_todo;
                strText_todo = text_todo.getText().toString();

                // récupérer le text du spinner
                String strSpinner;
                strSpinner = spinner.getSelectedItem().toString();

                // je vérifie si tout ce passe comme prévue : Log.d("debugs", strText_todo + " " + strSpinner);

                // créér un objet Todo_
                Todo todoVersAffichage = new Todo(3, strText_todo, strSpinner);

                // Log.d("debugs", todoVersAffichage.toString());



                // envoyer les données à la vue principale:

                    // Creer un objet Bundle : Role stocker le todo_, avec un id unique
                    // Placer ton todos dans ce bundle

                    // Crer un intent  : placer ce bundle a l'interieur ,
                    // Envoyé l'intent a ta vue principal via method setResult
                    // et finish ta vue todoActivity. finish()
            }
        });

        // creer evenement pour le bouton annulé :
        // Clique sur bouton annulé effacé le texte de text_todo.

    }

}