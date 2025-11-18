package w;

import Xb.C1841i;
import Xb.InterfaceC1828b0;
import Xb.InterfaceC1867v0;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.C5155d;
import z.C5156e;
import z.InterfaceC5159h;
import z.InterfaceC5162k;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lw/s;", "Lb0/i$c;", "Lz/k;", "interactionSource", "<init>", "(Lz/k;)V", "Loa/F;", "j2", "()V", "Lz/h;", "interaction", "k2", "(Lz/k;Lz/h;)V", "", "isFocused", "l2", "(Z)V", "m2", "O", "Lz/k;", "Lz/d;", "P", "Lz/d;", "focusedInteraction", "Q", "Z", "O1", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s extends i.c {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5162k interactionSource;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private C5155d focusedInteraction;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* compiled from: Focusable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {309}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f51739B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f51740C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC5159h f51741D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC1828b0 f51742E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5162k interfaceC5162k, InterfaceC5159h interfaceC5159h, InterfaceC1828b0 interfaceC1828b0, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f51740C = interfaceC5162k;
            this.f51741D = interfaceC5159h;
            this.f51742E = interfaceC1828b0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f51740C, this.f51741D, this.f51742E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f51739B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5162k interfaceC5162k = this.f51740C;
                InterfaceC5159h interfaceC5159h = this.f51741D;
                this.f51739B = 1;
                if (interfaceC5162k.c(interfaceC5159h, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            InterfaceC1828b0 interfaceC1828b0 = this.f51742E;
            if (interfaceC1828b0 != null) {
                interfaceC1828b0.c();
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f51743B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5159h f51744C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5162k interfaceC5162k, InterfaceC5159h interfaceC5159h) {
            super(1);
            this.f51743B = interfaceC5162k;
            this.f51744C = interfaceC5159h;
        }

        public final void a(Throwable th) {
            this.f51743B.a(this.f51744C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    public s(InterfaceC5162k interfaceC5162k) {
        this.interactionSource = interfaceC5162k;
    }

    private final void j2() {
        C5155d c5155d;
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        if (interfaceC5162k != null && (c5155d = this.focusedInteraction) != null) {
            interfaceC5162k.a(new C5156e(c5155d));
        }
        this.focusedInteraction = null;
    }

    private final void k2(InterfaceC5162k interfaceC5162k, InterfaceC5159h interfaceC5159h) {
        if (!getIsAttached()) {
            interfaceC5162k.a(interfaceC5159h);
        } else {
            InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) J1().getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
            C1841i.d(J1(), null, null, new a(interfaceC5162k, interfaceC5159h, interfaceC1867v0 != null ? interfaceC1867v0.q(new b(interfaceC5162k, interfaceC5159h)) : null, null), 3, null);
        }
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void l2(boolean isFocused) {
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        if (interfaceC5162k != null) {
            if (!isFocused) {
                C5155d c5155d = this.focusedInteraction;
                if (c5155d != null) {
                    k2(interfaceC5162k, new C5156e(c5155d));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            C5155d c5155d2 = this.focusedInteraction;
            if (c5155d2 != null) {
                k2(interfaceC5162k, new C5156e(c5155d2));
                this.focusedInteraction = null;
            }
            C5155d c5155d3 = new C5155d();
            k2(interfaceC5162k, c5155d3);
            this.focusedInteraction = c5155d3;
        }
    }

    public final void m2(InterfaceC5162k interactionSource) {
        if (C3862t.b(this.interactionSource, interactionSource)) {
            return;
        }
        j2();
        this.interactionSource = interactionSource;
    }
}
