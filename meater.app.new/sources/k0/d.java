package k0;

import U0.t;
import i0.InterfaceC3586l0;
import kotlin.Metadata;
import l0.C3870c;

/* compiled from: DrawContext.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0007\u001a\u00020\u00028&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lk0/d;", "", "Lh0/m;", "C", "()J", "E", "(J)V", "size", "Li0/l0;", "<anonymous parameter 0>", "G", "()Li0/l0;", "H", "(Li0/l0;)V", "canvas", "Lk0/h;", "D", "()Lk0/h;", "transform", "LU0/t;", "getLayoutDirection", "()LU0/t;", "b", "(LU0/t;)V", "layoutDirection", "LU0/d;", "getDensity", "()LU0/d;", "c", "(LU0/d;)V", "density", "Ll0/c;", "F", "()Ll0/c;", "I", "(Ll0/c;)V", "graphicsLayer", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d {
    long C();

    /* renamed from: D */
    h getTransform();

    void E(long j10);

    /* renamed from: F */
    default C3870c getGraphicsLayer() {
        return null;
    }

    default InterfaceC3586l0 G() {
        return new i();
    }

    default U0.d getDensity() {
        return e.a();
    }

    default t getLayoutDirection() {
        return t.Ltr;
    }

    default void H(InterfaceC3586l0 interfaceC3586l0) {
    }

    default void I(C3870c c3870c) {
    }

    default void b(t tVar) {
    }

    default void c(U0.d dVar) {
    }
}
