package androidx.media3.exoplayer.source;

import X1.C1804a;
import X1.InterfaceC1811h;
import android.util.SparseArray;

/* compiled from: SpannedData.java */
/* loaded from: classes.dex */
final class J<V> {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1811h<V> f27682c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f27681b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f27680a = -1;

    public J(InterfaceC1811h<V> interfaceC1811h) {
        this.f27682c = interfaceC1811h;
    }

    public void a(int i10, V v10) {
        if (this.f27680a == -1) {
            C1804a.g(this.f27681b.size() == 0);
            this.f27680a = 0;
        }
        if (this.f27681b.size() > 0) {
            SparseArray<V> sparseArray = this.f27681b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C1804a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                InterfaceC1811h<V> interfaceC1811h = this.f27682c;
                SparseArray<V> sparseArray2 = this.f27681b;
                interfaceC1811h.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f27681b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f27681b.size(); i10++) {
            this.f27682c.accept(this.f27681b.valueAt(i10));
        }
        this.f27680a = -1;
        this.f27681b.clear();
    }

    public void c(int i10) {
        for (int size = this.f27681b.size() - 1; size >= 0 && i10 < this.f27681b.keyAt(size); size--) {
            this.f27682c.accept(this.f27681b.valueAt(size));
            this.f27681b.removeAt(size);
        }
        this.f27680a = this.f27681b.size() > 0 ? Math.min(this.f27680a, this.f27681b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f27681b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f27681b.keyAt(i12)) {
                return;
            }
            this.f27682c.accept(this.f27681b.valueAt(i11));
            this.f27681b.removeAt(i11);
            int i13 = this.f27680a;
            if (i13 > 0) {
                this.f27680a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f27680a == -1) {
            this.f27680a = 0;
        }
        while (true) {
            int i11 = this.f27680a;
            if (i11 <= 0 || i10 >= this.f27681b.keyAt(i11)) {
                break;
            }
            this.f27680a--;
        }
        while (this.f27680a < this.f27681b.size() - 1 && i10 >= this.f27681b.keyAt(this.f27680a + 1)) {
            this.f27680a++;
        }
        return this.f27681b.valueAt(this.f27680a);
    }

    public V f() {
        return this.f27681b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f27681b.size() == 0;
    }
}
