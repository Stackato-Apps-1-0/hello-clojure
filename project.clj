(defproject ring-helloworld "1.0.0-SNAPSHOT"
  :description "Hello World ring app running on Stackato"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [ring/ring-core "0.3.11"]
                 [ring/ring-jetty-adapter "0.3.11"]]
  :main ring-helloworld.core)