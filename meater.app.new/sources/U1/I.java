package U1;

import java.util.Collections;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: TrackSelectionOverride.java */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16867c = X1.L.B0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f16868d = X1.L.B0(1);

    /* renamed from: a, reason: collision with root package name */
    public final H f16869a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4009y<Integer> f16870b;

    public I(H h10, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= h10.f16862a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f16869a = h10;
        this.f16870b = AbstractC4009y.B(list);
    }

    public int a() {
        return this.f16869a.f16864c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i10 = (I) obj;
        return this.f16869a.equals(i10.f16869a) && this.f16870b.equals(i10.f16870b);
    }

    public int hashCode() {
        return this.f16869a.hashCode() + (this.f16870b.hashCode() * 31);
    }
}
