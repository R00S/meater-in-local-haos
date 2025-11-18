package O8;

import N8.g;
import android.os.Bundle;

/* compiled from: UnavailableAnalyticsEventLogger.java */
/* loaded from: classes2.dex */
public class f implements a {
    @Override // O8.a
    public void a(String str, Bundle bundle) {
        g.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
