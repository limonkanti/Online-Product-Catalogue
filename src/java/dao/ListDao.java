

package dao;

import entity.Category;
import entity.Product;
import entity.SubCategory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class ListDao 
{
    //////////////////////////////
    public List catList()
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Category> cList=session.createQuery("SELECT al.catName FROM Category al").list();
        cList.toString();
        session.close();
        return cList;
    }
    
    public List<Category> catListByName(String name)
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Category> cList=session.createQuery("SELECT al FROM Category al where catName='"+name+"' ").list();
        // List<Category> cList=session.createQuery("SELECT al FROM Category al where lower(catName)='"+name.toLowerCase()+"' ").list();    
        cList.toString();
        session.close();
        return cList;
        
    }
    ///////////////////////////
    public List subcatList(String name)
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Category> cList=session.createQuery("SELECT al.subCatName FROM SubCategory al where al.category.catId IN("
                 + "SELECT a.catId from Category a where a.catName='"+name+"' )").list();
        cList.toString();
        session.close();
        return cList;
        
        
    }
    
    public List<SubCategory> subcatListByName(String name)
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
         List<SubCategory> cList=session.createQuery("SELECT al FROM SubCategory al where subCatName='"+name+"' ").list();
        cList.toString();
        session.close();
        return cList;
        
    }
    public List allProductList()
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
         List<Product> cList=session.createQuery("SELECT al FROM Product al").list();
        cList.toString();
        session.close();
        return cList;
         
    }
    
    
    
}
