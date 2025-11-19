package B1;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LB1/i;", "T", "LB1/m;", "", "readException", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class i<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Throwable readException) {
        super(null);
        C3862t.g(readException, "readException");
        this.readException = readException;
    }

    /* renamed from: a, reason: from getter */
    public final Throwable getReadException() {
        return this.readException;
    }
}
