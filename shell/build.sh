#!/bin/sh -

# Note that the `-processor` and `-processorpath` arguments are not necessary, since the @PaniniJ
# processor is automatically discovered within the JAR. 
javac -cp lib/at-paninij-proc-0.1.0.jar -d classes -s generated_src \
      src/helloworld/ConsoleTemplate.java \
      src/helloworld/GreeterTemplate.java \
      src/helloworld/HelloWorldTemplate.java \
      src/helloworld/StreamTemplate.java
