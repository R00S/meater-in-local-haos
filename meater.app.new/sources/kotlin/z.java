package kotlin;

import Ba.l;
import androidx.compose.runtime.snapshots.g;
import kotlin.B;
import kotlin.C1538d1;
import kotlin.InterfaceC1557m0;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.r1;
import oa.C4153F;
import y0.X;

/* compiled from: LazyLayoutPinnableItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R+\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR/\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\"\u0010#R/\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010&\"\u0004\b+\u0010(¨\u0006-"}, d2 = {"LC/z;", "Ly0/X;", "Ly0/X$a;", "LC/B$a;", "", "key", "LC/B;", "pinnedItemList", "<init>", "(Ljava/lang/Object;LC/B;)V", "a", "()Ly0/X$a;", "Loa/F;", "c", "()V", "g", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "LC/B;", "", "<set-?>", "LO/m0;", "getIndex", "()I", "h", "(I)V", "index", "d", "e", "k", "pinsCount", "LO/p0;", "i", "(Ly0/X$a;)V", "parentHandle", "f", "()Ly0/X;", "l", "(Ly0/X;)V", "_parentPinnableContainer", "value", "j", "parentPinnableContainer", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class z implements X, X.a, B.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final B pinnedItemList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 index = C1538d1.a(-1);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 pinsCount = C1538d1.a(0);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 parentHandle = r1.c(null, null, 2, null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 _parentPinnableContainer = r1.c(null, null, 2, null);

    public z(Object obj, B b10) {
        this.key = obj;
        this.pinnedItemList = b10;
    }

    private final X.a b() {
        return (X.a) this.parentHandle.getValue();
    }

    private final int e() {
        return this.pinsCount.d();
    }

    private final X f() {
        return (X) this._parentPinnableContainer.getValue();
    }

    private final void i(X.a aVar) {
        this.parentHandle.setValue(aVar);
    }

    private final void k(int i10) {
        this.pinsCount.g(i10);
    }

    private final void l(X x10) {
        this._parentPinnableContainer.setValue(x10);
    }

    @Override // y0.X
    public X.a a() {
        if (e() == 0) {
            this.pinnedItemList.x(this);
            X xD = d();
            i(xD != null ? xD.a() : null);
        }
        k(e() + 1);
        return this;
    }

    @Override // y0.X.a
    public void c() {
        if (e() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        k(e() - 1);
        if (e() == 0) {
            this.pinnedItemList.y(this);
            X.a aVarB = b();
            if (aVarB != null) {
                aVarB.c();
            }
            i(null);
        }
    }

    public final X d() {
        return f();
    }

    public final void g() {
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            c();
        }
    }

    @Override // C.B.a
    public int getIndex() {
        return this.index.d();
    }

    @Override // C.B.a
    public Object getKey() {
        return this.key;
    }

    public void h(int i10) {
        this.index.g(i10);
    }

    public final void j(X x10) {
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
        g gVarF = companion.f(gVarD);
        try {
            if (x10 != f()) {
                l(x10);
                if (e() > 0) {
                    X.a aVarB = b();
                    if (aVarB != null) {
                        aVarB.c();
                    }
                    i(x10 != null ? x10.a() : null);
                }
            }
            C4153F c4153f = C4153F.f46609a;
            companion.m(gVarD, gVarF, lVarH);
        } catch (Throwable th) {
            companion.m(gVarD, gVarF, lVarH);
            throw th;
        }
    }
}
