package org.qducloud.mapper.work;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.qducloud.bean.NoteFile;
/**
 * @author Cuiql
 */

@Mapper
public interface NoteFileMapper {
	public void addNoteFile(NoteFile file);
	public void updateNoteFile(NoteFile file);
	public void deleteNoteFile(String id);
	public NoteFile findNoteFileById(String id);
	public List<NoteFile> findAll();
}
