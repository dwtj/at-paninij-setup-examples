package helloworld;

import org.paninij.lang.Capsule;
import org.paninij.lang.CapsuleSystem;
import org.paninij.lang.Local;
import org.paninij.lang.Root;

@Root
@Capsule
class HelloWorldTemplate {

    @Local Console c;
    @Local Greeter g;

    void design(HelloWorld self) {
        g.imports(c);
    }

    void run() {
        g.greet();
    }
    
    public static void main(String[] args) {
        CapsuleSystem.start(HelloWorld.class, args);
    }
}
