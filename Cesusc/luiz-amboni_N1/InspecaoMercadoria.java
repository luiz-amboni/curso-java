package fretadora.cesusc;

import java.time.LocalDateTime;

public interface InspecaoMercadoria {

    void inpecionar(LocalDateTime dataInspecao, String orgaoInspecao);
}
