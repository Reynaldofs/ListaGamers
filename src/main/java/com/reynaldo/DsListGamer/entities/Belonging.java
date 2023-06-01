package com.reynaldo.DsListGamer.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
	@Table(name = "tb_belonging")
public class Belonging {

	
	
	
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer position;

	public Belonging() {
	}

	public Belonging(Game game, GameList List, Integer position) {
		id.setGame(game);
		id.setList(List);
		this.position = position;
	}
	
	
	
}
