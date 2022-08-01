object Question03{

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny", toUpper));
        println(formatNames("Niroshan", firstTwoUpper));
        println(formatNames("Saman", toLower));
        println(formatNames("Kumara", firstAndlastUpper));

    }

    /* high order function for format names */
    def formatNames(name : String, function: String => String): String = function(name);
    /* created four functions to change case */
    def toUpper(s: String): String = s.toUpperCase();
    def toLower(s: String): String = s.toLowerCase();
    def firstTwoUpper(s: String): String = toUpper(s.substring(0, 2)) + toLower(s.substring(2,s.length()));
    def firstAndlastUpper(s: String): String = s"${s(0).toUpper}${toLower(s.substring(1,s.length() - 1))}${s(s.length() - 1).toUpper}";

}