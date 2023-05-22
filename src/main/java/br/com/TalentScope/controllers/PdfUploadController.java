package br.com.TalentScope.controllers;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@RestController
public class PdfUploadController {

    @Value("${output.path}")
    private String outputPath;

    @PostMapping(value="/talentScope/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Arquivo não fornecido.");
        }

        try {
            // Carrega o arquivo PDF
            PDDocument document = PDDocument.load(file.getInputStream());

            // Extrai o conteúdo do PDF
            String content = new PDFTextStripper().getText(document);

            // Gera um nome único para o arquivo de texto
            String fileName = UUID.randomUUID().toString() + ".txt";

            // Define o caminho completo do arquivo de texto
            String filePath = outputPath + fileName;

            // Salva o conteúdo em um arquivo de texto
            Files.write(Paths.get(filePath), content.getBytes());

            // Fecha o documento PDF
            document.close();

            return ResponseEntity.ok("Arquivo de texto salvo com sucesso em: " + filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}
