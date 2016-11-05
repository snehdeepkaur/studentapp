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

/**
 *
 * @author PARVINDER
 */
public class view1OperationDB {
 DB db;
    public view1OperationDB()
    {
        db=ConnectionDB.ConDB();
    }
    public DBCursor searchview1template(String course,String branch,int sem)
    {
        DBCollection table=db.getCollection("hello");
        BasicDBObject searchquery=new BasicDBObject();
        searchquery.put("Course",course);
        searchquery.put("Branch",branch);
        searchquery.put("Semester",sem);
        BasicDBList list=new BasicDBList();
        list.add(searchquery);
        
        BasicDBObject search=new BasicDBObject();
        search.put("$and",list);
        
        System.out.println(search);
        DBCursor cursor=table.find(search);
        return cursor;
    }
}   

