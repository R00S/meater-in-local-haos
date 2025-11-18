package v2;

import S2.r;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: ExtractorsFactory.java */
/* loaded from: classes.dex */
public interface u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f51224a = new u() { // from class: v2.t
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return u.b();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ InterfaceC4810p[] b() {
        return new InterfaceC4810p[0];
    }

    InterfaceC4810p[] d();

    default InterfaceC4810p[] f(Uri uri, Map<String, List<String>> map) {
        return d();
    }

    default u a(r.a aVar) {
        return this;
    }

    @Deprecated
    default u e(boolean z10) {
        return this;
    }
}
