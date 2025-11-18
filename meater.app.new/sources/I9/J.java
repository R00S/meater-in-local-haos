package I9;

import kotlin.Metadata;

/* compiled from: TimeProvider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LI9/J;", "LI9/I;", "<init>", "()V", "", "a", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class J implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final J f6802a = new J();

    private J() {
    }

    @Override // I9.I
    public long a() {
        return System.currentTimeMillis() * 1000;
    }
}
