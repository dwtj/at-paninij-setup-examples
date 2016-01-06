package helloworld;

import org.paninij.lang.Capsule;
import org.paninij.lang.Imports;

@Capsule class GreeterTemplate {

    String greeting;
    @Imports Stream s;

    void init() {
        greeting = "Hello World!";
    }

    public void greet() {
        s.write("Panini: " + greeting);
        long time = System.currentTimeMillis();
        s.write("Time is now: " + time);
    }
}
