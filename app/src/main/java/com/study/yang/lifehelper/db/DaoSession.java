package com.study.yang.lifehelper.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.study.yang.lifehelper.db.Note;
import com.study.yang.lifehelper.db.weather;
import com.study.yang.lifehelper.db.Diary;
import com.study.yang.lifehelper.db.Voice;

import com.study.yang.lifehelper.db.NoteDao;
import com.study.yang.lifehelper.db.weatherDao;
import com.study.yang.lifehelper.db.DiaryDao;
import com.study.yang.lifehelper.db.VoiceDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig noteDaoConfig;
    private final DaoConfig weatherDaoConfig;
    private final DaoConfig diaryDaoConfig;
    private final DaoConfig voiceDaoConfig;

    private final NoteDao noteDao;
    private final weatherDao weatherDao;
    private final DiaryDao diaryDao;
    private final VoiceDao voiceDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        noteDaoConfig = daoConfigMap.get(NoteDao.class).clone();
        noteDaoConfig.initIdentityScope(type);

        weatherDaoConfig = daoConfigMap.get(weatherDao.class).clone();
        weatherDaoConfig.initIdentityScope(type);

        diaryDaoConfig = daoConfigMap.get(DiaryDao.class).clone();
        diaryDaoConfig.initIdentityScope(type);

        voiceDaoConfig = daoConfigMap.get(VoiceDao.class).clone();
        voiceDaoConfig.initIdentityScope(type);

        noteDao = new NoteDao(noteDaoConfig, this);
        weatherDao = new weatherDao(weatherDaoConfig, this);
        diaryDao = new DiaryDao(diaryDaoConfig, this);
        voiceDao = new VoiceDao(voiceDaoConfig, this);

        registerDao(Note.class, noteDao);
        registerDao(weather.class, weatherDao);
        registerDao(Diary.class, diaryDao);
        registerDao(Voice.class, voiceDao);
    }
    
    public void clear() {
        noteDaoConfig.getIdentityScope().clear();
        weatherDaoConfig.getIdentityScope().clear();
        diaryDaoConfig.getIdentityScope().clear();
        voiceDaoConfig.getIdentityScope().clear();
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public weatherDao getWeatherDao() {
        return weatherDao;
    }

    public DiaryDao getDiaryDao() {
        return diaryDao;
    }

    public VoiceDao getVoiceDao() {
        return voiceDao;
    }

}