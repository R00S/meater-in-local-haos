package androidx.media3.datasource.cache;

import X1.C1804a;
import X1.n;
import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* compiled from: SimpleCache.java */
/* loaded from: classes.dex */
public final class h implements Cache {

    /* renamed from: l, reason: collision with root package name */
    private static final HashSet<File> f26272l = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private final File f26273a;

    /* renamed from: b, reason: collision with root package name */
    private final b f26274b;

    /* renamed from: c, reason: collision with root package name */
    private final f f26275c;

    /* renamed from: d, reason: collision with root package name */
    private final d f26276d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<Cache.a>> f26277e;

    /* renamed from: f, reason: collision with root package name */
    private final Random f26278f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26279g;

    /* renamed from: h, reason: collision with root package name */
    private long f26280h;

    /* renamed from: i, reason: collision with root package name */
    private long f26281i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26282j;

    /* renamed from: k, reason: collision with root package name */
    private Cache.CacheException f26283k;

    /* compiled from: SimpleCache.java */
    class a extends Thread {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f26284B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f26284B = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (h.this) {
                this.f26284B.open();
                h.this.r();
                h.this.f26274b.c();
            }
        }
    }

    public h(File file, b bVar, Z1.a aVar) {
        this(file, bVar, aVar, null, false, false);
    }

    private void A() {
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = this.f26275c.g().iterator();
        while (it.hasNext()) {
            Iterator<i> it2 = it.next().f().iterator();
            while (it2.hasNext()) {
                i next = it2.next();
                if (((File) C1804a.e(next.f30094F)).length() != next.f30092D) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            z((b2.c) arrayList.get(i10));
        }
    }

    private i B(String str, i iVar) throws SQLException {
        boolean z10;
        if (!this.f26279g) {
            return iVar;
        }
        String name = ((File) C1804a.e(iVar.f30094F)).getName();
        long j10 = iVar.f30092D;
        long jCurrentTimeMillis = System.currentTimeMillis();
        d dVar = this.f26276d;
        if (dVar != null) {
            try {
                dVar.h(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                n.h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        i iVarL = ((e) C1804a.e(this.f26275c.f(str))).l(iVar, jCurrentTimeMillis, z10);
        x(iVar, iVarL);
        return iVarL;
    }

    private void m(i iVar) {
        this.f26275c.k(iVar.f30090B).a(iVar);
        this.f26281i += iVar.f30092D;
        v(iVar);
    }

    private static void o(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        n.c("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    private static long p(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private i q(String str, long j10, long j11) {
        i iVarE;
        e eVarF = this.f26275c.f(str);
        if (eVarF == null) {
            return i.u(str, j10, j11);
        }
        while (true) {
            iVarE = eVarF.e(j10, j11);
            if (!iVarE.f30093E || ((File) C1804a.e(iVarE.f30094F)).length() == iVarE.f30092D) {
                break;
            }
            A();
        }
        return iVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!this.f26273a.exists()) {
            try {
                o(this.f26273a);
            } catch (Cache.CacheException e10) {
                this.f26283k = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f26273a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f26273a;
            n.c("SimpleCache", str);
            this.f26283k = new Cache.CacheException(str);
            return;
        }
        long jT = t(fileArrListFiles);
        this.f26280h = jT;
        if (jT == -1) {
            try {
                this.f26280h = p(this.f26273a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f26273a;
                n.d("SimpleCache", str2, e11);
                this.f26283k = new Cache.CacheException(str2, e11);
                return;
            }
        }
        try {
            this.f26275c.l(this.f26280h);
            d dVar = this.f26276d;
            if (dVar != null) {
                dVar.e(this.f26280h);
                Map<String, c> mapB = this.f26276d.b();
                s(this.f26273a, true, fileArrListFiles, mapB);
                this.f26276d.g(mapB.keySet());
            } else {
                s(this.f26273a, true, fileArrListFiles, null);
            }
            this.f26275c.p();
            try {
                this.f26275c.q();
            } catch (IOException e12) {
                n.d("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + this.f26273a;
            n.d("SimpleCache", str3, e13);
            this.f26283k = new Cache.CacheException(str3, e13);
        }
    }

    private void s(File file, boolean z10, File[] fileArr, Map<String, c> map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                s(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!f.m(name) && !name.endsWith(".uid"))) {
                c cVarRemove = map != null ? map.remove(name) : null;
                if (cVarRemove != null) {
                    j11 = cVarRemove.f26241a;
                    j10 = cVarRemove.f26242b;
                } else {
                    j10 = -9223372036854775807L;
                    j11 = -1;
                }
                i iVarS = i.s(file2, j11, j10, this.f26275c);
                if (iVarS != null) {
                    m(iVarS);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long t(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return y(name);
                } catch (NumberFormatException unused) {
                    n.c("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean u(File file) {
        return f26272l.add(file.getAbsoluteFile());
    }

    private void v(i iVar) {
        ArrayList<Cache.a> arrayList = this.f26277e.get(iVar.f30090B);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).e(this, iVar);
            }
        }
        this.f26274b.e(this, iVar);
    }

    private void w(b2.c cVar) {
        ArrayList<Cache.a> arrayList = this.f26277e.get(cVar.f30090B);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).f(this, cVar);
            }
        }
        this.f26274b.f(this, cVar);
    }

    private void x(i iVar, b2.c cVar) {
        ArrayList<Cache.a> arrayList = this.f26277e.get(iVar.f30090B);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, iVar, cVar);
            }
        }
        this.f26274b.a(this, iVar, cVar);
    }

    private static long y(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void z(b2.c cVar) {
        e eVarF = this.f26275c.f(cVar.f30090B);
        if (eVarF == null || !eVarF.k(cVar)) {
            return;
        }
        this.f26281i -= cVar.f30092D;
        if (this.f26276d != null) {
            String name = ((File) C1804a.e(cVar.f30094F)).getName();
            try {
                this.f26276d.f(name);
            } catch (IOException unused) {
                n.h("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f26275c.n(eVarF.f26247b);
        w(cVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized File a(String str, long j10, long j11) {
        e eVarF;
        File file;
        try {
            C1804a.g(!this.f26282j);
            n();
            eVarF = this.f26275c.f(str);
            C1804a.e(eVarF);
            C1804a.g(eVarF.h(j10, j11));
            if (!this.f26273a.exists()) {
                o(this.f26273a);
                A();
            }
            this.f26274b.b(this, str, j10, j11);
            file = new File(this.f26273a, Integer.toString(this.f26278f.nextInt(10)));
            if (!file.exists()) {
                o(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i.w(file, eVarF.f26246a, j10, System.currentTimeMillis());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void b(String str, b2.f fVar) {
        C1804a.g(!this.f26282j);
        n();
        this.f26275c.d(str, fVar);
        try {
            this.f26275c.q();
        } catch (IOException e10) {
            throw new Cache.CacheException(e10);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized b2.e c(String str) {
        C1804a.g(!this.f26282j);
        return this.f26275c.h(str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long d(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 < 0 ? Long.MAX_VALUE : j13;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long jF = f(str, j15, j14 - j15);
            if (jF > 0) {
                j12 += jF;
            } else {
                jF = -jF;
            }
            j15 += jF;
        }
        return j12;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized b2.c e(String str, long j10, long j11) {
        C1804a.g(!this.f26282j);
        n();
        i iVarQ = q(str, j10, j11);
        if (iVarQ.f30093E) {
            return B(str, iVarQ);
        }
        if (this.f26275c.k(str).j(j10, iVarQ.f30092D)) {
            return iVarQ;
        }
        return null;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long f(String str, long j10, long j11) {
        e eVarF;
        C1804a.g(!this.f26282j);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        eVarF = this.f26275c.f(str);
        return eVarF != null ? eVarF.c(j10, j11) : -j11;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized b2.c g(String str, long j10, long j11) {
        b2.c cVarE;
        C1804a.g(!this.f26282j);
        n();
        while (true) {
            cVarE = e(str, j10, j11);
            if (cVarE == null) {
                wait();
            }
        }
        return cVarE;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void h(b2.c cVar) {
        C1804a.g(!this.f26282j);
        e eVar = (e) C1804a.e(this.f26275c.f(cVar.f30090B));
        eVar.m(cVar.f30091C);
        this.f26275c.n(eVar.f26247b);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void i(b2.c cVar) {
        C1804a.g(!this.f26282j);
        z(cVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void j(File file, long j10) {
        C1804a.g(!this.f26282j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            i iVar = (i) C1804a.e(i.t(file, j10, this.f26275c));
            e eVar = (e) C1804a.e(this.f26275c.f(iVar.f30090B));
            C1804a.g(eVar.h(iVar.f30091C, iVar.f30092D));
            long jD = b2.e.d(eVar.d());
            if (jD != -1) {
                C1804a.g(iVar.f30091C + iVar.f30092D <= jD);
            }
            if (this.f26276d == null) {
                m(iVar);
                this.f26275c.q();
                notifyAll();
                return;
            }
            try {
                this.f26276d.h(file.getName(), iVar.f30092D, iVar.f30095G);
                m(iVar);
                try {
                    this.f26275c.q();
                    notifyAll();
                    return;
                } catch (IOException e10) {
                    throw new Cache.CacheException(e10);
                }
            } catch (IOException e11) {
                throw new Cache.CacheException(e11);
            }
        }
    }

    public synchronized void n() {
        Cache.CacheException cacheException = this.f26283k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public h(File file, b bVar, Z1.a aVar, byte[] bArr, boolean z10, boolean z11) {
        this(file, bVar, new f(aVar, file, bArr, z10, z11), (aVar == null || z11) ? null : new d(aVar));
    }

    h(File file, b bVar, f fVar, d dVar) {
        if (u(file)) {
            this.f26273a = file;
            this.f26274b = bVar;
            this.f26275c = fVar;
            this.f26276d = dVar;
            this.f26277e = new HashMap<>();
            this.f26278f = new Random();
            this.f26279g = bVar.d();
            this.f26280h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
