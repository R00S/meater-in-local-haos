package ia;

import Ba.p;
import Ba.q;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Action.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001Bp\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012,\u0010\n\u001a(\b\u0001\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR6\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R@\u0010\n\u001a(\b\u0001\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R!\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lia/a;", "", "Lkotlin/Function2;", "Lja/a;", "Lta/d;", "Loa/F;", "onSuccess", "Lkotlin/Function3;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "LIa/d;", "targetState", "<init>", "(LBa/p;LBa/q;LIa/d;)V", "a", "LBa/p;", "b", "()LBa/p;", "LBa/q;", "()LBa/q;", "c", "LIa/d;", "()LIa/d;", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ia.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3636a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p<C3756a, InterfaceC4588d<? super C4153F>, Object> onSuccess;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q<Exception, C3756a, InterfaceC4588d<? super C4153F>, Object> onError;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ia.d<? extends C3756a> targetState;

    /* JADX WARN: Multi-variable type inference failed */
    public C3636a(p<? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onSuccess, q<? super Exception, ? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onError, Ia.d<? extends C3756a> dVar) {
        C3862t.g(onSuccess, "onSuccess");
        C3862t.g(onError, "onError");
        this.onSuccess = onSuccess;
        this.onError = onError;
        this.targetState = dVar;
    }

    public final q<Exception, C3756a, InterfaceC4588d<? super C4153F>, Object> a() {
        return this.onError;
    }

    public final p<C3756a, InterfaceC4588d<? super C4153F>, Object> b() {
        return this.onSuccess;
    }

    public final Ia.d<? extends C3756a> c() {
        return this.targetState;
    }

    public /* synthetic */ C3636a(p pVar, q qVar, Ia.d dVar, int i10, C3854k c3854k) {
        this(pVar, qVar, (i10 & 4) != 0 ? null : dVar);
    }
}
