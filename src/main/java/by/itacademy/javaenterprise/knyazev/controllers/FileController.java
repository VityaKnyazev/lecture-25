package by.itacademy.javaenterprise.knyazev.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	private static final String folder = "C:/";
	
	@PostMapping("/files")
	public String saveFile(@RequestParam MultipartFile file) throws Exception {
		
		if (file.isEmpty()) {
            return "redirect: /index";
        }
		
		try {
			byte[] data = file.getBytes();
			Files.write(Path.of(folder, file.getOriginalFilename()), data);
		} catch (IOException e) {
			throw new Exception(e);
		}
		
		return "redirect: /index";
	}	
}