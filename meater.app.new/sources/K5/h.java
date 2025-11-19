package K5;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.C2421z;
import f1.C3309b;
import g1.C3377a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: PermissionsHandler.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u001bR\u0014\u0010+\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LK5/h;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "permission", "", "l", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/app/Activity;", "activity", "", "permissions", "", "grantResults", "", "LK5/h$a;", "g", "(Landroid/app/Activity;[Ljava/lang/String;[I)Ljava/util/List;", "j", "(Landroid/app/Activity;[Ljava/lang/String;[I)Z", "Landroid/app/AlertDialog;", "dialog", "Loa/F;", "m", "(Landroid/app/AlertDialog;)V", "k", "(Landroid/content/Context;)Z", "title", "message", "", "callbackId", "c", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)Z", "a", "Landroid/app/AlertDialog;", "getDialog", "()Landroid/app/AlertDialog;", "setDialog", "i", "()Z", "runtimePermissionsRequired", "h", "()[Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AlertDialog dialog;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PermissionsHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LK5/h$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "a", "C", "D", "E", "F", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: C, reason: collision with root package name */
        public static final a f8705C = new a("GRANTED", 0);

        /* renamed from: D, reason: collision with root package name */
        public static final a f8706D = new a("DENIED", 1);

        /* renamed from: E, reason: collision with root package name */
        public static final a f8707E = new a("DENIED_ALWAYS", 2);

        /* renamed from: F, reason: collision with root package name */
        public static final a f8708F = new a("UNKNOWN", 3);

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ a[] f8709G;

        /* renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f8710H;

        static {
            a[] aVarArrC = c();
            f8709G = aVarArrC;
            f8710H = C4929b.a(aVarArrC);
            INSTANCE = new Companion(null);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f8705C, f8706D, f8707E, f8708F};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f8709G.clone();
        }
    }

    public static /* synthetic */ boolean d(h hVar, Activity activity, String str, String str2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: askPermission");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return hVar.c(activity, str, str2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F e(Activity activity, List list, int i10) {
        C3309b.t(activity, (String[]) list.toArray(new String[0]), i10);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Ba.a aVar) {
        aVar.invoke();
    }

    private final List<a> g(Activity activity, String[] permissions, int[] grantResults) {
        if (!i()) {
            return r.e(a.f8705C);
        }
        String[] strArrH = h();
        ArrayList arrayList = new ArrayList(strArrH.length);
        for (String str : strArrH) {
            int iI0 = C3831l.i0(permissions, str);
            int i10 = (iI0 < 0 || iI0 >= grantResults.length) ? -1 : grantResults[iI0];
            arrayList.add(i10 == -1 ? a.f8708F : i10 == 0 ? a.f8705C : !C3309b.v(activity, str) ? a.f8707E : a.f8706D);
        }
        return arrayList;
    }

    private final boolean i() {
        return true;
    }

    private final boolean l(Context context, String permission) {
        boolean z10 = !i() || C3377a.a(context, permission) == 0;
        U4.b.p("permitted ", permission, Boolean.valueOf(z10));
        return z10;
    }

    public final boolean c(final Activity activity, String title, String message, final int callbackId) {
        C3862t.g(activity, "activity");
        if (i() && !activity.isFinishing()) {
            String[] strArrH = h();
            final ArrayList arrayList = new ArrayList();
            for (String str : strArrH) {
                if (!l(activity, str)) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                U4.b.p("askPermission " + arrayList + " by " + activity.getLocalClassName(), new Object[0]);
                final Ba.a aVar = new Ba.a() { // from class: K5.f
                    @Override // Ba.a
                    public final Object invoke() {
                        return h.e(activity, arrayList, callbackId);
                    }
                };
                if (title == null || message == null) {
                    aVar.invoke();
                    return true;
                }
                C2421z.Companion companion = C2421z.INSTANCE;
                String string = activity.getString(R.string.ok_label);
                C3862t.f(string, "getString(...)");
                m(C2421z.Companion.f(companion, activity, title, message, false, new C2421z.AlertPair(string, new T4.e() { // from class: K5.g
                    @Override // T4.e
                    public final void a() {
                        h.f(aVar);
                    }
                }), null, null, 104, null));
                return true;
            }
        }
        return false;
    }

    public abstract String[] h();

    protected final boolean j(Activity activity, String[] permissions, int[] grantResults) {
        C3862t.g(activity, "activity");
        C3862t.g(permissions, "permissions");
        C3862t.g(grantResults, "grantResults");
        List<a> listG = g(activity, permissions, grantResults);
        if ((listG instanceof Collection) && listG.isEmpty()) {
            return true;
        }
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            if (((a) it.next()) != a.f8705C) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Context context) {
        C3862t.g(context, "context");
        for (String str : h()) {
            if (!l(context, str)) {
                return false;
            }
        }
        return true;
    }

    protected final void m(AlertDialog dialog) {
        C3862t.g(dialog, "dialog");
        AlertDialog alertDialog = this.dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.dialog = dialog;
        if (dialog != null) {
            dialog.show();
        }
    }
}
