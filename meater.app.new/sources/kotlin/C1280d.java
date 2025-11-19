package kotlin;

import A.InterfaceC0801i;
import A.N;
import Ba.p;
import Ba.q;
import androidx.compose.foundation.o;
import androidx.compose.ui.graphics.f;
import androidx.compose.ui.window.s;
import b0.i;
import i0.c1;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.C4732V;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import w.C4959d;
import z.InterfaceC5162k;

/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0098\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0083\u0001\u0010&\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'\"\u001a\u0010+\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"", "expanded", "Lkotlin/Function0;", "Loa/F;", "onDismissRequest", "Lb0/i;", "modifier", "LU0/j;", "offset", "Landroidx/compose/foundation/o;", "scrollState", "Landroidx/compose/ui/window/s;", "properties", "Li0/c1;", "shape", "Li0/t0;", "containerColor", "LU0/h;", "tonalElevation", "shadowElevation", "Lw/d;", "border", "Lkotlin/Function1;", "LA/i;", "content", "a", "(ZLBa/a;Lb0/i;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/s;Li0/c1;JFFLw/d;LBa/q;LO/l;III)V", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "LK/F;", "colors", "LA/N;", "contentPadding", "Lz/k;", "interactionSource", "b", "(LBa/p;LBa/a;Lb0/i;LBa/p;LBa/p;ZLK/F;LA/N;Lz/k;LO/l;II)V", "Landroidx/compose/ui/window/s;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/s;", "DefaultMenuProperties", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280d {

    /* renamed from: a, reason: collision with root package name */
    private static final s f8253a = new s(true, false, false, false, 14, (C3854k) null);

    /* compiled from: AndroidMenu.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.d$a */
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f8254B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4732V<Boolean> f8255C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<f> f8256D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ o f8257E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ c1 f8258F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f8259G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ float f8260H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f8261I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f8262J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i iVar, C4732V<Boolean> c4732v, InterfaceC1563p0<f> interfaceC1563p0, o oVar, c1 c1Var, long j10, float f10, float f11, C4959d c4959d, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f8254B = iVar;
            this.f8255C = c4732v;
            this.f8256D = interfaceC1563p0;
            this.f8257E = oVar;
            this.f8258F = c1Var;
            this.f8259G = j10;
            this.f8260H = f10;
            this.f8261I = f11;
            this.f8262J = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(2126968933, i10, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
            }
            C1255G.a(this.f8254B, this.f8255C, this.f8256D, this.f8257E, this.f8258F, this.f8259G, this.f8260H, this.f8261I, null, this.f8262J, interfaceC1554l, (C4732V.f50654d << 3) | 384);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidMenu.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.d$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ boolean f8263B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f8264C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ i f8265D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f8266E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ o f8267F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ s f8268G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ c1 f8269H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f8270I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ float f8271J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ float f8272K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f8273L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f8274M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f8275N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f8276O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Ba.a<C4153F> aVar, i iVar, long j10, o oVar, s sVar, c1 c1Var, long j11, float f10, float f11, C4959d c4959d, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10, int i11, int i12) {
            super(2);
            this.f8263B = z10;
            this.f8264C = aVar;
            this.f8265D = iVar;
            this.f8266E = j10;
            this.f8267F = oVar;
            this.f8268G = sVar;
            this.f8269H = c1Var;
            this.f8270I = j11;
            this.f8271J = f10;
            this.f8272K = f11;
            this.f8273L = qVar;
            this.f8274M = i10;
            this.f8275N = i11;
            this.f8276O = i12;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1280d.a(this.f8263B, this.f8264C, this.f8265D, this.f8266E, this.f8267F, this.f8268G, this.f8269H, this.f8270I, this.f8271J, this.f8272K, null, this.f8273L, interfaceC1554l, C1509K0.a(this.f8274M | 1), C1509K0.a(this.f8275N), this.f8276O);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidMenu.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU0/p;", "parentBounds", "menuBounds", "Loa/F;", "a", "(LU0/p;LU0/p;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.d$c */
    static final class c extends AbstractC3864v implements p<U0.p, U0.p, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<f> f8277B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1563p0<f> interfaceC1563p0) {
            super(2);
            this.f8277B = interfaceC1563p0;
        }

        public final void a(U0.p pVar, U0.p pVar2) {
            this.f8277B.setValue(f.b(C1255G.h(pVar, pVar2)));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(U0.p pVar, U0.p pVar2) {
            a(pVar, pVar2);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidMenu.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.d$d, reason: collision with other inner class name */
    static final class C0163d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8278B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f8279C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ i f8280D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8281E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8282F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f8283G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C1254F f8284H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ N f8285I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f8286J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f8287K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f8288L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0163d(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, Ba.a<C4153F> aVar, i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, boolean z10, C1254F c1254f, N n10, InterfaceC5162k interfaceC5162k, int i10, int i11) {
            super(2);
            this.f8278B = pVar;
            this.f8279C = aVar;
            this.f8280D = iVar;
            this.f8281E = pVar2;
            this.f8282F = pVar3;
            this.f8283G = z10;
            this.f8284H = c1254f;
            this.f8285I = n10;
            this.f8286J = interfaceC5162k;
            this.f8287K = i10;
            this.f8288L = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1280d.b(this.f8278B, this.f8279C, this.f8280D, this.f8281E, this.f8282F, this.f8283G, this.f8284H, this.f8285I, this.f8286J, interfaceC1554l, C1509K0.a(this.f8287K | 1), this.f8288L);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r38, Ba.a<oa.C4153F> r39, b0.i r40, long r41, androidx.compose.foundation.o r43, androidx.compose.ui.window.s r44, i0.c1 r45, long r46, float r48, float r49, w.C4959d r50, Ba.q<? super A.InterfaceC0801i, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r51, kotlin.InterfaceC1554l r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1280d.a(boolean, Ba.a, b0.i, long, androidx.compose.foundation.o, androidx.compose.ui.window.s, i0.c1, long, float, float, w.d, Ba.q, O.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r23, Ba.a<oa.C4153F> r24, b0.i r25, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r26, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r27, boolean r28, kotlin.C1254F r29, A.N r30, z.InterfaceC5162k r31, kotlin.InterfaceC1554l r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1280d.b(Ba.p, Ba.a, b0.i, Ba.p, Ba.p, boolean, K.F, A.N, z.k, O.l, int, int):void");
    }
}
