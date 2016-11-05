/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import rascal.service.ConnectionDB;
import studentmanagement.StudentManagementAboutBox;
import studentmanagement.template.fee_detailtemplate;


/**
 *
 * @author PARVINDER
 */
public class feesOperationDB {
     DB db;
 public   feesOperationDB()
    {
    db=ConnectionDB.conDB();
    }  
 public void Savefee_detail(fee_detailtemplate T)
         
 {
      DBCollection table=db.getCollection("fees");
        BasicDBObject document=new BasicDBObject();
        document.put("Course",T.getCourse()); 
       document.put("Branch",T.getBranch()); 
       document.put("Student_ID",T.getStudentid());
          document.put("Semester",T.getSemester());
      document.put("Hosteller",T.getHostellerfee());
      document.put("Semesterfee", T.getSemesterfee());
      document.put("type", T.getType());
        table.insert(document);     
         
 }  

public void updatefee_detail(fee_detailtemplate T)
{
DBCollection table=db.getCollection("fees");
        BasicDBObject query=new BasicDBObject();
 
        query.put("Student_ID",T.getStudentid());
      BasicDBObject document=new BasicDBObject();
      document.put("Branch", T.getBranch());
document.put("Course", T.getCourse());
document.put("Semester", T.getSemester());
document.put("Hosteller", T.getHostellerfee());
document.put("Semesterfee",T.getSemesterfee());
document.put("type",T.getType());


BasicDBObject UpdateObj=new BasicDBObject();
UpdateObj.put("$set",document);
table.update(query, UpdateObj);
//table.update(query, UpdateObj);
}
public DBCursor searchfee_detail(int Studentid)
{
    DBCollection table=db.getCollection("fees");
 BasicDBObject searchquery=new  BasicDBObject();
 searchquery.put("Student_ID",Studentid);
 //searchquery.pur("Classrollno",classrollno);
 DBCursor cursor=table.find(searchquery);
 return cursor;
}

   
}