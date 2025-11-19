package n2;

import U1.G;
import U1.v;

/* compiled from: TimelineWithUpdatedMediaItem.java */
/* loaded from: classes.dex */
public final class v extends androidx.media3.exoplayer.source.m {

    /* renamed from: f, reason: collision with root package name */
    private final U1.v f45674f;

    public v(G g10, U1.v vVar) {
        super(g10);
        this.f45674f = vVar;
    }

    @Override // androidx.media3.exoplayer.source.m, U1.G
    public G.c o(int i10, G.c cVar, long j10) {
        super.o(i10, cVar, j10);
        U1.v vVar = this.f45674f;
        cVar.f16846c = vVar;
        v.h hVar = vVar.f17234b;
        cVar.f16845b = hVar != null ? hVar.f17333h : null;
        return cVar;
    }
}
