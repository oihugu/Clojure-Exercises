(ns clojure-tests.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; beecrowd | 1007 | Diferença
(def a (Integer. (read-line)))
(def b (Integer. (read-line)))
(def c (Integer. (read-line)))
(def d (Integer. (read-line)))
(def soma (- (* a b) (* c d)))
(println "DIFERENCA =" soma)

;; beecrowd | 1008 | Salário
(def worker_id (Integer. (read-line)))
(def working_hours (Integer. (read-line)))
(def salary (Float. (read-line)))
(println "NUMBER =" worker_id)
(println (format "SALARY = U$ %.2f" (* working_hours salary)))

;; beecrowd | 1010 | Cálculo Simples
(require '[clojure.string :as str])
(def primeiro_produto (read-line))
(def segundo_produto (read-line))
(def ls_primeiro_produto (str/split primeiro_produto #" "))
(def ls_segundo_produto (str/split segundo_produto #" "))
(println (format "VALOR A PAGAR: R$ %.2f" (+ (* (Integer. (get ls_primeiro_produto 1))
                                                (Float. (get ls_primeiro_produto 2)))
                                             (* (Integer. (get ls_segundo_produto 1))
                                                (Float. (get ls_segundo_produto 2))))))

;; 