package br.com.TalentScope.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.TalentScope.controllers.ChatGptController;
import br.com.TalentScope.controllers.CurriculoController;
import br.com.TalentScope.models.Curriculo;

@Service
public class CurriculoService {
	Logger log = LoggerFactory.getLogger(CurriculoController.class);

	private Set<String> curriculosProcessados = new HashSet();

	ChatGptService chatGptService;
	ChatGptController chatGptController;
	Curriculo curriculo;

	public void extractTextFromCurriculosInFolder(String sourceFolderPath, String outputFolderPath) throws IOException {
		File sourceFolder = new File(sourceFolderPath);
		// lista os arquivos da pasta e filtra somente os arquivos com a extenção .pdf
		File[] curriculos = sourceFolder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));

		if (curriculos != null) {
			for (File cv : curriculos) {
				extractTextFromCurriculo(cv, outputFolderPath);
			}
		} else {
			log.info("Não tem currículo para análise.");
		}
	}

	private void extractTextFromCurriculo(File pdfFile, String outputFolderPath) throws IOException {

		String fileName = pdfFile.getName();

		// Verifica se o currículo já foi processado
		if (curriculosProcessados.contains(fileName)) {
			log.info("Currículo já foi processado anteriormente: " + fileName);
			return;
		}

		PDDocument document = PDDocument.load(pdfFile);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		// Extrai o texto do pdf
		String text = pdfTextStripper.getText(document);
		
		document.close();
		log.info("Curriculo analisado");
		
		// Seta o texto
//		if(text != null) {
//			curriculo.setTexto(text);
//		} else {
//			log.error("Não foi extraido nenhum texto");
//		}
		
		
		String outputFileName = pdfFile.getName().replace(".pdf", ".txt");
		File outputFile = new File(outputFolderPath, outputFileName);

		// Abre o arquivo para escrita
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			// escreve no arquivo txt
			fos.write(text.getBytes());
		}

		// Adiciona o nome do currículo ao conjunto de currículos processados
		curriculosProcessados.add(fileName);
	}

}
