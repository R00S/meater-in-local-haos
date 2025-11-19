package w;

import A.Y;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: Canvas.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb0/i;", "modifier", "Lkotlin/Function1;", "Lk0/f;", "Loa/F;", "onDraw", "a", "(Lb0/i;LBa/l;LO/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4960e {

    /* compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w.e$a */
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f51710B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<k0.f, C4153F> f51711C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f51712D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0.i iVar, Ba.l<? super k0.f, C4153F> lVar, int i10) {
            super(2);
            this.f51710B = iVar;
            this.f51711C = lVar;
            this.f51712D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C4960e.a(this.f51710B, this.f51711C, interfaceC1554l, C1509K0.a(this.f51712D | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(b0.i iVar, Ba.l<? super k0.f, C4153F> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(lVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-932836462, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            Y.a(androidx.compose.ui.draw.a.a(iVar, lVar), interfaceC1554lR, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new a(iVar, lVar, i10));
        }
    }
}
