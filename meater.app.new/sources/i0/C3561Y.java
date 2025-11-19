package i0;

import android.graphics.Path;
import i0.R0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AndroidPath.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li0/R0;", "a", "()Li0/R0;", "Landroid/graphics/Path;", "c", "(Landroid/graphics/Path;)Li0/R0;", "", "message", "Loa/F;", "d", "(Ljava/lang/String;)V", "Li0/R0$b;", "Landroid/graphics/Path$Direction;", "e", "(Li0/R0$b;)Landroid/graphics/Path$Direction;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3561Y {

    /* compiled from: AndroidPath.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.Y$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42895a;

        static {
            int[] iArr = new int[R0.b.values().length];
            try {
                iArr[R0.b.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R0.b.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42895a = iArr;
        }
    }

    public static final R0 a() {
        return new C3556T(null, 1, 0 == true ? 1 : 0);
    }

    public static final R0 c(Path path) {
        return new C3556T(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction e(R0.b bVar) {
        int i10 = a.f42895a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
