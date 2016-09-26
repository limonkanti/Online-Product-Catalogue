
package dao;

import entity.Category;
import entity.Product;
import entity.SubCategory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class AddDao 
{
    public boolean addCategory(Category cat)
    {
        try{
            SessionFactory factory=HibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            session.beginTransaction();
            session.save(cat);
            session.beginTransaction().commit();
            session.close();
            
            return true;
        }
        catch(HibernateException e)
        {
            System.out.println("Error is:\t"+e.toString());
            return false;
        }    
    }
        public boolean addSubCategory(SubCategory subcat) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(subcat);
            session.beginTransaction().commit();
            session.close();
            return true;
        } catch (HibernateException e) 
        {
            System.out.println("Error is:\t"+e.toString());
                    
            return false;
 
        }

    }
        
   public boolean addProduct(Product product) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(product);
            session.beginTransaction().commit();
            session.close();
            return true;
        } catch (HibernateException e) 
        {
            System.out.println("Error is:\t"+e.toString());
                    
            return false;

        }

    } 
   
    
    
    
    
    
}
