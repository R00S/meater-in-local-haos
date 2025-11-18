package k0;

import h0.C3476g;
import h0.C3482m;
import h0.C3483n;
import i0.InterfaceC3586l0;
import i0.K0;
import i0.R0;
import kotlin.Metadata;

/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk0/d;", "Lk0/h;", "b", "(Lk0/d;)Lk0/h;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3782b {

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ:\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"k0/b$a", "Lk0/h;", "", "left", "top", "right", "bottom", "Loa/F;", "f", "(FFFF)V", "Li0/s0;", "clipOp", "a", "(FFFFI)V", "Li0/R0;", "path", "c", "(Li0/R0;I)V", "b", "(FF)V", "scaleX", "scaleY", "Lh0/g;", "pivot", "e", "(FFJ)V", "Li0/L0;", "matrix", "d", "([F)V", "Lh0/m;", "h", "()J", "size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k0.b$a */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f43719a;

        a(d dVar) {
            this.f43719a = dVar;
        }

        @Override // k0.h
        public void a(float left, float top, float right, float bottom, int clipOp) {
            this.f43719a.G().a(left, top, right, bottom, clipOp);
        }

        @Override // k0.h
        public void b(float left, float top) {
            this.f43719a.G().b(left, top);
        }

        @Override // k0.h
        public void c(R0 path, int clipOp) {
            this.f43719a.G().c(path, clipOp);
        }

        @Override // k0.h
        public void d(float[] matrix) {
            this.f43719a.G().k(matrix);
        }

        @Override // k0.h
        public void e(float scaleX, float scaleY, long pivot) {
            InterfaceC3586l0 interfaceC3586l0G = this.f43719a.G();
            interfaceC3586l0G.b(C3476g.m(pivot), C3476g.n(pivot));
            interfaceC3586l0G.f(scaleX, scaleY);
            interfaceC3586l0G.b(-C3476g.m(pivot), -C3476g.n(pivot));
        }

        @Override // k0.h
        public void f(float left, float top, float right, float bottom) {
            InterfaceC3586l0 interfaceC3586l0G = this.f43719a.G();
            d dVar = this.f43719a;
            long jA = C3483n.a(C3482m.i(h()) - (right + left), C3482m.g(h()) - (bottom + top));
            if (!(C3482m.i(jA) >= 0.0f && C3482m.g(jA) >= 0.0f)) {
                K0.a("Width and height must be greater than or equal to zero");
            }
            dVar.E(jA);
            interfaceC3586l0G.b(left, top);
        }

        public long h() {
            return this.f43719a.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(d dVar) {
        return new a(dVar);
    }
}
