package Q;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: ActualIntMap.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"LQ/a;", "E", "", "Landroid/util/SparseArray;", "sparseArray", "<init>", "(Landroid/util/SparseArray;)V", "", "initialCapacity", "(I)V", "key", "a", "(I)Ljava/lang/Object;", "value", "Loa/F;", "b", "(ILjava/lang/Object;)V", "Landroid/util/SparseArray;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<E> sparseArray;

    private a(SparseArray<E> sparseArray) {
        this.sparseArray = sparseArray;
    }

    public final E a(int key) {
        return this.sparseArray.get(key);
    }

    public final void b(int key, E value) {
        this.sparseArray.put(key, value);
    }

    public a(int i10) {
        this(new SparseArray(i10));
    }

    public /* synthetic */ a(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
