package ta;

import Ba.p;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lta/h;", "Lta/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "Lta/g$b;", "E", "Lta/g$c;", "key", "b", "(Lta/g$c;)Lta/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "L", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "context", "s", "(Lta/g;)Lta/g;", "N", "(Lta/g$c;)Lta/g;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h implements g, Serializable {

    /* renamed from: B, reason: collision with root package name */
    public static final h f50000B = new h();

    private h() {
    }

    @Override // ta.g
    public <R> R L(R initial, p<? super R, ? super g.b, ? extends R> operation) {
        C3862t.g(operation, "operation");
        return initial;
    }

    @Override // ta.g
    public g N(g.c<?> key) {
        C3862t.g(key, "key");
        return this;
    }

    @Override // ta.g
    public <E extends g.b> E b(g.c<E> key) {
        C3862t.g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // ta.g
    public g s(g context) {
        C3862t.g(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
