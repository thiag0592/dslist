package com.investme.dslist.dto;

import com.investme.dslist.entities.Game;
import com.investme.dslist.projections.GameMinProjection;

public class GameMinDto {
	private Long id;
	private String title;
	private Integer year;
	private String	imgUrl;
	private String	shortDescription;

	public GameMinDto() {
	}

	public GameMinDto(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDto(GameMinProjection entityProjection) {
		this.id = entityProjection.getId();
		this.title = entityProjection.getTitle();
		this.year = entityProjection.getYear();
		this.imgUrl = entityProjection.getImgUrl();
		this.shortDescription = entityProjection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}

