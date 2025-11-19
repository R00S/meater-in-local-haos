package ta;

import Ba.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.g;
import ta.g.b;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lta/b;", "Lta/g$b;", "B", "E", "Lta/g$c;", "baseKey", "Lkotlin/Function1;", "safeCast", "<init>", "(Lta/g$c;LBa/l;)V", "element", "b", "(Lta/g$b;)Lta/g$b;", "key", "", "a", "(Lta/g$c;)Z", "LBa/l;", "C", "Lta/g$c;", "topmostKey", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ta.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4586b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final l<g.b, E> safeCast;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final g.c<?> topmostKey;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ta.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [Ba.l<? super ta.g$b, ? extends E extends B>, Ba.l<ta.g$b, E extends B>, java.lang.Object] */
    public AbstractC4586b(g.c<B> baseKey, l<? super g.b, ? extends E> safeCast) {
        C3862t.g(baseKey, "baseKey");
        C3862t.g(safeCast, "safeCast");
        this.safeCast = safeCast;
        this.topmostKey = baseKey instanceof AbstractC4586b ? (g.c<B>) ((AbstractC4586b) baseKey).topmostKey : baseKey;
    }

    public final boolean a(g.c<?> key) {
        C3862t.g(key, "key");
        return key == this || this.topmostKey == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lta/g$b;)TE; */
    public final g.b b(g.b element) {
        C3862t.g(element, "element");
        return (g.b) this.safeCast.invoke(element);
    }
}
