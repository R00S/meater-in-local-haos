package i0;

import h0.C3470a;
import h0.C3471b;
import h0.C3477h;
import h0.C3478i;
import h0.C3480k;
import h0.C3483n;
import i0.N0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aN\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aN\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0018*\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lk0/f;", "Li0/N0;", "outline", "Li0/t0;", "color", "", "alpha", "Lk0/g;", "style", "Li0/u0;", "colorFilter", "Li0/b0;", "blendMode", "Loa/F;", "c", "(Lk0/f;Li0/N0;JFLk0/g;Li0/u0;I)V", "Li0/j0;", "brush", "a", "(Lk0/f;Li0/N0;Li0/j0;FLk0/g;Li0/u0;I)V", "Lh0/i;", "Lh0/g;", "g", "(Lh0/i;)J", "Lh0/m;", "e", "Lh0/k;", "h", "(Lh0/k;)J", "f", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O0 {
    public static final void a(k0.f fVar, N0 n02, AbstractC3582j0 abstractC3582j0, float f10, k0.g gVar, C3604u0 c3604u0, int i10) {
        R0 path;
        if (n02 instanceof N0.b) {
            C3478i c3478iB = ((N0.b) n02).b();
            fVar.g1(abstractC3582j0, g(c3478iB), e(c3478iB), f10, gVar, c3604u0, i10);
            return;
        }
        if (n02 instanceof N0.c) {
            N0.c cVar = (N0.c) n02;
            path = cVar.getRoundRectPath();
            if (path == null) {
                C3480k roundRect = cVar.getRoundRect();
                fVar.d1(abstractC3582j0, h(roundRect), f(roundRect), C3471b.b(C3470a.d(roundRect.getBottomLeftCornerRadius()), 0.0f, 2, null), f10, gVar, c3604u0, i10);
                return;
            }
        } else {
            if (!(n02 instanceof N0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((N0.a) n02).getPath();
        }
        fVar.O0(path, abstractC3582j0, f10, gVar, c3604u0, i10);
    }

    public static /* synthetic */ void b(k0.f fVar, N0 n02, AbstractC3582j0 abstractC3582j0, float f10, k0.g gVar, C3604u0 c3604u0, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            gVar = k0.j.f43725a;
        }
        k0.g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            c3604u0 = null;
        }
        C3604u0 c3604u02 = c3604u0;
        if ((i11 & 32) != 0) {
            i10 = k0.f.INSTANCE.a();
        }
        a(fVar, n02, abstractC3582j0, f11, gVar2, c3604u02, i10);
    }

    public static final void c(k0.f fVar, N0 n02, long j10, float f10, k0.g gVar, C3604u0 c3604u0, int i10) {
        R0 path;
        if (n02 instanceof N0.b) {
            C3478i c3478iB = ((N0.b) n02).b();
            fVar.x0(j10, g(c3478iB), e(c3478iB), f10, gVar, c3604u0, i10);
            return;
        }
        if (n02 instanceof N0.c) {
            N0.c cVar = (N0.c) n02;
            path = cVar.getRoundRectPath();
            if (path == null) {
                C3480k roundRect = cVar.getRoundRect();
                fVar.h1(j10, h(roundRect), f(roundRect), C3471b.b(C3470a.d(roundRect.getBottomLeftCornerRadius()), 0.0f, 2, null), gVar, f10, c3604u0, i10);
                return;
            }
        } else {
            if (!(n02 instanceof N0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((N0.a) n02).getPath();
        }
        fVar.O(path, j10, f10, gVar, c3604u0, i10);
    }

    private static final long e(C3478i c3478i) {
        return C3483n.a(c3478i.k(), c3478i.e());
    }

    private static final long f(C3480k c3480k) {
        return C3483n.a(c3480k.j(), c3480k.d());
    }

    private static final long g(C3478i c3478i) {
        return C3477h.a(c3478i.getLeft(), c3478i.getTop());
    }

    private static final long h(C3480k c3480k) {
        return C3477h.a(c3480k.getLeft(), c3480k.getTop());
    }
}
