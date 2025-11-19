package Xb;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J9\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0001\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\u0001\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H'¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LXb/l;", "T", "Lta/d;", "value", "", "idempotent", "Lkotlin/Function1;", "", "Loa/F;", "onCancellation", "S", "(Ljava/lang/Object;Ljava/lang/Object;LBa/l;)Ljava/lang/Object;", "token", "(Ljava/lang/Object;)V", "cause", "", "M", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/CompletionHandler;", "handler", "R", "(LBa/l;)V", "LXb/E;", "F", "(LXb/E;Ljava/lang/Object;)V", "J", "(Ljava/lang/Object;LBa/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1847l<T> extends InterfaceC4588d<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.l$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC1847l interfaceC1847l, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC1847l.M(th);
        }
    }

    void F(E e10, T t10);

    void J(T value, Ba.l<? super Throwable, C4153F> onCancellation);

    boolean M(Throwable cause);

    void R(Ba.l<? super Throwable, C4153F> handler);

    Object S(T value, Object idempotent, Ba.l<? super Throwable, C4153F> onCancellation);

    void T(Object token);
}
