package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.os.Bundle;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.WiFiSSID;
import ih.t;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: NetworkConnectingFragmentDirections.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class a {

    /* compiled from: NetworkConnectingFragmentDirections.java */
    /* renamed from: com.apptionlabs.meater_app.qsg.ui.wifisetup.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class C0140a implements t {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f9917a;

        @Override // ih.t
        /* renamed from: a */
        public int getActionId() {
            return 2131361898;
        }

        public long b() {
            return ((Long) this.f9917a.get("deviceId")).longValue();
        }

        @Override // ih.t
        /* renamed from: c */
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f9917a.containsKey("isSuccessful")) {
                bundle.putBoolean("isSuccessful", ((Boolean) this.f9917a.get("isSuccessful")).booleanValue());
            }
            if (this.f9917a.containsKey("deviceId")) {
                bundle.putLong("deviceId", ((Long) this.f9917a.get("deviceId")).longValue());
            }
            return bundle;
        }

        public boolean d() {
            return ((Boolean) this.f9917a.get("isSuccessful")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0140a c0140a = (C0140a) obj;
            if (this.f9917a.containsKey("isSuccessful") == c0140a.f9917a.containsKey("isSuccessful") && d() == c0140a.d() && this.f9917a.containsKey("deviceId") == c0140a.f9917a.containsKey("deviceId") && b() == c0140a.b() && getActionId() == c0140a.getActionId()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((d() ? 1 : 0) + 31) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + getActionId();
        }

        public String toString() {
            return "ActionToWifiSetUpConnectivityComplete(actionId=" + getActionId() + "){isSuccessful=" + d() + ", deviceId=" + b() + "}";
        }

        private C0140a(boolean z10, long j10) {
            HashMap hashMap = new HashMap();
            this.f9917a = hashMap;
            hashMap.put("isSuccessful", Boolean.valueOf(z10));
            hashMap.put("deviceId", Long.valueOf(j10));
        }
    }

    /* compiled from: NetworkConnectingFragmentDirections.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f9918a;

        @Override // ih.t
        /* renamed from: a */
        public int getActionId() {
            return 2131361873;
        }

        public WiFiSSID b() {
            return (WiFiSSID) this.f9918a.get("choosenSSID");
        }

        @Override // ih.t
        /* renamed from: c */
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f9918a.containsKey("wifiNetworkName")) {
                bundle.putString("wifiNetworkName", (String) this.f9918a.get("wifiNetworkName"));
            }
            if (this.f9918a.containsKey("password")) {
                bundle.putString("password", (String) this.f9918a.get("password"));
            }
            if (this.f9918a.containsKey("choosenSSID")) {
                WiFiSSID wiFiSSID = (WiFiSSID) this.f9918a.get("choosenSSID");
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
            if (this.f9918a.containsKey("passwordLength")) {
                bundle.putInt("passwordLength", ((Integer) this.f9918a.get("passwordLength")).intValue());
            }
            return bundle;
        }

        public String d() {
            return (String) this.f9918a.get("password");
        }

        public int e() {
            return ((Integer) this.f9918a.get("passwordLength")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f9918a.containsKey("wifiNetworkName") != bVar.f9918a.containsKey("wifiNetworkName")) {
                return false;
            }
            if (f() == null ? bVar.f() != null : !f().equals(bVar.f())) {
                return false;
            }
            if (this.f9918a.containsKey("password") != bVar.f9918a.containsKey("password")) {
                return false;
            }
            if (d() == null ? bVar.d() != null : !d().equals(bVar.d())) {
                return false;
            }
            if (this.f9918a.containsKey("choosenSSID") != bVar.f9918a.containsKey("choosenSSID")) {
                return false;
            }
            if (b() == null ? bVar.b() != null : !b().equals(bVar.b())) {
                return false;
            }
            if (this.f9918a.containsKey("passwordLength") == bVar.f9918a.containsKey("passwordLength") && e() == bVar.e() && getActionId() == bVar.getActionId()) {
                return true;
            }
            return false;
        }

        public String f() {
            return (String) this.f9918a.get("wifiNetworkName");
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
            return "ActionToWifiSetupSignInFragment(actionId=" + getActionId() + "){wifiNetworkName=" + f() + ", password=" + d() + ", choosenSSID=" + b() + ", passwordLength=" + e() + "}";
        }

        private b(String str, String str2, WiFiSSID wiFiSSID, int i10) {
            HashMap hashMap = new HashMap();
            this.f9918a = hashMap;
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

    public static C0140a a(boolean z10, long j10) {
        return new C0140a(z10, j10);
    }

    public static b b(String str, String str2, WiFiSSID wiFiSSID, int i10) {
        return new b(str, str2, wiFiSSID, i10);
    }
}
