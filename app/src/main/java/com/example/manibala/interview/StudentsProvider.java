/*
package com.example.manibala.interview;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

import java.util.HashMap;

public class StudentsProvider extends ContentProvider {
    static final String PROVIDER_NAME = "com.example.manibala.interview.StudentsProvider";
    static final String URL = "content://" + PROVIDER_NAME + "/students";
    static final Uri CONTENT_URI = Uri.parse(URL);

    static final String _ID = "_id";
    static final String NAME="name";
    static final String GRADE="grade";

    private static HashMap<String, String> STUDENT_PROJECTION_MAP;

    static final int STUDENTS =1;
    static final int STUDENTS_ID =2;

    static final UriMatcher uriMatcher;
    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(PROVIDER_NAME, "students", STUDENTS);
        uriMatcher.addURI(PROVIDER_NAME, "students/#", STUDENTS_ID);
    }
    //Database specific constant declarations
    private SQLiteDatabase db;
    static final String DATABASE_NAME = "College";
    static final String STUDENTS_TABLE_NAME="students";
    static final int DATABASE_VERSION =1;
    static final String CREATE_DB_TABLE = "CREATE TABLE" + STUDENTS_TABLE_NAME + "(_id INTEGER PRIMARY KEY AUTOINCREMENT," + "name TEXT NOT NULL, "
    + "grade TEXT NOT NULL);";
    //helper class that actually creates and manages the providers underlying data repository
    private static class DatabaseHelper extends SQLiteOpenHelper{
        DatabaseHelper(Context context){
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        @Override
        public  void onCreate(SQLiteDatabase db){
            db.execSQL(CREATE_DB_TABLE);
        }
        @Override
       public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
            db.execSQL("Drop table IF EXISTS" + STUDENTS_TABLE_NAME);
        }
    }
    @Override
    public  boolean onCreate(){
        Context context = getContext();
        DatabaseHelper dbHelper = new DatabaseHelper(context);
        //create writable database which will trigger its creation if it does nt already exist
        db = dbHelper.getWritableDatabase();

        return (db==null)? false: true;
    }

    @androidx.annotation.Nullable
    @Override
    public Cursor query(@androidx.annotation.NonNull Uri uri, @androidx.annotation.Nullable String[] projection, @androidx.annotation.Nullable String selection, @androidx.annotation.Nullable String[] selectionArgs, @androidx.annotation.Nullable String sortOrder) {
        return null;
    }

    @androidx.annotation.Nullable
    @Override
    public String getType(@androidx.annotation.NonNull Uri uri) {
        return null;
    }

    @Override
    public  Uri insert(Uri uri, ContentValues values){
        //add new student record
        long rowId = db.insert(STUDENTS_TABLE_NAME, "", values);
        //if record is added successfully
        if(rowId>0){
            Uri _uri = ContentUris.withAppendedId(CONTENT_URI, rowId);
            getContext().getContentResolver().notifyChange(_uri, null);
            return _uri;
        }
        throw new SQLException("Failed to add a record into" + uri);
    }

    @Override
    public int delete(@androidx.annotation.NonNull Uri uri, @androidx.annotation.Nullable String selection, @androidx.annotation.Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@androidx.annotation.NonNull Uri uri, @androidx.annotation.Nullable ContentValues values, @androidx.annotation.Nullable String selection, @androidx.annotation.Nullable String[] selectionArgs) {
        return 0;
    }
    // @Override
   // public

}
*/
