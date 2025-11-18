package android.view;

import Ba.p;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Lifecycle.jvm.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8 X \u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/p;", "LXb/I;", "<init>", "()V", "Lkotlin/Function2;", "Lta/d;", "Loa/F;", "", "block", "LXb/v0;", "b", "(LBa/p;)LXb/v0;", "Landroidx/lifecycle/m;", "a", "()Landroidx/lifecycle/m;", "lifecycle", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2109p implements I {

    /* compiled from: Lifecycle.jvm.kt */
    @f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", l = {93}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.p$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f25979B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<I, InterfaceC4588d<? super C4153F>, Object> f25981D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f25981D = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return AbstractC2109p.this.new a(this.f25981D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f25979B;
            if (i10 == 0) {
                C4173r.b(obj);
                AbstractC2106m abstractC2106mA = AbstractC2109p.this.getLifecycle();
                p<I, InterfaceC4588d<? super C4153F>, Object> pVar = this.f25981D;
                this.f25979B = 1;
                if (H.a(abstractC2106mA, pVar, this) == objE) {
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

    /* renamed from: a */
    public abstract AbstractC2106m getLifecycle();

    @InterfaceC4156a
    public final InterfaceC1867v0 b(p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> block) {
        C3862t.g(block, "block");
        return C1841i.d(this, null, null, new a(block, null), 3, null);
    }
}
