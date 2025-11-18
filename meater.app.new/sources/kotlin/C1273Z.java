package kotlin;

import Ba.l;
import Ba.p;
import H0.C1060d;
import H0.TextLayoutResult;
import H0.TextStyle;
import M.w;
import R0.j;
import b0.i;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aæ\u0001\u0010'\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020%0$2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a%\u0010,\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0007¢\u0006\u0004\b,\u0010-\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0.8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"", "text", "Lb0/i;", "modifier", "Li0/t0;", "color", "LU0/v;", "fontSize", "LL0/w;", "fontStyle", "LL0/B;", "fontWeight", "LL0/l;", "fontFamily", "letterSpacing", "LR0/j;", "textDecoration", "LR0/i;", "textAlign", "lineHeight", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "LH0/F;", "Loa/F;", "onTextLayout", "LH0/J;", "style", "b", "(Ljava/lang/String;Lb0/i;JJLL0/w;LL0/B;LL0/l;JLR0/j;LR0/i;JIZIILBa/l;LH0/J;LO/l;III)V", "LH0/d;", "", "LF/e;", "inlineContent", "c", "(LH0/d;Lb0/i;JJLL0/w;LL0/B;LL0/l;JLR0/j;LR0/i;JIZIILjava/util/Map;LBa/l;LH0/J;LO/l;III)V", "value", "Lkotlin/Function0;", "content", "a", "(LH0/J;LBa/p;LO/l;I)V", "LO/G0;", "LO/G0;", "d", "()LO/G0;", "LocalTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273Z {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<TextStyle> f8085a = C1576w.c(m1.o(), a.f8086B);

    /* compiled from: Text.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH0/J;", "a", "()LH0/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.Z$a */
    static final class a extends AbstractC3864v implements Ba.a<TextStyle> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8086B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextStyle invoke() {
            return w.a();
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.Z$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ TextStyle f8087B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8088C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f8089D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(TextStyle textStyle, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f8087B = textStyle;
            this.f8088C = pVar;
            this.f8089D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1273Z.a(this.f8087B, this.f8088C, interfaceC1554l, C1509K0.a(this.f8089D | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.Z$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f8090B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f8091C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f8092D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f8093E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1352w f8094F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ FontWeight f8095G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ AbstractC1341l f8096H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f8097I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ j f8098J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ R0.i f8099K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f8100L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f8101M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ boolean f8102N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f8103O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f8104P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, C4153F> f8105Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ TextStyle f8106R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ int f8107S;

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ int f8108T;

        /* renamed from: U, reason: collision with root package name */
        final /* synthetic */ int f8109U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, i iVar, long j10, long j11, C1352w c1352w, FontWeight fontWeight, AbstractC1341l abstractC1341l, long j12, j jVar, R0.i iVar2, long j13, int i10, boolean z10, int i11, int i12, l<? super TextLayoutResult, C4153F> lVar, TextStyle textStyle, int i13, int i14, int i15) {
            super(2);
            this.f8090B = str;
            this.f8091C = iVar;
            this.f8092D = j10;
            this.f8093E = j11;
            this.f8094F = c1352w;
            this.f8095G = fontWeight;
            this.f8096H = abstractC1341l;
            this.f8097I = j12;
            this.f8098J = jVar;
            this.f8099K = iVar2;
            this.f8100L = j13;
            this.f8101M = i10;
            this.f8102N = z10;
            this.f8103O = i11;
            this.f8104P = i12;
            this.f8105Q = lVar;
            this.f8106R = textStyle;
            this.f8107S = i13;
            this.f8108T = i14;
            this.f8109U = i15;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1273Z.b(this.f8090B, this.f8091C, this.f8092D, this.f8093E, this.f8094F, this.f8095G, this.f8096H, this.f8097I, this.f8098J, this.f8099K, this.f8100L, this.f8101M, this.f8102N, this.f8103O, this.f8104P, this.f8105Q, this.f8106R, interfaceC1554l, C1509K0.a(this.f8107S | 1), C1509K0.a(this.f8108T), this.f8109U);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.Z$e */
    static final class e extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1060d f8111B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f8112C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f8113D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f8114E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1352w f8115F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ FontWeight f8116G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ AbstractC1341l f8117H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f8118I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ j f8119J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ R0.i f8120K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f8121L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f8122M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ boolean f8123N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f8124O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f8125P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ Map<String, F.e> f8126Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, C4153F> f8127R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ TextStyle f8128S;

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ int f8129T;

        /* renamed from: U, reason: collision with root package name */
        final /* synthetic */ int f8130U;

        /* renamed from: V, reason: collision with root package name */
        final /* synthetic */ int f8131V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C1060d c1060d, i iVar, long j10, long j11, C1352w c1352w, FontWeight fontWeight, AbstractC1341l abstractC1341l, long j12, j jVar, R0.i iVar2, long j13, int i10, boolean z10, int i11, int i12, Map<String, F.e> map, l<? super TextLayoutResult, C4153F> lVar, TextStyle textStyle, int i13, int i14, int i15) {
            super(2);
            this.f8111B = c1060d;
            this.f8112C = iVar;
            this.f8113D = j10;
            this.f8114E = j11;
            this.f8115F = c1352w;
            this.f8116G = fontWeight;
            this.f8117H = abstractC1341l;
            this.f8118I = j12;
            this.f8119J = jVar;
            this.f8120K = iVar2;
            this.f8121L = j13;
            this.f8122M = i10;
            this.f8123N = z10;
            this.f8124O = i11;
            this.f8125P = i12;
            this.f8126Q = map;
            this.f8127R = lVar;
            this.f8128S = textStyle;
            this.f8129T = i13;
            this.f8130U = i14;
            this.f8131V = i15;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1273Z.c(this.f8111B, this.f8112C, this.f8113D, this.f8114E, this.f8115F, this.f8116G, this.f8117H, this.f8118I, this.f8119J, this.f8120K, this.f8121L, this.f8122M, this.f8123N, this.f8124O, this.f8125P, this.f8126Q, this.f8127R, this.f8128S, interfaceC1554l, C1509K0.a(this.f8129T | 1), C1509K0.a(this.f8130U), this.f8131V);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(TextStyle textStyle, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-460300127);
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
                C1560o.S(-460300127, i11, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:346)");
            }
            AbstractC1501G0<TextStyle> abstractC1501G0 = f8085a;
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
    /* JADX WARN: Removed duplicated region for block: B:254:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
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
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1273Z.b(java.lang.String, b0.i, long, long, L0.w, L0.B, L0.l, long, R0.j, R0.i, long, int, boolean, int, int, Ba.l, H0.J, O.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(H0.C1060d r61, b0.i r62, long r63, long r65, kotlin.C1352w r67, kotlin.FontWeight r68, kotlin.AbstractC1341l r69, long r70, R0.j r72, R0.i r73, long r74, int r76, boolean r77, int r78, int r79, java.util.Map<java.lang.String, F.e> r80, Ba.l<? super H0.TextLayoutResult, oa.C4153F> r81, H0.TextStyle r82, kotlin.InterfaceC1554l r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1273Z.c(H0.d, b0.i, long, long, L0.w, L0.B, L0.l, long, R0.j, R0.i, long, int, boolean, int, int, java.util.Map, Ba.l, H0.J, O.l, int, int, int):void");
    }

    public static final AbstractC1501G0<TextStyle> d() {
        return f8085a;
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.Z$d */
    static final class d extends AbstractC3864v implements l<TextLayoutResult, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f8110B = new d();

        d() {
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
