package b7;

import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2261k extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z10) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z10);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return C2262l.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C2262l.class;
    }
}
