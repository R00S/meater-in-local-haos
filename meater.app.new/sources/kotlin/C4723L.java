package kotlin;

import androidx.compose.ui.platform.InterfaceC2031n0;
import kotlin.C1547h0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: InfiniteAnimationPolicy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "a", "(LBa/l;Lta/d;)Ljava/lang/Object;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4723L {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InfiniteAnimationPolicy.kt */
    @f(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.L$a */
    static final class a<R> extends l implements Ba.l<InterfaceC4588d<? super R>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f50602B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<Long, R> f50603C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.l<? super Long, ? extends R> lVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f50603C = lVar;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super R> interfaceC4588d) {
            return ((a) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f50603C, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f50602B;
            if (i10 == 0) {
                C4173r.b(obj);
                Ba.l<Long, R> lVar = this.f50603C;
                this.f50602B = 1;
                obj = C1547h0.b(lVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    public static final <R> Object a(Ba.l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        InterfaceC2031n0 interfaceC2031n0 = (InterfaceC2031n0) interfaceC4588d.getContext().b(InterfaceC2031n0.INSTANCE);
        return interfaceC2031n0 == null ? C1547h0.b(lVar, interfaceC4588d) : interfaceC2031n0.k(new a(lVar, null), interfaceC4588d);
    }
}
