package com.axh.media.model.mapping;

public enum ImageMapping {
	
	ID (ImageMapping.ID_FIELDNAME),
	IMAGEURL (ImageMapping.IMAGEURL_FIELDNAME),
    IMAGE (ImageMapping.IMAGE_FIELDNAME);
	
	public static final String ID_FIELDNAME = "movie_id";
	public static final String IMAGEURL_FIELDNAME = "imageUrl";
	public static final String IMAGE_FIELDNAME = "image";
	

	private String fieldName;
	
	ImageMapping(String fieldName) {
		this.fieldName = fieldName;		
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	
}
