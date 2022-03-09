import java.io.File

fun main(){
    val input = File("input.txt").readLines()
    //part1(input)
    part2(input)
}

fun part1(input: List<String>){
    var x = 0
    var y = 0
    var direction = ""
    var movement = 0

    input.forEach { data ->
        direction = data.substringBefore(" ")
        movement = data.substringAfter(" ").toInt()

        println("Direction: $direction,  Speed: $movement")
        println("Before x: $x aim: y: $y")

        when(direction){
             "forward" -> x = x + movement
             "down" -> y = y + movement
             "up" -> y = y - movement
         }

        println("After x: $x aim: y: $y")
        println("------------------")
    }

    println("Puzzle result: ${x*y}")
}

fun part2(input: List<String>){

    var direction = ""
    var movement = 0
    var aim = 0
    var depth = 0
    var horizontal = 0

    input.forEach { data ->
        direction = data.substringBefore(" ")
        movement = data.substringAfter(" ").toInt()

        println("Direction: $direction,  Speed: $movement")
        println("Before horizontal: $horizontal aim: $aim depth: $depth")
        when(direction){
            "forward" -> {
                horizontal = horizontal + movement
                depth = depth + (movement * aim)
            }
            "down" -> aim = aim + movement
            "up" -> aim = aim - movement
        }
        println("After horizontal: $horizontal aim: $aim depth: $depth")
        println("------------------")
    }
    println("Puzzle result: ${horizontal*depth}")
}