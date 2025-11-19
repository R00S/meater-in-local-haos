package y0;

import h0.C3478i;
import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ.\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Ly0/v;", "", "Lh0/g;", "relativeToLocal", "u", "(J)J", "c0", "sourceCoordinates", "relativeToSource", "R", "(Ly0/v;J)J", "", "includeMotionFrameOfReference", "g0", "(Ly0/v;JZ)J", "clipBounds", "Lh0/i;", "M", "(Ly0/v;Z)Lh0/i;", "LU0/r;", "a", "()J", "size", "U", "()Ly0/v;", "parentLayoutCoordinates", "L", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5116v {
    static /* synthetic */ C3478i X(InterfaceC5116v interfaceC5116v, InterfaceC5116v interfaceC5116v2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return interfaceC5116v.M(interfaceC5116v2, z10);
    }

    boolean L();

    C3478i M(InterfaceC5116v sourceCoordinates, boolean clipBounds);

    long R(InterfaceC5116v sourceCoordinates, long relativeToSource);

    InterfaceC5116v U();

    long a();

    long c0(long relativeToLocal);

    default long g0(InterfaceC5116v sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    long u(long relativeToLocal);
}
