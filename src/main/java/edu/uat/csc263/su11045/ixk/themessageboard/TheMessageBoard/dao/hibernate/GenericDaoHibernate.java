package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.DomainObject;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.GenericDao;

public class GenericDaoHibernate<T extends DomainObject> extends HibernateDaoSupport implements GenericDao<T> {

    private Class<T> type;

    public GenericDaoHibernate(Class<T> type) {
        super();
        this.type = type;
    }

    public T get(Long id) {
        return (T) getHibernateTemplate().get(type, id);
    }

    public List<T> getAll() {
        return getHibernateTemplate().loadAll(type);
    }

    public void save(T object) {
        getHibernateTemplate().saveOrUpdate(object);
        getHibernateTemplate().flush();
    }

    public void delete(T object) {
        getHibernateTemplate().delete(object);
    }

    @Autowired
    public void setupSessionFactory(SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }

}
