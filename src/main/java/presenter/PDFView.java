package presenter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfPTable;

@Component
public class PDFView implements PrintView {

    @Override
    public void generate(PrintViewModel printViewModel) {
        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File("finance.pdf")));

            //open
            document.open();

            PdfPTable pdfPTable = new PdfPTable(printViewModel.getHeaders().size());

            printViewModel.getHeaders().stream().forEach(header ->
                    pdfPTable.addCell(new PdfPCell(new Paragraph(header))));

            printViewModel.getBody().stream().forEach(
                    body -> body.stream().forEach(
                            elem -> pdfPTable.addCell(new PdfPCell(new Paragraph(elem)))));

            document.add(pdfPTable);
            document.close();

            System.out.println("Done");

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}