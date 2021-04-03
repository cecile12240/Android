package com.ipi.todo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.ipi.todo.POJO.Todo;

public class MainActivity extends AppCompatActivity {

    // 1 déclarer l'élément de la vue que je veux récupérer

    // 2 récupération de lélément qu'on vient de déclarer

    // 3 modification de l'élément


    TextView tv_Todos; // 1
    String allTodos = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("debugs", "je suis dans la méthode onCreate");
        Todo todo1 = new Todo(1, "mon premier todo", "low");
        Todo todo2 = new Todo(2, "juste pour le fun", "urgent");

        allTodos = allTodos + todo1.toString();
        allTodos = allTodos + todo2.toString();
        // ou allTodos +=

        tv_Todos = findViewById(R.id.tv_Todos); // 2
        tv_Todos.setText(allTodos); //3


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("debugs", "je suis dans la méthode onSave");
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debugs", "je suis dans la méthode onDestroy");
    }

}