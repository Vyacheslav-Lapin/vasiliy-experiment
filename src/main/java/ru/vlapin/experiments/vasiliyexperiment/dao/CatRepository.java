package ru.vlapin.experiments.vasiliyexperiment.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.vasiliyexperiment.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
