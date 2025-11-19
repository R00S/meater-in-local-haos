package E0;

import F0.p;
import kotlin.Metadata;
import y0.InterfaceC5116v;

/* compiled from: ScrollCapture.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"LE0/m;", "", "LF0/p;", "node", "", "depth", "LU0/p;", "viewportBoundsInWindow", "Ly0/v;", "coordinates", "<init>", "(LF0/p;ILU0/p;Ly0/v;)V", "", "toString", "()Ljava/lang/String;", "a", "LF0/p;", "c", "()LF0/p;", "b", "I", "()I", "LU0/p;", "d", "()LU0/p;", "Ly0/v;", "()Ly0/v;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E0.m, reason: from toString */
/* loaded from: classes.dex */
final class ScrollCaptureCandidate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p node;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int depth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final U0.p viewportBoundsInWindow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5116v coordinates;

    public ScrollCaptureCandidate(p pVar, int i10, U0.p pVar2, InterfaceC5116v interfaceC5116v) {
        this.node = pVar;
        this.depth = i10;
        this.viewportBoundsInWindow = pVar2;
        this.coordinates = interfaceC5116v;
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC5116v getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: b, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* renamed from: c, reason: from getter */
    public final p getNode() {
        return this.node;
    }

    /* renamed from: d, reason: from getter */
    public final U0.p getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }
}
