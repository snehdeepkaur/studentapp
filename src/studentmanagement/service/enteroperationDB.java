/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.service;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import rascal.service.ConnectionDB;
import template.template;

/**
 *
 * @author HarshDeep Singh
 */
public class enteroperationDB {
    DB db;
 public   enteroperationDB()
    {
        db=ConnectionDB.conDB();
    }
    public void enter_rec(template T)
    {
        DBCollection table=db.getCollection("enter_rec");
        BasicDBObject document=new BasicDBObject();
         document.put("Student id",T.getId());
             document.put("Branch",T.getBranch());
             document.put("sem",T.getSem());
        document.put("subject",T.getSubject());
        document.put("sub code", T.getSub_code());
        document.put("quiz1", T.getQuiz1());
         document.put("MST", T.getMst());
          document.put("quiz2", T.getQuiz2());
           document.put("EST", T.getEst());
            document.put("lab", T.getLab());
             document.put("Total", T.getTotal());
             table.insert(document);
             
    }
    public DBCursor search(String id,String sem)
    {
        DBCollection Table=db.getCollection("enter_rec");
        BasicDBObject search_query=new BasicDBObject();
        search_query.put("Student id", id);
        search_query.put("sem",sem);
        BasicDBList list = new BasicDBList();
        list.add(search_query);
        BasicDBObject search=new BasicDBObject();
        search.put("$and",search_query);
                
        DBCursor cursor=Table.find(search_query);
        return cursor;
    }
    
    public void delete(String c)
    {
        DBCollection table=db.getCollection("enter_rec");
        BasicDBObject searchquery=new BasicDBObject();
        searchquery.put("Student id",c);
        System.out.println(searchquery);
        table.remove(searchquery);
        
    }
    
    
            }
