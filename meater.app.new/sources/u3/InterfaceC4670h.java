package u3;

import Ub.n;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SupportSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lu3/h;", "Ljava/io/Closeable;", "", "enabled", "Loa/F;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lu3/g;", "getWritableDatabase", "()Lu3/g;", "writableDatabase", "a", "b", "c", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4670h extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lu3/h$a;", "", "", "version", "<init>", "(I)V", "", "fileName", "Loa/F;", "a", "(Ljava/lang/String;)V", "Lu3/g;", "db", "b", "(Lu3/g;)V", "d", "oldVersion", "newVersion", "g", "(Lu3/g;II)V", "e", "f", "c", "I", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u3.h$a */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int version;

        public a(int i10) {
            this.version = i10;
        }

        private final void a(String fileName) {
            if (n.t(fileName, ":memory:", true)) {
                return;
            }
            int length = fileName.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = C3862t.i(fileName.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (fileName.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + fileName);
            try {
                C4664b.a(new File(fileName));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
        }

        public void c(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String strH = db2.h();
                if (strH != null) {
                    a(strH);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listF = null;
            try {
                try {
                    listF = db2.F();
                } finally {
                    if (listF != null) {
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            C3862t.f(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String strH2 = db2.h();
                        if (strH2 != null) {
                            a(strH2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
            }
            if (listF != null) {
                return;
            }
        }

        public abstract void d(InterfaceC4669g db2);

        public abstract void e(InterfaceC4669g db2, int oldVersion, int newVersion);

        public void f(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
        }

        public abstract void g(InterfaceC4669g db2, int oldVersion, int newVersion);
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lu3/h$b;", "", "Landroid/content/Context;", "context", "", "name", "Lu3/h$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lu3/h$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lu3/h$a;", "d", "Z", "e", "f", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u3.h$b */
    public static final class b {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final a callback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean useNoBackupDirectory;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final boolean allowDataLossOnRecovery;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lu3/h$b$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lu3/h$b;", "a", "()Lu3/h$b;", "", "name", "c", "(Ljava/lang/String;)Lu3/h$b$a;", "Lu3/h$a;", "callback", "b", "(Lu3/h$a;)Lu3/h$b$a;", "Landroid/content/Context;", "Ljava/lang/String;", "Lu3/h$a;", "", "d", "Z", "useNoBackupDirectory", "e", "allowDataLossOnRecovery", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: u3.h$b$a */
        public static class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Context context;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private a callback;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private boolean useNoBackupDirectory;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private boolean allowDataLossOnRecovery;

            public a(Context context) {
                C3862t.g(context, "context");
                this.context = context;
            }

            public b a() {
                String str;
                a aVar = this.callback;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.context, this.name, aVar, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            public a b(a callback) {
                C3862t.g(callback, "callback");
                this.callback = callback;
                return this;
            }

            public a c(String name) {
                this.name = name;
                return this;
            }
        }

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu3/h$b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lu3/h$b$a;", "a", "(Landroid/content/Context;)Lu3/h$b$a;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: u3.h$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final a a(Context context) {
                C3862t.g(context, "context");
                return new a(context);
            }

            private Companion() {
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            C3862t.g(context, "context");
            C3862t.g(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z10;
            this.allowDataLossOnRecovery = z11;
        }

        public static final a a(Context context) {
            return INSTANCE.a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lu3/h$c;", "", "Lu3/h$b;", "configuration", "Lu3/h;", "a", "(Lu3/h$b;)Lu3/h;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u3.h$c */
    public interface c {
        InterfaceC4670h a(b configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    InterfaceC4669g getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean enabled);
}
