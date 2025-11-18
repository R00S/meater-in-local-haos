package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ViewTypeStorage.java */
/* loaded from: classes.dex */
interface z {

    /* compiled from: ViewTypeStorage.java */
    public static class a implements z {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<o> f29044a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        int f29045b = 0;

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.z$a$a, reason: collision with other inner class name */
        class C0394a implements c {

            /* renamed from: a, reason: collision with root package name */
            private SparseIntArray f29046a = new SparseIntArray(1);

            /* renamed from: b, reason: collision with root package name */
            private SparseIntArray f29047b = new SparseIntArray(1);

            /* renamed from: c, reason: collision with root package name */
            final o f29048c;

            C0394a(o oVar) {
                this.f29048c = oVar;
            }

            @Override // androidx.recyclerview.widget.z.c
            public int a(int i10) {
                int iIndexOfKey = this.f29047b.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return this.f29047b.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i10 + " does not belong to the adapter:" + this.f29048c.f29002c);
            }

            @Override // androidx.recyclerview.widget.z.c
            public int b(int i10) {
                int iIndexOfKey = this.f29046a.indexOfKey(i10);
                if (iIndexOfKey > -1) {
                    return this.f29046a.valueAt(iIndexOfKey);
                }
                int iC = a.this.c(this.f29048c);
                this.f29046a.put(i10, iC);
                this.f29047b.put(iC, i10);
                return iC;
            }
        }

        @Override // androidx.recyclerview.widget.z
        public o a(int i10) {
            o oVar = this.f29044a.get(i10);
            if (oVar != null) {
                return oVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.z
        public c b(o oVar) {
            return new C0394a(oVar);
        }

        int c(o oVar) {
            int i10 = this.f29045b;
            this.f29045b = i10 + 1;
            this.f29044a.put(i10, oVar);
            return i10;
        }
    }

    /* compiled from: ViewTypeStorage.java */
    public interface c {
        int a(int i10);

        int b(int i10);
    }

    o a(int i10);

    c b(o oVar);

    /* compiled from: ViewTypeStorage.java */
    public static class b implements z {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<List<o>> f29050a = new SparseArray<>();

        @Override // androidx.recyclerview.widget.z
        public o a(int i10) {
            List<o> list = this.f29050a.get(i10);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.z
        public c b(o oVar) {
            return new a(oVar);
        }

        /* compiled from: ViewTypeStorage.java */
        class a implements c {

            /* renamed from: a, reason: collision with root package name */
            final o f29051a;

            a(o oVar) {
                this.f29051a = oVar;
            }

            @Override // androidx.recyclerview.widget.z.c
            public int b(int i10) {
                List<o> arrayList = b.this.f29050a.get(i10);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b.this.f29050a.put(i10, arrayList);
                }
                if (!arrayList.contains(this.f29051a)) {
                    arrayList.add(this.f29051a);
                }
                return i10;
            }

            @Override // androidx.recyclerview.widget.z.c
            public int a(int i10) {
                return i10;
            }
        }
    }
}
