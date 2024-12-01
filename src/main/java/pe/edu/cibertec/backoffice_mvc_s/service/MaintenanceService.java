package pe.edu.cibertec.backoffice_mvc_s.service;

import pe.edu.cibertec.backoffice_mvc_s.dto.FilmDetailDto;
import pe.edu.cibertec.backoffice_mvc_s.dto.FilmDto;
import pe.edu.cibertec.backoffice_mvc_s.dto.FilmEditDto;
import pe.edu.cibertec.backoffice_mvc_s.entity.Language;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmEditDto getFilmForEditById(int id);

    void updateFilm(FilmEditDto filmEditDto);

    List<Language> getAllLanguages();

}
