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