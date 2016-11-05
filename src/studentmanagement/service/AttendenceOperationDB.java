/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import rascal.service.ConnectionDB;
import studentmanagement.template.Attendencetemplate;
/**
 *
 * @author RIIT_comp
 */
public class AttendenceOperationDB {
  DB db;
  
  public AttendenceOperationDB()
  {
      db=ConnectionDB.conDB();
  }
  public void Saveadd_attendence(Attendencetemplate T)
  {
      DBCollection table=db.getCollection("hello");
      BasicDBObject document=new BasicDBObject();
      document.put("Course",T.getCourse());
      document.put("Branch",T.getBranch());
      document.put("Student_ID",T.getStudent_ID());
      document.put("Semester",T.getSemester());
      document.put("Attendence",T.getAttendence());
      table.insert(document);
  }
  public void Updateadd_attendence(Attendencetemplate T)
  {
      DBCollection table=db.getCollection("hello");
      BasicDBObject query=new BasicDBObject();
      query.put("Student_ID",T.getStudent_ID());
      BasicDBObject document=new BasicDBObject();
      document.put("Branch",T.getBranch());
      document.put("Semester",T.getSemester());
      document.put("Course",T.getCourse());
      document.put("Attendence",T.getAttendence());
      BasicDBObject UpdateObj=new BasicDBObject();
      UpdateObj.put("$set",document);
      table.update(query,UpdateObj);
  }
  public DBCursor searchadd_attendence(int Student_ID)
  {   System.out.print(Student_ID);
      DBCollection table=db.getCollection("hello");
      BasicDBObject searchquery=new BasicDBObject();
      searchquery.put("Student_ID",Student_ID);
      
      DBCursor Cursor=table.find(searchquery);
      return Cursor;        
              
  }

    
   
    
}
