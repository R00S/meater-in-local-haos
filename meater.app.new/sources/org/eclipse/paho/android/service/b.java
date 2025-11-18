package org.eclipse.paho.android.service;

import Fc.m;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.UUID;
import org.eclipse.paho.android.service.c;

/* compiled from: DatabaseMessageStore.java */
/* loaded from: classes3.dex */
class b implements org.eclipse.paho.android.service.c {

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f47238a = null;

    /* renamed from: b, reason: collision with root package name */
    private c f47239b;

    /* renamed from: c, reason: collision with root package name */
    private Ec.d f47240c;

    /* compiled from: DatabaseMessageStore.java */
    class a implements Iterator<c.a> {

        /* renamed from: B, reason: collision with root package name */
        private final Cursor f47241B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f47242C;

        /* renamed from: D, reason: collision with root package name */
        private final String[] f47243D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f47244E;

        a(String str) {
            this.f47244E = str;
            String[] strArr = {str};
            this.f47243D = strArr;
            b.this.f47238a = b.this.f47239b.getWritableDatabase();
            if (str == null) {
                this.f47241B = b.this.f47238a.query("MqttArrivedMessageTable", null, null, null, null, null, "mtimestamp ASC");
            } else {
                this.f47241B = b.this.f47238a.query("MqttArrivedMessageTable", null, "clientHandle=?", strArr, null, null, "mtimestamp ASC");
            }
            this.f47242C = this.f47241B.moveToFirst();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c.a next() {
            Cursor cursor = this.f47241B;
            String string = cursor.getString(cursor.getColumnIndex("messageId"));
            Cursor cursor2 = this.f47241B;
            String string2 = cursor2.getString(cursor2.getColumnIndex("clientHandle"));
            Cursor cursor3 = this.f47241B;
            String string3 = cursor3.getString(cursor3.getColumnIndex("destinationName"));
            Cursor cursor4 = this.f47241B;
            byte[] blob = cursor4.getBlob(cursor4.getColumnIndex("payload"));
            Cursor cursor5 = this.f47241B;
            int i10 = cursor5.getInt(cursor5.getColumnIndex("qos"));
            Cursor cursor6 = this.f47241B;
            boolean z10 = Boolean.parseBoolean(cursor6.getString(cursor6.getColumnIndex("retained")));
            Cursor cursor7 = this.f47241B;
            boolean z11 = Boolean.parseBoolean(cursor7.getString(cursor7.getColumnIndex("duplicate")));
            d dVar = new d(b.this, blob);
            dVar.j(i10);
            dVar.k(z10);
            dVar.f(z11);
            this.f47242C = this.f47241B.moveToNext();
            return new C0656b(b.this, string, string2, string3, dVar);
        }

        protected void finalize() throws Throwable {
            this.f47241B.close();
            super.finalize();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f47242C) {
                this.f47241B.close();
            }
            return this.f47242C;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: DatabaseMessageStore.java */
    /* renamed from: org.eclipse.paho.android.service.b$b, reason: collision with other inner class name */
    private class C0656b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f47246a;

        /* renamed from: b, reason: collision with root package name */
        private final String f47247b;

        /* renamed from: c, reason: collision with root package name */
        private final m f47248c;

        C0656b(b bVar, String str, String str2, String str3, m mVar) {
            this.f47246a = str;
            this.f47247b = str3;
            this.f47248c = mVar;
        }

        @Override // org.eclipse.paho.android.service.c.a
        public m a() {
            return this.f47248c;
        }

        @Override // org.eclipse.paho.android.service.c.a
        public String b() {
            return this.f47246a;
        }

        @Override // org.eclipse.paho.android.service.c.a
        public String c() {
            return this.f47247b;
        }
    }

    /* compiled from: DatabaseMessageStore.java */
    private static class c extends SQLiteOpenHelper {

        /* renamed from: B, reason: collision with root package name */
        private Ec.d f47249B;

        public c(Ec.d dVar, Context context) {
            super(context, "mqttAndroidService.db", (SQLiteDatabase.CursorFactory) null, 1);
            this.f47249B = dVar;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            this.f47249B.b("MQTTDatabaseHelper", "onCreate {CREATE TABLE MqttArrivedMessageTable(messageId TEXT PRIMARY KEY, clientHandle TEXT, destinationName TEXT, payload BLOB, qos INTEGER, retained TEXT, duplicate TEXT, mtimestamp INTEGER);}");
            try {
                sQLiteDatabase.execSQL("CREATE TABLE MqttArrivedMessageTable(messageId TEXT PRIMARY KEY, clientHandle TEXT, destinationName TEXT, payload BLOB, qos INTEGER, retained TEXT, duplicate TEXT, mtimestamp INTEGER);");
                this.f47249B.b("MQTTDatabaseHelper", "created the table");
            } catch (SQLException e10) {
                this.f47249B.c("MQTTDatabaseHelper", "onCreate", e10);
                throw e10;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
            this.f47249B.b("MQTTDatabaseHelper", "onUpgrade");
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS MqttArrivedMessageTable");
                onCreate(sQLiteDatabase);
                this.f47249B.b("MQTTDatabaseHelper", "onUpgrade complete");
            } catch (SQLException e10) {
                this.f47249B.c("MQTTDatabaseHelper", "onUpgrade", e10);
                throw e10;
            }
        }
    }

    /* compiled from: DatabaseMessageStore.java */
    private class d extends m {
        public d(b bVar, byte[] bArr) {
            super(bArr);
        }

        @Override // Fc.m
        protected void f(boolean z10) {
            super.f(z10);
        }
    }

    public b(MqttService mqttService, Context context) {
        this.f47239b = null;
        this.f47240c = mqttService;
        this.f47239b = new c(this.f47240c, context);
        this.f47240c.b("DatabaseMessageStore", "DatabaseMessageStore<init> complete");
    }

    private int h(String str) {
        Cursor cursorQuery = this.f47238a.query("MqttArrivedMessageTable", new String[]{"messageId"}, "clientHandle=?", new String[]{str}, null, null, null);
        int i10 = cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        cursorQuery.close();
        return i10;
    }

    @Override // org.eclipse.paho.android.service.c
    public Iterator<c.a> a(String str) {
        return new a(str);
    }

    @Override // org.eclipse.paho.android.service.c
    public String b(String str, String str2, m mVar) throws SQLException {
        this.f47238a = this.f47239b.getWritableDatabase();
        this.f47240c.b("DatabaseMessageStore", "storeArrived{" + str + "}, {" + mVar.toString() + "}");
        byte[] bArrB = mVar.b();
        int iC = mVar.c();
        boolean zE = mVar.e();
        boolean zD = mVar.d();
        ContentValues contentValues = new ContentValues();
        String string = UUID.randomUUID().toString();
        contentValues.put("messageId", string);
        contentValues.put("clientHandle", str);
        contentValues.put("destinationName", str2);
        contentValues.put("payload", bArrB);
        contentValues.put("qos", Integer.valueOf(iC));
        contentValues.put("retained", Boolean.valueOf(zE));
        contentValues.put("duplicate", Boolean.valueOf(zD));
        contentValues.put("mtimestamp", Long.valueOf(System.currentTimeMillis()));
        try {
            this.f47238a.insertOrThrow("MqttArrivedMessageTable", null, contentValues);
            int iH = h(str);
            this.f47240c.b("DatabaseMessageStore", "storeArrived: inserted message with id of {" + string + "} - Number of messages in database for this clientHandle = " + iH);
            return string;
        } catch (SQLException e10) {
            this.f47240c.c("DatabaseMessageStore", "onUpgrade", e10);
            throw e10;
        }
    }

    @Override // org.eclipse.paho.android.service.c
    public boolean c(String str, String str2) {
        this.f47238a = this.f47239b.getWritableDatabase();
        this.f47240c.b("DatabaseMessageStore", "discardArrived{" + str + "}, {" + str2 + "}");
        try {
            int iDelete = this.f47238a.delete("MqttArrivedMessageTable", "messageId=? AND clientHandle=?", new String[]{str2, str});
            if (iDelete == 1) {
                int iH = h(str);
                this.f47240c.b("DatabaseMessageStore", "discardArrived - Message deleted successfully. - messages in db for this clientHandle " + iH);
                return true;
            }
            this.f47240c.a("DatabaseMessageStore", "discardArrived - Error deleting message {" + str2 + "} from database: Rows affected = " + iDelete);
            return false;
        } catch (SQLException e10) {
            this.f47240c.c("DatabaseMessageStore", "discardArrived", e10);
            throw e10;
        }
    }

    @Override // org.eclipse.paho.android.service.c
    public void close() {
        SQLiteDatabase sQLiteDatabase = this.f47238a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    @Override // org.eclipse.paho.android.service.c
    public void d(String str) {
        int iDelete;
        this.f47238a = this.f47239b.getWritableDatabase();
        String[] strArr = {str};
        if (str == null) {
            this.f47240c.b("DatabaseMessageStore", "clearArrivedMessages: clearing the table");
            iDelete = this.f47238a.delete("MqttArrivedMessageTable", null, null);
        } else {
            this.f47240c.b("DatabaseMessageStore", "clearArrivedMessages: clearing the table of " + str + " messages");
            iDelete = this.f47238a.delete("MqttArrivedMessageTable", "clientHandle=?", strArr);
        }
        this.f47240c.b("DatabaseMessageStore", "clearArrivedMessages: rows affected = " + iDelete);
    }
}
