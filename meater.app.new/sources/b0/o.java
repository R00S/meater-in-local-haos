package b0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: SessionMutex.kt */
@Aa.b
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0088\u0001\b\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006\u000e"}, d2 = {"Lb0/o;", "T", "", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lb0/o$a;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "b", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "c", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o<T> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SessionMutex.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002R\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lb0/o$a;", "T", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public final T a() {
            return this.value;
        }
    }

    public static <T> AtomicReference<a<T>> a() {
        return b(new AtomicReference(null));
    }

    public static final T c(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    private static <T> AtomicReference<a<T>> b(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }
}
