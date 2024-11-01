package application.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import application.model.Jogo;
import application.record.JogoDTO;
import application.record.JogolistDTO;
import application.repository.JogoRepository;
 
@Service
public class JogoService {
    @Autowired
    private JogoRepository jogoRepo;

    public Iterable<JogolistDTO> getAllSimple(){
        return jogoRepo.findAll().stream().map(JogolistDTO::new).toList();
    }
 
    public Iterable<JogoDTO> getAll() {
        return jogoRepo.findAll().stream().map(JogoDTO::new).toList();
    }
 
    public JogoDTO add(JogoDTO jogo) {
        return new JogoDTO(jogoRepo.save(new Jogo(jogo)));
    }
}
 
 