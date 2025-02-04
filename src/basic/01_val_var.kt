package basic

 fun main() {
//   Constantes,
     //   semelhantes as const do JavaScript,
     //   Não podem ter seus valores alterados
     val name = "Lucas de Lima"
     println("Name: $name")

//     Variáveis,
     //  semelhante aos lets do JavaScript
     //  Podem receber novos valores, desde que respeite a tipagem inferida
     //  Ou seja, se começou sendo um inteiro, tem que seguir recebendo valores inteiros e por aí vai
     var age = 25
     println("age: $age")

     age = 59
     println("age: $age")



}
