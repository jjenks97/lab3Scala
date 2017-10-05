//1.

def circleArea( radius: Double): Double = {
  math.Pi * radius * radius
}

circleArea(4)

//2.
def hypotenuse( a: Double, b: Double): Double = {
  math.sqrt((a * a) + (b * b))
}

hypotenuse(3, 4)

//3.
def reverseDigits(x: Int): Int = {
  var z = x
  var y = 0
  while (z != 0) {
    y = (y * 10) + (z % 10)
    z = z / 10
  }
  return y
}
reverseDigits(123)
reverseDigits(-123)


//4.
def conditionalRemove(x: Char, y: List[Char]): List[Char] = {
  val lastIndex = y.length - 1
  if (x == y(lastIndex)){
    return y.patch(lastIndex, Nil, 1)
  }
  return y
}
conditionalRemove('a', List('b', 'c', 'a'))
conditionalRemove('a', List('b', 'c', 'e'))
conditionalRemove('a', List('a', 'b', 'c', 'a'))
//6.

def isPalindrome( s: String ) = {
  val sanitized = s.toLowerCase.replace(" ", "").replaceAll("""[\p{Punct}]""", "")

  sanitized.reverse == sanitized
}

isPalindrome("mom")
isPalindrome("Wow")
isPalindrome("W ow")
isPalindrome("???#@%%$ Wow")
isPalindrome("Moo")

//7.

def isPerfectNumber(x: Int): (Boolean, List[Int]) = {
  var y = x - 1
  var z = 0
  var numberList = List[Int]()
  while(y > 0) {
    if(x % (y) == 0) {
      z = z + y
      numberList = y :: numberList
    }
    y = y - 1
  }
  if(z == x) {
    return (true, numberList)
  }
  else {
    return (false, List[Int](1))
  }
}

isPerfectNumber(6)
isPerfectNumber(10)

//8.

