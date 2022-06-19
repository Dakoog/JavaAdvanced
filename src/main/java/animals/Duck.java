package animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duck extends Bird {

    private Map<String,Duckling> ducklings = new HashMap<>();

    public Duck(String name) {
        super(name);
        //this.ducklings = new Duckling("Dewey");
    }
    public Duckling addNephew(String name){
       return ducklings.put(name,new Duckling(name));
    }
    public Duckling getNephew(String name){
        return ducklings.get(name);
    }



    @Override
    void cantRun() {
        System.out.println("I am duck. My name is "+ name +". I can't run. I am swim on rivers or lakes.");
    }

    @Override
    public void saySomething() {
        System.out.println(name + ": kwa kwa");

    }

    public class Duckling extends Bird{


        public Duckling(String name) {
            super(name);
        }

        public void say() {
            System.out.println(name + ": "+ Duck.this.name+  "is my uncle.");   // inner class can use all methods with Duck class
        }

        @Override
        public void saySomething() {

        }

        @Override
        void cantRun() {

        }
    }
}


