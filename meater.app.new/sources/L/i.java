package L;

import Ba.p;
import H0.TextStyle;
import i0.C3602t0;
import kotlin.C1273Z;
import kotlin.C1298s;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: ProvideContentColorTextStyle.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Li0/t0;", "contentColor", "LH0/J;", "textStyle", "Lkotlin/Function0;", "Loa/F;", "content", "a", "(JLH0/J;LBa/p;LO/l;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* compiled from: ProvideContentColorTextStyle.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ long f8910B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ TextStyle f8911C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8912D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f8913E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j10, TextStyle textStyle, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f8910B = j10;
            this.f8911C = textStyle;
            this.f8912D = pVar;
            this.f8913E = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            i.a(this.f8910B, this.f8911C, this.f8912D, interfaceC1554l, C1509K0.a(this.f8913E | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(long j10, TextStyle textStyle, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.i(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.R(textStyle) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.l(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-716124955, i11, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            C1576w.b(new C1503H0[]{C1298s.a().d(C3602t0.g(j10)), C1273Z.d().d(((TextStyle) interfaceC1554lR.o(C1273Z.d())).I(textStyle))}, pVar, interfaceC1554lR, ((i11 >> 3) & 112) | C1503H0.f12626i);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new a(j10, textStyle, pVar, i10));
        }
    }
}
