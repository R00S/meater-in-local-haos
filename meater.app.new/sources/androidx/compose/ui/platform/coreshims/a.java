package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;

/* compiled from: AutofillIdCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f23052a;

    private a(AutofillId autofillId) {
        this.f23052a = autofillId;
    }

    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f23052a;
    }
}
