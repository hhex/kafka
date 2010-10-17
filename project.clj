(defproject kafka "0.5.0"
  :description "Applet delivering sayings of Karl Kraus"
  :url "http://lisp.chack-tec.com"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 ]
  :dev-dependencies [[swank-clojure "1.2.1"]
                     ]
  :aot [kafka.applet]

  :warn-on-reflection true
  :jar-name "kafka.jar"
  :uberjar-name "kafka-full.jar"
  )
