package unikom.tugasutsakb.fauzisunarya_10117110.presenter;

import android.provider.BaseColumns;

/** NIM : 10117095
 * Nama : Alvin Lukman Nulhakim
 * Kelas : IF-3
 * Tanggal : 12-Mei-2020**/
public class DatabaseContract {

    static String TABLE_NAME = "friend";

    public static final class NoteColumns implements BaseColumns{
       public static String NIM = "nim";
       public static String NAMA = "nama";
       public static String KELAS = "kelas";
       public static String TELPON = "telpon";
       public static String EMAIL = "email";
       public static String IG = "ig";
       public static String DATE = "date";
    }
}
