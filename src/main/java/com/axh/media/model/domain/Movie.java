package com.axh.media.model.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.axh.media.model.mapping.ImageMapping;
import com.axh.media.model.mapping.MovieMapping;

@Entity
@Table(name = MovieMapping.TABLE_NAME)
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = MovieMapping.ID_FIELDNAME, nullable = false)
	private int filmId;
	
	@Column(name = MovieMapping.ID_1080P_FIELDNAME, nullable = true)
	private int film1080pId;

	@Column(name = MovieMapping.ID_720P_FIELDNAME, nullable = true)
	private int film720pId;

	@Column(name = MovieMapping.ID_IMAGE_FIELDNAME, nullable = true)
	private int imageId;
	
	@Column(name = MovieMapping.TITLE_FIELDNAME, nullable = false, length = 150)
	private String title;
	
	@Column(name = MovieMapping.YEAR_FIELDNAME, nullable = false)
	private int year;
	
	@Column(name = MovieMapping.TORRENT_FIELDNAME, nullable = false, length = 200)
	private String torrent;
	
	@Column(name = MovieMapping.LINK_FIELDNAME, nullable = false, length = 200)
	private String link;
	
	@Column(name = MovieMapping.IMDB_FIELDNAME, nullable = false, length = 100)
	private String imdb;
	
	@Column(name = MovieMapping.RATING_FIELDNAME, nullable = false, precision = 3)
	private BigDecimal rating;
	
	@Column(name = MovieMapping.GENRE_FIELDNAME, nullable = false, length = 100)
	private String genre;
	
	@Column(name = MovieMapping.SIZE_FIELDNAME, nullable = false)
	private long size;
	
	@Column(name = MovieMapping.RUNTIME_FIELDNAME, nullable = false)
	private int runTime;
	
	@Column(name = MovieMapping.SYNOPSIS_FIELDNAME, nullable = false)
	private String synopsis;
	
	@OneToOne
	@JoinColumn(name=MovieMapping.ID_IMAGE_FIELDNAME, referencedColumnName=ImageMapping.ID_FIELDNAME, nullable=true)
	private Image image;

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
	 * @return the film1080pId
	 */
	public int getFilm1080pId() {
		return film1080pId;
	}

	/**
	 * @param film1080pId the film1080pId to set
	 */
	public void setFilm1080pId(int film1080pId) {
		this.film1080pId = film1080pId;
	}

	/**
	 * @return the film720pId
	 */
	public int getFilm720pId() {
		return film720pId;
	}

	/**
	 * @param film720pId the film720pId to set
	 */
	public void setFilm720pId(int film720pId) {
		this.film720pId = film720pId;
	}

	/**
	 * @return the imageId
	 */
	public int getImageId() {
		return imageId;
	}

	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(int imageId) {
		this.imageId = imageId;
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
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the torrent
	 */
	public String getTorrent() {
		return torrent;
	}

	/**
	 * @param torrent the torrent to set
	 */
	public void setTorrent(String torrent) {
		this.torrent = torrent;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
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
	 * @return the size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(long size) {
		this.size = size;
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
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	
	
	
}
