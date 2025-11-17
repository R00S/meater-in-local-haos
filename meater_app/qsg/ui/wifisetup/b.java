package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.os.Bundle;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.WiFiSSID;
import ih.t;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: WifiSetUpConnectingFragmentDirections.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class b {

    /* compiled from: WifiSetUpConnectingFragmentDirections.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class a implements t {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f9919a;

        @Override // ih.t
        /* renamed from: a */
        public int getActionId() {
            return 2131361899;
        }

        public WiFiSSID b() {
            return (WiFiSSID) this.f9919a.get("choosenSSID");
        }

        @Override // ih.t
        /* renamed from: c */
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f9919a.containsKey("wifiNetworkName")) {
                bundle.putString("wifiNetworkName", (String) this.f9919a.get("wifiNetworkName"));
            }
            if (this.f9919a.containsKey("password")) {
                bundle.putString("password", (String) this.f9919a.get("password"));
            }
            if (this.f9919a.containsKey("choosenSSID")) {
                WiFiSSID wiFiSSID = (WiFiSSID) this.f9919a.get("choosenSSID");
                if (!Parcelable.class.isAssignableFrom(WiFiSSID.class) && wiFiSSID != null) {
                    if (Serializable.class.isAssignableFrom(WiFiSSID.class)) {
                        bundle.putSerializable("choosenSSID", (Serializable) Serializable.class.cast(wiFiSSID));
                    } else {
                        throw new UnsupportedOperationException(WiFiSSID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                } else {
                    bundle.putParcelable("choosenSSID", (Parcelable) Parcelable.class.cast(wiFiSSID));
                }
            }
            if (this.f9919a.containsKey("passwordLength")) {
                bundle.putInt("passwordLength", ((Integer) this.f9919a.get("passwordLength")).intValue());
            }
            return bundle;
        }

        public String d() {
            return (String) this.f9919a.get("password");
        }

        public int e() {
            return ((Integer) this.f9919a.get("passwordLength")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9919a.containsKey("wifiNetworkName") != aVar.f9919a.containsKey("wifiNetworkName")) {
                return false;
            }
            if (f() == null ? aVar.f() != null : !f().equals(aVar.f())) {
                return false;
            }
            if (this.f9919a.containsKey("password") != aVar.f9919a.containsKey("password")) {
                return false;
            }
            if (d() == null ? aVar.d() != null : !d().equals(aVar.d())) {
                return false;
            }
            if (this.f9919a.containsKey("choosenSSID") != aVar.f9919a.containsKey("choosenSSID")) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (this.f9919a.containsKey("passwordLength") == aVar.f9919a.containsKey("passwordLength") && e() == aVar.e() && getActionId() == aVar.getActionId()) {
                return true;
            }
            return false;
        }

        public String f() {
            return (String) this.f9919a.get("wifiNetworkName");
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12 = 0;
            if (f() != null) {
                i10 = f().hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (i10 + 31) * 31;
            if (d() != null) {
                i11 = d().hashCode();
            } else {
                i11 = 0;
            }
            int i14 = (i13 + i11) * 31;
            if (b() != null) {
                i12 = b().hashCode();
            }
            return ((((i14 + i12) * 31) + e()) * 31) + getActionId();
        }

        public String toString() {
            return "ActionToWifiSetUpSignInFragment(actionId=" + getActionId() + "){wifiNetworkName=" + f() + ", password=" + d() + ", choosenSSID=" + b() + ", passwordLength=" + e() + "}";
        }

        private a(String str, String str2, WiFiSSID wiFiSSID, int i10) {
            HashMap hashMap = new HashMap();
            this.f9919a = hashMap;
            if (str != null) {
                hashMap.put("wifiNetworkName", str);
                if (str2 != null) {
                    hashMap.put("password", str2);
                    if (wiFiSSID != null) {
                        hashMap.put("choosenSSID", wiFiSSID);
                        hashMap.put("passwordLength", Integer.valueOf(i10));
                        return;
                    }
                    throw new IllegalArgumentException("Argument \"choosenSSID\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"wifiNetworkName\" is marked as non-null but was passed a null value.");
        }
    }

    public static a a(String str, String str2, WiFiSSID wiFiSSID, int i10) {
        return new a(str, str2, wiFiSSID, i10);
    }
}
