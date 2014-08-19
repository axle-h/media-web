package com.axh.media.model.domain;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.axh.media.model.mapping.FilmMapping;

@Entity
@Table(name = "films_1080p")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = FilmMapping.ID_FIELDNAME , nullable = false)
	private int filmId;
	
	@Column(name = FilmMapping.TITLE_FIELDNAME, nullable = false, length = 150)
	private String title;
	
	@Column(name = FilmMapping.RELEASEYEAR_FIELDNAME, nullable = false)
	private int releaseYear;
	
	@Column(name = FilmMapping.PUBLISHED_FIELDNAME, nullable = false)
	private Calendar published;
	
	@Column(name = FilmMapping.TORRENT_FIELDNAME, nullable = false, length = 200)
	private String torrent;
	
	@Column(name = FilmMapping.LINK_FIELDNAME, nullable = false, length = 200)
	private String link;
	
	@Column(name = FilmMapping.IMDB_FIELDNAME, nullable = false, length = 100)
	private String imdbLink;
	
	@Column(name = FilmMapping.RATING_FIELDNAME, nullable = false, precision = 3)
	private BigDecimal imdbRating;
	
	@Column(name = FilmMapping.GENRE_FIELDNAME, nullable = false, length = 100)
	private String genre;
	
	@Column(name = FilmMapping.QUALITY_FIELDNAME, nullable = false, length = 10)
	private String quality;
	
	@Column(name = FilmMapping.SIZE_FIELDNAME, nullable = false)
	private long size;
	
	@Column(name = FilmMapping.RUNTIME_FIELDNAME, nullable = false)
	private int runTime;
	
	@Column(name = FilmMapping.SYNOPSIS_FIELDNAME, nullable = false)
	private String synopsis;

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
	 * @return the imdbLink
	 */
	public String getImdbLink() {
		return imdbLink;
	}

	/**
	 * @param imdbLink the imdbLink to set
	 */
	public void setImdbLink(String imdbLink) {
		this.imdbLink = imdbLink;
	}

	/**
	 * @return the imdbRating
	 */
	public BigDecimal getImdbRating() {
		return imdbRating;
	}

	/**
	 * @param imdbRating the imdbRating to set
	 */
	public void setImdbRating(BigDecimal imdbRating) {
		this.imdbRating = imdbRating;
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
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(String quality) {
		this.quality = quality;
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
	
}
