package W1;

import X1.C1804a;
import X1.L;
import android.os.Bundle;

/* compiled from: VoiceSpan.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final String f18353b = L.B0(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f18354a;

    public i(String str) {
        this.f18354a = str;
    }

    public static i a(Bundle bundle) {
        return new i((String) C1804a.e(bundle.getString(f18353b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f18353b, this.f18354a);
        return bundle;
    }
}
