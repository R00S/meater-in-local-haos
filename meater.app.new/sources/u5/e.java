package u5;

import android.os.Bundle;
import java.util.HashMap;
import kotlin.InterfaceC3402h;

/* compiled from: WifiSetUpCompleteFragmentArgs.java */
/* loaded from: classes2.dex */
public class e implements InterfaceC3402h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f50473a = new HashMap();

    private e() {
    }

    public static e fromBundle(Bundle bundle) {
        e eVar = new e();
        bundle.setClassLoader(e.class.getClassLoader());
        if (!bundle.containsKey("isSuccessful")) {
            throw new IllegalArgumentException("Required argument \"isSuccessful\" is missing and does not have an android:defaultValue");
        }
        eVar.f50473a.put("isSuccessful", Boolean.valueOf(bundle.getBoolean("isSuccessful")));
        if (!bundle.containsKey("isConnectivityPassed")) {
            throw new IllegalArgumentException("Required argument \"isConnectivityPassed\" is missing and does not have an android:defaultValue");
        }
        eVar.f50473a.put("isConnectivityPassed", Boolean.valueOf(bundle.getBoolean("isConnectivityPassed")));
        if (!bundle.containsKey("deviceId")) {
            throw new IllegalArgumentException("Required argument \"deviceId\" is missing and does not have an android:defaultValue");
        }
        eVar.f50473a.put("deviceId", Long.valueOf(bundle.getLong("deviceId")));
        return eVar;
    }

    public long a() {
        return ((Long) this.f50473a.get("deviceId")).longValue();
    }

    public boolean b() {
        return ((Boolean) this.f50473a.get("isConnectivityPassed")).booleanValue();
    }

    public boolean c() {
        return ((Boolean) this.f50473a.get("isSuccessful")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f50473a.containsKey("isSuccessful") == eVar.f50473a.containsKey("isSuccessful") && c() == eVar.c() && this.f50473a.containsKey("isConnectivityPassed") == eVar.f50473a.containsKey("isConnectivityPassed") && b() == eVar.b() && this.f50473a.containsKey("deviceId") == eVar.f50473a.containsKey("deviceId") && a() == eVar.a();
    }

    public int hashCode() {
        return (((((c() ? 1 : 0) + 31) * 31) + (b() ? 1 : 0)) * 31) + ((int) (a() ^ (a() >>> 32)));
    }

    public String toString() {
        return "WifiSetUpCompleteFragmentArgs{isSuccessful=" + c() + ", isConnectivityPassed=" + b() + ", deviceId=" + a() + "}";
    }
}
