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
import studentManagement.template.personalinfotemplate;


/**
 *
 * @author PARVINDER
 */
public class newrecordOperationDB {
    DB db;
 public   newrecordOperationDB()
    {
    db=ConnectionDB.conDB();
    }
    public void Savenewrecord1(personalinfotemplate T)
    {
        DBCollection table=db.getCollection("hello");
        BasicDBObject document=new BasicDBObject();
        document.put("Address",T.getAddr());
        document.put("Advisor",T.getAdvisor());
        document.put("Blood",T.getBlood());
        document.put("Branch",T.getBranch());
        document.put("Category",T.getCategory());
        document.put("City",T.getCity());
        document.put("Collegerollno",T.getcollegerollno());
        document.put("Country",T.getCountry());
        document.put("Course",T.getCourse());
        document.put("Day Scholar/Hostler",T.getDay());
        document.put("Dateofbirth",T.getDateofbirth());
        document.put("Fathercontact",T.getFathercont());
        document.put("FEEcategory",T.getFeecategory());
        document.put("FEEcategory1",T.getFeecategory1());
        document.put("FEEcategory2",T.getFeecategory2());
        
        document.put("FEEstatus",T.getFeestatus());
        document.put("feewaiver",T.getFeewaiver());
        document.put("Fathermail",T.getFemail());
                document.put("Fathername",T.getFname());
                document.put("Gender",T.getGender());
                document.put("ID",T.getId());
        document.put("Mothermail",T.getMemail());
        document.put("Month",T.getMonth());
        document.put("Mothername",T.getMname());
        document.put("Mothercontact",T.getMothcont());
       document.put("Name",T.getName());
       document.put("Section",T.getSection());
       document.put("Semester",T.getSemester());
       document.put("State",T.getState());
       document.put("Studentcontact",T.getStucont());
       document.put("Studentmail",T.getStuemail());
       document.put("Universityrollno",T.getUnirollno());
       document.put("Year",T.getYear());
      
       
       
       //  document.put("id",T.getStudent_ID());
        
      //  document.put("name","pari");
      //  document.put("roll no",1421611);
       table.insert(document);
    }
      public void updatenewrecord1(personalinfotemplate T)
    {
        
        
        DBCollection table=db.getCollection("hello");
        BasicDBObject query=new  BasicDBObject();
        query.put("ID",T.getId());
        
        BasicDBObject document=new BasicDBObject();
        document.put("Address",T.getAddr());
        document.put("Advisor",T.getAdvisor());
        document.put("Blood",T.getBlood());
        document.put("Branch",T.getBranch());
        document.put("Category",T.getCategory());
        document.put("City",T.getCity());
        document.put("Collegerollno",T.getcollegerollno());
        document.put("Country",T.getCountry());
        document.put("Course",T.getCourse());
        document.put("Day Scholar/Hostler",T.getDay());
        document.put("Dateofbirth",T.getDateofbirth());
        document.put("Fathercontact",T.getFathercont());
        document.put("FEEcategory",T.getFeecategory());
        document.put("FEEcategory1",T.getFeecategory1());
        document.put("FEEcategory2",T.getFeecategory2());
        
        document.put("FEEstatus",T.getFeestatus());
        document.put("feewaiver",T.getFeewaiver());
        document.put("Fathermail",T.getFemail());
        document.put("Fathername",T.getFname());
        document.put("Gender",T.getGender());
       
        document.put("Mothermail",T.getMemail());
        document.put("Month",T.getMonth());
        document.put("Mothername",T.getMname());
        document.put("Mothercontact",T.getMothcont());
       document.put("Name",T.getName());
       document.put("Section",T.getSection());
       document.put("Semester",T.getSemester());
       document.put("State",T.getState());
       document.put("Studentcontact",T.getStucont());
       document.put("Studentmail",T.getStuemail());
       document.put("Universityrollno",T.getUnirollno());
       document.put("Year",T.getYear());
      
       
       
BasicDBObject UpdateObj=new BasicDBObject();
UpdateObj.put("$set",document);
table.update(query, UpdateObj);
    }



    public DBCursor searchnewrecord1(int studentid)
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