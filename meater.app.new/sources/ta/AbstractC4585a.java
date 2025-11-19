package ta;

import Ba.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lta/a;", "Lta/g$b;", "Lta/g$c;", "key", "<init>", "(Lta/g$c;)V", "B", "Lta/g$c;", "getKey", "()Lta/g$c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ta.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4585a implements g.b {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final g.c<?> key;

    public AbstractC4585a(g.c<?> key) {
        C3862t.g(key, "key");
        this.key = key;
    }

    @Override // ta.g
    public <R> R L(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // ta.g
    public g N(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // ta.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // ta.g
    public g s(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
