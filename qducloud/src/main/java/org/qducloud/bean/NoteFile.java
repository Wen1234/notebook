package org.qducloud.bean;

import java.util.Date;

import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Cuiql
 */
@EntityScan
@ToString
public class NoteFile {
	private String id;
	private String author;
	private boolean comment;
	private String content;
	private String content_short;
	private Date display_time;
	private String title;
	private boolean is_active;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isComment() {
		return comment;
	}
	public void setComment(boolean comment) {
		this.comment = comment;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent_short() {
		return content_short;
	}
	public void setContent_short(String content_short) {
		this.content_short = content_short;
	}
	public Date getDisplay_time() {
		return display_time;
	}
	public void setDisplay_time(Date display_time) {
		this.display_time = display_time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
}
