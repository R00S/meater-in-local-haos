package W1;

import X1.L;
import android.os.Bundle;

/* compiled from: TextEmphasisSpan.java */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f18347d = L.B0(0);

    /* renamed from: e, reason: collision with root package name */
    private static final String f18348e = L.B0(1);

    /* renamed from: f, reason: collision with root package name */
    private static final String f18349f = L.B0(2);

    /* renamed from: a, reason: collision with root package name */
    public int f18350a;

    /* renamed from: b, reason: collision with root package name */
    public int f18351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18352c;

    public h(int i10, int i11, int i12) {
        this.f18350a = i10;
        this.f18351b = i11;
        this.f18352c = i12;
    }

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f18347d), bundle.getInt(f18348e), bundle.getInt(f18349f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f18347d, this.f18350a);
        bundle.putInt(f18348e, this.f18351b);
        bundle.putInt(f18349f, this.f18352c);
        return bundle;
    }
}
