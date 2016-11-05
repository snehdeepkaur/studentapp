/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.service;

//import rascal.service.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

/**
 *
 * @author PARVINDER
 */
public class viewoperationDB {
     DB db;
 public   viewoperationDB()
    {
    db=ConnectionDB.ConDB();
    }
 public DBCursor searchviewrecord(int studentid)
 {
 System.out.println(studentid);
 //System.out.println(classrollno);
 DBCollection table=db.getCollection("hello");
 BasicDBObject searchquery=new  BasicDBObject();
 searchquery.put("ID",studentid);
 //searchquery.pur("Classrollno",classrollno);
 DBCursor cursor=table.find(searchquery);
 return cursor;
}
}
