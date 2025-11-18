package kotlin;

import Ba.l;
import Ba.p;
import H0.TextLayoutResult;
import H0.TextStyle;
import R0.j;
import b0.i;
import i0.InterfaceC3608w0;
import kotlin.AbstractC1341l;
import kotlin.AbstractC1501G0;
import kotlin.C1352w;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.FontWeight;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.m1;
import oa.C4153F;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a%\u0010(\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0&H\u0007¢\u0006\u0004\b(\u0010)\"\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0*8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"", "text", "Lb0/i;", "modifier", "Li0/t0;", "color", "LU0/v;", "fontSize", "LL0/w;", "fontStyle", "LL0/B;", "fontWeight", "LL0/l;", "fontFamily", "letterSpacing", "LR0/j;", "textDecoration", "LR0/i;", "textAlign", "lineHeight", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "LH0/F;", "Loa/F;", "onTextLayout", "LH0/J;", "style", "b", "(Ljava/lang/String;Lb0/i;JJLL0/w;LL0/B;LL0/l;JLR0/j;LR0/i;JIZIILBa/l;LH0/J;LO/l;III)V", "c", "(Ljava/lang/String;Lb0/i;JJLL0/w;LL0/B;LL0/l;JLR0/j;LR0/i;JIZILBa/l;LH0/J;LO/l;III)V", "value", "Lkotlin/Function0;", "content", "a", "(LH0/J;LBa/p;LO/l;I)V", "LO/G0;", "LO/G0;", "getLocalTextStyle", "()LO/G0;", "LocalTextStyle", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<TextStyle> f6360a = C1576w.c(m1.o(), a.f6361B);

    /* compiled from: Text.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH0/J;", "a", "()LH0/J;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<TextStyle> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f6361B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextStyle invoke() {
            return n0.b();
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ TextStyle f6362B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6363C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f6364D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(TextStyle textStyle, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f6362B = textStyle;
            this.f6363C = pVar;
            this.f6364D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            l0.a(this.f6362B, this.f6363C, interfaceC1554l, C1509K0.a(this.f6364D | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/t0;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class c implements InterfaceC3608w0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6365a;

        c(long j10) {
            this.f6365a = j10;
        }

        @Override // i0.InterfaceC3608w0
        public final long a() {
            return this.f6365a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f6366B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f6367C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f6368D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f6369E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1352w f6370F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ FontWeight f6371G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ AbstractC1341l f6372H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f6373I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ j f6374J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ R0.i f6375K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f6376L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f6377M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ boolean f6378N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f6379O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f6380P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, C4153F> f6381Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ TextStyle f6382R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ int f6383S;

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ int f6384T;

        /* renamed from: U, reason: collision with root package name */
        final /* synthetic */ int f6385U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, i iVar, long j10, long j11, C1352w c1352w, FontWeight fontWeight, AbstractC1341l abstractC1341l, long j12, j jVar, R0.i iVar2, long j13, int i10, boolean z10, int i11, int i12, l<? super TextLayoutResult, C4153F> lVar, TextStyle textStyle, int i13, int i14, int i15) {
            super(2);
            this.f6366B = str;
            this.f6367C = iVar;
            this.f6368D = j10;
            this.f6369E = j11;
            this.f6370F = c1352w;
            this.f6371G = fontWeight;
            this.f6372H = abstractC1341l;
            this.f6373I = j12;
            this.f6374J = jVar;
            this.f6375K = iVar2;
            this.f6376L = j13;
            this.f6377M = i10;
            this.f6378N = z10;
            this.f6379O = i11;
            this.f6380P = i12;
            this.f6381Q = lVar;
            this.f6382R = textStyle;
            this.f6383S = i13;
            this.f6384T = i14;
            this.f6385U = i15;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            l0.b(this.f6366B, this.f6367C, this.f6368D, this.f6369E, this.f6370F, this.f6371G, this.f6372H, this.f6373I, this.f6374J, this.f6375K, this.f6376L, this.f6377M, this.f6378N, this.f6379O, this.f6380P, this.f6381Q, this.f6382R, interfaceC1554l, C1509K0.a(this.f6383S | 1), C1509K0.a(this.f6384T), this.f6385U);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class f extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f6387B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f6388C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f6389D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f6390E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1352w f6391F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ FontWeight f6392G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ AbstractC1341l f6393H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f6394I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ j f6395J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ R0.i f6396K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f6397L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f6398M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ boolean f6399N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f6400O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, C4153F> f6401P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ TextStyle f6402Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ int f6403R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ int f6404S;

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ int f6405T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(String str, i iVar, long j10, long j11, C1352w c1352w, FontWeight fontWeight, AbstractC1341l abstractC1341l, long j12, j jVar, R0.i iVar2, long j13, int i10, boolean z10, int i11, l<? super TextLayoutResult, C4153F> lVar, TextStyle textStyle, int i12, int i13, int i14) {
            super(2);
            this.f6387B = str;
            this.f6388C = iVar;
            this.f6389D = j10;
            this.f6390E = j11;
            this.f6391F = c1352w;
            this.f6392G = fontWeight;
            this.f6393H = abstractC1341l;
            this.f6394I = j12;
            this.f6395J = jVar;
            this.f6396K = iVar2;
            this.f6397L = j13;
            this.f6398M = i10;
            this.f6399N = z10;
            this.f6400O = i11;
            this.f6401P = lVar;
            this.f6402Q = textStyle;
            this.f6403R = i12;
            this.f6404S = i13;
            this.f6405T = i14;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            l0.c(this.f6387B, this.f6388C, this.f6389D, this.f6390E, this.f6391F, this.f6392G, this.f6393H, this.f6394I, this.f6395J, this.f6396K, this.f6397L, this.f6398M, this.f6399N, this.f6400O, this.f6401P, this.f6402Q, interfaceC1554l, C1509K0.a(this.f6403R | 1), C1509K0.a(this.f6404S), this.f6405T);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(TextStyle textStyle, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1772272796);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(textStyle) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1772272796, i11, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:396)");
            }
            AbstractC1501G0<TextStyle> abstractC1501G0 = f6360a;
            C1576w.a(abstractC1501G0.d(((TextStyle) interfaceC1554lR.o(abstractC1501G0)).I(textStyle)), pVar, interfaceC1554lR, (i11 & 112) | C1503H0.f12626i);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(textStyle, pVar, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r68, b0.i r69, long r70, long r72, kotlin.C1352w r74, kotlin.FontWeight r75, kotlin.AbstractC1341l r76, long r77, R0.j r79, R0.i r80, long r81, int r83, boolean r84, int r85, int r86, Ba.l<? super H0.TextLayoutResult, oa.C4153F> r87, H0.TextStyle r88, kotlin.InterfaceC1554l r89, int r90, int r91, int r92) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.l0.b(java.lang.String, b0.i, long, long, L0.w, L0.B, L0.l, long, R0.j, R0.i, long, int, boolean, int, int, Ba.l, H0.J, O.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    @oa.InterfaceC4156a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void c(java.lang.String r54, b0.i r55, long r56, long r58, kotlin.C1352w r60, kotlin.FontWeight r61, kotlin.AbstractC1341l r62, long r63, R0.j r65, R0.i r66, long r67, int r69, boolean r70, int r71, Ba.l r72, H0.TextStyle r73, kotlin.InterfaceC1554l r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.l0.c(java.lang.String, b0.i, long, long, L0.w, L0.B, L0.l, long, R0.j, R0.i, long, int, boolean, int, Ba.l, H0.J, O.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class e extends AbstractC3864v implements l<TextLayoutResult, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f6386B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return C4153F.f46609a;
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }
    }
}
