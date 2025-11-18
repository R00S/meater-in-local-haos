package kotlin;

import U0.d;
import U0.h;
import h0.C3476g;
import java.util.List;
import kotlin.Metadata;
import u0.C4649o;
import u0.PointerInputChange;

/* compiled from: AndroidScrollable.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lx/a;", "Lx/t;", "<init>", "()V", "LU0/d;", "Lu0/o;", "event", "LU0/r;", "bounds", "Lh0/g;", "a", "(LU0/d;Lu0/o;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5021a implements InterfaceC5040t {

    /* renamed from: a, reason: collision with root package name */
    public static final C5021a f52330a = new C5021a();

    private C5021a() {
    }

    @Override // kotlin.InterfaceC5040t
    public long a(d dVar, C4649o c4649o, long j10) {
        List<PointerInputChange> listC = c4649o.c();
        C3476g c3476gD = C3476g.d(C3476g.INSTANCE.c());
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            c3476gD = C3476g.d(C3476g.r(c3476gD.getPackedValue(), listC.get(i10).getScrollDelta()));
        }
        return C3476g.s(c3476gD.getPackedValue(), -dVar.X0(h.u(64)));
    }
}
