package br.com.dio.challenge.domain.user;

import br.com.dio.challenge.domain.matter.Matter;

public interface UserInterface {
    void registerBootcamp (Matter bootcamp);
    void progress ();
    double calculateTotalXP();
}
