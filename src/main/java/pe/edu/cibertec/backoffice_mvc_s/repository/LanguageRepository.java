package pe.edu.cibertec.backoffice_mvc_s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.backoffice_mvc_s.entity.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
