fun first()
{
    val my_name: String = "Полина"
    val my_surname: String = "Кызылова"
    val my_pofession: String = "студент"

    println("Мое имя: $my_name")
    println("Моя фамилия: $my_surname")
    println("Мой род деятельнсоти: $my_pofession")
}

fun second()
{
    val a: Int = 5
    val b: Double= 5.5
    val c: Float = 55.5F
    val d: String = "red"
    val e: Char = 'e'
    val f: Boolean = false
    val g: Long = 10
    val h: Short = 10
    val i: Byte = 10

    print("$a  type = ")
    println(a.javaClass)

    print("$b  type = ")
    println(b.javaClass)

    print("$c  type = ")
    println(c.javaClass)

    print("$d  type = ")
    println(d.javaClass)

    print("$e  type = ")
    println(e.javaClass)

    print("$f  type = ")
    println(f.javaClass)

    print("$g  type = ")
    println(g.javaClass)

    print("$h  type = ")
    println(h.javaClass)

    print("$i  type = ")
    println(i.javaClass)
}

fun third(user_str: String)
{
    print("Длина строки: ")
    println(user_str.length)

    print("Строка пустая: ")
    println(user_str.isEmpty())

    print("Первый символ строки: ")
    println(user_str[0])

    print("Строка начинается с символа 'd': ")
    println(user_str.startsWith('d'))

    print("Строка заканчивается символом 'f': ")
    println(user_str.endsWith('f'))

    print("Строка содержит символ 's': ")
    println(user_str.contains('s'))

    print("Добавлене к строке строки '. The end': ")
    val additive_str: String = ". The end"
    val sb = StringBuilder()
    sb.append(user_str).append(additive_str)
    val result_str = sb.toString()
    println("$result_str")

    print("Замена в стркое всех 's' на 'h': ")
    println(user_str.replace('s', 'h'))
}

fun main()
{
    println("-----Задание №1-----")
    first()

    println("\n-----Задание №2-----")
    second()

    println("\n-----Задание №3-----")
    print("Введите строку: ")
    var stroka: String = readLine()!!
    third(stroka)
}