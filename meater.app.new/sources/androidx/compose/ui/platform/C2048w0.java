package androidx.compose.ui.platform;

import android.graphics.Matrix;
import i0.C3553P;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: LayerMatrixCache.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000eR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/w0;", "T", "", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "Loa/F;", "getMatrix", "<init>", "(LBa/p;)V", "c", "()V", "target", "Li0/L0;", "b", "(Ljava/lang/Object;)[F", "a", "LBa/p;", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", "d", "[F", "matrixCache", "e", "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", "h", "isInverseValid", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2048w0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<T, Matrix, C4153F> getMatrix;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Matrix androidMatrixCache;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Matrix previousAndroidMatrix;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float[] matrixCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty = true;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseDirty = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseValid = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C2048w0(Ba.p<? super T, ? super Matrix, C4153F> pVar) {
        this.getMatrix = pVar;
    }

    public final float[] a(T target) {
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = i0.L0.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = C2044u0.a(b(target), fArrC);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(T target) {
        float[] fArrC = this.matrixCache;
        if (fArrC == null) {
            fArrC = i0.L0.c(null, 1, null);
            this.matrixCache = fArrC;
        }
        if (!this.isDirty) {
            return fArrC;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !C3862t.b(matrix, matrix2)) {
            C3553P.b(fArrC, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArrC;
    }

    public final void c() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
