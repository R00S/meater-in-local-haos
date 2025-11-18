package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.w;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u3.InterfaceC4670h;

/* compiled from: DatabaseConfiguration.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010+R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u00105R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u00105R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010-R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u00103R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u00103R\u0014\u0010I\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u00105¨\u0006J"}, d2 = {"Landroidx/room/h;", "", "Landroid/content/Context;", "context", "", "name", "Lu3/h$c;", "sqliteOpenHelperFactory", "Landroidx/room/w$e;", "migrationContainer", "", "Landroidx/room/w$b;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/w$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/w$f;", "prepackagedDatabaseCallback", "typeConverters", "autoMigrationSpecs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lu3/h$c;Landroidx/room/w$e;Ljava/util/List;ZLandroidx/room/w$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/w$f;Ljava/util/List;Ljava/util/List;)V", "fromVersion", "toVersion", "a", "(II)Z", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lu3/h$c;", "d", "Landroidx/room/w$e;", "e", "Ljava/util/List;", "f", "Z", "g", "Landroidx/room/w$d;", "h", "Ljava/util/concurrent/Executor;", "i", "j", "Landroid/content/Intent;", "k", "l", "m", "Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "r", "s", "multiInstanceInvalidation", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2178h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4670h.c sqliteOpenHelperFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final w.e migrationContainer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final List<w.b> callbacks;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean allowMainThreadQueries;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final w.d journalMode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Executor queryExecutor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Executor transactionExecutor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Intent multiInstanceInvalidationServiceIntent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean requireMigration;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> migrationNotRequiredFrom;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String copyFromAssetPath;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final File copyFromFile;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Callable<InputStream> copyFromInputStream;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final List<Object> typeConverters;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final List<Object> autoMigrationSpecs;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final boolean multiInstanceInvalidation;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public C2178h(Context context, String str, InterfaceC4670h.c sqliteOpenHelperFactory, w.e migrationContainer, List<? extends w.b> list, boolean z10, w.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, w.f fVar, List<? extends Object> typeConverters, List<Object> autoMigrationSpecs) {
        C3862t.g(context, "context");
        C3862t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        C3862t.g(migrationContainer, "migrationContainer");
        C3862t.g(journalMode, "journalMode");
        C3862t.g(queryExecutor, "queryExecutor");
        C3862t.g(transactionExecutor, "transactionExecutor");
        C3862t.g(typeConverters, "typeConverters");
        C3862t.g(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z10;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z11;
        this.allowDestructiveMigrationOnDowngrade = z12;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean a(int fromVersion, int toVersion) {
        if ((fromVersion > toVersion && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set<Integer> set = this.migrationNotRequiredFrom;
        return set == null || !set.contains(Integer.valueOf(fromVersion));
    }
}
