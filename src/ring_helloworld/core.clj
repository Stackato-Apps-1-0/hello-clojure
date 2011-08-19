(ns ring-helloworld.core
  (:use ring.util.response
        ring.adapter.jetty))

(defn app [req]
  (response "Hello World, from Stackato!"))

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "VCAP_APP_PORT" "8080"))]
    (run-jetty app {:port port})))

