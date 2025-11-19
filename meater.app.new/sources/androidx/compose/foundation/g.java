package androidx.compose.foundation;

import A0.C0839s;
import A0.InterfaceC0831j;
import A0.r;
import Ba.p;
import Xb.C1841i;
import Xb.I;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import b0.i;
import i0.C3602t0;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import kotlin.jvm.internal.M;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.InterfaceC4949B;
import z.C5155d;
import z.C5156e;
import z.C5157f;
import z.C5158g;
import z.InterfaceC5159h;
import z.InterfaceC5160i;
import z.m;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/g;", "Lw/B;", "<init>", "()V", "Lz/i;", "interactionSource", "LA0/j;", "a", "(Lz/i;)LA0/j;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g implements InterfaceC4949B {

    /* renamed from: a, reason: collision with root package name */
    public static final g f21966a = new g();

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/g$a;", "Lb0/i$c;", "LA0/r;", "Lz/i;", "interactionSource", "<init>", "(Lz/i;)V", "Loa/F;", "T1", "()V", "Lk0/c;", "d", "(Lk0/c;)V", "O", "Lz/i;", "", "P", "Z", "isPressed", "Q", "isHovered", "R", "isFocused", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends i.c implements r {

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5160i interactionSource;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata */
        private boolean isPressed;

        /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
        private boolean isHovered;

        /* renamed from: R, reason: collision with root package name and from kotlin metadata */
        private boolean isFocused;

        /* compiled from: Indication.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {240}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.g$a$a, reason: collision with other inner class name */
        static final class C0307a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f21971B;

            /* compiled from: Indication.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz/h;", "interaction", "Loa/F;", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.g$a$a$a, reason: collision with other inner class name */
            static final class C0308a<T> implements InterfaceC1971f {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ M f21973B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ M f21974C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ M f21975D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ a f21976E;

                C0308a(M m10, M m11, M m12, a aVar) {
                    this.f21973B = m10;
                    this.f21974C = m11;
                    this.f21975D = m12;
                    this.f21976E = aVar;
                }

                @Override // ac.InterfaceC1971f
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object a(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    boolean z10 = true;
                    if (interfaceC5159h instanceof m.b) {
                        this.f21973B.f43976B++;
                    } else if (interfaceC5159h instanceof m.c) {
                        M m10 = this.f21973B;
                        m10.f43976B--;
                    } else if (interfaceC5159h instanceof m.a) {
                        M m11 = this.f21973B;
                        m11.f43976B--;
                    } else if (interfaceC5159h instanceof C5157f) {
                        this.f21974C.f43976B++;
                    } else if (interfaceC5159h instanceof C5158g) {
                        M m12 = this.f21974C;
                        m12.f43976B--;
                    } else if (interfaceC5159h instanceof C5155d) {
                        this.f21975D.f43976B++;
                    } else if (interfaceC5159h instanceof C5156e) {
                        M m13 = this.f21975D;
                        m13.f43976B--;
                    }
                    boolean z11 = false;
                    boolean z12 = this.f21973B.f43976B > 0;
                    boolean z13 = this.f21974C.f43976B > 0;
                    boolean z14 = this.f21975D.f43976B > 0;
                    if (this.f21976E.isPressed != z12) {
                        this.f21976E.isPressed = z12;
                        z11 = true;
                    }
                    if (this.f21976E.isHovered != z13) {
                        this.f21976E.isHovered = z13;
                        z11 = true;
                    }
                    if (this.f21976E.isFocused != z14) {
                        this.f21976E.isFocused = z14;
                    } else {
                        z10 = z11;
                    }
                    if (z10) {
                        C0839s.a(this.f21976E);
                    }
                    return C4153F.f46609a;
                }
            }

            C0307a(InterfaceC4588d<? super C0307a> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return a.this.new C0307a(interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0307a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f21971B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    M m10 = new M();
                    M m11 = new M();
                    M m12 = new M();
                    InterfaceC1970e<InterfaceC5159h> interfaceC1970eB = a.this.interactionSource.b();
                    C0308a c0308a = new C0308a(m10, m11, m12, a.this);
                    this.f21971B = 1;
                    if (interfaceC1970eB.b(c0308a, this) == objE) {
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

        public a(InterfaceC5160i interfaceC5160i) {
            this.interactionSource = interfaceC5160i;
        }

        @Override // b0.i.c
        public void T1() {
            C1841i.d(J1(), null, null, new C0307a(null), 3, null);
        }

        @Override // A0.r
        public void d(InterfaceC3783c interfaceC3783c) {
            interfaceC3783c.C1();
            if (this.isPressed) {
                k0.f.T0(interfaceC3783c, C3602t0.k(C3602t0.INSTANCE.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC3783c.C(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered || this.isFocused) {
                k0.f.T0(interfaceC3783c, C3602t0.k(C3602t0.INSTANCE.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC3783c.C(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private g() {
    }

    @Override // w.InterfaceC4949B
    public InterfaceC0831j a(InterfaceC5160i interactionSource) {
        return new a(interactionSource);
    }

    public boolean equals(Object other) {
        return other == this;
    }

    public int hashCode() {
        return -1;
    }
}
