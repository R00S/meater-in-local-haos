package A0;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: NestedVectorStack.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"LA0/Z;", "T", "", "<init>", "()V", "", "a", "()Z", "b", "()Ljava/lang/Object;", "LQ/b;", "vector", "Loa/F;", "c", "(LQ/b;)V", "", "I", "size", "", "[I", "currentIndexes", "", "[LQ/b;", "vectors", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] currentIndexes = new int[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Q.b<T>[] vectors = new Q.b[16];

    public final boolean a() {
        int i10 = this.size;
        return i10 > 0 && this.currentIndexes[i10 - 1] >= 0;
    }

    public final T b() {
        int i10 = this.size;
        if (i10 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i11 = i10 - 1;
        int i12 = this.currentIndexes[i11];
        Q.b<T> bVar = this.vectors[i11];
        C3862t.d(bVar);
        if (i12 > 0) {
            this.currentIndexes[i11] = r3[i11] - 1;
        } else if (i12 == 0) {
            this.vectors[i11] = null;
            this.size--;
        }
        return bVar.t()[i12];
    }

    public final void c(Q.b<T> vector) {
        if (vector.x()) {
            return;
        }
        int i10 = this.size;
        int[] iArr = this.currentIndexes;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.currentIndexes = iArrCopyOf;
            Q.b<T>[] bVarArr = this.vectors;
            Object[] objArrCopyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.vectors = (Q.b[]) objArrCopyOf;
        }
        this.currentIndexes[i10] = vector.getSize() - 1;
        this.vectors[i10] = vector;
        this.size++;
    }
}
