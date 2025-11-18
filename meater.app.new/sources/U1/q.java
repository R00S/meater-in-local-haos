package U1;

import X1.C1804a;
import android.util.SparseBooleanArray;

/* compiled from: FlagSet.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f17096a;

    /* compiled from: FlagSet.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f17097a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f17098b;

        public b a(int i10) {
            C1804a.g(!this.f17098b);
            this.f17097a.append(i10, true);
            return this;
        }

        public b b(q qVar) {
            for (int i10 = 0; i10 < qVar.d(); i10++) {
                a(qVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public q e() {
            C1804a.g(!this.f17098b);
            this.f17098b = true;
            return new q(this.f17097a);
        }
    }

    public boolean a(int i10) {
        return this.f17096a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        C1804a.c(i10, 0, d());
        return this.f17096a.keyAt(i10);
    }

    public int d() {
        return this.f17096a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (X1.L.f18626a >= 24) {
            return this.f17096a.equals(qVar.f17096a);
        }
        if (d() != qVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != qVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (X1.L.f18626a >= 24) {
            return this.f17096a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }

    private q(SparseBooleanArray sparseBooleanArray) {
        this.f17096a = sparseBooleanArray;
    }
}
