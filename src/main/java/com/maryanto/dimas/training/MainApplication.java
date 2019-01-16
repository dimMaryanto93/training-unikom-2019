package com.maryanto.dimas.training;

import com.maryanto.dimas.training.configuration.SessionFactoryUtil;
import com.maryanto.dimas.training.dao.BukuDao;
import com.maryanto.dimas.training.entity.Buku;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {

    private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        System.out.println("halo saya sedang belajar maven!");

        SessionFactoryUtil util = new SessionFactoryUtil();
        SessionFactory sessionFactory = util.getSessionFactory();
        Session session = sessionFactory.openSession();
        BukuDao dao = new BukuDao(session);
        session.beginTransaction();
        log.info("hibernate connection open!");


        Buku pemograman = new Buku(
                "2344-1234324",
                "Bahasa Pemograman",
                "Dimas Maryanto",
                2019,
                "INformatika");

        log.info("before save: {}", pemograman.toString());
        pemograman = dao.save(pemograman);
        log.info("after save: {}", pemograman.toString());

        session.getTransaction().commit();

        session.beginTransaction();
        Buku bukuPemograman = dao.findById(pemograman.getId());
        bukuPemograman.setNamaPengarang("Rega");
        dao.update(bukuPemograman);

        bukuPemograman = dao.findById(bukuPemograman.getId());
        log.info("after update: {}", bukuPemograman);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        log.info("hibernate connection close!");

    }
}
