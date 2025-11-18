package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: Lambda.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/jvm/internal/v;", "R", "Lkotlin/jvm/internal/o;", "Ljava/io/Serializable;", "", "arity", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3864v<R> implements InterfaceC3858o<R>, Serializable {
    private final int arity;

    public AbstractC3864v(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC3858o
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strK = P.k(this);
        C3862t.f(strK, "renderLambdaToString(...)");
        return strK;
    }
}
