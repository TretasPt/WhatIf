        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.nio.charset.StandardCharsets;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.nio.file.StandardOpenOption;
        
        // import java.io.IOException;
        // import java.nio.file.*;
        // import java.nio.charset.StandardCharsets;
        // // import org.apache.commons.codec.binary.Base64;  
        // import java.util.Base64;
        
        public class test {

            // public static final String ANSI_RESET = "\u001B[0m";
            // public static final String ANSI_BLACK = "\u001B[30m";
            // public static final String ANSI_RED = "\u001B[31m";
            // public static final String ANSI_GREEN = "\u001B[32m";
            // public static final String ANSI_YELLOW = "\u001B[33m";
            // public static final String ANSI_BLUE = "\u001B[34m";
            // public static final String ANSI_PURPLE = "\u001B[35m";
            // public static final String ANSI_CYAN = "\u001B[36m";
            // public static final String ANSI_WHITE = "\u001B[37m";

            // System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);

            // public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
            // public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
            // public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
            // public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
            // public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
            // public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
            // public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
            // public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

            // System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
            // System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
            // System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);


            public static void main(String[] args){
        
                String fileName = "C:/MultiUser/JAVA/WhatIf/Ideias/test.txt";
        
                Path path = Paths.get(fileName);
        
                // default, create, truncate and write to it.
                // try (BufferedWriter writer =
                //              Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
        
                //     writer.write("This is a test.");
        
                // } catch (IOException e) {
                //     e.printStackTrace();
                // }
        
                // Append mode.
                try (BufferedWriter writer =
                             Files.newBufferedWriter(path,StandardCharsets.UTF_8,StandardOpenOption.APPEND)){
        
                    writer.write("Hello World !!" + "\n");
        
                } catch (IOException e) {
                    e.printStackTrace();
                }
        
            }
        

// import org.apache.commons.codec.binary.Base64;
// import java.util.Base64;

// import java.util.Arrays;

// public class Base64Encode {
//   public static void main(String[] args) {
//     String hello = "Hello World";

//     byte[] encoded = Base64.encodeBase64(hello.getBytes());

//     System.out.println(Arrays.toString(encoded));

//     String encodedString = new String(encoded);
//     System.out.println(hello + " = " + encodedString);
//   }
// }


static void testfunc() throws IOException{
    // Path path = Paths.get("C:/MultiUser/JAVA/WhatIf/Ideias/ideas.txt");
    // byte[] data = Files.readAllBytes(path);
    // // String s = new String(data, StandardCharsets.UTF_8);
    // // System.out.print(s);
    // // System.out.println(new String (data, StandardCharsets.UTF_8));
    // data[0]=84;
    // String s = Base64.getEncoder().encodeToString(data);
    // System.out.println(s);
    
    // byte[] decode = Base64.getDecoder().decode(s);
    // System.out.println(decode);

    // Files.write(Paths.get("C:/MultiUser/JAVA/WhatIf/Ideias/ideas2.txt"), decode);

    byte[] bytes = new byte[64];
    for (int i =0; i!=64;i++){
        bytes[i]=(byte)i;
    }
    Files.write(Paths.get("C:/MultiUser/JAVA/WhatIf/Ideias/ideas2.txt"), bytes);
 }
}