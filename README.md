# ring-helloworld

This is a minimal Hello World Clojure based on leningen and Ring

## Local setup

Install [Leiningen](https://github.com/technomancy/leiningen#readme) and run:

    lein deps
    lein run

## Deploying to Stackato

    lein deps  # this is not automatically run on the server yet.
    stackato push -n

