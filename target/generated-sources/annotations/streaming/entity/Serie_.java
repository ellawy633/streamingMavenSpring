package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Pays;
import streaming.entity.Personne;
import streaming.entity.Saison;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-04T15:50:47")
@StaticMetamodel(Serie.class)
public class Serie_ { 

    public static volatile ListAttribute<Serie, Personne> realisateurs;
    public static volatile SingularAttribute<Serie, String> titre;
    public static volatile SingularAttribute<Serie, Long> id;
    public static volatile SingularAttribute<Serie, String> synopsis;
    public static volatile ListAttribute<Serie, Saison> saisons;
    public static volatile ListAttribute<Serie, Personne> acteurs;
    public static volatile ListAttribute<Serie, Pays> pays;

}