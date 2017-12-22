package com.study.yang.lifehelper.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "VOICE".
 */
public class Voice {

    private Long id;
    private String filename;
    private Long duration;
    private String filepath;

    public Voice() {
    }

    public Voice(Long id) {
        this.id = id;
    }

    public Voice(Long id, String filename, Long duration, String filepath) {
        this.id = id;
        this.filename = filename;
        this.duration = duration;
        this.filepath = filepath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

}