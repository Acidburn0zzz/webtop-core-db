/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.core.jooq.core.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MediaTypes implements java.io.Serializable {

	private static final long serialVersionUID = -753560623;

	private java.lang.String extension;
	private java.lang.String mediaType;

	public MediaTypes() {}

	public MediaTypes(
		java.lang.String extension,
		java.lang.String mediaType
	) {
		this.extension = extension;
		this.mediaType = mediaType;
	}

	public java.lang.String getExtension() {
		return this.extension;
	}

	public void setExtension(java.lang.String extension) {
		this.extension = extension;
	}

	public java.lang.String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(java.lang.String mediaType) {
		this.mediaType = mediaType;
	}
}