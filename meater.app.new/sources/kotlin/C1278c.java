package kotlin;

import Ba.p;
import androidx.compose.ui.window.j;
import b0.i;
import i0.c1;
import kotlin.C1509K0;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÆ\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "onDismissRequest", "confirmButton", "Lb0/i;", "modifier", "dismissButton", "icon", "title", "text", "Li0/c1;", "shape", "Li0/t0;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "LU0/h;", "tonalElevation", "Landroidx/compose/ui/window/j;", "properties", "a", "(LBa/a;LBa/p;Lb0/i;LBa/p;LBa/p;LBa/p;LBa/p;Li0/c1;JJJJFLandroidx/compose/ui/window/j;LO/l;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.c, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278c {

    /* compiled from: AndroidAlertDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.c$a */
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f8236B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8237C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ i f8238D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8239E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8240F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8241G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8242H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ c1 f8243I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f8244J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ long f8245K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f8246L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ long f8247M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ float f8248N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ j f8249O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f8250P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ int f8251Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ int f8252R;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.a<C4153F> aVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar5, c1 c1Var, long j10, long j11, long j12, long j13, float f10, j jVar, int i10, int i11, int i12) {
            super(2);
            this.f8236B = aVar;
            this.f8237C = pVar;
            this.f8238D = iVar;
            this.f8239E = pVar2;
            this.f8240F = pVar3;
            this.f8241G = pVar4;
            this.f8242H = pVar5;
            this.f8243I = c1Var;
            this.f8244J = j10;
            this.f8245K = j11;
            this.f8246L = j12;
            this.f8247M = j13;
            this.f8248N = f10;
            this.f8249O = jVar;
            this.f8250P = i10;
            this.f8251Q = i11;
            this.f8252R = i12;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1278c.a(this.f8236B, this.f8237C, this.f8238D, this.f8239E, this.f8240F, this.f8241G, this.f8242H, this.f8243I, this.f8244J, this.f8245K, this.f8246L, this.f8247M, this.f8248N, this.f8249O, interfaceC1554l, C1509K0.a(this.f8250P | 1), C1509K0.a(this.f8251Q), this.f8252R);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Ba.a<oa.C4153F> r47, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r48, b0.i r49, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r50, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r51, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r52, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r53, i0.c1 r54, long r55, long r57, long r59, long r61, float r63, androidx.compose.ui.window.j r64, kotlin.InterfaceC1554l r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1278c.a(Ba.a, Ba.p, b0.i, Ba.p, Ba.p, Ba.p, Ba.p, i0.c1, long, long, long, long, float, androidx.compose.ui.window.j, O.l, int, int, int):void");
    }
}
