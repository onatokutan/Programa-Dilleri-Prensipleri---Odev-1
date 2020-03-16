/**
*
* @author Onat Okutan onatokutan@gmail.com
* @since 08.03.2020
* <p>
* String methodlarla ve scanner yardımıyla bir txt dosyasından verileri
* okuyup değerlendiren bir programcık.
* </p>
*/
package pdpodev;
import java.io.File; 
import java.util.Scanner; 

public class pdpodev 
{ 

  public static void main(String[] args)throws Exception 
  {
    String theString = "";

    char[] sesliharf = {'a','e','ı','i','o','ö','u','ü'};
    String[] websitesi = {".com",".edu",".net",".org",".com.tr"
     ,".edu.tr",".net.tr",".org.tr"};
    int sesliharfsayisi = 0;
    int kelimesayisi = 0;
    int websitesisayisi =0;
    int mailsayisi=0;
    int cumlesayisi=0;
    File file = new File("icerik.txt");
    Scanner scanner = new Scanner(file);

    theString = scanner.nextLine();
    while (scanner.hasNextLine()) {
       theString = theString + "\n" + scanner.nextLine();
       System.out.println(theString);
       for(int x=0;x<=7;x++)
        if(theString.contains(websitesi[x]))
            websitesisayisi++;
        if(theString.contains(". "))
            cumlesayisi++;
        if(theString.contains("@"))
            mailsayisi++;
    }
    
    char[] charArray = theString.toCharArray();
    for(int i=0;i<charArray.length;i++){
        for(int k=0;k<=7;k++){
            if(charArray[i]==sesliharf[k])
                sesliharfsayisi++;
        }
        if(charArray[i]==' '||charArray[i]=='\n')
           kelimesayisi++;
    }
            System.out.print("Sesli Harf Sayisi :"+sesliharfsayisi+"\n");
            System.out.print("Kelime Sayisi :"+ kelimesayisi+"\n");
            System.out.print("Websitesi Sayisi :"+ websitesisayisi+"\n");
            System.out.print("Mail Sayisi :"+ mailsayisi+"\n");
            System.out.print("Cumle Sayisi :"+ cumlesayisi+"\n");

   } 
} 