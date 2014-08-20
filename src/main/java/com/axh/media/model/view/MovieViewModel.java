package com.axh.media.model.view;

import java.math.BigDecimal;
import java.util.Calendar;

public class MovieViewModel {
	
	private int filmId;
	
	private String title;
	
	private int releaseYear;
	
	private Calendar published;
	
	private String imdb;
	
	private BigDecimal rating;
	
	private String genre;
	
	private int runTime;
	
	private String synopsis;
	
	private String imageUrl;
	
	private byte[] image;

	/**
	 * @return the filmId
	 */
	public int getFilmId() {
		return filmId;
	}

	/**
	 * @param filmId the filmId to set
	 */
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}

	/**
	 * @param releaseYear the releaseYear to set
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	/**
	 * @return the published
	 */
	public Calendar getPublished() {
		return published;
	}

	/**
	 * @param published the published to set
	 */
	public void setPublished(Calendar published) {
		this.published = published;
	}

	/**
	 * @return the imdb
	 */
	public String getImdb() {
		return imdb;
	}

	/**
	 * @param imdb the imdb to set
	 */
	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	/**
	 * @return the rating
	 */
	public BigDecimal getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the runTime
	 */
	public int getRunTime() {
		return runTime;
	}

	/**
	 * @param runTime the runTime to set
	 */
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	/**
	 * @return the synopsis
	 */
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * @param synopsis the synopsis to set
	 */
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
