package p024c.p082u.p083a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportSQLiteOpenHelper.java */
/* renamed from: c.u.a.c */
/* loaded from: classes.dex */
public interface InterfaceC1009c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: c.u.a.c$a */
    public static abstract class a {

        /* renamed from: a */
        public final int f6689a;

        public a(int i2) {
            this.f6689a = i2;
        }

        /* renamed from: a */
        private void m6463a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e2) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e2);
                    }
                }
            } catch (Exception e3) {
                Log.w("SupportSQLite", "delete failed: ", e3);
            }
        }

        /* renamed from: b */
        public void mo4639b(InterfaceC1008b interfaceC1008b) {
        }

        /* renamed from: c */
        public void m6464c(InterfaceC1008b interfaceC1008b) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + interfaceC1008b.mo6455g());
            if (!interfaceC1008b.isOpen()) {
                m6463a(interfaceC1008b.mo6455g());
                return;
            }
            List<Pair<String, String>> listMo6459s = null;
            try {
                try {
                    listMo6459s = interfaceC1008b.mo6459s();
                } finally {
                    if (listMo6459s != null) {
                        Iterator<Pair<String, String>> it = listMo6459s.iterator();
                        while (it.hasNext()) {
                            m6463a((String) it.next().second);
                        }
                    } else {
                        m6463a(interfaceC1008b.mo6455g());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                interfaceC1008b.close();
            } catch (IOException unused2) {
            }
        }

        /* renamed from: d */
        public abstract void mo4640d(InterfaceC1008b interfaceC1008b);

        /* renamed from: e */
        public abstract void mo4641e(InterfaceC1008b interfaceC1008b, int i2, int i3);

        /* renamed from: f */
        public void mo4642f(InterfaceC1008b interfaceC1008b) {
        }

        /* renamed from: g */
        public abstract void mo4643g(InterfaceC1008b interfaceC1008b, int i2, int i3);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: c.u.a.c$b */
    public static class b {

        /* renamed from: a */
        public final Context f6690a;

        /* renamed from: b */
        public final String f6691b;

        /* renamed from: c */
        public final a f6692c;

        /* renamed from: d */
        public final boolean f6693d;

        /* compiled from: SupportSQLiteOpenHelper.java */
        /* renamed from: c.u.a.c$b$a */
        public static class a {

            /* renamed from: a */
            Context f6694a;

            /* renamed from: b */
            String f6695b;

            /* renamed from: c */
            a f6696c;

            /* renamed from: d */
            boolean f6697d;

            a(Context context) {
                this.f6694a = context;
            }

            /* renamed from: a */
            public b m6466a() {
                if (this.f6696c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f6694a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f6697d && TextUtils.isEmpty(this.f6695b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f6694a, this.f6695b, this.f6696c, this.f6697d);
            }

            /* renamed from: b */
            public a m6467b(a aVar) {
                this.f6696c = aVar;
                return this;
            }

            /* renamed from: c */
            public a m6468c(String str) {
                this.f6695b = str;
                return this;
            }

            /* renamed from: d */
            public a m6469d(boolean z) {
                this.f6697d = z;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z) {
            this.f6690a = context;
            this.f6691b = str;
            this.f6692c = aVar;
            this.f6693d = z;
        }

        /* renamed from: a */
        public static a m6465a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: c.u.a.c$c */
    public interface c {
        /* renamed from: a */
        InterfaceC1009c mo4667a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    /* renamed from: s0 */
    InterfaceC1008b mo4666s0();

    void setWriteAheadLoggingEnabled(boolean z);
}
