/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;
import streaming.entity.Lien;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
public interface FilmServiceCRUD extends CrudRepository<Film, Long> {

    public Film findOneByTitre(String t);

    public List<Film> findAllByAnnee(Integer annee);

    public List<Film> findAllByTitreOrAnnee(String t, Integer annee);
    //4

    public List<Film> findAllByTitreAndAnnee(String t, Integer annee);

//5 Les films pour un genre id donné
    public List<Film> findAllByGenreId(Long genreId);

    //6. Les films pour un pays id donnée
    public List<Film> findAllByPaysId(long payeId);

    //7Les films pour un genre id et un pays id donnés
    public List<Film> findAllByGenreIdAndPaysId(Long idGenre, Long idPays);

    //8. Les films pour un acteur (nom/prénom) donné
    public List<Film> findAllByActeursNomAndActeursPrenom(String nom, String prenom);

    //9. Le nombre de films pour un acteur donné
    public Long countByActeursNomAndActeursPrenom(String nom, String prenom);

    //10 . Les films pour un réalisateur donné, classés par titre
    public List<Film> findAllByRealisateursNomAndRealisateursPrenomOrderByTitre(String nom, String prenom);

//11. Le nombre de films pour un réalisateur donné
    public Long countByRealisateursNomAndRealisateursPrenom(String nom, String prenom);

//12. Les films d'un pays donné, pour un genre donné, un réalisateur donné et un acteur donné
    public List<Film> findAllByPaysIdAndGenreIdAndRealisateursNomAndRealisateursPrenomAndActeursNomAndActeursPrenom(Long id, Long idgenre, String nomreal, String prenomreal, String nomact, String prenomact);

}
