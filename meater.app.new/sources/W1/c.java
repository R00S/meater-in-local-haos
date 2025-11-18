package W1;

import X1.C1804a;
import X1.L;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;

/* compiled from: CustomSpanBundler.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18338a = L.B0(0);

    /* renamed from: b, reason: collision with root package name */
    private static final String f18339b = L.B0(1);

    /* renamed from: c, reason: collision with root package name */
    private static final String f18340c = L.B0(2);

    /* renamed from: d, reason: collision with root package name */
    private static final String f18341d = L.B0(3);

    /* renamed from: e, reason: collision with root package name */
    private static final String f18342e = L.B0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (d dVar : (d[]) spanned.getSpans(0, spanned.length(), d.class)) {
            arrayList.add(b(spanned, dVar, 3, null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f18338a, spanned.getSpanStart(obj));
        bundle2.putInt(f18339b, spanned.getSpanEnd(obj));
        bundle2.putInt(f18340c, spanned.getSpanFlags(obj));
        bundle2.putInt(f18341d, i10);
        if (bundle != null) {
            bundle2.putBundle(f18342e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f18338a);
        int i11 = bundle.getInt(f18339b);
        int i12 = bundle.getInt(f18340c);
        int i13 = bundle.getInt(f18341d, -1);
        Bundle bundle2 = bundle.getBundle(f18342e);
        if (i13 == 1) {
            spannable.setSpan(f.a((Bundle) C1804a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(h.a((Bundle) C1804a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new d(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(i.a((Bundle) C1804a.e(bundle2)), i10, i11, i12);
        }
    }
}
