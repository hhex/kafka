(ns kafka.applet
  (:use kafka.panel)
  (:import (javax.swing JApplet UIManager))
  (:gen-class
     :extends javax.swing.JApplet))

;;;;; http://download.oracle.com/javase/tutorial/deployment/applet/getStarted.html

(defn -init [#^JApplet applet]
  (. UIManager (setLookAndFeel (. UIManager getSystemLookAndFeelClassName)))
  (.add applet (new kafka.panel))
  )



