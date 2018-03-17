package com.example.javatokotlin.java;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Java Entity
 * Created by pdc-k-kamiya on 2018/03/17.
 */
public class Entity {
    private int id;
    private String title;
    private String description;
    private Entity(Builder builder){
        id = builder.id;
        title = builder.title;
        description = builder.description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(@NonNull String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(@NonNull String description) {
        this.description = description;
    }
    public static class Builder{
        private int id;
        private String title;
        private String description;
        public Builder() {
            id = 0;
            title = "";
            description = "";
        }
        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Entity build(){
            return new Entity(this);
        }
    }
}

class EntityControl{
    public EntityControl(){
        Entity entity = new Entity.Builder().id(0).description("description").build();
        entity.setDescription(null);
        Log.d("DESCRIPTION", entity.getDescription());
    }
}
