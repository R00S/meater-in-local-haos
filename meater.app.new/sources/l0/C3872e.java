package l0;

import h0.C3470a;
import h0.C3477h;
import h0.C3480k;
import h0.C3483n;
import i0.N0;
import kotlin.Metadata;

/* compiled from: GraphicsLayer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk0/f;", "Ll0/c;", "graphicsLayer", "Loa/F;", "a", "(Lk0/f;Ll0/c;)V", "Li0/N0;", "outline", "b", "(Ll0/c;Li0/N0;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3872e {
    public static final void a(k0.f fVar, C3870c c3870c) {
        c3870c.h(fVar.getDrawContext().G(), fVar.getDrawContext().getGraphicsLayer());
    }

    public static final void b(C3870c c3870c, N0 n02) {
        if (n02 instanceof N0.b) {
            N0.b bVar = (N0.b) n02;
            c3870c.R(C3477h.a(bVar.b().getLeft(), bVar.b().getTop()), C3483n.a(bVar.b().k(), bVar.b().e()));
            return;
        }
        if (n02 instanceof N0.a) {
            c3870c.O(((N0.a) n02).getPath());
            return;
        }
        if (n02 instanceof N0.c) {
            N0.c cVar = (N0.c) n02;
            if (cVar.getRoundRectPath() != null) {
                c3870c.O(cVar.getRoundRectPath());
            } else {
                C3480k roundRect = cVar.getRoundRect();
                c3870c.W(C3477h.a(roundRect.getLeft(), roundRect.getTop()), C3483n.a(roundRect.j(), roundRect.d()), C3470a.d(roundRect.getBottomLeftCornerRadius()));
            }
        }
    }
}
