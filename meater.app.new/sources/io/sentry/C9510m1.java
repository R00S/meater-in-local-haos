package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: FullyDisplayedReporter.java */
@ApiStatus.Internal
/* renamed from: io.sentry.m1 */
/* loaded from: classes2.dex */
public final class C9510m1 {

    /* renamed from: a */
    private static final C9510m1 f36465a = new C9510m1();

    /* renamed from: b */
    private final List<a> f36466b = new CopyOnWriteArrayList();

    /* compiled from: FullyDisplayedReporter.java */
    @ApiStatus.Internal
    /* renamed from: io.sentry.m1$a */
    public interface a {
    }

    private C9510m1() {
    }

    /* renamed from: a */
    public static C9510m1 m31014a() {
        return f36465a;
    }

    /* renamed from: b */
    public void m31015b(a aVar) {
        this.f36466b.add(aVar);
    }
}
