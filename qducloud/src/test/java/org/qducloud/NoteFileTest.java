package org.qducloud;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qducloud.bean.NoteFile;
import org.qducloud.service.NoteFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 笔记相关测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteFileTest {

    @Autowired
    private NoteFileService noteFileService;

    /**
     * 测试新增笔记
     */
    @Test
    public void testAddNoteFile(){
        NoteFile noteFile = new NoteFile();
        noteFile.setAuthor("施耐庵");
        noteFile.setComment(true);
        noteFile.setContent("合久必分，分久必合");
        noteFile.setContent_short("三国鼎立");
        noteFile.setTitle("三国演义");
        boolean ret = noteFileService.addNoteFile(noteFile);
        Assert.assertTrue(ret);
    }

    /**
     * 测试根据笔记id拿到笔记数据
     */
    @Test
    public void testGetById(){
        //要查找的笔记的ID
        String noteFileId = "6c778cdc-566b-11e8-8806-80fa5b45fda3";
        NoteFile noteFile = noteFileService.findNoteFileById(noteFileId);
        System.out.println(noteFile);
    }

    /**
     * 测试拿到所有笔记数据
     */
    @Test
    public void testGetAll(){
        List<NoteFile> allNoteFile = noteFileService.findAll();
        System.out.println("==========查询所有笔记结果==========");
        for(NoteFile noteFile : allNoteFile){
            System.out.println(noteFile);
        }
        System.out.println("==========查询所有笔记结果==========");
    }

    /**
     * 测试更新笔记数据
     */
    @Test
    public void testUpdate(){
        //要更新的笔记的ID
        String noteFileId = "3a96cb9d-575c-11e8-8981-00163e104287";
        NoteFile noteFile = noteFileService.findNoteFileById(noteFileId);
        noteFile.setAuthor("曹雪芹");
        noteFile.setContent("已更新");
        boolean ret = noteFileService.updateNoteFile(noteFile);
        Assert.assertTrue(ret);
    }

    /**
     * 测试删除笔记数据
     */
    @Test
    public void testDelete(){
        //要删除的笔记的ID
        String noteFileId = "3a96cb9d-575c-11e8-8981-00163e104287";
        boolean ret = noteFileService.deleteNoteFile(noteFileId);
        Assert.assertTrue(ret);
    }
}
