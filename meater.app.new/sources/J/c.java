package J;

import A0.C0839s;
import Xb.I;
import i0.C3602t0;
import i0.InterfaceC3608w0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import oa.C4173r;
import s.C4388J;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.InterfaceC5160i;
import z.m;

/* compiled from: CommonRipple.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"LJ/c;", "LJ/q;", "Lz/i;", "interactionSource", "", "bounded", "LU0/h;", "radius", "Li0/w0;", "color", "Lkotlin/Function0;", "LJ/g;", "rippleAlpha", "<init>", "(Lz/i;ZFLi0/w0;LBa/a;Lkotlin/jvm/internal/k;)V", "Lz/m$b;", "interaction", "Lh0/m;", "size", "", "targetRadius", "Loa/F;", "o2", "(Lz/m$b;JF)V", "v2", "(Lz/m$b;)V", "Lk0/f;", "p2", "(Lk0/f;)V", "U1", "()V", "Ls/J;", "LJ/h;", "Z", "Ls/J;", "ripples", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends q {

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final C4388J<m.b, h> ripples;

    /* compiled from: CommonRipple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", l = {88}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7065B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ h f7066C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ c f7067D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ m.b f7068E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, c cVar, m.b bVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7066C = hVar;
            this.f7067D = cVar;
            this.f7068E = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f7066C, this.f7067D, this.f7068E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7065B;
            try {
                if (i10 == 0) {
                    C4173r.b(obj);
                    h hVar = this.f7066C;
                    this.f7065B = 1;
                    if (hVar.d(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                this.f7067D.ripples.o(this.f7068E);
                C0839s.a(this.f7067D);
                return C4153F.f46609a;
            } catch (Throwable th) {
                this.f7067D.ripples.o(this.f7068E);
                C0839s.a(this.f7067D);
                throw th;
            }
        }
    }

    public /* synthetic */ c(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a aVar, C3854k c3854k) {
        this(interfaceC5160i, z10, f10, interfaceC3608w0, aVar);
    }

    @Override // b0.i.c
    public void U1() {
        this.ripples.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // J.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o2(z.m.b r18, long r19, float r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            s.J<z.m$b, J.h> r2 = r0.ripples
            java.lang.Object[] r3 = r2.keys
            java.lang.Object[] r4 = r2.values
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L51
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            J.h r13 = (J.h) r13
            z.m$b r14 = (z.m.b) r14
            r13.h()
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L4a:
            if (r10 != r11) goto L51
        L4c:
            if (r7 == r5) goto L51
            int r7 = r7 + 1
            goto L13
        L51:
            boolean r2 = r17.getBounded()
            r3 = 0
            if (r2 == 0) goto L61
            long r4 = r18.getPressPosition()
            h0.g r2 = h0.C3476g.d(r4)
            goto L62
        L61:
            r2 = r3
        L62:
            J.h r4 = new J.h
            boolean r5 = r17.getBounded()
            r6 = r21
            r4.<init>(r2, r6, r5, r3)
            s.J<z.m$b, J.h> r2 = r0.ripples
            r2.r(r1, r4)
            Xb.I r5 = r17.J1()
            J.c$a r8 = new J.c$a
            r8.<init>(r4, r0, r1, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            Xb.C1837g.d(r5, r6, r7, r8, r9, r10)
            A0.C0839s.a(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.c.o2(z.m$b, long, float):void");
    }

    @Override // J.q
    public void p2(k0.f fVar) {
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        float pressedAlpha = r2().invoke().getPressedAlpha();
        if (pressedAlpha == 0.0f) {
            return;
        }
        C4388J<m.b, h> c4388j = this.ripples;
        Object[] objArr = c4388j.keys;
        Object[] objArr2 = c4388j.values;
        long[] jArr = c4388j.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                long j11 = j10;
                int i16 = 0;
                while (i16 < i15) {
                    if ((j11 & 255) < 128) {
                        int i17 = (i13 << 3) + i16;
                        float f12 = pressedAlpha;
                        i10 = i16;
                        i11 = i15;
                        f11 = pressedAlpha;
                        i12 = i14;
                        ((h) objArr2[i17]).e(fVar, C3602t0.k(s2(), f12, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        f11 = pressedAlpha;
                        i10 = i16;
                        i11 = i15;
                        i12 = i14;
                    }
                    j11 >>= i12;
                    i16 = i10 + 1;
                    i14 = i12;
                    pressedAlpha = f11;
                    i15 = i11;
                }
                f10 = pressedAlpha;
                if (i15 != i14) {
                    return;
                }
            } else {
                f10 = pressedAlpha;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            pressedAlpha = f10;
        }
    }

    @Override // J.q
    public void v2(m.b interaction) {
        h hVarB = this.ripples.b(interaction);
        if (hVarB != null) {
            hVarB.h();
        }
    }

    private c(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a<RippleAlpha> aVar) {
        super(interfaceC5160i, z10, f10, interfaceC3608w0, aVar, null);
        this.ripples = new C4388J<>(0, 1, null);
    }
}
