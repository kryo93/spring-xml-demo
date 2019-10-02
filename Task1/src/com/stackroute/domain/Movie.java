package com.stackroute.domain;


public class Movie
{

    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void showDetails()
    {
        System.out.println("Actor name is " + actor.getName() + " Actor age is " + actor.getAge() + " Actor gender is " + actor.getGender());
    }

}
