package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3858o;
import kotlin.jvm.internal.P;
import ta.InterfaceC4588d;

/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/k;", "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/jvm/internal/o;", "", "", "arity", "Lta/d;", "completion", "<init>", "(ILta/d;)V", "", "toString", "()Ljava/lang/String;", "B", "I", "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class k extends j implements InterfaceC3858o<Object> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int arity;

    public k(int i10, InterfaceC4588d<Object> interfaceC4588d) {
        super(interfaceC4588d);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC3858o
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strJ = P.j(this);
        C3862t.f(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
