package org.qducloud.service;

import java.util.List;

import org.qducloud.bean.NoteFile;
/**
 * @author Cuiql
 */
public interface NoteFileService {
	public boolean addNoteFile(NoteFile file);
	public boolean updateNoteFile(NoteFile file);
	public boolean deleteNoteFile(String id);
	public NoteFile findNoteFileById(String id);
	public List<NoteFile> findAll();
}