package com.ipi.todo.POJO;

import java.io.Serializable;

public class Todo implements Serializable {
    private int id; // 6
    private String text; // jenga
    private String urgency; // low

    public Todo(int id, String text, String urgency) {
        this.id = id;
        this.text = text;
        this.urgency = urgency;
    }

    public int getId() {
        // saisie moi un mot de passe
        // si saisie ok je te donne l'id
        // si saisie nok alors je ne te donne rien
        return id;
    }
    public String getText() {
        return text;
    }
    public String getUrgency() { return urgency; }

    public void setId(int id) {
        // saisie moi un mot de passe
        // si saisie ok je change l'id
        // si saisie nok alors je ne change rien
        this.id = id;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setUrgency(String urgency) { this.urgency = urgency; }


    /* mon objet todo_ doit être formatté comme ça :
        mon texte todo_ // l'urgence \n
    */

    @Override
    public String toString() {
        return "\uD83D\uDD15" + this.text + " // " + this.urgency +'\n';
    }
}

// Todo_ todo1 = new Todo_(1,"jenga","low")

// todo1.getId() => 6
// todo1.getText() => jenga
// todo1.getUrgency() => low

// la méthode ToString() est une représentation de l'objet en une phrase ( ou chaine de caractère)
//todo1.toString() =>  jenga6low