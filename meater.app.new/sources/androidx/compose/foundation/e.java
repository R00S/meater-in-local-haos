package androidx.compose.foundation;

import Ba.q;
import h0.C3476g;
import kotlin.C5018A;
import kotlin.InterfaceC5038r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.InterfaceC4622H;
import ua.C4696b;
import w.InterfaceC4949B;
import z.InterfaceC5162k;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/e;", "Landroidx/compose/foundation/a;", "Lz/k;", "interactionSource", "Lw/B;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LF0/i;", "role", "Lkotlin/Function0;", "Loa/F;", "onClick", "<init>", "(Lz/k;Lw/B;ZLjava/lang/String;LF0/i;LBa/a;Lkotlin/jvm/internal/k;)V", "Lu0/H;", "w2", "(Lu0/H;Lta/d;)Ljava/lang/Object;", "J2", "(Lz/k;Lw/B;ZLjava/lang/String;LF0/i;LBa/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class e extends androidx.compose.foundation.a {

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {636}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx/r;", "Lh0/g;", "offset", "Loa/F;", "<anonymous>", "(Lx/r;Lh0/g;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21950B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f21951C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ long f21952D;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        public final Object b(InterfaceC5038r interfaceC5038r, long j10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            a aVar = e.this.new a(interfaceC4588d);
            aVar.f21951C = interfaceC5038r;
            aVar.f21952D = j10;
            return aVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(InterfaceC5038r interfaceC5038r, C3476g c3476g, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(interfaceC5038r, c3476g.getPackedValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f21950B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5038r interfaceC5038r = (InterfaceC5038r) this.f21951C;
                long j10 = this.f21952D;
                if (e.this.getEnabled()) {
                    e eVar = e.this;
                    this.f21950B = 1;
                    if (eVar.D2(interfaceC5038r, j10, this) == objE) {
                        return objE;
                    }
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

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/g;", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<C3476g, C4153F> {
        b() {
            super(1);
        }

        public final void a(long j10) {
            if (e.this.getEnabled()) {
                e.this.C2().invoke();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3476g c3476g) {
            a(c3476g.getPackedValue());
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ e(InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str, F0.i iVar, Ba.a aVar, C3854k c3854k) {
        this(interfaceC5162k, interfaceC4949B, z10, str, iVar, aVar);
    }

    static /* synthetic */ Object I2(e eVar, InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objH = C5018A.h(interfaceC4622H, eVar.new a(null), eVar.new b(), interfaceC4588d);
        return objH == C4696b.e() ? objH : C4153F.f46609a;
    }

    public final void J2(InterfaceC5162k interactionSource, InterfaceC4949B indicationNodeFactory, boolean enabled, String onClickLabel, F0.i role, Ba.a<C4153F> onClick) {
        H2(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
    }

    @Override // androidx.compose.foundation.a
    public Object w2(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return I2(this, interfaceC4622H, interfaceC4588d);
    }

    private e(InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str, F0.i iVar, Ba.a<C4153F> aVar) {
        super(interfaceC5162k, interfaceC4949B, z10, str, iVar, aVar, null);
    }
}
