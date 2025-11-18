package Xb;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t¨\u0006\u0014"}, d2 = {"LXb/x0;", "LXb/C0;", "LXb/x;", "LXb/v0;", "parent", "<init>", "(LXb/v0;)V", "", "b1", "()Z", "", "exception", "d", "(Ljava/lang/Throwable;)Z", "D", "Z", "m0", "handlesException", "n0", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1871x0 extends C0 implements InterfaceC1870x {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesException;

    public C1871x0(InterfaceC1867v0 interfaceC1867v0) {
        super(true);
        w0(interfaceC1867v0);
        this.handlesException = b1();
    }

    private final boolean b1() {
        C0 c0W;
        r rVarQ0 = q0();
        C1860s c1860s = rVarQ0 instanceof C1860s ? (C1860s) rVarQ0 : null;
        if (c1860s != null && (c0W = c1860s.w()) != null) {
            while (!c0W.getHandlesException()) {
                r rVarQ02 = c0W.q0();
                C1860s c1860s2 = rVarQ02 instanceof C1860s ? (C1860s) rVarQ02 : null;
                if (c1860s2 == null || (c0W = c1860s2.w()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Xb.InterfaceC1870x
    public boolean d(Throwable exception) {
        return D0(new C1874z(exception, false, 2, null));
    }

    @Override // Xb.C0
    /* renamed from: m0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // Xb.C0
    public boolean n0() {
        return true;
    }
}
