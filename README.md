# at-paninij-setup-examples

This repo contains examples illustrating and tutorials explaining how to set
up some different environments for developing `@PaniniJ` projects. Each example
includes the same "Hello World" `@PaniniJ` program, but they differ by the means
and tools by which the build is configured and performed.

- `maven/`
- `eclipse/`
- `netbeans/`
- `intellij/`
- `shell/`

Of these, the `maven/` example is the most flexible. Like Maven-based Java
projects, a Maven-based `@PaniniJ` project development is more portable than a
project based on a particular IDE's build system. This means that, one can
develop a single Maven `@PaniniJ` project using any or all of these three IDEs.
In fact, the `maven/` example explains how a Maven-based `@PaniniJ` project can
be imported into each of these IDEs for development.

For more resources explaining capsule-oriented programming, the Panini
programming model, and the syntax of `@PaniniJ`, see the [`@PaniniJ` Getting Started Manual](http://hridesh.github.io/panini).
