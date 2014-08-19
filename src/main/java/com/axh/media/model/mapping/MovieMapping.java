package com.axh.media.model.mapping;

public enum MovieMapping {
	
	ID (MovieMapping.ID_FIELDNAME),
	ID_1080P (MovieMapping.ID_1080P_FIELDNAME),
	ID_720P (MovieMapping.ID_720P_FIELDNAME),
	ID_IMAGE (MovieMapping.ID_IMAGE_FIELDNAME),
	TITLE (MovieMapping.TITLE_FIELDNAME),
	RELEASEYEAR (MovieMapping.YEAR_FIELDNAME),
    TORRENT (MovieMapping.TORRENT_FIELDNAME),
    LINK (MovieMapping.LINK_FIELDNAME),
    IMDB (MovieMapping.IMDB_FIELDNAME),
    RATING (MovieMapping.RATING_FIELDNAME),
    GENRE (MovieMapping.GENRE_FIELDNAME),
    SIZE (MovieMapping.SIZE_FIELDNAME),
    RUNTIME (MovieMapping.RUNTIME_FIELDNAME),
    SYNOPSIS (MovieMapping.SYNOPSIS_FIELDNAME);
	
	public static final String TABLE_NAME = "movies";
	public static final String ID_FIELDNAME = "film_id";
	public static final String ID_1080P_FIELDNAME = "film_1080p_id";
	public static final String ID_720P_FIELDNAME = "film_720p_id";
	public static final String ID_IMAGE_FIELDNAME = "image_id";
	public static final String TITLE_FIELDNAME = "title";
	public static final String YEAR_FIELDNAME = "year";
	public static final String TORRENT_FIELDNAME = "torrent";
	public static final String LINK_FIELDNAME = "link";
	public static final String IMDB_FIELDNAME = "imdb";
	public static final String RATING_FIELDNAME = "rating";
	public static final String GENRE_FIELDNAME = "genre";
	public static final String SIZE_FIELDNAME = "size";
	public static final String RUNTIME_FIELDNAME = "runTime";
	public static final String SYNOPSIS_FIELDNAME = "synopsis";
	
	
	private String fieldName;
	
	MovieMapping(String fieldName) {
		this.fieldName = fieldName;		
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	
	
}
