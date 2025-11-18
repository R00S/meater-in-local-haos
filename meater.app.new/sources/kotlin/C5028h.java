package kotlin;

import Ba.p;
import Xb.C1837g;
import Xb.I;
import androidx.compose.foundation.gestures.d;
import b0.k;
import java.util.concurrent.CancellationException;
import kotlin.AnimationState;
import kotlin.C4751h;
import kotlin.C4758k0;
import kotlin.C4759l;
import kotlin.C4761m;
import kotlin.InterfaceC4787z;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.L;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lx/h;", "Lx/n;", "Lv/z;", "", "flingDecay", "Lb0/k;", "motionDurationScale", "<init>", "(Lv/z;Lb0/k;)V", "Lx/u;", "initialVelocity", "a", "(Lx/u;FLta/d;)Ljava/lang/Object;", "Lv/z;", "b", "()Lv/z;", "d", "(Lv/z;)V", "Lb0/k;", "", "c", "I", "()I", "e", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5028h implements InterfaceC5034n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4787z<Float> flingDecay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k motionDurationScale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastAnimationCycleCount;

    /* compiled from: Scrollable.kt */
    @f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {893}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "", "<anonymous>", "(LXb/I;)F"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.h$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super Float>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f52388B;

        /* renamed from: C, reason: collision with root package name */
        Object f52389C;

        /* renamed from: D, reason: collision with root package name */
        int f52390D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f52391E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C5028h f52392F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC5041u f52393G;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/h;", "", "Lv/m;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x.h$a$a, reason: collision with other inner class name */
        static final class C0764a extends AbstractC3864v implements Ba.l<C4751h<Float, C4761m>, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ L f52394B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ InterfaceC5041u f52395C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ L f52396D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C5028h f52397E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0764a(L l10, InterfaceC5041u interfaceC5041u, L l11, C5028h c5028h) {
                super(1);
                this.f52394B = l10;
                this.f52395C = interfaceC5041u;
                this.f52396D = l11;
                this.f52397E = c5028h;
            }

            public final void a(C4751h<Float, C4761m> c4751h) {
                float fFloatValue = c4751h.e().floatValue() - this.f52394B.f43975B;
                float fA = this.f52395C.a(fFloatValue);
                this.f52394B.f43975B = c4751h.e().floatValue();
                this.f52396D.f43975B = c4751h.f().floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    c4751h.a();
                }
                C5028h c5028h = this.f52397E;
                c5028h.e(c5028h.getLastAnimationCycleCount() + 1);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C4751h<Float, C4761m> c4751h) {
                a(c4751h);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, C5028h c5028h, InterfaceC5041u interfaceC5041u, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52391E = f10;
            this.f52392F = c5028h;
            this.f52393G = interfaceC5041u;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f52391E, this.f52392F, this.f52393G, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super Float> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float f10;
            L l10;
            AnimationState animationState;
            InterfaceC4787z<Float> interfaceC4787zB;
            C0764a c0764a;
            Object objE = C4696b.e();
            int i10 = this.f52390D;
            if (i10 == 0) {
                C4173r.b(obj);
                if (Math.abs(this.f52391E) > 1.0f) {
                    L l11 = new L();
                    l11.f43975B = this.f52391E;
                    L l12 = new L();
                    AnimationState animationStateB = C4759l.b(0.0f, this.f52391E, 0L, 0L, false, 28, null);
                    try {
                        interfaceC4787zB = this.f52392F.b();
                        c0764a = new C0764a(l12, this.f52393G, l11, this.f52392F);
                        this.f52388B = l11;
                        this.f52389C = animationStateB;
                        this.f52390D = 1;
                    } catch (CancellationException unused) {
                        l10 = l11;
                        animationState = animationStateB;
                        l10.f43975B = ((Number) animationState.p()).floatValue();
                        f10 = l10.f43975B;
                        return b.b(f10);
                    }
                    if (C4758k0.h(animationStateB, interfaceC4787zB, false, c0764a, this, 2, null) == objE) {
                        return objE;
                    }
                    l10 = l11;
                    f10 = l10.f43975B;
                } else {
                    f10 = this.f52391E;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.f52389C;
                l10 = (L) this.f52388B;
                try {
                    C4173r.b(obj);
                } catch (CancellationException unused2) {
                    l10.f43975B = ((Number) animationState.p()).floatValue();
                    f10 = l10.f43975B;
                    return b.b(f10);
                }
                f10 = l10.f43975B;
            }
            return b.b(f10);
        }
    }

    public C5028h(InterfaceC4787z<Float> interfaceC4787z, k kVar) {
        this.flingDecay = interfaceC4787z;
        this.motionDurationScale = kVar;
    }

    @Override // kotlin.InterfaceC5034n
    public Object a(InterfaceC5041u interfaceC5041u, float f10, InterfaceC4588d<? super Float> interfaceC4588d) {
        this.lastAnimationCycleCount = 0;
        return C1837g.g(this.motionDurationScale, new a(f10, this, interfaceC5041u, null), interfaceC4588d);
    }

    public final InterfaceC4787z<Float> b() {
        return this.flingDecay;
    }

    /* renamed from: c, reason: from getter */
    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void d(InterfaceC4787z<Float> interfaceC4787z) {
        this.flingDecay = interfaceC4787z;
    }

    public final void e(int i10) {
        this.lastAnimationCycleCount = i10;
    }

    public /* synthetic */ C5028h(InterfaceC4787z interfaceC4787z, k kVar, int i10, C3854k c3854k) {
        this(interfaceC4787z, (i10 & 2) != 0 ? d.e() : kVar);
    }
}
