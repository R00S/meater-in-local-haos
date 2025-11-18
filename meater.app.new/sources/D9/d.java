package D9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f3584b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f3585a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f3584b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f3584b;
                    if (dVar == null) {
                        dVar = new d();
                        f3584b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f3585a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f3585a);
        }
        return setUnmodifiableSet;
    }
}
