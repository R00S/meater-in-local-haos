package io.sentry;

import io.sentry.protocol.C9559r;
import io.sentry.util.C9646q;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryIntegrationPackageStorage.java */
@ApiStatus.Internal
/* renamed from: io.sentry.q4 */
/* loaded from: classes2.dex */
public final class C9573q4 {

    /* renamed from: a */
    private static volatile C9573q4 f36796a;

    /* renamed from: b */
    private final Set<String> f36797b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final Set<C9559r> f36798c = new CopyOnWriteArraySet();

    private C9573q4() {
    }

    /* renamed from: c */
    public static C9573q4 m31555c() {
        if (f36796a == null) {
            synchronized (C9573q4.class) {
                if (f36796a == null) {
                    f36796a = new C9573q4();
                }
            }
        }
        return f36796a;
    }

    /* renamed from: a */
    public void m31556a(String str) {
        C9646q.m31802c(str, "integration is required.");
        this.f36797b.add(str);
    }

    /* renamed from: b */
    public void m31557b(String str, String str2) {
        C9646q.m31802c(str, "name is required.");
        C9646q.m31802c(str2, "version is required.");
        this.f36798c.add(new C9559r(str, str2));
    }

    /* renamed from: d */
    public Set<String> m31558d() {
        return this.f36797b;
    }

    /* renamed from: e */
    public Set<C9559r> m31559e() {
        return this.f36798c;
    }
}
