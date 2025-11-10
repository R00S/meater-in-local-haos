package com.apptionlabs.meater_app.qsg.ui.firmware;

import android.os.Bundle;
import ih.t;
import java.util.HashMap;

/* compiled from: FirmwareUpdateFragmentDirections.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class b {

    /* compiled from: FirmwareUpdateFragmentDirections.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class a implements t {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f9794a;

        @Override // ih.t
        /* renamed from: a */
        public int getActionId() {
            return 2131361878;
        }

        public boolean b() {
            return ((Boolean) this.f9794a.get("updateStatus")).booleanValue();
        }

        @Override // ih.t
        /* renamed from: c */
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f9794a.containsKey("updateStatus")) {
                bundle.putBoolean("updateStatus", ((Boolean) this.f9794a.get("updateStatus")).booleanValue());
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
            a aVar = (a) obj;
            if (this.f9794a.containsKey("updateStatus") == aVar.f9794a.containsKey("updateStatus") && b() == aVar.b() && getActionId() == aVar.getActionId()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((b() ? 1 : 0) + 31) * 31) + getActionId();
        }

        public String toString() {
            return "ActionToFirmwareCompleteScreen(actionId=" + getActionId() + "){updateStatus=" + b() + "}";
        }

        private a(boolean z10) {
            HashMap hashMap = new HashMap();
            this.f9794a = hashMap;
            hashMap.put("updateStatus", Boolean.valueOf(z10));
        }
    }

    public static a a(boolean z10) {
        return new a(z10);
    }
}
