package com.investme.dslist.dto;

import java.util.Objects;

import com.investme.dslist.entities.GameList;

public class GameListDto {

	private Long id;
	private String name;
	
	public GameListDto() {
	}

	public GameListDto(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
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
		GameListDto other = (GameListDto) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
