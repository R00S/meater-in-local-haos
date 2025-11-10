package com.apptionlabs.meater_app.qsg.ui.pairing;

import android.os.Bundle;
import ih.ActionOnlyNavDirections;
import ih.t;
import java.util.HashMap;

/* compiled from: NearbyDevicesFragmentDirections.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class a {

    /* compiled from: NearbyDevicesFragmentDirections.java */
    /* renamed from: com.apptionlabs.meater_app.qsg.ui.pairing.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class C0139a implements t {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f9864a;

        @Override // ih.t
        /* renamed from: a */
        public int getActionId() {
            return 2131361871;
        }

        public long b() {
            return ((Long) this.f9864a.get("deviceId")).longValue();
        }

        @Override // ih.t
        /* renamed from: c */
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f9864a.containsKey("deviceId")) {
                bundle.putLong("deviceId", ((Long) this.f9864a.get("deviceId")).longValue());
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0139a c0139a = (C0139a) obj;
            if (this.f9864a.containsKey("deviceId") == c0139a.f9864a.containsKey("deviceId") && b() == c0139a.b() && getActionId() == c0139a.getActionId()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((int) (b() ^ (b() >>> 32))) + 31) * 31) + getActionId();
        }

        public String toString() {
            return "ActionToPairingCompleteScreen(actionId=" + getActionId() + "){deviceId=" + b() + "}";
        }

        private C0139a(long j10) {
            HashMap hashMap = new HashMap();
            this.f9864a = hashMap;
            hashMap.put("deviceId", Long.valueOf(j10));
        }
    }

    public static t a() {
        return new ActionOnlyNavDirections(2131361851);
    }

    public static C0139a b(long j10) {
        return new C0139a(j10);
    }
}
