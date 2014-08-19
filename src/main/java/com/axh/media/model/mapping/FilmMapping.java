package com.axh.media.model.mapping;

public enum FilmMapping {
	
	ID (FilmMapping.ID_FIELDNAME),
	TITLE (FilmMapping.TITLE_FIELDNAME),
	RELEASEYEAR (FilmMapping.RELEASEYEAR_FIELDNAME),
	PUBLISHED (FilmMapping.PUBLISHED_FIELDNAME),
    TORRENT (FilmMapping.TORRENT_FIELDNAME),
    LINK (FilmMapping.LINK_FIELDNAME),
    IMDB (FilmMapping.IMDB_FIELDNAME),
    RATING (FilmMapping.RATING_FIELDNAME),
    GENRE (FilmMapping.GENRE_FIELDNAME),
    QUALITY (FilmMapping.QUALITY_FIELDNAME),
    SIZE (FilmMapping.SIZE_FIELDNAME),
    RUNTIME (FilmMapping.RUNTIME_FIELDNAME),
    SYNOPSIS (FilmMapping.SYNOPSIS_FIELDNAME);
	
	public static final String ID_FIELDNAME = "film_id";
	public static final String TITLE_FIELDNAME = "title";
	public static final String RELEASEYEAR_FIELDNAME = "releaseYear";
	public static final String PUBLISHED_FIELDNAME = "published";
	public static final String TORRENT_FIELDNAME = "torrent";
	public static final String LINK_FIELDNAME = "link";
	public static final String IMDB_FIELDNAME = "imdbLink";
	public static final String RATING_FIELDNAME = "imdbRating";
	public static final String GENRE_FIELDNAME = "genre";
	public static final String QUALITY_FIELDNAME = "quality";
	public static final String SIZE_FIELDNAME = "size";
	public static final String RUNTIME_FIELDNAME = "runTime";
	public static final String SYNOPSIS_FIELDNAME = "synopsis";
	
	
	private String fieldName;
	
	FilmMapping(String fieldName) {
		this.fieldName = fieldName;		
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	
	
}
