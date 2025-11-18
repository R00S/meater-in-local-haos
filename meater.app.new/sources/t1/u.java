package t1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final Object f49807a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final u f49808a;

        a(u uVar) {
            this.f49808a = uVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            t tVarB = this.f49808a.b(i10);
            if (tVarB == null) {
                return null;
            }
            return tVarB.X0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<t> listC = this.f49808a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listC.get(i11).X0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            t tVarD = this.f49808a.d(i10);
            if (tVarD == null) {
                return null;
            }
            return tVarD.X0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f49808a.f(i10, i11, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    static class b extends a {
        b(u uVar) {
            super(uVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f49808a.a(i10, t.Y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public u() {
        this.f49807a = new b(this);
    }

    public t b(int i10) {
        return null;
    }

    public List<t> c(String str, int i10) {
        return null;
    }

    public t d(int i10) {
        return null;
    }

    public Object e() {
        return this.f49807a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public u(Object obj) {
        this.f49807a = obj;
    }

    public void a(int i10, t tVar, String str, Bundle bundle) {
    }
}
