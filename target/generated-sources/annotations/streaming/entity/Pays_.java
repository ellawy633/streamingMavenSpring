package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Film;
import streaming.entity.Serie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-04T15:50:47")
@StaticMetamodel(Pays.class)
public class Pays_ { 

    public static volatile ListAttribute<Pays, Serie> seriesProduits;
    public static volatile SingularAttribute<Pays, Long> id;
    public static volatile SingularAttribute<Pays, String> nom;
    public static volatile ListAttribute<Pays, Film> filmsProduits;

}