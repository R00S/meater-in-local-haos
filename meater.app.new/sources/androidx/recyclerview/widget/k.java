package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: F, reason: collision with root package name */
    static final ThreadLocal<k> f28968F = new ThreadLocal<>();

    /* renamed from: G, reason: collision with root package name */
    static Comparator<c> f28969G = new a();

    /* renamed from: C, reason: collision with root package name */
    long f28971C;

    /* renamed from: D, reason: collision with root package name */
    long f28972D;

    /* renamed from: B, reason: collision with root package name */
    ArrayList<RecyclerView> f28970B = new ArrayList<>();

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<c> f28973E = new ArrayList<>();

    /* compiled from: GapWorker.java */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f28981d;
            if ((recyclerView == null) != (cVar2.f28981d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f28978a;
            if (z10 != cVar2.f28978a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f28979b - cVar.f28979b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f28980c - cVar2.f28980c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.q.c {

        /* renamed from: a, reason: collision with root package name */
        int f28974a;

        /* renamed from: b, reason: collision with root package name */
        int f28975b;

        /* renamed from: c, reason: collision with root package name */
        int[] f28976c;

        /* renamed from: d, reason: collision with root package name */
        int f28977d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f28977d;
            int i13 = i12 * 2;
            int[] iArr = this.f28976c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f28976c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f28976c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f28976c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f28977d++;
        }

        void b() {
            int[] iArr = this.f28976c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f28977d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f28977d = 0;
            int[] iArr = this.f28976c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f28591O;
            if (recyclerView.f28589N == null || qVar == null || !qVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f28573F.p()) {
                    qVar.u(recyclerView.f28589N.h(), this);
                }
            } else if (!recyclerView.w0()) {
                qVar.t(this.f28974a, this.f28975b, recyclerView.f28584K0, this);
            }
            int i10 = this.f28977d;
            if (i10 > qVar.f28720m) {
                qVar.f28720m = i10;
                qVar.f28721n = z10;
                recyclerView.f28569D.P();
            }
        }

        boolean d(int i10) {
            if (this.f28976c != null) {
                int i11 = this.f28977d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f28976c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f28974a = i10;
            this.f28975b = i11;
        }
    }

    /* compiled from: GapWorker.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f28978a;

        /* renamed from: b, reason: collision with root package name */
        public int f28979b;

        /* renamed from: c, reason: collision with root package name */
        public int f28980c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f28981d;

        /* renamed from: e, reason: collision with root package name */
        public int f28982e;

        c() {
        }

        public void a() {
            this.f28978a = false;
            this.f28979b = 0;
            this.f28980c = 0;
            this.f28981d = null;
            this.f28982e = 0;
        }
    }

    k() {
    }

    private void b() {
        c cVar;
        int size = this.f28970B.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f28970B.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f28582J0.c(recyclerView, false);
                i10 += recyclerView.f28582J0.f28977d;
            }
        }
        this.f28973E.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f28970B.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f28582J0;
                int iAbs = Math.abs(bVar.f28974a) + Math.abs(bVar.f28975b);
                for (int i14 = 0; i14 < bVar.f28977d * 2; i14 += 2) {
                    if (i12 >= this.f28973E.size()) {
                        cVar = new c();
                        this.f28973E.add(cVar);
                    } else {
                        cVar = this.f28973E.get(i12);
                    }
                    int[] iArr = bVar.f28976c;
                    int i15 = iArr[i14 + 1];
                    cVar.f28978a = i15 <= iAbs;
                    cVar.f28979b = iAbs;
                    cVar.f28980c = i15;
                    cVar.f28981d = recyclerView2;
                    cVar.f28982e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f28973E, f28969G);
    }

    private void c(c cVar, long j10) {
        RecyclerView.G gI = i(cVar.f28981d, cVar.f28982e, cVar.f28978a ? Long.MAX_VALUE : j10);
        if (gI == null || gI.mNestedRecyclerView == null || !gI.isBound() || gI.isInvalid()) {
            return;
        }
        h(gI.mNestedRecyclerView.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f28973E.size(); i10++) {
            c cVar = this.f28973E.get(i10);
            if (cVar.f28981d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f28575G.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.G gO0 = RecyclerView.o0(recyclerView.f28575G.i(i11));
            if (gO0.mPosition == i10 && !gO0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f28627j0 && recyclerView.f28575G.j() != 0) {
            recyclerView.h1();
        }
        b bVar = recyclerView.f28582J0;
        bVar.c(recyclerView, true);
        if (bVar.f28977d != 0) {
            try {
                Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f28584K0.f(recyclerView.f28589N);
                for (int i10 = 0; i10 < bVar.f28977d * 2; i10 += 2) {
                    i(recyclerView, bVar.f28976c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    private RecyclerView.G i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f28569D;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (n1.o.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.T0(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.R0();
        RecyclerView.G gN = xVar.N(i10, false, j10);
        if (gN != null) {
            if (!gN.isBound() || gN.isInvalid()) {
                xVar.a(gN, false);
            } else {
                xVar.G(gN.itemView);
            }
        }
        recyclerView.T0(false);
        Trace.endSection();
        return gN;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.f28554g1 && this.f28970B.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f28970B.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f28554g1 && !this.f28970B.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f28971C == 0) {
                this.f28971C = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f28582J0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f28970B.remove(recyclerView);
        if (RecyclerView.f28554g1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f28970B.isEmpty()) {
                int size = this.f28970B.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f28970B.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f28972D);
                    this.f28971C = 0L;
                    Trace.endSection();
                }
            }
        } finally {
            this.f28971C = 0L;
            Trace.endSection();
        }
    }
}
