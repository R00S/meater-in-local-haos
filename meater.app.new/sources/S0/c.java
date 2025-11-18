package S0;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: PreviewLogger.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LS0/c;", "", "a", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: PreviewLogger.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LS0/c$a;", "", "<init>", "()V", "", "message", "", "throwable", "Loa/F;", "b", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: S0.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ void c(Companion companion, String str, Throwable th, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th = null;
            }
            companion.b(str, th);
        }

        public final void a(String message, Throwable throwable) {
            Log.e("PreviewLogger", message, throwable);
        }

        public final void b(String message, Throwable throwable) {
            Log.w("PreviewLogger", message, throwable);
        }

        private Companion() {
        }
    }
}
