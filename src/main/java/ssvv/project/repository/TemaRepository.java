package ssvv.project.repository;

import ssvv.project.domain.Tema;
import ssvv.project.validation.*;

public class TemaRepository extends AbstractCRUDRepository<String, Tema> {
    public TemaRepository(Validator<Tema> validator) {
        super(validator);
    }
}

