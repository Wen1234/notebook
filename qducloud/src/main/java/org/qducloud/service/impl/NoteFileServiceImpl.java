package org.qducloud.service.impl;
import java.util.Date;
import java.util.List;

/**
 * @author Cuiql
 */
import org.qducloud.bean.NoteFile;
import org.qducloud.mapper.work.NoteFileMapper;
import org.qducloud.service.NoteFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class NoteFileServiceImpl implements NoteFileService {

	@Autowired
	private NoteFileMapper noteFileMapper;
	
	@Override
	public boolean addNoteFile(NoteFile file) {
		try {
			noteFileMapper.addNoteFile(file);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateNoteFile(NoteFile file) {
		try {
			noteFileMapper.updateNoteFile(file);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteNoteFile(String id) {
		try {
			noteFileMapper.deleteNoteFile(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public NoteFile findNoteFileById(String id) {
		return noteFileMapper.findNoteFileById(id);
	}

	@Override
	public List<NoteFile> findAll() {
		return noteFileMapper.findAll();
	}
	

}
