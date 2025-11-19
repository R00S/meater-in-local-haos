package u0;

import kotlin.Metadata;
import s.C4382D;
import s.C4386H;
import y0.InterfaceC5116v;

/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010$\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lu0/f;", "", "Ly0/v;", "rootCoordinates", "<init>", "(Ly0/v;)V", "", "pointerId", "Ls/H;", "Lu0/l;", "hitNodes", "Loa/F;", "f", "(JLs/H;)V", "Lu0/y;", "", "Lb0/i$c;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "a", "(JLjava/util/List;Z)V", "Lu0/g;", "internalPointerEvent", "isInBounds", "c", "(Lu0/g;Z)Z", "b", "()V", "d", "e", "Ly0/v;", "Lu0/m;", "Lu0/m;", "getRoot$ui_release", "()Lu0/m;", "root", "Ls/D;", "Ls/D;", "hitPointerIdsAndNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4640f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5116v rootCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4647m root = new C4647m();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4382D<C4386H<Node>> hitPointerIdsAndNodes = new C4382D<>(10);

    public C4640f(InterfaceC5116v interfaceC5116v) {
        this.rootCoordinates = interfaceC5116v;
    }

    private final void f(long pointerId, C4386H<Node> hitNodes) {
        this.root.i(pointerId, hitNodes);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r18, java.util.List<? extends b0.i.c> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C4640f.a(long, java.util.List, boolean):void");
    }

    public final void b() {
        this.root.c();
    }

    public final boolean c(C4641g internalPointerEvent, boolean isInBounds) {
        if (this.root.a(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return this.root.e(internalPointerEvent) || this.root.f(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds);
        }
        return false;
    }

    public final void d() {
        this.root.d();
        b();
    }

    public final void e() {
        this.root.h();
    }
}
