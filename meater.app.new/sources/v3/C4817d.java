package v3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import u3.C4664b;
import u3.C4666d;
import u3.InterfaceC4669g;
import u3.InterfaceC4670h;
import v3.C4817d;
import w3.C4976a;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 /2\u00020\u0001:\u0003012B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001b\u0010'\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b#\u0010$*\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lv3/d;", "Lu3/h;", "Landroid/content/Context;", "context", "", "name", "Lu3/h$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lu3/h$a;ZZ)V", "enabled", "Loa/F;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "B", "Landroid/content/Context;", "C", "Ljava/lang/String;", "D", "Lu3/h$a;", "E", "Z", "F", "Loa/i;", "Lv3/d$c;", "G", "Loa/i;", "lazyDelegate", "H", "writeAheadLoggingEnabled", "g", "()Lv3/d$c;", "getDelegate$delegate", "(Lv3/d;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lu3/g;", "getWritableDatabase", "()Lu3/g;", "writableDatabase", "I", "a", "b", "c", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4817d implements InterfaceC4670h {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4670h.a callback;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final boolean useNoBackupDirectory;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDataLossOnRecovery;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<c> lazyDelegate;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean writeAheadLoggingEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lv3/d$b;", "", "Lv3/c;", "db", "<init>", "(Lv3/c;)V", "a", "Lv3/c;", "()Lv3/c;", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v3.d$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private C4816c db;

        public b(C4816c c4816c) {
            this.db = c4816c;
        }

        /* renamed from: a, reason: from getter */
        public final C4816c getDb() {
            return this.db;
        }

        public final void b(C4816c c4816c) {
            this.db = c4816c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 @2\u00020\u0001:\u0003AB\u0014B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105¨\u0006C"}, d2 = {"Lv3/d$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "Lv3/d$b;", "dbRef", "Lu3/h$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lv3/d$b;Lu3/h$a;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "f", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "e", "Lu3/g;", "c", "(Z)Lu3/g;", "sqLiteDatabase", "Lv3/c;", "d", "(Landroid/database/sqlite/SQLiteDatabase;)Lv3/c;", "Loa/F;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "B", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "C", "Lv3/d$b;", "getDbRef", "()Lv3/d$b;", "D", "Lu3/h$a;", "getCallback", "()Lu3/h$a;", "E", "Z", "getAllowDataLossOnRecovery", "()Z", "F", "migrated", "Lw3/a;", "G", "Lw3/a;", "lock", "H", "opened", "I", "a", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v3.d$c */
    static final class c extends SQLiteOpenHelper {

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final b dbRef;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4670h.a callback;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final boolean allowDataLossOnRecovery;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private boolean migrated;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final C4976a lock;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private boolean opened;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lv3/d$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lv3/d$c$b;", "callbackName", "", "cause", "<init>", "(Lv3/d$c$b;Ljava/lang/Throwable;)V", "B", "Lv3/d$c$b;", "a", "()Lv3/d$c$b;", "C", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v3.d$c$a */
        private static final class a extends RuntimeException {

            /* renamed from: B, reason: collision with root package name and from kotlin metadata */
            private final b callbackName;

            /* renamed from: C, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                C3862t.g(callbackName, "callbackName");
                C3862t.g(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            /* renamed from: a, reason: from getter */
            public final b getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lv3/d$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v3.d$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv3/d$c$c;", "", "<init>", "()V", "Lv3/d$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lv3/c;", "a", "(Lv3/d$b;Landroid/database/sqlite/SQLiteDatabase;)Lv3/c;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v3.d$c$c, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final C4816c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                C3862t.g(refHolder, "refHolder");
                C3862t.g(sqLiteDatabase, "sqLiteDatabase");
                C4816c db2 = refHolder.getDb();
                if (db2 != null && db2.c(sqLiteDatabase)) {
                    return db2;
                }
                C4816c c4816c = new C4816c(sqLiteDatabase);
                refHolder.b(c4816c);
                return c4816c;
            }

            private Companion() {
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v3.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0736d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51276a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f51276a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final InterfaceC4670h.a callback, boolean z10) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: v3.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C4817d.c.b(callback, dbRef, sQLiteDatabase);
                }
            });
            C3862t.g(context, "context");
            C3862t.g(dbRef, "dbRef");
            C3862t.g(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C3862t.f(str, "randomUUID().toString()");
            }
            this.lock = new C4976a(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(InterfaceC4670h.a callback, b dbRef, SQLiteDatabase dbObj) {
            C3862t.g(callback, "$callback");
            C3862t.g(dbRef, "$dbRef");
            Companion companion = INSTANCE;
            C3862t.f(dbObj, "dbObj");
            callback.c(companion.a(dbRef, dbObj));
        }

        private final SQLiteDatabase e(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                C3862t.f(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            C3862t.f(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase f(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z10 = this.opened;
            if (databaseName != null && !z10 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return e(writable);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return e(writable);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i10 = C0736d.f51276a[aVar.getCallbackName().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return e(writable);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        public final InterfaceC4669g c(boolean writable) throws IOException {
            try {
                this.lock.b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseF = f(writable);
                if (!this.migrated) {
                    C4816c c4816cD = d(sQLiteDatabaseF);
                    this.lock.d();
                    return c4816cD;
                }
                close();
                InterfaceC4669g interfaceC4669gC = c(writable);
                this.lock.d();
                return interfaceC4669gC;
            } catch (Throwable th) {
                this.lock.d();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                C4976a.c(this.lock, false, 1, null);
                super.close();
                this.dbRef.b(null);
                this.opened = false;
            } finally {
                this.lock.d();
            }
        }

        public final C4816c d(SQLiteDatabase sqLiteDatabase) {
            C3862t.g(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.a(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            C3862t.g(db2, "db");
            if (!this.migrated && this.callback.version != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.b(d(db2));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            C3862t.g(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.d(d(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
            C3862t.g(db2, "db");
            this.migrated = true;
            try {
                this.callback.e(d(db2), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            C3862t.g(db2, "db");
            if (!this.migrated) {
                try {
                    this.callback.f(d(db2));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            C3862t.g(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.g(d(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv3/d$c;", "a", "()Lv3/d$c;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v3.d$d, reason: collision with other inner class name */
    static final class C0737d extends AbstractC3864v implements Ba.a<c> {
        C0737d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (C4817d.this.name == null || !C4817d.this.useNoBackupDirectory) {
                cVar = new c(C4817d.this.context, C4817d.this.name, new b(null), C4817d.this.callback, C4817d.this.allowDataLossOnRecovery);
            } else {
                cVar = new c(C4817d.this.context, new File(C4666d.a(C4817d.this.context), C4817d.this.name).getAbsolutePath(), new b(null), C4817d.this.callback, C4817d.this.allowDataLossOnRecovery);
            }
            C4664b.d(cVar, C4817d.this.writeAheadLoggingEnabled);
            return cVar;
        }
    }

    public C4817d(Context context, String str, InterfaceC4670h.a callback, boolean z10, boolean z11) {
        C3862t.g(context, "context");
        C3862t.g(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z10;
        this.allowDataLossOnRecovery = z11;
        this.lazyDelegate = C4165j.a(new C0737d());
    }

    private final c g() {
        return this.lazyDelegate.getValue();
    }

    @Override // u3.InterfaceC4670h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.lazyDelegate.b()) {
            g().close();
        }
    }

    @Override // u3.InterfaceC4670h
    /* renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // u3.InterfaceC4670h
    public InterfaceC4669g getWritableDatabase() {
        return g().c(true);
    }

    @Override // u3.InterfaceC4670h
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.b()) {
            C4664b.d(g(), enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }
}
