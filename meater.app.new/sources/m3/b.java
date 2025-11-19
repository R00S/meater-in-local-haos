package m3;

import Ba.l;
import Xb.P;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.f;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: CoroutineAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "LXb/P;", "", "tag", "Lcom/google/common/util/concurrent/f;", "b", "(LXb/P;Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: CoroutineAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c.a<T> f45040B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ P<T> f45041C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, P<? extends T> p10) {
            super(1);
            this.f45040B = aVar;
            this.f45041C = p10;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f45040B.b(this.f45041C.g());
            } else if (th instanceof CancellationException) {
                this.f45040B.c();
            } else {
                this.f45040B.e(th);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    public static final <T> f<T> b(final P<? extends T> p10, final Object obj) {
        C3862t.g(p10, "<this>");
        f<T> fVarA = c.a(new c.InterfaceC0345c() { // from class: m3.a
            @Override // androidx.concurrent.futures.c.InterfaceC0345c
            public final Object a(c.a aVar) {
                return b.d(p10, obj, aVar);
            }
        });
        C3862t.f(fVarA, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return fVarA;
    }

    public static /* synthetic */ f c(P p10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(p10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(P this_asListenableFuture, Object obj, c.a completer) {
        C3862t.g(this_asListenableFuture, "$this_asListenableFuture");
        C3862t.g(completer, "completer");
        this_asListenableFuture.q(new a(completer, this_asListenableFuture));
        return obj;
    }
}
