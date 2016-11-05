/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.service;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 *
 * @author PARVINDER
 */
public class ConnectionDB {
    public static   DB ConDB()
    {
    MongoClient mongo=new MongoClient("localhost",27017);
    DB db=mongo.getDB("hello");
    return db;

}}
