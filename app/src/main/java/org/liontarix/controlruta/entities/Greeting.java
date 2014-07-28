package org.liontarix.controlruta.entities;

import java.io.Serializable;

/**
 * Created by roberto on 7/28/14.
 */
public class Greeting implements Serializable{

    public Greeting() {

    }

    private String id;
    private String content;

    public String getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

}