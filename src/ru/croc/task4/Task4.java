package ru.croc.task4;

public class Task4 {

    private static String ParseCode(String pCode)
    {
        String MyCommentsRegex = "(?://.*)|(/\\*(?:.|[\\n\\r])*?\\*/)";
        return pCode.replaceAll(MyCommentsRegex, " ");

    }

    public static void main(String[] args) {

        String text1 = "/*\n" +
                " * My first ever program in Java!\n" +
                " */\n" +
                "class Hello { // class body starts here \n" +
                "  \n" +
                "  /* main method */\n" +
                "  public static void main(String[] args/* we put command line arguments here*/) {\n" +
                "    // this line prints my first greeting to the screen\n" +
                "    System.out.println(\"Hi!\"); // :)\n" +
                "  }\n" +
                "} // the end\n" +
                "// to be continued...\n";


        String text = ParseCode(text1);
        System.out.println(text);
    }

}



