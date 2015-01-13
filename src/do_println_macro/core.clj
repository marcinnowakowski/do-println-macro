(ns do-println-macro.core
  (:gen-class))


(defmacro dup
  "this macro wrapps with 'do' expression 
   and performs println on expression on a way"
  [expression]
  (list 'do 
    (list 'println expression)
    expression
  )
)


(defn -main
  "I do simple testing... rest in test section."
  [& args]
  (println "Hello, World!")
  (do
    (def lol 
      (dup
      (+ 10 1)
      )
    )
  (println (+ 4 lol))
  )
  (dup 3)
)
