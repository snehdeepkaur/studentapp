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
 * @author RIIT_comp
 */
public class ViewAttendenceOperationDB {
    DB db;
    public ViewAttendenceOperationDB(){
        db=ConnectionDB.ConDB();
    }
    public DBCursor searchViewAttendencetemplate(String Course,String Branch,String Semester,int Student_ID)
    {
        DBCollection table=db.getCollection("hello");
       BasicDBObject searchquery=new BasicDBObject(); 
        searchquery.put("Course",Course);
        searchquery.put("Branch",Branch);
        searchquery.put("Semester",Semester);
        searchquery.put("Student_ID",Student_ID);
        BasicDBList list=new BasicDBList();
        list.add(searchquery);
        BasicDBObject search=new BasicDBObject();
        search.put("$and",list);
        DBCursor cursor=table.find(search);
        return cursor;
    }

    
   
    }

