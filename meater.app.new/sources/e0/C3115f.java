package e0;

import A0.A0;
import A0.B0;
import A0.C0832k;
import A0.z0;
import Ba.l;
import U0.r;
import h0.C3476g;
import kotlin.Metadata;
import y0.C5117w;
import y0.InterfaceC5116v;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Le0/g;", "Le0/b;", "event", "Loa/F;", "e", "(Le0/g;Le0/b;)V", "Le0/d;", "Lh0/g;", "position", "", "d", "(Le0/d;J)Z", "LA0/A0;", "T", "Lkotlin/Function1;", "LA0/z0;", "block", "f", "(LA0/A0;LBa/l;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3115f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC3113d interfaceC3113d, long j10) {
        if (!interfaceC3113d.getNode().getIsAttached()) {
            return false;
        }
        InterfaceC5116v interfaceC5116vH = C0832k.k(interfaceC3113d).h();
        if (!interfaceC5116vH.L()) {
            return false;
        }
        long jA = interfaceC5116vH.a();
        int iG = r.g(jA);
        int iF = r.f(jA);
        long jE = C5117w.e(interfaceC5116vH);
        float fM = C3476g.m(jE);
        float fN = C3476g.n(jE);
        float f10 = iG + fM;
        float f11 = iF + fN;
        float fM2 = C3476g.m(j10);
        if (fM > fM2 || fM2 > f10) {
            return false;
        }
        float fN2 = C3476g.n(j10);
        return fN <= fN2 && fN2 <= f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC3116g interfaceC3116g, C3111b c3111b) {
        interfaceC3116g.z1(c3111b);
        interfaceC3116g.L0(c3111b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends A0> void f(T t10, l<? super T, ? extends z0> lVar) {
        if (lVar.invoke(t10) != z0.ContinueTraversal) {
            return;
        }
        B0.f(t10, lVar);
    }
}
