package T4;

import kotlin.Metadata;

/* compiled from: EmptyViewListener.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LT4/k;", "", "", "shouldShow", "Loa/F;", "a", "(Z)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface k {

    /* compiled from: EmptyViewListener.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(k kVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyView");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            kVar.a(z10);
        }
    }

    void a(boolean shouldShow);
}
