package u5;

import android.os.Bundle;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.WiFiSSID;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.InterfaceC3402h;

/* compiled from: WifiSetUpSignInFragmentArgs.java */
/* loaded from: classes2.dex */
public class p implements InterfaceC3402h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f50483a = new HashMap();

    private p() {
    }

    public static p fromBundle(Bundle bundle) {
        p pVar = new p();
        bundle.setClassLoader(p.class.getClassLoader());
        if (!bundle.containsKey("password")) {
            throw new IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("password");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
        }
        pVar.f50483a.put("password", string);
        if (!bundle.containsKey("choosenSSID")) {
            throw new IllegalArgumentException("Required argument \"choosenSSID\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(WiFiSSID.class) && !Serializable.class.isAssignableFrom(WiFiSSID.class)) {
            throw new UnsupportedOperationException(WiFiSSID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        WiFiSSID wiFiSSID = (WiFiSSID) bundle.get("choosenSSID");
        if (wiFiSSID == null) {
            throw new IllegalArgumentException("Argument \"choosenSSID\" is marked as non-null but was passed a null value.");
        }
        pVar.f50483a.put("choosenSSID", wiFiSSID);
        if (!bundle.containsKey("passwordLength")) {
            throw new IllegalArgumentException("Required argument \"passwordLength\" is missing and does not have an android:defaultValue");
        }
        pVar.f50483a.put("passwordLength", Integer.valueOf(bundle.getInt("passwordLength")));
        if (!bundle.containsKey("wifiNetworkName")) {
            throw new IllegalArgumentException("Required argument \"wifiNetworkName\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("wifiNetworkName");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"wifiNetworkName\" is marked as non-null but was passed a null value.");
        }
        pVar.f50483a.put("wifiNetworkName", string2);
        return pVar;
    }

    public WiFiSSID a() {
        return (WiFiSSID) this.f50483a.get("choosenSSID");
    }

    public String b() {
        return (String) this.f50483a.get("password");
    }

    public int c() {
        return ((Integer) this.f50483a.get("passwordLength")).intValue();
    }

    public String d() {
        return (String) this.f50483a.get("wifiNetworkName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f50483a.containsKey("password") != pVar.f50483a.containsKey("password")) {
            return false;
        }
        if (b() == null ? pVar.b() != null : !b().equals(pVar.b())) {
            return false;
        }
        if (this.f50483a.containsKey("choosenSSID") != pVar.f50483a.containsKey("choosenSSID")) {
            return false;
        }
        if (a() == null ? pVar.a() != null : !a().equals(pVar.a())) {
            return false;
        }
        if (this.f50483a.containsKey("passwordLength") == pVar.f50483a.containsKey("passwordLength") && c() == pVar.c() && this.f50483a.containsKey("wifiNetworkName") == pVar.f50483a.containsKey("wifiNetworkName")) {
            return d() == null ? pVar.d() == null : d().equals(pVar.d());
        }
        return false;
    }

    public int hashCode() {
        return (((((((b() != null ? b().hashCode() : 0) + 31) * 31) + (a() != null ? a().hashCode() : 0)) * 31) + c()) * 31) + (d() != null ? d().hashCode() : 0);
    }

    public String toString() {
        return "WifiSetUpSignInFragmentArgs{password=" + b() + ", choosenSSID=" + a() + ", passwordLength=" + c() + ", wifiNetworkName=" + d() + "}";
    }
}
