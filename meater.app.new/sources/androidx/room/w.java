package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.V;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;
import r3.AbstractC4343a;
import u3.C4663a;
import u3.C4665c;
import u3.InterfaceC4669g;
import u3.InterfaceC4670h;
import v3.C4819f;

/* compiled from: RoomDatabase.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b&\u0018\u0000 \u0082\u00012\u00020\u0001:\f\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u001a\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u0019H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H$¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H$¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001b0\u0019H\u0015¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00050'H\u0017¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH'¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000bH\u0017¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u000bH\u0017¢\u0006\u0004\b-\u0010\u0003J+\u0010/\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0012\u00101\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u000100H\u0016¢\u0006\u0004\b/\u00103J#\u0010/\u001a\u0002022\u0006\u0010/\u001a\u0002042\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\b/\u00107J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020.H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000bH\u0017¢\u0006\u0004\b<\u0010\u0003J\u000f\u0010=\u001a\u00020\u000bH\u0017¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u000bH\u0017¢\u0006\u0004\b>\u0010\u0003J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ#\u0010A\u001a\u00028\u0000\"\u0004\b\u0000\u0010C2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000DH\u0016¢\u0006\u0004\bA\u0010EJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020FH\u0014¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LR\u001e\u0010M\u001a\u0004\u0018\u00010F8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bM\u0010N\u0012\u0004\bO\u0010\u0003R\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010$R\u0016\u0010Y\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR$\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010\u001b8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b]\u0010^\u0012\u0004\b_\u0010\u0003RR\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010`2\u001a\u0010a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010`8E@EX\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010b\u001a\u0004\bc\u0010&\"\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001d\u0010n\u001a\b\u0012\u0004\u0012\u00020m0l8G¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR#\u0010r\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00010`8G¢\u0006\f\n\u0004\br\u0010b\u001a\u0004\bs\u0010&R$\u0010t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010bR\u001a\u0010u\u001a\u00020J8VX\u0096\u0004¢\u0006\f\u0012\u0004\bv\u0010\u0003\u001a\u0004\bu\u0010LR\u0017\u0010w\u001a\u00020J8G¢\u0006\f\u0012\u0004\bx\u0010\u0003\u001a\u0004\bw\u0010LR\u0014\u0010{\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010zR\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0081\u0001\u001a\u00020J8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010L¨\u0006\u0089\u0001"}, d2 = {"Landroidx/room/w;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "Lu3/h;", "openHelper", "unwrapOpenHelper", "(Ljava/lang/Class;Lu3/h;)Ljava/lang/Object;", "Loa/F;", "internalBeginTransaction", "internalEndTransaction", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/h;", "configuration", "init", "(Landroidx/room/h;)V", "", "autoMigrationSpecs", "", "Lr3/a;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "config", "createOpenHelper", "(Landroidx/room/h;)Lu3/h;", "Landroidx/room/q;", "createInvalidationTracker", "()Landroidx/room/q;", "getRequiredTypeConverters", "()Ljava/util/Map;", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "clearAllTables", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "", "query", "", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lu3/j;", "Landroid/os/CancellationSignal;", "signal", "(Lu3/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "Lu3/k;", "compileStatement", "(Ljava/lang/String;)Lu3/k;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lu3/g;", "db", "internalInitInvalidationTracker", "(Lu3/g;)V", "", "inTransaction", "()Z", "mDatabase", "Lu3/g;", "getMDatabase$annotations", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "internalOpenHelper", "Lu3/h;", "invalidationTracker", "Landroidx/room/q;", "getInvalidationTracker", "allowMainThreadQueries", "Z", "writeAheadLoggingEnabled", "Landroidx/room/w$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "<set-?>", "Ljava/util/Map;", "getAutoMigrationSpecs", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Landroidx/room/c;", "autoCloser", "Landroidx/room/c;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "backingFieldMap", "getBackingFieldMap", "typeConverters", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Lu3/h;", "isMainThread$room_runtime_release", "isMainThread", "Companion", "a", "b", "c", "d", "e", "f", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class w {
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private C2173c autoCloser;
    private final Map<String, Object> backingFieldMap;
    private InterfaceC4670h internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile InterfaceC4669g mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final q invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010-R\u0016\u0010:\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010-R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u0017R\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Landroidx/room/w$a;", "Landroidx/room/w;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "", "Lr3/a;", "migrations", "a", "([Lr3/a;)Landroidx/room/w$a;", "b", "()Landroidx/room/w$a;", "c", "()Landroidx/room/w;", "Landroid/content/Context;", "Ljava/lang/Class;", "Ljava/lang/String;", "", "Landroidx/room/w$b;", "d", "Ljava/util/List;", "callbacks", "e", "typeConverters", "f", "autoMigrationSpecs", "Ljava/util/concurrent/Executor;", "g", "Ljava/util/concurrent/Executor;", "queryExecutor", "h", "transactionExecutor", "Lu3/h$c;", "i", "Lu3/h$c;", "factory", "", "j", "Z", "allowMainThreadQueries", "Landroidx/room/w$d;", "k", "Landroidx/room/w$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "m", "requireMigration", "n", "allowDestructiveMigrationOnDowngrade", "", "o", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "p", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Landroidx/room/w$e;", "q", "Landroidx/room/w$e;", "migrationContainer", "", "", "r", "Ljava/util/Set;", "migrationsNotRequiredFrom", "s", "migrationStartAndEndVersions", "t", "copyFromAssetPath", "Ljava/io/File;", "u", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "v", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a<T extends w> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<T> klass;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<b> callbacks;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<Object> typeConverters;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private List<Object> autoMigrationSpecs;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Executor queryExecutor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Executor transactionExecutor;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4670h.c factory;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean allowMainThreadQueries;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private d journalMode;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Intent multiInstanceInvalidationIntent;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean requireMigration;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationOnDowngrade;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private long autoCloseTimeout;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private TimeUnit autoCloseTimeUnit;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final e migrationContainer;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Set<Integer> migrationsNotRequiredFrom;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private Set<Integer> migrationStartAndEndVersions;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private String copyFromAssetPath;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private File copyFromFile;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private Callable<InputStream> copyFromInputStream;

        public a(Context context, Class<T> klass, String str) {
            C3862t.g(context, "context");
            C3862t.g(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = d.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new e();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        public a<T> a(AbstractC4343a... migrations) {
            C3862t.g(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (AbstractC4343a abstractC4343a : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                C3862t.d(set);
                set.add(Integer.valueOf(abstractC4343a.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                C3862t.d(set2);
                set2.add(Integer.valueOf(abstractC4343a.endVersion));
            }
            this.migrationContainer.b((AbstractC4343a[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a<T> b() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T c() {
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorG = o.c.g();
                this.transactionExecutor = executorG;
                this.queryExecutor = executorG;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                C3862t.d(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            InterfaceC4670h.c e10 = this.factory;
            if (e10 == null) {
                e10 = new C4819f();
            }
            if (e10 != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.queryExecutor;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    e10 = new C2175e(e10, new C2173c(j10, timeUnit, executor2));
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i11 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    e10 = new E(str, file, callable, e10);
                }
            } else {
                e10 = null;
            }
            InterfaceC4670h.c cVar = e10;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.context;
            String str2 = this.name;
            e eVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z10 = this.allowMainThreadQueries;
            d dVarN = this.journalMode.n(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C2178h c2178h = new C2178h(context, str2, cVar, eVar, list, z10, dVarN, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, null, this.typeConverters, this.autoMigrationSpecs);
            T t10 = (T) v.b(this.klass, "_Impl");
            t10.init(c2178h);
            return t10;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/room/w$b;", "", "<init>", "()V", "Lu3/g;", "db", "Loa/F;", "a", "(Lu3/g;)V", "c", "b", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public void a(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
        }

        public void b(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
        }

        public void c(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Landroidx/room/w$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/app/ActivityManager;", "activityManager", "", "j", "(Landroid/app/ActivityManager;)Z", "Landroid/content/Context;", "context", "n", "(Landroid/content/Context;)Landroidx/room/w$d;", "B", "C", "D", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean j(ActivityManager activityManager) {
            return C4665c.b(activityManager);
        }

        public final d n(Context context) {
            C3862t.g(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || j(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00170\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006#"}, d2 = {"Landroidx/room/w$e;", "", "<init>", "()V", "Lr3/a;", "migration", "Loa/F;", "a", "(Lr3/a;)V", "", "result", "", "upgrade", "", "start", "end", "", "e", "(Ljava/util/List;ZII)Ljava/util/List;", "", "migrations", "b", "([Lr3/a;)V", "", "f", "()Ljava/util/Map;", "d", "(II)Ljava/util/List;", "startVersion", "endVersion", "c", "(II)Z", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<Integer, TreeMap<Integer, AbstractC4343a>> migrations = new LinkedHashMap();

        private final void a(AbstractC4343a migration) {
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            Map<Integer, TreeMap<Integer, AbstractC4343a>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, AbstractC4343a> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, AbstractC4343a> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<r3.AbstractC4343a> e(java.util.List<r3.AbstractC4343a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, r3.a>> r0 = r6.migrations
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                kotlin.jvm.internal.C3862t.f(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                kotlin.jvm.internal.C3862t.f(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                kotlin.jvm.internal.C3862t.d(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.w.e.e(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(AbstractC4343a... migrations) {
            C3862t.g(migrations, "migrations");
            for (AbstractC4343a abstractC4343a : migrations) {
                a(abstractC4343a);
            }
        }

        public final boolean c(int startVersion, int endVersion) {
            Map<Integer, Map<Integer, AbstractC4343a>> mapF = f();
            if (!mapF.containsKey(Integer.valueOf(startVersion))) {
                return false;
            }
            Map<Integer, AbstractC4343a> mapH = mapF.get(Integer.valueOf(startVersion));
            if (mapH == null) {
                mapH = M.h();
            }
            return mapH.containsKey(Integer.valueOf(endVersion));
        }

        public List<AbstractC4343a> d(int start, int end) {
            if (start == end) {
                return kotlin.collections.r.m();
            }
            return e(new ArrayList(), end > start, start, end);
        }

        public Map<Integer, Map<Integer, AbstractC4343a>> f() {
            return this.migrations;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/w$f;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f {
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/g;", "it", "", "a", "(Lu3/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.l<InterfaceC4669g, Object> {
        g() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4669g it) {
            C3862t.g(it, "it");
            w.this.internalBeginTransaction();
            return null;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/g;", "it", "", "a", "(Lu3/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.l<InterfaceC4669g, Object> {
        h() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4669g it) {
            C3862t.g(it, "it");
            w.this.internalEndTransaction();
            return null;
        }
    }

    public w() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C3862t.f(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        InterfaceC4669g writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().x(writableDatabase);
        if (writableDatabase.l1()) {
            writableDatabase.x0();
        } else {
            writableDatabase.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().F0();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().o();
    }

    public static /* synthetic */ Cursor query$default(w wVar, u3.j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return wVar.query(jVar, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> clazz, InterfaceC4670h openHelper) {
        if (clazz.isInstance(openHelper)) {
            return openHelper;
        }
        if (openHelper instanceof InterfaceC2179i) {
            return (T) unwrapOpenHelper(clazz, ((InterfaceC2179i) openHelper).getDelegate());
        }
        return null;
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @InterfaceC4156a
    public void beginTransaction() {
        assertNotMainThread();
        C2173c c2173c = this.autoCloser;
        if (c2173c == null) {
            internalBeginTransaction();
        } else {
            c2173c.g(new g());
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            C3862t.f(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().u();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public u3.k compileStatement(String sql) {
        C3862t.g(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().T(sql);
    }

    protected abstract q createInvalidationTracker();

    protected abstract InterfaceC4670h createOpenHelper(C2178h config);

    @InterfaceC4156a
    public void endTransaction() {
        C2173c c2173c = this.autoCloser;
        if (c2173c == null) {
            internalEndTransaction();
        } else {
            c2173c.g(new h());
        }
    }

    protected final Map<Class<Object>, Object> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<AbstractC4343a> getAutoMigrations(Map<Class<Object>, Object> autoMigrationSpecs) {
        C3862t.g(autoMigrationSpecs, "autoMigrationSpecs");
        return kotlin.collections.r.m();
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        C3862t.f(lock, "readWriteLock.readLock()");
        return lock;
    }

    public q getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public InterfaceC4670h getOpenHelper() {
        InterfaceC4670h interfaceC4670h = this.internalOpenHelper;
        if (interfaceC4670h != null) {
            return interfaceC4670h;
        }
        C3862t.u("internalOpenHelper");
        return null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        C3862t.u("internalQueryExecutor");
        return null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return V.d();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return M.h();
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        C3862t.u("internalTransactionExecutor");
        return null;
    }

    public <T> T getTypeConverter(Class<T> klass) {
        C3862t.g(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().e1();
    }

    public void init(C2178h configuration) {
        C3862t.g(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<Object> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i10));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (AbstractC4343a abstractC4343a : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.migrationContainer.c(abstractC4343a.startVersion, abstractC4343a.endVersion)) {
                        configuration.migrationContainer.b(abstractC4343a);
                    }
                }
                D d10 = (D) unwrapOpenHelper(D.class, getOpenHelper());
                if (d10 != null) {
                    d10.d(configuration);
                }
                C2174d c2174d = (C2174d) unwrapOpenHelper(C2174d.class, getOpenHelper());
                if (c2174d != null) {
                    this.autoCloser = c2174d.autoCloser;
                    getInvalidationTracker().r(c2174d.autoCloser);
                }
                boolean z10 = configuration.journalMode == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z10);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new I(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z10;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().s(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    size3 = i13;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void internalInitInvalidationTracker(InterfaceC4669g db2) {
        C3862t.g(db2, "db");
        getInvalidationTracker().l(db2);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        C2173c c2173c = this.autoCloser;
        if (c2173c != null) {
            zIsOpen = c2173c.l();
        } else {
            InterfaceC4669g interfaceC4669g = this.mDatabase;
            if (interfaceC4669g == null) {
                boolValueOf = null;
                return C3862t.b(boolValueOf, Boolean.TRUE);
            }
            zIsOpen = interfaceC4669g.isOpen();
        }
        boolValueOf = Boolean.valueOf(zIsOpen);
        return C3862t.b(boolValueOf, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        InterfaceC4669g interfaceC4669g = this.mDatabase;
        return interfaceC4669g != null && interfaceC4669g.isOpen();
    }

    public final Cursor query(u3.j query) {
        C3862t.g(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(Runnable body) {
        C3862t.g(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    protected final void setAutoMigrationSpecs(Map<Class<Object>, Object> map) {
        C3862t.g(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @InterfaceC4156a
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().u0();
    }

    public Cursor query(String query, Object[] args) {
        C3862t.g(query, "query");
        return getOpenHelper().getWritableDatabase().c1(new C4663a(query, args));
    }

    public Cursor query(u3.j query, CancellationSignal signal) {
        C3862t.g(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().getWritableDatabase().r1(query, signal);
        }
        return getOpenHelper().getWritableDatabase().c1(query);
    }

    public <V> V runInTransaction(Callable<V> body) {
        C3862t.g(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }

    @InterfaceC4156a
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @InterfaceC4156a
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }
}
