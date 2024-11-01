package application.record;

import application.model.Jogo;

public record JogolistDTO(long id, String titulo) {
    public JogolistDTO(Jogo jogo) {
    this(jogo.getId(), jogo.getTitulo());
    
}

}
