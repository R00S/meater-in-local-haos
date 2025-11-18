package t1;

import android.view.accessibility.AccessibilityManager;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: AccessibilityManagerCompat.java */
    public interface a {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    private static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final a f49752a;

        b(a aVar) {
            this.f49752a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f49752a.equals(((b) obj).f49752a);
            }
            return false;
        }

        public int hashCode() {
            return this.f49752a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f49752a.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    @Deprecated
    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
