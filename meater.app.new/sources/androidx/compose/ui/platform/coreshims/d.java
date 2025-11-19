package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: ViewCompatShims.java */
/* loaded from: classes.dex */
public class d {

    /* compiled from: ViewCompatShims.java */
    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    /* compiled from: ViewCompatShims.java */
    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* compiled from: ViewCompatShims.java */
    private static class c {
        static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    public static androidx.compose.ui.platform.coreshims.a a(View view) {
        return androidx.compose.ui.platform.coreshims.a.b(a.a(view));
    }

    public static androidx.compose.ui.platform.coreshims.c b(View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = b.a(view)) == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.c.f(contentCaptureSessionA, view);
    }

    public static void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i10);
        }
    }
}
