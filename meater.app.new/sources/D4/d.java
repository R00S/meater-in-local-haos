package D4;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: PendingIntentFlags.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LD4/d;", "", "", "flags", "", "mutable", "<init>", "(IZ)V", "a", "I", "()I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    public d(int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            i10 |= z10 ? 33554432 : 67108864;
        }
        this.flags = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    public /* synthetic */ d(int i10, boolean z10, int i11, C3854k c3854k) {
        this(i10, (i11 & 2) != 0 ? true : z10);
    }
}
