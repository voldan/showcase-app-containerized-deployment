package com.softserveinc.itacademy.bikechampionship.commons.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Team.class)
public abstract class Team_ {

	public static volatile SingularAttribute<Team, String> name;
	public static volatile SingularAttribute<Team, Long> id;
	public static volatile ListAttribute<Team, Participant> participants;

}

