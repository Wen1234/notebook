package org.qducloud.controller.work;

import java.util.List;

import org.qducloud.bean.NoteFile;
import org.qducloud.service.NoteFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Cuiql
 */
@Api(tags="云笔记控制类")
@Controller
@RequestMapping("work/notefile")
@CrossOrigin(origins = "*", maxAge = 3600)
public class NoteFileController {
	@Autowired
	private NoteFileService noteFileService;
	@ResponseBody
	@GetMapping("getbyid")
	@ApiOperation(value="根据笔记id拿到笔记数据")
	public NoteFile getById(String id) {
		return noteFileService.findNoteFileById(id);
	}
	
	@ResponseBody
	@GetMapping("getAll")
	@ApiOperation(value="拿到所有笔记数据")
	public List<NoteFile> getAll() {
		return noteFileService.findAll();
	}
	@ResponseBody
	@PostMapping("add")
	@ApiOperation(value="新增笔记数据")
	public boolean add(NoteFile file) {
		return noteFileService.addNoteFile(file);
	}
	@ResponseBody
	@PostMapping("update")
	@ApiOperation(value="更新笔记数据")
	public boolean update(NoteFile file) {
		return noteFileService.updateNoteFile(file);
	}
	@ResponseBody
	@GetMapping("delete")
	@ApiOperation(value="删除笔记数据")
	public boolean delete(String id) {
		return noteFileService.deleteNoteFile(id);
	}
}
	