package com.example.greendao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.greendao.bean.Student;
import com.example.greendao.bean.JsonStrData;
import com.example.greendao.bean.MessCtData;
import com.example.greendao.bean.RecomdRouteData;

import com.example.greendao.dao.StudentDao;
import com.example.greendao.dao.JsonStrDataDao;
import com.example.greendao.dao.MessCtDataDao;
import com.example.greendao.dao.RecomdRouteDataDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig studentDaoConfig;
    private final DaoConfig jsonStrDataDaoConfig;
    private final DaoConfig messCtDataDaoConfig;
    private final DaoConfig recomdRouteDataDaoConfig;

    private final StudentDao studentDao;
    private final JsonStrDataDao jsonStrDataDao;
    private final MessCtDataDao messCtDataDao;
    private final RecomdRouteDataDao recomdRouteDataDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        studentDaoConfig = daoConfigMap.get(StudentDao.class).clone();
        studentDaoConfig.initIdentityScope(type);

        jsonStrDataDaoConfig = daoConfigMap.get(JsonStrDataDao.class).clone();
        jsonStrDataDaoConfig.initIdentityScope(type);

        messCtDataDaoConfig = daoConfigMap.get(MessCtDataDao.class).clone();
        messCtDataDaoConfig.initIdentityScope(type);

        recomdRouteDataDaoConfig = daoConfigMap.get(RecomdRouteDataDao.class).clone();
        recomdRouteDataDaoConfig.initIdentityScope(type);

        studentDao = new StudentDao(studentDaoConfig, this);
        jsonStrDataDao = new JsonStrDataDao(jsonStrDataDaoConfig, this);
        messCtDataDao = new MessCtDataDao(messCtDataDaoConfig, this);
        recomdRouteDataDao = new RecomdRouteDataDao(recomdRouteDataDaoConfig, this);

        registerDao(Student.class, studentDao);
        registerDao(JsonStrData.class, jsonStrDataDao);
        registerDao(MessCtData.class, messCtDataDao);
        registerDao(RecomdRouteData.class, recomdRouteDataDao);
    }
    
    public void clear() {
        studentDaoConfig.clearIdentityScope();
        jsonStrDataDaoConfig.clearIdentityScope();
        messCtDataDaoConfig.clearIdentityScope();
        recomdRouteDataDaoConfig.clearIdentityScope();
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public JsonStrDataDao getJsonStrDataDao() {
        return jsonStrDataDao;
    }

    public MessCtDataDao getMessCtDataDao() {
        return messCtDataDao;
    }

    public RecomdRouteDataDao getRecomdRouteDataDao() {
        return recomdRouteDataDao;
    }

}
