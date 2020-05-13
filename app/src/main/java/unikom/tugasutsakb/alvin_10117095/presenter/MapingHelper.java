package unikom.tugasutsakb.fauzisunarya_10117110.presenter;

import android.database.Cursor;

import java.util.ArrayList;

import unikom.tugasutsakb.fauzisunarya_10117110.model.Friend;

/** NIM : 10117095
 * Nama : Alvin Lukman Nulhakim
 * Kelas : IF-3
 * Tanggal : 12-Mei-2020**/

public class MapingHelper {

    public static ArrayList<Friend> mapCursorToArrayList(Cursor friendsCursor){
        ArrayList<Friend> friendsList = new ArrayList<>();

        while (friendsCursor.moveToNext()){
            int id  = friendsCursor.getInt(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns._ID));
            String nim = friendsCursor.getString(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.NIM));
            String nama = friendsCursor.getString(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.NAMA));
            String kelas = friendsCursor.getString(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.KELAS));
            String telp = friendsCursor.getString(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.TELPON));
            String email = friendsCursor.getString(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.EMAIL));
            String ig = friendsCursor.getString(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.IG));
            String date = friendsCursor.getString(friendsCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DATE));
            friendsList.add(new Friend(id, nim, nama, kelas, telp, email, ig, date));

        }
        return friendsList;
    }
}
