package f7;

import com.google.android.gms.common.data.DataHolder;
import g7.C3443n;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: B, reason: collision with root package name */
    protected final DataHolder f41377B;

    /* renamed from: C, reason: collision with root package name */
    protected int f41378C;

    /* renamed from: D, reason: collision with root package name */
    private int f41379D;

    public d(DataHolder dataHolder, int i10) {
        this.f41377B = (DataHolder) C3445p.k(dataHolder);
        e(i10);
    }

    protected byte[] a(String str) {
        return this.f41377B.f0(str, this.f41378C, this.f41379D);
    }

    protected int b(String str) {
        return this.f41377B.h0(str, this.f41378C, this.f41379D);
    }

    protected String d(String str) {
        return this.f41377B.G0(str, this.f41378C, this.f41379D);
    }

    protected final void e(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f41377B.getCount()) {
            z10 = true;
        }
        C3445p.n(z10);
        this.f41378C = i10;
        this.f41379D = this.f41377B.O0(i10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (C3443n.a(Integer.valueOf(dVar.f41378C), Integer.valueOf(this.f41378C)) && C3443n.a(Integer.valueOf(dVar.f41379D), Integer.valueOf(this.f41379D)) && dVar.f41377B == this.f41377B) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C3443n.b(Integer.valueOf(this.f41378C), Integer.valueOf(this.f41379D), this.f41377B);
    }
}
