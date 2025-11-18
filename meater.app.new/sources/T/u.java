package T;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u001d\u0010\u001a\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u0014R4\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010\f\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"LT/u;", "K", "V", "T", "", "<init>", "()V", "", "", "buffer", "", "dataSize", "index", "Loa/F;", "n", "([Ljava/lang/Object;II)V", "m", "([Ljava/lang/Object;I)V", "", "i", "()Z", "b", "()Ljava/lang/Object;", "k", "j", "LT/t;", "d", "()LT/t;", "l", "hasNext", "<set-?>", "B", "[Ljava/lang/Object;", "g", "()[Ljava/lang/Object;", "C", "I", "D", "h", "()I", "p", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Object[] buffer = t.INSTANCE.a().getBuffer();

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int dataSize;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int index;

    public final K b() {
        V.a.a(i());
        return (K) this.buffer[this.index];
    }

    public final t<? extends K, ? extends V> d() {
        V.a.a(j());
        Object obj = this.buffer[this.index];
        C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    /* renamed from: g, reason: from getter */
    protected final Object[] getBuffer() {
        return this.buffer;
    }

    /* renamed from: h, reason: from getter */
    protected final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return i();
    }

    public final boolean i() {
        return this.index < this.dataSize;
    }

    public final boolean j() {
        V.a.a(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final void k() {
        V.a.a(i());
        this.index += 2;
    }

    public final void l() {
        V.a.a(j());
        this.index++;
    }

    public final void m(Object[] buffer, int dataSize) {
        n(buffer, dataSize, 0);
    }

    public final void n(Object[] buffer, int dataSize, int index) {
        this.buffer = buffer;
        this.dataSize = dataSize;
        this.index = index;
    }

    protected final void p(int i10) {
        this.index = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
