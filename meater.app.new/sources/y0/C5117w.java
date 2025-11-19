package y0;

import A0.AbstractC0823c0;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly0/v;", "Lh0/g;", "e", "(Ly0/v;)J", "f", "Lh0/i;", "b", "(Ly0/v;)Lh0/i;", "c", "a", "d", "(Ly0/v;)Ly0/v;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5117w {
    public static final C3478i a(InterfaceC5116v interfaceC5116v) {
        C3478i c3478iX;
        InterfaceC5116v interfaceC5116vU = interfaceC5116v.U();
        return (interfaceC5116vU == null || (c3478iX = InterfaceC5116v.X(interfaceC5116vU, interfaceC5116v, false, 2, null)) == null) ? new C3478i(0.0f, 0.0f, U0.r.g(interfaceC5116v.a()), U0.r.f(interfaceC5116v.a())) : c3478iX;
    }

    public static final C3478i b(InterfaceC5116v interfaceC5116v) {
        return InterfaceC5116v.X(d(interfaceC5116v), interfaceC5116v, false, 2, null);
    }

    public static final C3478i c(InterfaceC5116v interfaceC5116v) {
        InterfaceC5116v interfaceC5116vD = d(interfaceC5116v);
        float fG = U0.r.g(interfaceC5116vD.a());
        float f10 = U0.r.f(interfaceC5116vD.a());
        C3478i c3478iB = b(interfaceC5116v);
        float left = c3478iB.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fG) {
            left = fG;
        }
        float top = c3478iB.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f10) {
            top = f10;
        }
        float right = c3478iB.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fG) {
            fG = right;
        }
        float bottom = c3478iB.getBottom();
        float f11 = bottom >= 0.0f ? bottom : 0.0f;
        if (f11 <= f10) {
            f10 = f11;
        }
        if (left == fG || top == f10) {
            return C3478i.INSTANCE.a();
        }
        long jU = interfaceC5116vD.u(C3477h.a(left, top));
        long jU2 = interfaceC5116vD.u(C3477h.a(fG, top));
        long jU3 = interfaceC5116vD.u(C3477h.a(fG, f10));
        long jU4 = interfaceC5116vD.u(C3477h.a(left, f10));
        float fM = C3476g.m(jU);
        float fM2 = C3476g.m(jU2);
        float fM3 = C3476g.m(jU4);
        float fM4 = C3476g.m(jU3);
        float fMin = Math.min(fM, Math.min(fM2, Math.min(fM3, fM4)));
        float fMax = Math.max(fM, Math.max(fM2, Math.max(fM3, fM4)));
        float fN = C3476g.n(jU);
        float fN2 = C3476g.n(jU2);
        float fN3 = C3476g.n(jU4);
        float fN4 = C3476g.n(jU3);
        return new C3478i(fMin, Math.min(fN, Math.min(fN2, Math.min(fN3, fN4))), fMax, Math.max(fN, Math.max(fN2, Math.max(fN3, fN4))));
    }

    public static final InterfaceC5116v d(InterfaceC5116v interfaceC5116v) {
        InterfaceC5116v interfaceC5116v2;
        InterfaceC5116v interfaceC5116vU = interfaceC5116v.U();
        while (true) {
            InterfaceC5116v interfaceC5116v3 = interfaceC5116vU;
            interfaceC5116v2 = interfaceC5116v;
            interfaceC5116v = interfaceC5116v3;
            if (interfaceC5116v == null) {
                break;
            }
            interfaceC5116vU = interfaceC5116v.U();
        }
        AbstractC0823c0 abstractC0823c0 = interfaceC5116v2 instanceof AbstractC0823c0 ? (AbstractC0823c0) interfaceC5116v2 : null;
        if (abstractC0823c0 == null) {
            return interfaceC5116v2;
        }
        AbstractC0823c0 wrappedBy = abstractC0823c0.getWrappedBy();
        while (true) {
            AbstractC0823c0 abstractC0823c02 = wrappedBy;
            AbstractC0823c0 abstractC0823c03 = abstractC0823c0;
            abstractC0823c0 = abstractC0823c02;
            if (abstractC0823c0 == null) {
                return abstractC0823c03;
            }
            wrappedBy = abstractC0823c0.getWrappedBy();
        }
    }

    public static final long e(InterfaceC5116v interfaceC5116v) {
        return interfaceC5116v.c0(C3476g.INSTANCE.c());
    }

    public static final long f(InterfaceC5116v interfaceC5116v) {
        return interfaceC5116v.u(C3476g.INSTANCE.c());
    }
}
