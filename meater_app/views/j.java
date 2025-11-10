package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.apptionlabs.meater_app.activities.CustomSettingActivity;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState;
import java.lang.ref.WeakReference;

/* compiled from: CloudConnectionViewStateHelper.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f10548a;

    /* renamed from: b, reason: collision with root package name */
    private ih.g<NetworkConstant> f10549b = zm.a.c(NetworkConstant.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CloudConnectionViewStateHelper.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10550a;

        static {
            int[] iArr = new int[CloudDisconnectedState.values().length];
            f10550a = iArr;
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10550a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10550a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_DEVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10550a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10550a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_INTERNET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10550a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public j(Activity activity) {
        this.f10548a = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Activity activity, View view) {
        activity.startActivity(new Intent(activity, (Class<?>) CustomSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Activity activity, View view) {
        int I = com.apptionlabs.meater_app.app.a.u().I();
        w6.d dVar = w6.d.N;
        if (I != dVar.getProgress()) {
            com.apptionlabs.meater_app.app.a.u().A0(dVar.getProgress());
        }
        Intent intent = new Intent(activity, (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Activity activity, View view) {
        String str = i6.c.f14113t;
        Boolean bool = Boolean.TRUE;
        WebViewActivity.D2(activity, null, str, null, bool, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        f8.l0.H(view.getContext(), ((NetworkConstant) this.f10549b.getValue()).getNetworkConstant().e());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r9) {
        /*
            r8 = this;
            com.apptionlabs.meater_app.views.ToolTipView$b r0 = com.apptionlabs.meater_app.views.ToolTipView.b.ACTION
            java.lang.ref.WeakReference<android.app.Activity> r1 = r8.f10548a
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 != 0) goto Ld
            return
        Ld:
            y5.g r2 = y5.g.E()
            com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState r2 = r2.O()
            int[] r3 = com.apptionlabs.meater_app.views.j.a.f10550a
            int r4 = r2.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto Lc1;
                case 2: goto L88;
                case 3: goto L74;
                case 4: goto L49;
                case 5: goto L3e;
                case 6: goto L25;
                default: goto L21;
            }
        L21:
            r3 = r4
            r5 = r3
            goto L9b
        L25:
            r0 = 2132018088(0x7f1403a8, float:1.9674473E38)
            java.lang.String r4 = r1.getString(r0)
            r0 = 2132017582(0x7f1401ae, float:1.9673446E38)
            java.lang.String r0 = r1.getString(r0)
            com.apptionlabs.meater_app.views.ToolTipView$b r3 = com.apptionlabs.meater_app.views.ToolTipView.b.INFO
            com.apptionlabs.meater_app.views.h r5 = new com.apptionlabs.meater_app.views.h
            r5.<init>()
            r7 = r3
            r3 = r0
            r0 = r7
            goto L9b
        L3e:
            r3 = 2132017598(0x7f1401be, float:1.9673479E38)
            java.lang.String r1 = r1.getString(r3)
        L45:
            r3 = r4
            r5 = r3
            r4 = r1
            goto L9b
        L49:
            w7.a r3 = com.apptionlabs.meater_app.app.a.u()
            com.apptionlabs.meater_app.model.MEATERCloudAccount r3 = r3.k()
            if (r3 == 0) goto L56
            java.lang.String r3 = r3.email
            goto L58
        L56:
            java.lang.String r3 = ""
        L58:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 2132018979(0x7f140723, float:1.967628E38)
            java.lang.String r1 = r1.getString(r6)
            r5.append(r1)
            java.lang.String r1 = " "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            goto L45
        L74:
            r3 = 2132018982(0x7f140726, float:1.9676286E38)
            java.lang.String r4 = r1.getString(r3)
            r3 = 2132017206(0x7f140036, float:1.9672684E38)
            java.lang.String r3 = r1.getString(r3)
            com.apptionlabs.meater_app.views.g r5 = new com.apptionlabs.meater_app.views.g
            r5.<init>()
            goto L9b
        L88:
            r3 = 2132018089(0x7f1403a9, float:1.9674475E38)
            java.lang.String r4 = r1.getString(r3)
            r3 = 2132018350(0x7f1404ae, float:1.9675004E38)
            java.lang.String r3 = r1.getString(r3)
            com.apptionlabs.meater_app.views.f r5 = new com.apptionlabs.meater_app.views.f
            r5.<init>()
        L9b:
            com.apptionlabs.meater_app.views.ToolTipView r9 = (com.apptionlabs.meater_app.views.ToolTipView) r9
            r9.b(r4, r3, r0, r5)
            b6.y8 r0 = r9.f10442q
            android.widget.LinearLayout r0 = r0.S
            com.apptionlabs.meater_app.views.i r1 = new com.apptionlabs.meater_app.views.i
            r1.<init>()
            r0.setOnClickListener(r1)
            com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState r0 = com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION
            r1 = 0
            r3 = 1
            if (r2 != r0) goto Lb4
            r0 = r3
            goto Lb5
        Lb4:
            r0 = r1
        Lb5:
            android.view.View[] r2 = new android.view.View[r3]
            b6.y8 r9 = r9.f10442q
            android.widget.LinearLayout r9 = r9.S
            r2[r1] = r9
            f8.q0.g(r0, r2)
            return
        Lc1:
            r0 = 4
            r9.setVisibility(r0)
            android.content.Intent r9 = new android.content.Intent
            java.lang.Class<com.apptionlabs.meater_app.activities.CloudAccountActivity> r0 = com.apptionlabs.meater_app.activities.CloudAccountActivity.class
            r9.<init>(r1, r0)
            r1.startActivity(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.views.j.i(android.view.View):void");
    }
}
