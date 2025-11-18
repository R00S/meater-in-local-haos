package p024c.p082u.p083a.p084g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1009c;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* renamed from: c.u.a.g.b */
/* loaded from: classes.dex */
class C1014b implements InterfaceC1009c {

    /* renamed from: f */
    private final Context f6705f;

    /* renamed from: g */
    private final String f6706g;

    /* renamed from: h */
    private final InterfaceC1009c.a f6707h;

    /* renamed from: i */
    private final boolean f6708i;

    /* renamed from: j */
    private final Object f6709j = new Object();

    /* renamed from: k */
    private a f6710k;

    /* renamed from: l */
    private boolean f6711l;

    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* renamed from: c.u.a.g.b$a */
    static class a extends SQLiteOpenHelper {

        /* renamed from: f */
        final C1013a[] f6712f;

        /* renamed from: g */
        final InterfaceC1009c.a f6713g;

        /* renamed from: h */
        private boolean f6714h;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: c.u.a.g.b$a$a, reason: collision with other inner class name */
        class C11449a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ InterfaceC1009c.a f6715a;

            /* renamed from: b */
            final /* synthetic */ C1013a[] f6716b;

            C11449a(InterfaceC1009c.a aVar, C1013a[] c1013aArr) {
                this.f6715a = aVar;
                this.f6716b = c1013aArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f6715a.m6464c(a.m6474b(this.f6716b, sQLiteDatabase));
            }
        }

        a(Context context, String str, C1013a[] c1013aArr, InterfaceC1009c.a aVar) {
            super(context, str, null, aVar.f6689a, new C11449a(aVar, c1013aArr));
            this.f6713g = aVar;
            this.f6712f = c1013aArr;
        }

        /* renamed from: b */
        static C1013a m6474b(C1013a[] c1013aArr, SQLiteDatabase sQLiteDatabase) {
            C1013a c1013a = c1013aArr[0];
            if (c1013a == null || !c1013a.m6472a(sQLiteDatabase)) {
                c1013aArr[0] = new C1013a(sQLiteDatabase);
            }
            return c1013aArr[0];
        }

        /* renamed from: a */
        C1013a m6475a(SQLiteDatabase sQLiteDatabase) {
            return m6474b(this.f6712f, sQLiteDatabase);
        }

        /* renamed from: c */
        synchronized InterfaceC1008b m6476c() {
            this.f6714h = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f6714h) {
                return m6475a(writableDatabase);
            }
            close();
            return m6476c();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f6712f[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f6713g.mo4639b(m6475a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f6713g.mo4640d(m6475a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f6714h = true;
            this.f6713g.mo4641e(m6475a(sQLiteDatabase), i2, i3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f6714h) {
                return;
            }
            this.f6713g.mo4642f(m6475a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f6714h = true;
            this.f6713g.mo4643g(m6475a(sQLiteDatabase), i2, i3);
        }
    }

    C1014b(Context context, String str, InterfaceC1009c.a aVar, boolean z) {
        this.f6705f = context;
        this.f6706g = str;
        this.f6707h = aVar;
        this.f6708i = z;
    }

    /* renamed from: a */
    private a m6473a() {
        a aVar;
        synchronized (this.f6709j) {
            if (this.f6710k == null) {
                C1013a[] c1013aArr = new C1013a[1];
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 23 || this.f6706g == null || !this.f6708i) {
                    this.f6710k = new a(this.f6705f, this.f6706g, c1013aArr, this.f6707h);
                } else {
                    this.f6710k = new a(this.f6705f, new File(this.f6705f.getNoBackupFilesDir(), this.f6706g).getAbsolutePath(), c1013aArr, this.f6707h);
                }
                if (i2 >= 16) {
                    this.f6710k.setWriteAheadLoggingEnabled(this.f6711l);
                }
            }
            aVar = this.f6710k;
        }
        return aVar;
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m6473a().close();
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c
    public String getDatabaseName() {
        return this.f6706g;
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c
    /* renamed from: s0 */
    public InterfaceC1008b mo4666s0() {
        return m6473a().m6476c();
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f6709j) {
            a aVar = this.f6710k;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f6711l = z;
        }
    }
}
