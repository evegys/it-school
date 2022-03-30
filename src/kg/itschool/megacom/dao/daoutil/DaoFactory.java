package kg.itschool.megacom.dao.daoutil;

import kg.itschool.megacom.dao.*;
import kg.itschool.megacom.dao.impl.*;

public abstract class DaoFactory {
    static {
        try{
            System.out.println("Loading driver...");
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failed");
            e.printStackTrace();
        }
    }

    public static ManagerDao getManagerDaoSql() {return new ManagerDaoImpl();}
    public static MentorDao getMentorDaoSql() {
        return new MentorDaoImpl();
    }
    public static StudentDao getStudentDaoSql() {
        return new StudentDaoImpl();
    }
    public static CourseDao getCourseDaoSql() {
        return new CourseDaoImpl();
    }
    public static GroupDao getGroupDaoSql() {
        return new GroupDaoImpl();
    }
    public static AddressDao getAddressDaoSql() {
        return new AddressDaoImpl();
    }
    }

