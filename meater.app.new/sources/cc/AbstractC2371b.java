package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: Atomic.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\bR\u0013\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00108\u0002X\u0082\u0004¨\u0006\u0012"}, d2 = {"Lcc/b;", "T", "Lcc/y;", "<init>", "()V", "", "decision", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "e", "failure", "Loa/F;", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "a", "Lkotlinx/atomicfu/AtomicRef;", "_consensus", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2371b<T> extends AbstractC2394y {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31166a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2371b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = C2370a.f31165a;

    private final Object c(Object decision) {
        Object obj = f31166a.get(this);
        Object obj2 = C2370a.f31165a;
        return obj != obj2 ? obj : androidx.concurrent.futures.b.a(f31166a, this, obj2, decision) ? decision : f31166a.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cc.AbstractC2394y
    public final Object a(Object affected) {
        Object objC = f31166a.get(this);
        if (objC == C2370a.f31165a) {
            objC = c(e(affected));
        }
        b(affected, objC);
        return objC;
    }

    public abstract void b(T affected, Object failure);

    public abstract Object e(T affected);
}
