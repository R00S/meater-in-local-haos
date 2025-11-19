package Q4;

import Ub.n;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import e5.C3197a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0019\u0010\u000b\u001a\u00020\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0003¨\u0006\u0013"}, d2 = {"Landroid/view/View;", "Loa/F;", "g", "(Landroid/view/View;)V", "j", "i", "b", "a", "Landroid/widget/TextView;", "", "content", "c", "(Landroid/widget/TextView;Ljava/lang/String;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", "e", "d", "k", "h", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l {
    public static final void a(View view) {
        C3862t.g(view, "<this>");
        C3197a.a(view, false);
    }

    public static final void b(View view) {
        C3862t.g(view, "<this>");
        C3197a.a(view, true);
    }

    public static final void c(TextView textView, String content) {
        C3862t.g(textView, "<this>");
        C3862t.g(content, "content");
        textView.setText(f(content));
    }

    public static final String d(String content) {
        String strSubstring;
        C3862t.g(content, "content");
        try {
            boolean zQ = x4.g.t().Q();
            if (n.Y(content, "metric=", 0, false, 6, null) > n.Y(content, "imperial=", 0, false, 6, null)) {
                if (zQ) {
                    strSubstring = content.substring(n.Y(content, "imperial=\"", 0, false, 6, null) + 10, n.Y(content, "\" metric=", 0, false, 6, null));
                    C3862t.f(strSubstring, "substring(...)");
                } else {
                    strSubstring = content.substring(n.Y(content, "metric=\"", 0, false, 6, null) + 8, n.Y(content, "\" />", 0, false, 6, null));
                    C3862t.f(strSubstring, "substring(...)");
                }
            } else if (zQ) {
                strSubstring = content.substring(n.Y(content, "imperial=\"", 0, false, 6, null) + 10, n.Y(content, "\" />", 0, false, 6, null));
                C3862t.f(strSubstring, "substring(...)");
            } else {
                strSubstring = content.substring(n.Y(content, "metric=\"", 0, false, 6, null) + 8, n.Y(content, "\" imperial=", 0, false, 6, null));
                C3862t.f(strSubstring, "substring(...)");
            }
            String strC = n.C(content, "<measurement", strSubstring, false, 4, null);
            return n.q0(strC, n.Y(strC, strSubstring, 0, false, 6, null) + strSubstring.length(), n.Y(strC, "\" />", 0, false, 6, null) + 4).toString();
        } catch (Exception e10) {
            U4.b.t("(ViewExt) Measurement Parsing Exception | " + e10.getMessage(), new Object[0]);
            return content;
        }
    }

    public static final String e(String content) throws NumberFormatException {
        int i10;
        String str;
        C3862t.g(content, "content");
        try {
            boolean zN1 = x4.g.t().n1();
            if (n.Y(content, "c=", 0, false, 6, null) > n.Y(content, "f=", 0, false, 6, null)) {
                if (zN1) {
                    String strSubstring = content.substring(n.Y(content, "f=\"", 0, false, 6, null) + 3, n.Y(content, "\" c=", 0, false, 6, null));
                    C3862t.f(strSubstring, "substring(...)");
                    i10 = Integer.parseInt(strSubstring);
                } else {
                    String strSubstring2 = content.substring(n.Y(content, "c=\"", 0, false, 6, null) + 3, n.Y(content, "\" />", 0, false, 6, null));
                    C3862t.f(strSubstring2, "substring(...)");
                    i10 = Integer.parseInt(strSubstring2);
                }
            } else if (zN1) {
                String strSubstring3 = content.substring(n.Y(content, "f=\"", 0, false, 6, null) + 3, n.Y(content, "\" />", 0, false, 6, null));
                C3862t.f(strSubstring3, "substring(...)");
                i10 = Integer.parseInt(strSubstring3);
            } else {
                String strSubstring4 = content.substring(n.Y(content, "c=\"", 0, false, 6, null) + 3, n.Y(content, "\" f=", 0, false, 6, null));
                C3862t.f(strSubstring4, "substring(...)");
                i10 = Integer.parseInt(strSubstring4);
            }
            if (zN1) {
                str = i10 + "°F";
            } else {
                str = i10 + "°C";
            }
            String strC = n.C(content, "<temperature", str, false, 4, null);
            return n.q0(strC, n.Y(strC, str, 0, false, 6, null) + str.length(), n.Y(strC, "\" />", 0, false, 6, null) + 4).toString();
        } catch (Exception e10) {
            U4.b.t("(ViewExt) Temperature Parsing Exception | " + e10.getMessage(), new Object[0]);
            return content;
        }
    }

    public static final String f(String content) {
        C3862t.g(content, "content");
        ArrayList arrayList = new ArrayList();
        int iY = n.Y(content, "<", 0, false, 6, null);
        while (iY != -1) {
            arrayList.add(Integer.valueOf(iY));
            iY = n.Y(content, "<", iY + 1, false, 4, null);
        }
        ArrayList arrayList2 = new ArrayList();
        int iY2 = n.Y(content, " />", 0, false, 6, null);
        while (iY2 != -1) {
            arrayList2.add(Integer.valueOf(iY2));
            iY2 = n.Y(content, " />", iY2 + 1, false, 4, null);
        }
        String strC = content;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            C3862t.f(obj, "get(...)");
            String strSubstring = content.substring(((Number) obj).intValue(), ((Number) arrayList2.get(i10)).intValue() + 3);
            C3862t.f(strSubstring, "substring(...)");
            String strE = n.J(strSubstring, "<temperature", true) ? e(strSubstring) : "";
            if (n.J(strSubstring, "<measurement", true)) {
                strE = d(strSubstring);
            }
            strC = n.C(strC, strSubstring, strE, false, 4, null);
        }
        return strC;
    }

    public static final void g(View view) {
        C3862t.g(view, "<this>");
        view.setVisibility(8);
    }

    public static final void h(View view) {
        C3862t.g(view, "<this>");
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.fade_out));
        view.setVisibility(8);
    }

    public static final void i(View view) {
        C3862t.g(view, "<this>");
        view.setVisibility(4);
    }

    public static final void j(View view) {
        C3862t.g(view, "<this>");
        view.setVisibility(0);
    }

    public static final void k(View view) {
        C3862t.g(view, "<this>");
        view.setVisibility(0);
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.fade_in));
    }
}
