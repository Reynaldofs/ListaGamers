package com.reynaldo.DsListGamer.entities;

import java.util.Objects;

public class GameList {

	private long id;
	private String name;
	
	public GameList( ) {		
	}

	public GameList(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameList other = (GameList) obj;
		return id == other.id;
	}
	
}
