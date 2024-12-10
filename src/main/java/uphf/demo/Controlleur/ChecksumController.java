package uphf.demo.Controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uphf.demo.Services.ChecksumService;
import uphf.demo.entities.Model_checksum;
import uphf.demo.repositories.ChecksumRepository;

import java.security.NoSuchAlgorithmException;
import java.util.List;


@RestController
@RequestMapping("/checksum")
public class ChecksumController {

    @Autowired
    private ChecksumService checksumService;

    @Autowired
    private ChecksumRepository repository;

    @PostMapping
    public Model_checksum createChecksum(@RequestParam String input, @RequestParam String algorithm) throws NoSuchAlgorithmException {
        String checksum = checksumService.calculateChecksum(input, algorithm);
        Model_checksum entry = new Model_checksum();
        entry.setInput(input);
        entry.setAlgorithm(algorithm);
        entry.setChecksum(checksum);
        return repository.save(entry);
    }

    @GetMapping
    public List<Model_checksum> getAllChecksums() {
        return repository.findAll();
    }
}