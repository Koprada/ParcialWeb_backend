package org.example.Rest;
@RestController
@RequestMapping("/libros")
public class libroController {
    @Autowired
    librorepository libroRepository;
    @Autowired
    libroService libroService;
    @Autowired
    private converterDTO converterDTO;
}
