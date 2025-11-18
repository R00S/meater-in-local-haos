package androidx.core.view.p004d0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: androidx.core.view.d0.d */
/* loaded from: classes.dex */
public class C0290d {

    /* renamed from: a */
    private final Object f2380a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: androidx.core.view.d0.d$a */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0290d f2381a;

        a(C0290d c0290d) {
            this.f2381a = c0290d;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            C0289c c0289cMo2024b = this.f2381a.mo2024b(i2);
            if (c0289cMo2024b == null) {
                return null;
            }
            return c0289cMo2024b.m2011x0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            List<C0289c> listM2025c = this.f2381a.m2025c(str, i2);
            if (listM2025c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM2025c.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listM2025c.get(i3).m2011x0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f2381a.mo2028f(i2, i3, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: androidx.core.view.d0.d$b */
    static class b extends a {
        b(C0290d c0290d) {
            super(c0290d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i2) {
            C0289c c0289cMo2026d = this.f2381a.mo2026d(i2);
            if (c0289cMo2026d == null) {
                return null;
            }
            return c0289cMo2026d.m2011x0();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: androidx.core.view.d0.d$c */
    static class c extends b {
        c(C0290d c0290d) {
            super(c0290d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2381a.m2023a(i2, C0289c.m1949y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C0290d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2380a = new c(this);
            return;
        }
        if (i2 >= 19) {
            this.f2380a = new b(this);
        } else if (i2 >= 16) {
            this.f2380a = new a(this);
        } else {
            this.f2380a = null;
        }
    }

    /* renamed from: a */
    public void m2023a(int i2, C0289c c0289c, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C0289c mo2024b(int i2) {
        return null;
    }

    /* renamed from: c */
    public List<C0289c> m2025c(String str, int i2) {
        return null;
    }

    /* renamed from: d */
    public C0289c mo2026d(int i2) {
        return null;
    }

    /* renamed from: e */
    public Object m2027e() {
        return this.f2380a;
    }

    /* renamed from: f */
    public boolean mo2028f(int i2, int i3, Bundle bundle) {
        return false;
    }

    public C0290d(Object obj) {
        this.f2380a = obj;
    }
}
