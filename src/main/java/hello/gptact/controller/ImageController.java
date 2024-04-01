package hello.gptact.controller;

import hello.gptact.service.ImageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/upload")
    public void uploadImage(@RequestParam("file") MultipartFile file) {
        imageService.uploadImage(file);
    }
}
