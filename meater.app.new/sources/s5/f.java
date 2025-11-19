package s5;

import android.os.Bundle;
import java.util.HashMap;
import kotlin.InterfaceC3402h;

/* compiled from: DevicePairingCompleteFragmentArgs.java */
/* loaded from: classes2.dex */
public class f implements InterfaceC3402h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f49274a = new HashMap();

    private f() {
    }

    public static f fromBundle(Bundle bundle) {
        f fVar = new f();
        bundle.setClassLoader(f.class.getClassLoader());
        if (!bundle.containsKey("deviceId")) {
            throw new IllegalArgumentException("Required argument \"deviceId\" is missing and does not have an android:defaultValue");
        }
        fVar.f49274a.put("deviceId", Long.valueOf(bundle.getLong("deviceId")));
        return fVar;
    }

    public long a() {
        return ((Long) this.f49274a.get("deviceId")).longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f49274a.containsKey("deviceId") == fVar.f49274a.containsKey("deviceId") && a() == fVar.a();
    }

    public int hashCode() {
        return 31 + ((int) (a() ^ (a() >>> 32)));
    }

    public String toString() {
        return "DevicePairingCompleteFragmentArgs{deviceId=" + a() + "}";
    }
}
