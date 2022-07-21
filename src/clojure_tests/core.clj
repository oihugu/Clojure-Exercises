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


;; beecrowd | 1015 | Distância Entre Dois Pontos
(require '[clojure.string :as str])
(def p1 (str/split (read-line) #" "))
(def p2 (str/split (read-line) #" "))
(def distancia (Math/sqrt 
                (+ 
                 (Math/pow (- 
                     (Float. (get p2 0)) 
                     (Float. (get p1 0)))
                     2)
                   
                 (Math/pow (-
                     (Float. (get p2 1))
                     (Float. (get p1 1)))
                     2)
                 )))
(println (format "%.4f" distancia))
