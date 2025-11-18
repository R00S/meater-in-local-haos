package T;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LT/g;", "K", "V", "T", "", "LT/e;", "LT/f;", "builder", "", "LT/u;", "path", "<init>", "(LT/f;[LT/u;)V", "", "keyHash", "LT/t;", "node", "key", "pathIndex", "Loa/F;", "m", "(ILT/t;Ljava/lang/Object;I)V", "l", "()V", "k", "next", "()Ljava/lang/Object;", "remove", "newValue", "n", "(Ljava/lang/Object;Ljava/lang/Object;)V", "E", "LT/f;", "F", "Ljava/lang/Object;", "lastIteratedKey", "", "G", "Z", "nextWasInvoked", "H", "I", "expectedModCount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> implements Iterator<T>, Ca.a {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final f<K, V> builder;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private K lastIteratedKey;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean nextWasInvoked;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.i(), uVarArr);
        this.builder = fVar;
        this.expectedModCount = fVar.getModCount();
    }

    private final void k() {
        if (this.builder.getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void m(int keyHash, t<?, ?> node, K key, int pathIndex) {
        int i10 = pathIndex * 5;
        if (i10 > 30) {
            h()[pathIndex].n(node.getBuffer(), node.getBuffer().length, 0);
            while (!C3862t.b(h()[pathIndex].b(), key)) {
                h()[pathIndex].k();
            }
            j(pathIndex);
            return;
        }
        int iF = 1 << x.f(keyHash, i10);
        if (node.q(iF)) {
            h()[pathIndex].n(node.getBuffer(), node.m() * 2, node.n(iF));
            j(pathIndex);
        } else {
            int iO = node.O(iF);
            t<?, ?> tVarN = node.N(iO);
            h()[pathIndex].n(node.getBuffer(), node.m() * 2, iO);
            m(keyHash, tVarN, key, pathIndex + 1);
        }
    }

    public final void n(K key, V newValue) {
        if (this.builder.containsKey(key)) {
            if (getHasNext()) {
                K kD = d();
                this.builder.put(key, newValue);
                m(kD != null ? kD.hashCode() : 0, this.builder.i(), kD, 0);
            } else {
                this.builder.put(key, newValue);
            }
            this.expectedModCount = this.builder.getModCount();
        }
    }

    @Override // T.e, java.util.Iterator
    public T next() {
        k();
        this.lastIteratedKey = d();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // T.e, java.util.Iterator
    public void remove() {
        l();
        if (getHasNext()) {
            K kD = d();
            W.d(this.builder).remove(this.lastIteratedKey);
            m(kD != null ? kD.hashCode() : 0, this.builder.i(), kD, 0);
        } else {
            W.d(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount();
    }
}
