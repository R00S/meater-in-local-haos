package com.apptionlabs.meater_app.qsg.ui.info;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.result.c;
import android.widget.TextView;
import com.apptionlabs.meater_app.qsg.ui.info.PermissionsFragment;
import e7.b;
import f8.l0;
import ih.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import rk.f0;
import w6.d;
import wh.h0;
import wh.m;

/* compiled from: PermissionsFragment.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/PermissionsFragment;", "Le7/b;", "Lih/u;", "T2", "S2", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "Landroidx/activity/result/c;", "", "", "kotlin.jvm.PlatformType", "v0", "Landroidx/activity/result/c;", "requestBluetoothPermissions", "", "Q2", "()Z", "useModernPermissions", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class PermissionsFragment extends b {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final c<String[]> requestBluetoothPermissions;

    /* compiled from: PermissionsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9813a;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19359s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.b.f19360t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.b.f19361u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.b.f19362v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w6.b.f19364x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w6.b.f19363w.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w6.b.f19365y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9813a = iArr;
        }
    }

    public PermissionsFragment() {
        c<String[]> a22 = a2(new e.b(), new android.view.result.b() { // from class: g7.d0
            @Override // android.view.result.b
            public final void a(Object obj) {
                PermissionsFragment.R2(PermissionsFragment.this, (Map) obj);
            }
        });
        m.e(a22, "registerForActivityResult(...)");
        this.requestBluetoothPermissions = a22;
    }

    private final boolean Q2() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(PermissionsFragment permissionsFragment, Map map) {
        m.f(permissionsFragment, "this$0");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            String str = (String) entry.getKey();
            if (!booleanValue) {
                if (!androidx.core.app.b.v(permissionsFragment.c2(), str)) {
                    k6.b.p("never ask again", new Object[0]);
                    t a10 = f0.a();
                    m.e(a10, "actionToBluetoothPermissionDisableScreen(...)");
                    androidx.navigation.fragment.a.a(permissionsFragment).S(a10);
                    return;
                }
                permissionsFragment.T2();
                k6.b.p("denied", new Object[0]);
                return;
            }
            k6.b.p("Granted", new Object[0]);
            permissionsFragment.S2();
        }
    }

    private final void S2() {
        if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.a(e2(), "android.permission.POST_NOTIFICATIONS") != 0) {
            t c10 = f0.c();
            m.e(c10, "actionToNotificationPermissionFragment(...)");
            androidx.navigation.fragment.a.a(this).S(c10);
        } else {
            t b10 = f0.b();
            m.e(b10, "actionToImportantAlertPermissionFragment(...)");
            androidx.navigation.fragment.a.a(this).S(b10);
        }
    }

    private final void T2() {
        if (Q2()) {
            A2().f8513k0.setText(A0(2132018283));
            A2().f8512j0.setText(z2(2132018280));
        } else {
            A2().f8513k0.setText(A0(2132018003));
            A2().f8512j0.setText(z2(2132018001));
        }
        A2().S.setText(A0(2132018850));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(PermissionsFragment permissionsFragment, View view) {
        m.f(permissionsFragment, "this$0");
        permissionsFragment.requestBluetoothPermissions.a(ih.a.f268a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(PermissionsFragment permissionsFragment, View view) {
        m.f(permissionsFragment, "this$0");
        if (permissionsFragment.Q2()) {
            l0.H(permissionsFragment.Y(), i6.c.INSTANCE.m());
        } else {
            l0.H(permissionsFragment.Y(), i6.c.INSTANCE.l());
        }
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        A2().Q.setAnimation(D2().t().u());
    }

    @Override // e7.b
    public void H2() {
        if (Q2()) {
            switch (a.f9813a[C2().ordinal()]) {
                case 1:
                    TextView textView = A2().f8512j0;
                    h0 h0Var = h0.a;
                    Locale locale = Locale.US;
                    String A0 = A0(2132018281);
                    m.e(A0, "getString(...)");
                    String format = String.format(locale, A0, Arrays.copyOf(new Object[]{A0(2132018144)}, 1));
                    m.e(format, "format(locale, format, *args)");
                    textView.setText(format);
                    return;
                case 2:
                case 3:
                case 4:
                    A2().f8512j0.setText(z2(2132018281));
                    return;
                case 5:
                case 6:
                case 7:
                    A2().f8512j0.setText(z2(2132018281));
                    return;
                default:
                    return;
            }
        }
        A2().f8512j0.setText(A0(2132018004));
    }

    @Override // e7.b
    public void I2() {
        if (Q2()) {
            A2().f8513k0.setText(A0(2132018284));
        } else {
            A2().f8513k0.setText(A0(2132018007));
        }
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132017539));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionsFragment.U2(PermissionsFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void M2() {
        if (Q2()) {
            A2().f8516n0.setText(A0(2132018285));
        } else {
            A2().f8516n0.setText(A0(2132018008));
        }
        A2().f8516n0.setVisibility(0);
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: g7.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionsFragment.V2(PermissionsFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void y2() {
        d B2 = B2();
        d dVar = d.D;
        if (B2.compareTo(dVar) > 0) {
            ih.a aVar = ih.a.f268a;
            Context e22 = e2();
            m.e(e22, "requireContext(...)");
            if (!aVar.d(e22)) {
                t a10 = f0.a();
                m.e(a10, "actionToBluetoothPermissionDisableScreen(...)");
                androidx.navigation.fragment.a.a(this).S(a10);
                return;
            }
            S2();
            return;
        }
        D2().I(dVar);
    }
}
