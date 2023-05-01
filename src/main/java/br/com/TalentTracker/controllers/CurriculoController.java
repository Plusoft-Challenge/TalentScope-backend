package br.com.TalentTracker.controllers;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/talent")
public class CurriculoController {

  
  
  // public ResponseEntity<Map<String, String>> extrairInfoCurriculo(@RequestParam("file") MultipartFile file){
  //   Map<String, String> resultado = new HashMap<>();
    
  //   try (InputStream inputStream = file.getInputStream()) {
      
  //   } catch (Exception e) {
  //     // TODO: handle exception
  //   }
  // }
}
