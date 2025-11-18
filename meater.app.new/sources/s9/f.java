package s9;

import com.google.firebase.perf.application.a;
import v9.C4925a;

/* compiled from: FirebasePerformanceInitializer.java */
/* loaded from: classes2.dex */
public final class f implements a.InterfaceC0490a {

    /* renamed from: a, reason: collision with root package name */
    private static final C4925a f49538a = C4925a.e();

    @Override // com.google.firebase.perf.application.a.InterfaceC0490a
    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e10) {
            f49538a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
