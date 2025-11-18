package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p024c.p033b.p034a.p036b.C0854b;
import p024c.p082u.p083a.C1007a;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: InvalidationTracker.java */
/* renamed from: androidx.room.g */
/* loaded from: classes.dex */
public class C0648g {

    /* renamed from: a */
    private static final String[] f4255a = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: c */
    final String[] f4257c;

    /* renamed from: d */
    private Map<String, Set<String>> f4258d;

    /* renamed from: e */
    final AbstractC0651j f4259e;

    /* renamed from: h */
    volatile InterfaceC1012f f4262h;

    /* renamed from: i */
    private b f4263i;

    /* renamed from: j */
    private final C0647f f4264j;

    /* renamed from: l */
    private C0649h f4266l;

    /* renamed from: f */
    AtomicBoolean f4260f = new AtomicBoolean(false);

    /* renamed from: g */
    private volatile boolean f4261g = false;

    /* renamed from: k */
    @SuppressLint({"RestrictedApi"})
    final C0854b<c, d> f4265k = new C0854b<>();

    /* renamed from: m */
    Runnable f4267m = new a();

    /* renamed from: b */
    final HashMap<String, Integer> f4256b = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g$a */
    class a implements Runnable {
        a() {
        }

        /* renamed from: a */
        private Set<Integer> m4604a() {
            HashSet hashSet = new HashSet();
            Cursor cursorQuery = C0648g.this.f4259e.query(new C1007a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorQuery.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorQuery.getInt(0)));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            if (!hashSet.isEmpty()) {
                C0648g.this.f4262h.mo6470E();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock closeLock = C0648g.this.f4259e.getCloseLock();
            Set<Integer> setM4604a = null;
            try {
                try {
                    closeLock.lock();
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                }
                if (C0648g.this.m4595c()) {
                    if (C0648g.this.f4260f.compareAndSet(true, false)) {
                        if (C0648g.this.f4259e.inTransaction()) {
                            return;
                        }
                        AbstractC0651j abstractC0651j = C0648g.this.f4259e;
                        if (abstractC0651j.mWriteAheadLoggingEnabled) {
                            InterfaceC1008b interfaceC1008bMo4666s0 = abstractC0651j.getOpenHelper().mo4666s0();
                            interfaceC1008bMo4666s0.mo6458n();
                            try {
                                setM4604a = m4604a();
                                interfaceC1008bMo4666s0.mo6456j0();
                                interfaceC1008bMo4666s0.mo6462z0();
                            } catch (Throwable th) {
                                interfaceC1008bMo4666s0.mo6462z0();
                                throw th;
                            }
                        } else {
                            setM4604a = m4604a();
                        }
                        if (setM4604a == null || setM4604a.isEmpty()) {
                            return;
                        }
                        synchronized (C0648g.this.f4265k) {
                            Iterator<Map.Entry<c, d>> it = C0648g.this.f4265k.iterator();
                            while (it.hasNext()) {
                                it.next().getValue().m4611a(setM4604a);
                            }
                        }
                    }
                }
            } finally {
                closeLock.unlock();
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g$b */
    static class b {

        /* renamed from: a */
        final long[] f4269a;

        /* renamed from: b */
        final boolean[] f4270b;

        /* renamed from: c */
        final int[] f4271c;

        /* renamed from: d */
        boolean f4272d;

        /* renamed from: e */
        boolean f4273e;

        b(int i2) {
            long[] jArr = new long[i2];
            this.f4269a = jArr;
            boolean[] zArr = new boolean[i2];
            this.f4270b = zArr;
            this.f4271c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        int[] m4605a() {
            synchronized (this) {
                if (this.f4272d && !this.f4273e) {
                    int length = this.f4269a.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1;
                        if (i2 >= length) {
                            this.f4273e = true;
                            this.f4272d = false;
                            return this.f4271c;
                        }
                        boolean z = this.f4269a[i2] > 0;
                        boolean[] zArr = this.f4270b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.f4271c;
                            if (!z) {
                                i3 = 2;
                            }
                            iArr[i2] = i3;
                        } else {
                            this.f4271c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i2++;
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        boolean m4606b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.f4269a;
                    long j2 = jArr[i2];
                    jArr[i2] = 1 + j2;
                    if (j2 == 0) {
                        this.f4272d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: c */
        boolean m4607c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.f4269a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        this.f4272d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: d */
        void m4608d() {
            synchronized (this) {
                this.f4273e = false;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g$c */
    public static abstract class c {

        /* renamed from: a */
        final String[] f4274a;

        public c(String[] strArr) {
            this.f4274a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        boolean mo4609a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo4610b(Set<String> set);
    }

    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g$d */
    static class d {

        /* renamed from: a */
        final int[] f4275a;

        /* renamed from: b */
        private final String[] f4276b;

        /* renamed from: c */
        final c f4277c;

        /* renamed from: d */
        private final Set<String> f4278d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f4277c = cVar;
            this.f4275a = iArr;
            this.f4276b = strArr;
            if (iArr.length != 1) {
                this.f4278d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f4278d = Collections.unmodifiableSet(hashSet);
        }

        /* renamed from: a */
        void m4611a(Set<Integer> set) {
            int length = this.f4275a.length;
            Set<String> hashSet = null;
            for (int i2 = 0; i2 < length; i2++) {
                if (set.contains(Integer.valueOf(this.f4275a[i2]))) {
                    if (length == 1) {
                        hashSet = this.f4278d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f4276b[i2]);
                    }
                }
            }
            if (hashSet != null) {
                this.f4277c.mo4610b(hashSet);
            }
        }

        /* renamed from: b */
        void m4612b(String[] strArr) {
            Set<String> set = null;
            if (this.f4276b.length == 1) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (strArr[i2].equalsIgnoreCase(this.f4276b[0])) {
                        set = this.f4278d;
                        break;
                    }
                    i2++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4276b;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            String str2 = strArr2[i3];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4277c.mo4610b(set);
            }
        }
    }

    public C0648g(AbstractC0651j abstractC0651j, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4259e = abstractC0651j;
        this.f4263i = new b(strArr.length);
        this.f4258d = map2;
        this.f4264j = new C0647f(abstractC0651j);
        int length = strArr.length;
        this.f4257c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4256b.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.f4257c[i2] = str2.toLowerCase(locale);
            } else {
                this.f4257c[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f4256b.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f4256b;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    private static void m4590b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: h */
    private String[] m4591h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4258d.containsKey(lowerCase)) {
                hashSet.addAll(this.f4258d.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: j */
    private void m4592j(InterfaceC1008b interfaceC1008b, int i2) throws SQLException {
        interfaceC1008b.mo6461v("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f4257c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4255a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m4590b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            interfaceC1008b.mo6461v(sb.toString());
        }
    }

    /* renamed from: l */
    private void m4593l(InterfaceC1008b interfaceC1008b, int i2) throws SQLException {
        String str = this.f4257c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4255a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m4590b(sb, str, str2);
            interfaceC1008b.mo6461v(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void m4594a(c cVar) throws SQLException {
        d dVarMo5378o;
        String[] strArrM4591h = m4591h(cVar.f4274a);
        int[] iArr = new int[strArrM4591h.length];
        int length = strArrM4591h.length;
        for (int i2 = 0; i2 < length; i2++) {
            Integer num = this.f4256b.get(strArrM4591h[i2].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrM4591h[i2]);
            }
            iArr[i2] = num.intValue();
        }
        d dVar = new d(cVar, iArr, strArrM4591h);
        synchronized (this.f4265k) {
            dVarMo5378o = this.f4265k.mo5378o(cVar, dVar);
        }
        if (dVarMo5378o == null && this.f4263i.m4606b(iArr)) {
            m4602m();
        }
    }

    /* renamed from: c */
    boolean m4595c() {
        if (!this.f4259e.isOpen()) {
            return false;
        }
        if (!this.f4261g) {
            this.f4259e.getOpenHelper().mo4666s0();
        }
        if (this.f4261g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: d */
    void m4596d(InterfaceC1008b interfaceC1008b) {
        synchronized (this) {
            if (this.f4261g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC1008b.mo6461v("PRAGMA temp_store = MEMORY;");
            interfaceC1008b.mo6461v("PRAGMA recursive_triggers='ON';");
            interfaceC1008b.mo6461v("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m4603n(interfaceC1008b);
            this.f4262h = interfaceC1008b.mo6451F("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4261g = true;
        }
    }

    /* renamed from: e */
    public void m4597e(String... strArr) {
        synchronized (this.f4265k) {
            Iterator<Map.Entry<c, d>> it = this.f4265k.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().mo4609a()) {
                    next.getValue().m4612b(strArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void m4598f() {
        if (this.f4260f.compareAndSet(false, true)) {
            this.f4259e.getQueryExecutor().execute(this.f4267m);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public void m4599g(c cVar) throws SQLException {
        d dVarMo5379q;
        synchronized (this.f4265k) {
            dVarMo5379q = this.f4265k.mo5379q(cVar);
        }
        if (dVarMo5379q == null || !this.f4263i.m4607c(dVarMo5379q.f4275a)) {
            return;
        }
        m4602m();
    }

    /* renamed from: i */
    void m4600i(Context context, String str) {
        this.f4266l = new C0649h(context, str, this, this.f4259e.getQueryExecutor());
    }

    /* renamed from: k */
    void m4601k() {
        C0649h c0649h = this.f4266l;
        if (c0649h != null) {
            c0649h.m4613a();
            this.f4266l = null;
        }
    }

    /* renamed from: m */
    void m4602m() throws SQLException {
        if (this.f4259e.isOpen()) {
            m4603n(this.f4259e.getOpenHelper().mo4666s0());
        }
    }

    /* renamed from: n */
    void m4603n(InterfaceC1008b interfaceC1008b) throws SQLException {
        if (interfaceC1008b.mo6453P0()) {
            return;
        }
        while (true) {
            try {
                Lock closeLock = this.f4259e.getCloseLock();
                closeLock.lock();
                try {
                    int[] iArrM4605a = this.f4263i.m4605a();
                    if (iArrM4605a == null) {
                        return;
                    }
                    int length = iArrM4605a.length;
                    interfaceC1008b.mo6458n();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            int i3 = iArrM4605a[i2];
                            if (i3 == 1) {
                                m4592j(interfaceC1008b, i2);
                            } else if (i3 == 2) {
                                m4593l(interfaceC1008b, i2);
                            }
                        } finally {
                        }
                    }
                    interfaceC1008b.mo6456j0();
                    interfaceC1008b.mo6462z0();
                    this.f4263i.m4608d();
                } finally {
                    closeLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }
}
