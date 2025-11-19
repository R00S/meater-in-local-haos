package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.V;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import p.C4189b;
import u3.C4663a;
import u3.InterfaceC4669g;
import za.C5220a;

/* compiled from: InvalidationTracker.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0005?C+-=BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0000¢\u0006\u0004\b(\u0010\u000fJ\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b.\u0010,J\u000f\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\u000fJ#\u00104\u001a\u00020\r2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\rH\u0000¢\u0006\u0004\b7\u0010\u000fJC\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<\"\u0004\b\u0000\u001082\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u0006\u00109\u001a\u00020/2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000:H\u0017¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010DR&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bE\u0010FR\"\u0010K\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010LR\u001a\u0010R\u001a\u00020M8GX\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010SR$\u0010[\u001a\u0004\u0018\u00010U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bN\u0010X\"\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010`R&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020c0b8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\bV\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010hR\u0014\u0010k\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010jR\u0014\u0010l\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010jR\u001a\u0010p\u001a\u00020m8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010n\u0012\u0004\bo\u0010\u000f¨\u0006q"}, d2 = {"Landroidx/room/q;", "", "Landroidx/room/w;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/w;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "Loa/F;", "n", "()V", "Lu3/g;", "db", "", "tableId", "v", "(Lu3/g;I)V", "t", "y", "([Ljava/lang/String;)[Ljava/lang/String;", "names", "q", "Landroidx/room/c;", "autoCloser", "r", "(Landroidx/room/c;)V", "l", "(Lu3/g;)V", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "s", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "u", "Landroidx/room/q$c;", "observer", "c", "(Landroidx/room/q$c;)V", "d", "p", "", "f", "()Z", "o", "tables", "m", "([Ljava/lang/String;)V", "x", "w", "T", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/B;", "e", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/B;", "a", "Landroidx/room/w;", "h", "()Landroidx/room/w;", "b", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "tableIdLookup", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "Landroidx/room/c;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Z", "initialized", "Lu3/k;", "i", "Lu3/k;", "()Lu3/k;", "setCleanupStatement$room_runtime_release", "(Lu3/k;)V", "cleanupStatement", "Landroidx/room/q$b;", "Landroidx/room/q$b;", "observedTableTracker", "Landroidx/room/o;", "Landroidx/room/o;", "invalidationLiveDataContainer", "Lp/b;", "Landroidx/room/q$d;", "Lp/b;", "()Lp/b;", "observerMap", "Landroidx/room/t;", "Landroidx/room/t;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class q {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f29186r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w database;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> shadowTablesMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Set<String>> viewTables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> tableIdLookup;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String[] tablesNames;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C2173c autoCloser;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean pendingRefresh;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile boolean initialized;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile u3.k cleanupStatement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b observedTableTracker;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final o invalidationLiveDataContainer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C4189b<c, d> observerMap;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t multiInstanceInvalidationClient;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object syncTriggersLock;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Object trackerLock;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Runnable refreshRunnable;

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/room/q$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lu3/g;", "database", "Loa/F;", "a", "(Lu3/g;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final void a(InterfaceC4669g database) {
            C3862t.g(database, "database");
            if (database.l1()) {
                database.x0();
            } else {
                database.A();
            }
        }

        public final String b(String tableName, String triggerType) {
            C3862t.g(tableName, "tableName");
            C3862t.g(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private Companion() {
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/room/q$b;", "", "", "tableCount", "<init>", "(I)V", "", "tableIds", "", "b", "([I)Z", "c", "Loa/F;", "d", "()V", "a", "()[I", "", "[J", "getTableObservers", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long[] tableObservers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean[] triggerStates;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int[] triggerStateChanges;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean needsSync;

        public b(int i10) {
            this.tableObservers = new long[i10];
            this.triggerStates = new boolean[i10];
            this.triggerStateChanges = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.needsSync) {
                        return null;
                    }
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.triggerStates;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.triggerStateChanges;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.triggerStateChanges[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.needsSync = false;
                    return (int[]) this.triggerStateChanges.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            C3862t.g(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            this.needsSync = true;
                            z10 = true;
                        }
                    }
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            C3862t.g(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            this.needsSync = true;
                            z10 = true;
                        }
                    }
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                C4153F c4153f = C4153F.f46609a;
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/q$c;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "Loa/F;", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String[] tables;

        public c(String[] tables) {
            C3862t.g(tables, "tables");
            this.tables = tables;
        }

        /* renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> tables);
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/room/q$d;", "", "Landroidx/room/q$c;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/q$c;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "Loa/F;", "b", "(Ljava/util/Set;)V", "tables", "c", "([Ljava/lang/String;)V", "a", "Landroidx/room/q$c;", "getObserver$room_runtime_release", "()Landroidx/room/q$c;", "[I", "()[I", "[Ljava/lang/String;", "d", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c observer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int[] tableIds;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String[] tableNames;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Set<String> singleTableSet;

        public d(c observer, int[] tableIds, String[] tableNames) {
            C3862t.g(observer, "observer");
            C3862t.g(tableIds, "tableIds");
            C3862t.g(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            this.singleTableSet = !(tableNames.length == 0) ? V.c(tableNames[0]) : V.d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        /* renamed from: a, reason: from getter */
        public final int[] getTableIds() {
            return this.tableIds;
        }

        public final void b(Set<Integer> invalidatedTablesIds) {
            Set<String> setD;
            C3862t.g(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setB = V.b();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setB.add(this.tableNames[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setD = V.a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : V.d();
                }
            } else {
                setD = V.d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.observer.c(setD);
        }

        public final void c(String[] tables) {
            Set<String> setD;
            C3862t.g(tables, "tables");
            int length = this.tableNames.length;
            if (length == 0) {
                setD = V.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setD = V.d();
                        break;
                    } else {
                        if (Ub.n.t(tables[i10], this.tableNames[0], true)) {
                            setD = this.singleTableSet;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setB = V.b();
                for (String str : tables) {
                    for (String str2 : this.tableNames) {
                        if (Ub.n.t(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = V.a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.observer.c(setD);
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/room/q$e;", "Landroidx/room/q$c;", "Landroidx/room/q;", "tracker", "delegate", "<init>", "(Landroidx/room/q;Landroidx/room/q$c;)V", "", "", "tables", "Loa/F;", "c", "(Ljava/util/Set;)V", "b", "Landroidx/room/q;", "getTracker", "()Landroidx/room/q;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegateRef", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q tracker;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final WeakReference<c> delegateRef;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q tracker, c delegate) {
            super(delegate.getTables());
            C3862t.g(tracker, "tracker");
            C3862t.g(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        @Override // androidx.room.q.c
        public void c(Set<String> tables) {
            C3862t.g(tables, "tables");
            c cVar = this.delegateRef.get();
            if (cVar == null) {
                this.tracker.p(this);
            } else {
                cVar.c(tables);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/room/q$f", "Ljava/lang/Runnable;", "", "", "a", "()Ljava/util/Set;", "Loa/F;", "run", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements Runnable {
        f() {
        }

        private final Set<Integer> a() {
            q qVar = q.this;
            Set setB = V.b();
            Cursor cursorQuery$default = w.query$default(qVar.getDatabase(), new C4663a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorQuery$default.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorQuery$default.getInt(0)));
                } finally {
                }
            }
            C4153F c4153f = C4153F.f46609a;
            C5220a.a(cursorQuery$default, null);
            Set<Integer> setA = V.a(setB);
            if (!setA.isEmpty()) {
                if (q.this.getCleanupStatement() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                u3.k cleanupStatement = q.this.getCleanupStatement();
                if (cleanupStatement == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cleanupStatement.R();
            }
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<Integer> setD;
            C2173c c2173c;
            C2173c c2173c2;
            Lock closeLock$room_runtime_release = q.this.getDatabase().getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                try {
                } catch (SQLiteException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setD = V.d();
                    closeLock$room_runtime_release.unlock();
                    c2173c = q.this.autoCloser;
                    if (c2173c != null) {
                    }
                } catch (IllegalStateException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    setD = V.d();
                    closeLock$room_runtime_release.unlock();
                    c2173c = q.this.autoCloser;
                    if (c2173c != null) {
                    }
                }
                if (!q.this.f()) {
                    if (c2173c2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!q.this.getPendingRefresh().compareAndSet(true, false)) {
                    closeLock$room_runtime_release.unlock();
                    C2173c c2173c3 = q.this.autoCloser;
                    if (c2173c3 != null) {
                        c2173c3.e();
                        return;
                    }
                    return;
                }
                if (q.this.getDatabase().inTransaction()) {
                    closeLock$room_runtime_release.unlock();
                    C2173c c2173c4 = q.this.autoCloser;
                    if (c2173c4 != null) {
                        c2173c4.e();
                        return;
                    }
                    return;
                }
                InterfaceC4669g writableDatabase = q.this.getDatabase().getOpenHelper().getWritableDatabase();
                writableDatabase.x0();
                try {
                    setD = a();
                    writableDatabase.u0();
                    closeLock$room_runtime_release.unlock();
                    c2173c = q.this.autoCloser;
                    if (c2173c != null) {
                        c2173c.e();
                    }
                    if (setD.isEmpty()) {
                        return;
                    }
                    C4189b<c, d> c4189bI = q.this.i();
                    q qVar = q.this;
                    synchronized (c4189bI) {
                        try {
                            Iterator<Map.Entry<K, V>> it = qVar.i().iterator();
                            while (it.hasNext()) {
                                ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                            }
                            C4153F c4153f = C4153F.f46609a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } finally {
                    writableDatabase.F0();
                }
            } finally {
                closeLock$room_runtime_release.unlock();
                c2173c2 = q.this.autoCloser;
                if (c2173c2 != null) {
                    c2173c2.e();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(w database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        String lowerCase;
        C3862t.g(database, "database");
        C3862t.g(shadowTablesMap, "shadowTablesMap");
        C3862t.g(viewTables, "viewTables");
        C3862t.g(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new b(tableNames.length);
        this.invalidationLiveDataContainer = new o(database);
        this.observerMap = new C4189b<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            C3862t.f(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            C3862t.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i10));
            String str2 = this.shadowTablesMap.get(tableNames[i10]);
            if (str2 != null) {
                C3862t.f(US, "US");
                lowerCase = str2.toLowerCase(US);
                C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            C3862t.f(US2, "US");
            String lowerCase3 = value.toLowerCase(US2);
            C3862t.f(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String key = entry.getKey();
                C3862t.f(US2, "US");
                String lowerCase4 = key.toLowerCase(US2);
                C3862t.f(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase4, M.i(map, lowerCase3));
            }
        }
        this.refreshRunnable = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.d();
            u3.k kVar = this.cleanupStatement;
            if (kVar != null) {
                kVar.close();
                C4153F c4153f = C4153F.f46609a;
            }
        }
    }

    private final String[] q(String[] names) {
        Set setB = V.b();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            C3862t.f(US, "US");
            String lowerCase = str.toLowerCase(US);
            C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                C3862t.f(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                C3862t.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                C3862t.d(set);
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (String[]) V.a(setB).toArray(new String[0]);
    }

    private final void t(InterfaceC4669g db2, int tableId) {
        db2.I("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + tableId + ", 0)");
        String str = this.tablesNames[tableId];
        for (String str2 : f29186r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + INSTANCE.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + tableId + " AND invalidated = 0; END";
            C3862t.f(str3, "StringBuilder().apply(builderAction).toString()");
            db2.I(str3);
        }
    }

    private final void v(InterfaceC4669g db2, int tableId) {
        String str = this.tablesNames[tableId];
        for (String str2 : f29186r) {
            String str3 = "DROP TRIGGER IF EXISTS " + INSTANCE.b(str, str2);
            C3862t.f(str3, "StringBuilder().apply(builderAction).toString()");
            db2.I(str3);
        }
    }

    private final String[] y(String[] tableNames) {
        String[] strArrQ = q(tableNames);
        for (String str : strArrQ) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            C3862t.f(US, "US");
            String lowerCase = str.toLowerCase(US);
            C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return strArrQ;
    }

    @SuppressLint({"RestrictedApi"})
    public void c(c observer) {
        d dVarR;
        C3862t.g(observer, "observer");
        String[] strArrQ = q(observer.getTables());
        ArrayList arrayList = new ArrayList(strArrQ.length);
        for (String str : strArrQ) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            C3862t.f(US, "US");
            String lowerCase = str.toLowerCase(US);
            C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrV0 = kotlin.collections.r.V0(arrayList);
        d dVar = new d(observer, iArrV0, strArrQ);
        synchronized (this.observerMap) {
            dVarR = this.observerMap.r(observer, dVar);
        }
        if (dVarR == null && this.observedTableTracker.b(Arrays.copyOf(iArrV0, iArrV0.length))) {
            w();
        }
    }

    public void d(c observer) {
        C3862t.g(observer, "observer");
        c(new e(this, observer));
    }

    public <T> android.view.B<T> e(String[] tableNames, boolean inTransaction, Callable<T> computeFunction) {
        C3862t.g(tableNames, "tableNames");
        C3862t.g(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.a(y(tableNames), inTransaction, computeFunction);
    }

    public final boolean f() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        if (this.initialized) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: g, reason: from getter */
    public final u3.k getCleanupStatement() {
        return this.cleanupStatement;
    }

    /* renamed from: h, reason: from getter */
    public final w getDatabase() {
        return this.database;
    }

    public final C4189b<c, d> i() {
        return this.observerMap;
    }

    /* renamed from: j, reason: from getter */
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    public final Map<String, Integer> k() {
        return this.tableIdLookup;
    }

    public final void l(InterfaceC4669g database) {
        C3862t.g(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.I("PRAGMA temp_store = MEMORY;");
            database.I("PRAGMA recursive_triggers='ON';");
            database.I("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            x(database);
            this.cleanupStatement = database.T("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.initialized = true;
            C4153F c4153f = C4153F.f46609a;
        }
    }

    public final void m(String... tables) {
        C3862t.g(tables, "tables");
        synchronized (this.observerMap) {
            try {
                Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    C3862t.f(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.c(tables);
                    }
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            C2173c c2173c = this.autoCloser;
            if (c2173c != null) {
                c2173c.j();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void p(c observer) {
        d dVarV;
        C3862t.g(observer, "observer");
        synchronized (this.observerMap) {
            dVarV = this.observerMap.v(observer);
        }
        if (dVarV != null) {
            b bVar = this.observedTableTracker;
            int[] tableIds = dVarV.getTableIds();
            if (bVar.c(Arrays.copyOf(tableIds, tableIds.length))) {
                w();
            }
        }
    }

    public final void r(C2173c autoCloser) {
        C3862t.g(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.m(new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f29184B.n();
            }
        });
    }

    public final void s(Context context, String name, Intent serviceIntent) {
        C3862t.g(context, "context");
        C3862t.g(name, "name");
        C3862t.g(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new t(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void u() {
        t tVar = this.multiInstanceInvalidationClient;
        if (tVar != null) {
            tVar.o();
        }
        this.multiInstanceInvalidationClient = null;
    }

    public final void w() {
        if (this.database.isOpenInternal()) {
            x(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    public final void x(InterfaceC4669g database) {
        C3862t.g(database, "database");
        if (database.e1()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] iArrA = this.observedTableTracker.a();
                    if (iArrA == null) {
                        return;
                    }
                    INSTANCE.a(database);
                    try {
                        int length = iArrA.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = iArrA[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                t(database, i11);
                            } else if (i12 == 2) {
                                v(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.u0();
                        database.F0();
                        C4153F c4153f = C4153F.f46609a;
                    } catch (Throwable th) {
                        database.F0();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
