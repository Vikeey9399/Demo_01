import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Demo_03 extends Demo_Base {

    public static void main(String[] args) {
        
        // Initialize the WebDriver and navigate to the target URL
        GetDriver();
        driver.get("https://www.ilovepdf.com/powerpoint_to_pdf");
        
        // Define the file path for the PDF you want to read
        String filePath = "/home/apmosys/Documents/Pramod/Application.pdf";
        
        // Load and read the PDF file using PDFBox
        System.out.println("Start");
        PDDocument document = null;
        try {
        	  System.out.println("in try");
            document = PDDocument.load(new File(filePath));
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfText = pdfStripper.getText(document);
            System.out.println(pdfText);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("in catch");
        } finally {
        	System.out.println("in finaly");
            // Close the document in the finally block to ensure it gets closed even if an exception occurs
            try {
                if (document != null) {
                    document.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Out");
        // Close the WebDriver
        driver.quit();
    }
}
