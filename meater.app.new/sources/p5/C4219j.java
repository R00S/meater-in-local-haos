package p5;

import android.os.Bundle;
import java.util.HashMap;
import kotlin.InterfaceC3402h;

/* compiled from: FirmwareCompleteFragmentArgs.java */
/* renamed from: p5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4219j implements InterfaceC3402h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f47535a = new HashMap();

    private C4219j() {
    }

    public static C4219j fromBundle(Bundle bundle) {
        C4219j c4219j = new C4219j();
        bundle.setClassLoader(C4219j.class.getClassLoader());
        if (!bundle.containsKey("updateStatus")) {
            throw new IllegalArgumentException("Required argument \"updateStatus\" is missing and does not have an android:defaultValue");
        }
        c4219j.f47535a.put("updateStatus", Boolean.valueOf(bundle.getBoolean("updateStatus")));
        return c4219j;
    }

    public boolean a() {
        return ((Boolean) this.f47535a.get("updateStatus")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4219j c4219j = (C4219j) obj;
        return this.f47535a.containsKey("updateStatus") == c4219j.f47535a.containsKey("updateStatus") && a() == c4219j.a();
    }

    public int hashCode() {
        return 31 + (a() ? 1 : 0);
    }

    public String toString() {
        return "FirmwareCompleteFragmentArgs{updateStatus=" + a() + "}";
    }
}
