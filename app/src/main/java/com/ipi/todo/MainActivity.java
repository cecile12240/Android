package com.ipi.todo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ipi.todo.POJO.Todo;

public class MainActivity extends AppCompatActivity {

    // 1 déclarer l'élément de la vue que je veux récupérer

    // 2 récupération de lélément qu'on vient de déclarer

    // 3 modification de l'élément


    TextView tv_Todos; // 1
    String allTodos = "";
    final int KEY_RESULT_CODE = 2;


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

        if(savedInstanceState != null){
            // on va récupérer la sauvegarde
            allTodos = savedInstanceState.getString("mesTodos");
        }

        tv_Todos.setText(allTodos); //3
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("debugs", "je suis dans la méthode onSave");
        outState.putString("mesTodos",allTodos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(getApplicationContext(),AddTodoActivity.class);
        startActivityForResult(intent,KEY_RESULT_CODE);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debugs", "je suis dans la méthode onDestroy");
    }


    // attend des données de la todoActivity :

    // voir la méthode onActivityResult
    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        Bundle passeur  = intent.getBundleExtra("todo");
        Todo todoVersAffichage ;
        todoVersAffichage = (Todo) passeur.getSerializable("monBundle");
        allTodos = allTodos + todoVersAffichage.toString();
        tv_Todos.setText(allTodos);

    }
    // récupérer le bundle grace à son identifiant unique

    // deserialiser ton todo_
    // Ajouter ton todo_ dans ta liste todo_.

}