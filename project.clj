(defproject kafka "0.5.0"
  :description "Applet delivering sayings of Karl Kraus"
  :url "http://lisp.chack-tec.com"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 ]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  ;; These namespaces will be AOT-compiled. Needed for gen-class and
  ;; other Java interop functionality. :namespaces is an alias for this.
  :aot [kafka.applet]
  ;; Leave the contents of :source-path out of jars (for AOT projects)
  ;;:omit-source true
  ;; Emit warnings on all reflection calls.
  :warn-on-reflection true
  :jar-name "kafka.jar" ;; applets mag den default jar Namen nicht
  :uberjar-name "kafka-full.jar"
  )
