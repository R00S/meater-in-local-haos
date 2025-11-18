package s;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import t.C4535d;

/* compiled from: FloatSet.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Ls/y;", "Ls/h;", "", "initialCapacity", "<init>", "(I)V", "Loa/F;", "g", "capacity", "f", "e", "()V", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4414y extends AbstractC4398h {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public C4414y(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C4535d.a("Capacity must be a positive value.");
        }
        g(U.g(i10));
    }

    private final void e() {
        this.growthLimit = U.c(get_capacity()) - this._size;
    }

    private final void f(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = U.f48663a;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            C3831l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i10 = capacity >> 3;
        long j10 = 255 << ((capacity & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        e();
    }

    private final void g(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, U.f(initialCapacity)) : 0;
        this._capacity = iMax;
        f(iMax);
        this.elements = new float[iMax];
    }
}
