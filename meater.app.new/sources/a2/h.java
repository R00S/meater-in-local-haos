package a2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f20004a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f20005b;

    public synchronized Map<String, String> a() {
        try {
            if (this.f20005b == null) {
                this.f20005b = Collections.unmodifiableMap(new HashMap(this.f20004a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20005b;
    }
}
