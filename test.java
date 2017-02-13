import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class MainClass {

  public static void main(String[] args) throws Exception {
    Document document = new Document();
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("1.pdf"));
    writer.setEncryption(PdfWriter.STRENGTH128BITS, "Hello", "World", PdfWriter.AllowCopy
        | PdfWriter.AllowPrinting);
    document.open();
    document.add(new Paragraph("Hello World"));
    document.close();
  }
}
