package J;

import Xb.C1841i;
import Xb.I;
import h0.C3482m;
import i0.C3600s0;
import i0.C3602t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4737a;
import kotlin.C4739b;
import kotlin.C4761m;
import kotlin.InterfaceC4753i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.C5152a;
import z.C5153b;
import z.C5154c;
import z.C5155d;
import z.C5156e;
import z.C5157f;
import z.C5158g;
import z.InterfaceC5159h;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"LJ/u;", "", "", "bounded", "Lkotlin/Function0;", "LJ/g;", "rippleAlpha", "<init>", "(ZLBa/a;)V", "Lz/h;", "interaction", "LXb/I;", "scope", "Loa/F;", "c", "(Lz/h;LXb/I;)V", "Lk0/f;", "", "radius", "Li0/t0;", "color", "b", "(Lk0/f;FJ)V", "a", "Z", "LBa/a;", "Lv/a;", "Lv/m;", "Lv/a;", "animatedAlpha", "", "d", "Ljava/util/List;", "interactions", "e", "Lz/h;", "currentInteraction", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<RippleAlpha> rippleAlpha;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4737a<Float, C4761m> animatedAlpha = C4739b.b(0.0f, 0.0f, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC5159h> interactions = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5159h currentInteraction;

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {497}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7163B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f7165D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC4753i<Float> f7166E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, InterfaceC4753i<Float> interfaceC4753i, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7165D = f10;
            this.f7166E = interfaceC4753i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return u.this.new a(this.f7165D, this.f7166E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7163B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a c4737a = u.this.animatedAlpha;
                Float fB = kotlin.coroutines.jvm.internal.b.b(this.f7165D);
                InterfaceC4753i<Float> interfaceC4753i = this.f7166E;
                this.f7163B = 1;
                if (C4737a.f(c4737a, fB, interfaceC4753i, null, null, this, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {503}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7167B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC4753i<Float> f7169D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC4753i<Float> interfaceC4753i, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7169D = interfaceC4753i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return u.this.new b(this.f7169D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7167B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a c4737a = u.this.animatedAlpha;
                Float fB = kotlin.coroutines.jvm.internal.b.b(0.0f);
                InterfaceC4753i<Float> interfaceC4753i = this.f7169D;
                this.f7167B = 1;
                if (C4737a.f(c4737a, fB, interfaceC4753i, null, null, this, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    public u(boolean z10, Ba.a<RippleAlpha> aVar) {
        this.bounded = z10;
        this.rippleAlpha = aVar;
    }

    public final void b(k0.f fVar, float f10, long j10) {
        long j11;
        float fFloatValue = this.animatedAlpha.m().floatValue();
        if (fFloatValue > 0.0f) {
            long jK = C3602t0.k(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                k0.f.r1(fVar, jK, f10, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fI = C3482m.i(fVar.C());
            float fG = C3482m.g(fVar.C());
            int iB = C3600s0.INSTANCE.b();
            k0.d drawContext = fVar.getDrawContext();
            long jC = drawContext.C();
            drawContext.G().h();
            try {
                drawContext.getTransform().a(0.0f, 0.0f, fI, fG, iB);
                j11 = jC;
            } catch (Throwable th) {
                th = th;
                j11 = jC;
            }
            try {
                k0.f.r1(fVar, jK, f10, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.G().t();
                drawContext.E(j11);
            } catch (Throwable th2) {
                th = th2;
                drawContext.G().t();
                drawContext.E(j11);
                throw th;
            }
        }
    }

    public final void c(InterfaceC5159h interaction, I scope) {
        boolean z10 = interaction instanceof C5157f;
        if (z10) {
            this.interactions.add(interaction);
        } else if (interaction instanceof C5158g) {
            this.interactions.remove(((C5158g) interaction).getEnter());
        } else if (interaction instanceof C5155d) {
            this.interactions.add(interaction);
        } else if (interaction instanceof C5156e) {
            this.interactions.remove(((C5156e) interaction).getFocus());
        } else if (interaction instanceof C5153b) {
            this.interactions.add(interaction);
        } else if (interaction instanceof C5154c) {
            this.interactions.remove(((C5154c) interaction).getStart());
        } else if (!(interaction instanceof C5152a)) {
            return;
        } else {
            this.interactions.remove(((C5152a) interaction).getStart());
        }
        InterfaceC5159h interfaceC5159h = (InterfaceC5159h) kotlin.collections.r.w0(this.interactions);
        if (C3862t.b(this.currentInteraction, interfaceC5159h)) {
            return;
        }
        if (interfaceC5159h != null) {
            RippleAlpha rippleAlphaInvoke = this.rippleAlpha.invoke();
            C1841i.d(scope, null, null, new a(z10 ? rippleAlphaInvoke.getHoveredAlpha() : interaction instanceof C5155d ? rippleAlphaInvoke.getFocusedAlpha() : interaction instanceof C5153b ? rippleAlphaInvoke.getDraggedAlpha() : 0.0f, p.d(interfaceC5159h), null), 3, null);
        } else {
            C1841i.d(scope, null, null, new b(p.e(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = interfaceC5159h;
    }
}
