fun main() {
    val man = "человеку"
    val people = "людям"
    var suffix: String
    var mod: Int

    var likes: Int = 1
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 2
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 11
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 12
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 21
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 101
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 111
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 121
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 1201
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 1211
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")

    likes = 1221
    mod = likes % 100
    suffix = if (likes == 1 || (mod % 10 == 1 && mod != 11)) man else people
    println("Понравилось $likes $suffix")
}