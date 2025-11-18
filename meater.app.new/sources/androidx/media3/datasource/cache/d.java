package androidx.media3.datasource.cache;

import X1.C1804a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: CacheFileMetadataIndex.java */
/* loaded from: classes.dex */
final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f26243c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    private final Z1.a f26244a;

    /* renamed from: b, reason: collision with root package name */
    private String f26245b;

    public d(Z1.a aVar) {
        this.f26244a = aVar;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor c() {
        C1804a.e(this.f26245b);
        return this.f26244a.getReadableDatabase().query(this.f26245b, f26243c, null, null, null, null, null);
    }

    private static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map<String, c> b() throws DatabaseIOException {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put((String) C1804a.e(cursorC.getString(0)), new c(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } finally {
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void e(long j10) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j10);
            this.f26245b = d(hexString);
            if (Z1.c.b(this.f26244a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f26244a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    Z1.c.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f26245b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f26245b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void f(String str) throws DatabaseIOException {
        C1804a.e(this.f26245b);
        try {
            this.f26244a.getWritableDatabase().delete(this.f26245b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void g(Set<String> set) throws DatabaseIOException {
        C1804a.e(this.f26245b);
        try {
            SQLiteDatabase writableDatabase = this.f26244a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f26245b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void h(String str, long j10, long j11) throws DatabaseIOException, SQLException {
        C1804a.e(this.f26245b);
        try {
            SQLiteDatabase writableDatabase = this.f26244a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f26245b, null, contentValues);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
