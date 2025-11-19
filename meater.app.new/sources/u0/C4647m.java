package u0;

import kotlin.Metadata;
import s.C4386H;
import s.C4411v;
import y0.InterfaceC5116v;

/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0003J%\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lu0/m;", "", "<init>", "()V", "Ls/v;", "Lu0/z;", "changes", "Ly0/v;", "parentCoordinates", "Lu0/g;", "internalPointerEvent", "", "isInBounds", "a", "(Ls/v;Ly0/v;Lu0/g;Z)Z", "f", "e", "(Lu0/g;)Z", "Loa/F;", "d", "c", "", "pointerIdValue", "Ls/H;", "Lu0/l;", "hitNodes", "i", "(JLs/H;)V", "h", "b", "(Lu0/g;)V", "LQ/b;", "LQ/b;", "g", "()LQ/b;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4647m {

    /* renamed from: b, reason: collision with root package name */
    public static final int f50282b = Q.b.f14177E;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Q.b<Node> children = new Q.b<>(new Node[16], 0);

    public boolean a(C4411v<PointerInputChange> changes, InterfaceC5116v parentCoordinates, C4641g internalPointerEvent, boolean isInBounds) {
        Q.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] c4646lArrT = bVar.t();
        int i10 = 0;
        boolean z10 = false;
        do {
            z10 = c4646lArrT[i10].a(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
            i10++;
        } while (i10 < size);
        return z10;
    }

    public void b(C4641g internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.t()[size].getPointerIds().g()) {
                this.children.E(size);
            }
        }
    }

    public final void c() {
        this.children.l();
    }

    public void d() {
        Q.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size > 0) {
            Node[] c4646lArrT = bVar.t();
            int i10 = 0;
            do {
                c4646lArrT[i10].d();
                i10++;
            } while (i10 < size);
        }
    }

    public boolean e(C4641g internalPointerEvent) {
        Q.b<Node> bVar = this.children;
        int size = bVar.getSize();
        boolean z10 = false;
        if (size > 0) {
            Node[] c4646lArrT = bVar.t();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = c4646lArrT[i10].e(internalPointerEvent) || z11;
                i10++;
            } while (i10 < size);
            z10 = z11;
        }
        b(internalPointerEvent);
        return z10;
    }

    public boolean f(C4411v<PointerInputChange> changes, InterfaceC5116v parentCoordinates, C4641g internalPointerEvent, boolean isInBounds) {
        Q.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] c4646lArrT = bVar.t();
        int i10 = 0;
        boolean z10 = false;
        do {
            z10 = c4646lArrT[i10].f(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
            i10++;
        } while (i10 < size);
        return z10;
    }

    public final Q.b<Node> g() {
        return this.children;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.children.getSize()) {
            Node c4646l = this.children.t()[i10];
            if (c4646l.getPointerInputFilter().getIsAttached()) {
                i10++;
                c4646l.h();
            } else {
                c4646l.d();
                this.children.E(i10);
            }
        }
    }

    public void i(long pointerIdValue, C4386H<Node> hitNodes) {
        Q.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size > 0) {
            Node[] c4646lArrT = bVar.t();
            int i10 = 0;
            do {
                c4646lArrT[i10].i(pointerIdValue, hitNodes);
                i10++;
            } while (i10 < size);
        }
    }
}
