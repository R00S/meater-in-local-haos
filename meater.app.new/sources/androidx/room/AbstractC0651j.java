package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.p009s.AbstractC0660a;
import androidx.room.p010t.C0665e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p024c.p033b.p034a.p035a.C0850a;
import p024c.p082u.p083a.C1007a;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1009c;
import p024c.p082u.p083a.InterfaceC1011e;
import p024c.p082u.p083a.InterfaceC1012f;
import p024c.p082u.p083a.p084g.C1015c;

/* compiled from: RoomDatabase.java */
/* renamed from: androidx.room.j */
/* loaded from: classes.dex */
public abstract class AbstractC0651j {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;

    @Deprecated
    protected List<b> mCallbacks;

    @Deprecated
    protected volatile InterfaceC1008b mDatabase;
    private InterfaceC1009c mOpenHelper;
    private Executor mQueryExecutor;
    private Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private final Map<String, Object> mBackingFieldMap = new ConcurrentHashMap();
    private final C0648g mInvalidationTracker = createInvalidationTracker();

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.j$a */
    public static class a<T extends AbstractC0651j> {

        /* renamed from: a */
        private final Class<T> f4300a;

        /* renamed from: b */
        private final String f4301b;

        /* renamed from: c */
        private final Context f4302c;

        /* renamed from: d */
        private ArrayList<b> f4303d;

        /* renamed from: e */
        private Executor f4304e;

        /* renamed from: f */
        private Executor f4305f;

        /* renamed from: g */
        private InterfaceC1009c.c f4306g;

        /* renamed from: h */
        private boolean f4307h;

        /* renamed from: j */
        private boolean f4309j;

        /* renamed from: l */
        private boolean f4311l;

        /* renamed from: n */
        private Set<Integer> f4313n;

        /* renamed from: o */
        private Set<Integer> f4314o;

        /* renamed from: p */
        private String f4315p;

        /* renamed from: q */
        private File f4316q;

        /* renamed from: i */
        private c f4308i = c.AUTOMATIC;

        /* renamed from: k */
        private boolean f4310k = true;

        /* renamed from: m */
        private final d f4312m = new d();

        a(Context context, Class<T> cls, String str) {
            this.f4302c = context;
            this.f4300a = cls;
            this.f4301b = str;
        }

        /* renamed from: a */
        public a<T> m4617a(b bVar) {
            if (this.f4303d == null) {
                this.f4303d = new ArrayList<>();
            }
            this.f4303d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public a<T> m4618b(AbstractC0660a... abstractC0660aArr) {
            if (this.f4314o == null) {
                this.f4314o = new HashSet();
            }
            for (AbstractC0660a abstractC0660a : abstractC0660aArr) {
                this.f4314o.add(Integer.valueOf(abstractC0660a.startVersion));
                this.f4314o.add(Integer.valueOf(abstractC0660a.endVersion));
            }
            this.f4312m.m4631b(abstractC0660aArr);
            return this;
        }

        /* renamed from: c */
        public a<T> m4619c() {
            this.f4307h = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        public T m4620d() {
            Executor executor;
            if (this.f4302c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f4300a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f4304e;
            if (executor2 == null && this.f4305f == null) {
                Executor executorM5371d = C0850a.m5371d();
                this.f4305f = executorM5371d;
                this.f4304e = executorM5371d;
            } else if (executor2 != null && this.f4305f == null) {
                this.f4305f = executor2;
            } else if (executor2 == null && (executor = this.f4305f) != null) {
                this.f4304e = executor;
            }
            Set<Integer> set = this.f4314o;
            if (set != null && this.f4313n != null) {
                for (Integer num : set) {
                    if (this.f4313n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f4306g == null) {
                this.f4306g = new C1015c();
            }
            String str = this.f4315p;
            if (str != null || this.f4316q != null) {
                if (this.f4301b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f4316q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f4306g = new C0657p(str, this.f4316q, this.f4306g);
            }
            Context context = this.f4302c;
            C0642a c0642a = new C0642a(context, this.f4301b, this.f4306g, this.f4312m, this.f4303d, this.f4307h, this.f4308i.m4628k(context), this.f4304e, this.f4305f, this.f4309j, this.f4310k, this.f4311l, this.f4313n, this.f4315p, this.f4316q);
            T t = (T) C0650i.m4615b(this.f4300a, AbstractC0651j.DB_IMPL_SUFFIX);
            t.init(c0642a);
            return t;
        }

        /* renamed from: e */
        public a<T> m4621e() {
            this.f4310k = false;
            this.f4311l = true;
            return this;
        }

        /* renamed from: f */
        public a<T> m4622f(InterfaceC1009c.c cVar) {
            this.f4306g = cVar;
            return this;
        }

        /* renamed from: g */
        public a<T> m4623g(Executor executor) {
            this.f4304e = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.j$b */
    public static abstract class b {
        /* renamed from: a */
        public void m4624a(InterfaceC1008b interfaceC1008b) {
        }

        /* renamed from: b */
        public void m4625b(InterfaceC1008b interfaceC1008b) {
        }

        /* renamed from: c */
        public void mo4626c(InterfaceC1008b interfaceC1008b) {
        }
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.j$c */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: g */
        private static boolean m4627g(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: k */
        c m4628k(Context context) {
            ActivityManager activityManager;
            return this != AUTOMATIC ? this : (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || m4627g(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.j$d */
    public static class d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, AbstractC0660a>> f4321a = new HashMap<>();

        /* renamed from: a */
        private void m4629a(AbstractC0660a abstractC0660a) {
            int i2 = abstractC0660a.startVersion;
            int i3 = abstractC0660a.endVersion;
            TreeMap<Integer, AbstractC0660a> treeMap = this.f4321a.get(Integer.valueOf(i2));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f4321a.put(Integer.valueOf(i2), treeMap);
            }
            AbstractC0660a abstractC0660a2 = treeMap.get(Integer.valueOf(i3));
            if (abstractC0660a2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC0660a2 + " with " + abstractC0660a);
            }
            treeMap.put(Integer.valueOf(i3), abstractC0660a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:13:0x0026->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List<androidx.room.p009s.AbstractC0660a> m4630d(java.util.List<androidx.room.p009s.AbstractC0660a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.s.a>> r0 = r6.f4321a
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
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = 0
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AbstractC0651j.d.m4630d(java.util.List, boolean, int, int):java.util.List");
        }

        /* renamed from: b */
        public void m4631b(AbstractC0660a... abstractC0660aArr) {
            for (AbstractC0660a abstractC0660a : abstractC0660aArr) {
                m4629a(abstractC0660a);
            }
        }

        /* renamed from: c */
        public List<AbstractC0660a> m4632c(int i2, int i3) {
            if (i2 == i3) {
                return Collections.emptyList();
            }
            return m4630d(new ArrayList(), i3 > i2, i2, i3);
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() throws SQLException {
        assertNotMainThread();
        InterfaceC1008b interfaceC1008bMo4666s0 = this.mOpenHelper.mo4666s0();
        this.mInvalidationTracker.m4603n(interfaceC1008bMo4666s0);
        interfaceC1008bMo4666s0.mo6458n();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            try {
                writeLock.lock();
                this.mInvalidationTracker.m4601k();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public InterfaceC1012f compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.mo4666s0().mo6451F(str);
    }

    protected abstract C0648g createInvalidationTracker();

    protected abstract InterfaceC1009c createOpenHelper(C0642a c0642a);

    @Deprecated
    public void endTransaction() {
        this.mOpenHelper.mo4666s0().mo6462z0();
        if (inTransaction()) {
            return;
        }
        this.mInvalidationTracker.m4598f();
    }

    Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public C0648g getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public InterfaceC1009c getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.mo4666s0().mo6453P0();
    }

    public void init(C0642a c0642a) {
        InterfaceC1009c interfaceC1009cCreateOpenHelper = createOpenHelper(c0642a);
        this.mOpenHelper = interfaceC1009cCreateOpenHelper;
        if (interfaceC1009cCreateOpenHelper instanceof C0656o) {
            ((C0656o) interfaceC1009cCreateOpenHelper).m4665b(c0642a);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            z = c0642a.f4242g == c.WRITE_AHEAD_LOGGING;
            this.mOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.mCallbacks = c0642a.f4240e;
        this.mQueryExecutor = c0642a.f4243h;
        this.mTransactionExecutor = new ExecutorC0659r(c0642a.f4244i);
        this.mAllowMainThreadQueries = c0642a.f4241f;
        this.mWriteAheadLoggingEnabled = z;
        if (c0642a.f4245j) {
            this.mInvalidationTracker.m4600i(c0642a.f4237b, c0642a.f4238c);
        }
    }

    protected void internalInitInvalidationTracker(InterfaceC1008b interfaceC1008b) {
        this.mInvalidationTracker.m4596d(interfaceC1008b);
    }

    public boolean isOpen() {
        InterfaceC1008b interfaceC1008b = this.mDatabase;
        return interfaceC1008b != null && interfaceC1008b.isOpen();
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.mo4666s0().mo6452H0(new C1007a(str, objArr));
    }

    public void runInTransaction(Runnable runnable) throws SQLException {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.mo4666s0().mo6456j0();
    }

    public Cursor query(InterfaceC1011e interfaceC1011e) {
        return query(interfaceC1011e, (CancellationSignal) null);
    }

    public Cursor query(InterfaceC1011e interfaceC1011e, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null && Build.VERSION.SDK_INT >= 16) {
            return this.mOpenHelper.mo4666s0().mo6454S(interfaceC1011e, cancellationSignal);
        }
        return this.mOpenHelper.mo4666s0().mo6452H0(interfaceC1011e);
    }

    public <V> V runInTransaction(Callable<V> callable) throws SQLException {
        beginTransaction();
        try {
            try {
                V vCall = callable.call();
                setTransactionSuccessful();
                endTransaction();
                return vCall;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                C0665e.m4678a(e3);
                endTransaction();
                return null;
            }
        } catch (Throwable th) {
            endTransaction();
            throw th;
        }
    }
}
