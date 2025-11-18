package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.os.C0275d;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
final class RunnableC0627h implements Runnable {

    /* renamed from: f */
    static final ThreadLocal<RunnableC0627h> f4182f = new ThreadLocal<>();

    /* renamed from: g */
    static Comparator<c> f4183g = new a();

    /* renamed from: i */
    long f4185i;

    /* renamed from: j */
    long f4186j;

    /* renamed from: h */
    ArrayList<RecyclerView> f4184h = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<c> f4187k = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* renamed from: androidx.recyclerview.widget.h$a */
    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4195d;
            if ((recyclerView == null) != (cVar2.f4195d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f4192a;
            if (z != cVar2.f4192a) {
                return z ? -1 : 1;
            }
            int i2 = cVar2.f4193b - cVar.f4193b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f4194c - cVar2.f4194c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.h$b */
    static class b implements RecyclerView.AbstractC0602o.c {

        /* renamed from: a */
        int f4188a;

        /* renamed from: b */
        int f4189b;

        /* renamed from: c */
        int[] f4190c;

        /* renamed from: d */
        int f4191d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o.c
        /* renamed from: a */
        public void mo4237a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.f4191d * 2;
            int[] iArr = this.f4190c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f4190c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i4 * 2];
                this.f4190c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f4190c;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.f4191d++;
        }

        /* renamed from: b */
        void m4517b() {
            int[] iArr = this.f4190c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4191d = 0;
        }

        /* renamed from: c */
        void m4518c(RecyclerView recyclerView, boolean z) {
            this.f4191d = 0;
            int[] iArr = this.f4190c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0602o abstractC0602o = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || abstractC0602o == null || !abstractC0602o.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.m4426p()) {
                    abstractC0602o.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abstractC0602o.collectAdjacentPrefetchPositions(this.f4188a, this.f4189b, recyclerView.mState, this);
            }
            int i2 = this.f4191d;
            if (i2 > abstractC0602o.mPrefetchMaxCountObserved) {
                abstractC0602o.mPrefetchMaxCountObserved = i2;
                abstractC0602o.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.m4272K();
            }
        }

        /* renamed from: d */
        boolean m4519d(int i2) {
            if (this.f4190c != null) {
                int i3 = this.f4191d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f4190c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m4520e(int i2, int i3) {
            this.f4188a = i2;
            this.f4189b = i3;
        }
    }

    /* compiled from: GapWorker.java */
    /* renamed from: androidx.recyclerview.widget.h$c */
    static class c {

        /* renamed from: a */
        public boolean f4192a;

        /* renamed from: b */
        public int f4193b;

        /* renamed from: c */
        public int f4194c;

        /* renamed from: d */
        public RecyclerView f4195d;

        /* renamed from: e */
        public int f4196e;

        c() {
        }

        /* renamed from: a */
        public void m4521a() {
            this.f4192a = false;
            this.f4193b = 0;
            this.f4194c = 0;
            this.f4195d = null;
            this.f4196e = 0;
        }
    }

    RunnableC0627h() {
    }

    /* renamed from: b */
    private void m4506b() {
        c cVar;
        int size = this.f4184h.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f4184h.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m4518c(recyclerView, false);
                i2 += recyclerView.mPrefetchRegistry.f4191d;
            }
        }
        this.f4187k.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f4184h.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f4188a) + Math.abs(bVar.f4189b);
                for (int i6 = 0; i6 < bVar.f4191d * 2; i6 += 2) {
                    if (i4 >= this.f4187k.size()) {
                        cVar = new c();
                        this.f4187k.add(cVar);
                    } else {
                        cVar = this.f4187k.get(i4);
                    }
                    int[] iArr = bVar.f4190c;
                    int i7 = iArr[i6 + 1];
                    cVar.f4192a = i7 <= iAbs;
                    cVar.f4193b = iAbs;
                    cVar.f4194c = i7;
                    cVar.f4195d = recyclerView2;
                    cVar.f4196e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f4187k, f4183g);
    }

    /* renamed from: c */
    private void m4507c(c cVar, long j2) {
        RecyclerView.AbstractC0590c0 abstractC0590c0M4511i = m4511i(cVar.f4195d, cVar.f4196e, cVar.f4192a ? Long.MAX_VALUE : j2);
        if (abstractC0590c0M4511i == null || abstractC0590c0M4511i.mNestedRecyclerView == null || !abstractC0590c0M4511i.isBound() || abstractC0590c0M4511i.isInvalid()) {
            return;
        }
        m4510h(abstractC0590c0M4511i.mNestedRecyclerView.get(), j2);
    }

    /* renamed from: d */
    private void m4508d(long j2) {
        for (int i2 = 0; i2 < this.f4187k.size(); i2++) {
            c cVar = this.f4187k.get(i2);
            if (cVar.f4195d == null) {
                return;
            }
            m4507c(cVar, j2);
            cVar.m4521a();
        }
    }

    /* renamed from: e */
    static boolean m4509e(RecyclerView recyclerView, int i2) {
        int iM4452j = recyclerView.mChildHelper.m4452j();
        for (int i3 = 0; i3 < iM4452j; i3++) {
            RecyclerView.AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m4451i(i3));
            if (childViewHolderInt.mPosition == i2 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m4510h(RecyclerView recyclerView, long j2) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m4452j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.m4518c(recyclerView, true);
        if (bVar.f4191d != 0) {
            try {
                C0275d.m1840a("RV Nested Prefetch");
                recyclerView.mState.m4310f(recyclerView.mAdapter);
                for (int i2 = 0; i2 < bVar.f4191d * 2; i2 += 2) {
                    m4511i(recyclerView, bVar.f4190c[i2], j2);
                }
            } finally {
                C0275d.m1841b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC0590c0 m4511i(RecyclerView recyclerView, int i2, long j2) {
        if (m4509e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.C0609v c0609v = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC0590c0 abstractC0590c0M4270I = c0609v.m4270I(i2, false, j2);
            if (abstractC0590c0M4270I != null) {
                if (!abstractC0590c0M4270I.isBound() || abstractC0590c0M4270I.isInvalid()) {
                    c0609v.m4275a(abstractC0590c0M4270I, false);
                } else {
                    c0609v.m4264B(abstractC0590c0M4270I.itemView);
                }
            }
            return abstractC0590c0M4270I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void m4512a(RecyclerView recyclerView) {
        this.f4184h.add(recyclerView);
    }

    /* renamed from: f */
    void m4513f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f4185i == 0) {
            this.f4185i = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m4520e(i2, i3);
    }

    /* renamed from: g */
    void m4514g(long j2) {
        m4506b();
        m4508d(j2);
    }

    /* renamed from: j */
    public void m4515j(RecyclerView recyclerView) {
        this.f4184h.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0275d.m1840a("RV Prefetch");
            if (!this.f4184h.isEmpty()) {
                int size = this.f4184h.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f4184h.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m4514g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4186j);
                }
            }
        } finally {
            this.f4185i = 0L;
            C0275d.m1841b();
        }
    }
}
