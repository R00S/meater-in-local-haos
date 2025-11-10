package com.apptionlabs.meater_app.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b6.q;
import com.apptionlabs.meater_app.activities.JuicyVideosActivity;
import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.JuicyVideo;
import com.apptionlabs.meater_app.data.JuicyVideoList;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.views.r1;
import com.google.gson.Gson;
import f8.l0;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import lm.b;
import q5.w;

/* loaded from: /tmp/meat/meat/classes.dex */
public class JuicyVideosActivity extends j {

    /* renamed from: a0, reason: collision with root package name */
    RecyclerView f9379a0;

    /* renamed from: b0, reason: collision with root package name */
    Context f9380b0;

    /* renamed from: c0, reason: collision with root package name */
    w f9381c0;

    /* renamed from: d0, reason: collision with root package name */
    RecyclerView.p f9382d0;

    /* renamed from: e0, reason: collision with root package name */
    q f9383e0;

    /* renamed from: f0, reason: collision with root package name */
    JuicyVideoList f9384f0 = new JuicyVideoList();

    /* renamed from: g0, reason: collision with root package name */
    private ih.g<NetworkConstant> f9385g0 = zm.a.c(NetworkConstant.class);

    /* renamed from: h0, reason: collision with root package name */
    private e6.e f9386h0 = e6.e.ALL;

    /* renamed from: i0, reason: collision with root package name */
    android.view.o f9387i0 = new a(true);

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends android.view.o {
        a(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            JuicyVideosActivity.this.s2();
            JuicyVideosActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9389a;

        static {
            int[] iArr = new int[e6.e.values().length];
            f9389a = iArr;
            try {
                iArr[e6.e.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A2(View view) {
        Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2(View view) {
        Y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C2(View view) {
        T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D2(View view) {
        L2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E2(View view) {
        P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F2(View view) {
        M2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G2(View view) {
        V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H2(View view) {
        U2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(View view) {
        R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J2(View view) {
        O2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K2(View view) {
        S2();
    }

    private void L2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.I.title);
        a3(e6.e.ALL);
    }

    private void M2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.K.title);
        a3(e6.e.BEEF);
    }

    private void N2() {
        lm.b.g(b.EnumC0292b.f17359w1.title, b.a.f17298r.title, b.c.Q.title);
        l0.H(this, ((NetworkConstant) this.f9385g0.getValue()).getNetworkConstant().k());
    }

    private void P2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.J.title);
        a3(e6.e.GUEST);
    }

    private void R2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.N.title);
        a3(e6.e.LAMB);
    }

    private void T2() {
        lm.b.g(b.EnumC0292b.A1.title, b.a.f17298r.title, b.c.Q.title);
        l0.H(this, ((NetworkConstant) this.f9385g0.getValue()).getNetworkConstant().j());
    }

    private void U2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.M.title);
        a3(e6.e.PORK);
    }

    private void V2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.L.title);
        a3(e6.e.CHICKEN);
    }

    private void W2() {
        lm.b.g(b.EnumC0292b.f17368z1.title, b.a.f17298r.title, b.c.Q.title);
        l0.H(this, ((NetworkConstant) this.f9385g0.getValue()).getNetworkConstant().a());
    }

    private void Y2() {
        lm.b.g(b.EnumC0292b.f17362x1.title, b.a.f17298r.title, b.c.Q.title);
        l0.H(this, ((NetworkConstant) this.f9385g0.getValue()).getNetworkConstant().n());
    }

    private int Z2(ArrayList<JuicyVideo> arrayList, String str) {
        int i10 = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (str.isEmpty()) {
            return arrayList.size();
        }
        try {
            long time = DateExtensionKt.getDateFormatWithTimeZone().parse(str).getTime();
            Iterator<JuicyVideo> it = arrayList.iterator();
            while (it.hasNext()) {
                if (DateExtensionKt.getDateFormatWithTimeZone().parse(it.next().datePublished).getTime() > time) {
                    i10++;
                }
            }
            return i10;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    private void a3(e6.e eVar) {
        ArrayList<JuicyVideo> w22 = w2(eVar);
        if (w22.isEmpty()) {
            return;
        }
        w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        this.f9386h0 = eVar;
        this.f9383e0.X.f(eVar.ordinal(), Z2(this.f9384f0.guest, u10.t()));
        this.f9381c0.P(w22, eVar.ordinal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2() {
        String v22 = v2();
        w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        u10.E0(v22);
        u10.V0(v22);
        u10.G0(v22);
        u10.U0(v22);
        u10.Z0(v22);
        u10.l1(v22);
        u10.j1(v22);
        u10.m1(v22);
    }

    private void t2() {
        this.f9383e0.X.setDisabled(this.f9384f0.guest.isEmpty());
    }

    private ArrayList<JuicyVideo> u2() {
        return new ArrayList<>();
    }

    private String v2() {
        return DateExtensionKt.getDateFormatWithTimeZone().format(Calendar.getInstance().getTime());
    }

    private ArrayList<JuicyVideo> w2(e6.e eVar) {
        w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        if (b.f9389a[eVar.ordinal()] != 1) {
            return new ArrayList<>();
        }
        u10.E0(v2());
        return u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(View view) {
        N2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(View view) {
        W2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(View view) {
        X2();
    }

    public void O2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.O.title);
        a3(e6.e.FISH);
    }

    public void Q2() {
        lm.b.g(b.EnumC0292b.f17365y1.title, b.a.f17298r.title, b.c.Q.title);
        l0.H(this, ((NetworkConstant) this.f9385g0.getValue()).getNetworkConstant().c());
    }

    public void S2() {
        lm.b.g(b.EnumC0292b.f17353u1.title, b.a.f17298r.title, b.c.P.title);
        a3(e6.e.OTHER);
    }

    public void X2() {
        lm.b.g(b.EnumC0292b.B1.title, b.a.f17298r.title, b.c.Q.title);
        l0.H(this, ((NetworkConstant) this.f9385g0.getValue()).getNetworkConstant().g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9383e0 = (q) androidx.databinding.g.j(this, 2131558444);
        this.f9384f0 = (JuicyVideoList) new Gson().i(getIntent().getStringExtra("juicy_cooks"), JuicyVideoList.class);
        t2();
        this.f9380b0 = getApplicationContext();
        this.f9379a0 = (RecyclerView) findViewById(2131363152);
        this.f9382d0 = new LinearLayoutManager(this.f9380b0);
        this.f9379a0.j(new r1(0));
        this.f9379a0.setLayoutManager(this.f9382d0);
        w wVar = new w(this.f9380b0, w2(e6.e.ALL), this);
        this.f9381c0 = wVar;
        this.f9379a0.setAdapter(wVar);
        this.f9379a0.setNestedScrollingEnabled(false);
        com.apptionlabs.meater_app.app.a.u().X0(DateExtensionKt.getDateFormatWithTimeZone().format(Calendar.getInstance().getTime()));
        a3(this.f9386h0);
        this.f9383e0.V.setOnClickListener(new View.OnClickListener() { // from class: p5.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.x2(view);
            }
        });
        this.f9383e0.f8156f0.setOnClickListener(new View.OnClickListener() { // from class: p5.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.y2(view);
            }
        });
        this.f9383e0.Q.setOnClickListener(new View.OnClickListener() { // from class: p5.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.D2(view);
            }
        });
        this.f9383e0.X.setOnClickListener(new View.OnClickListener() { // from class: p5.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.E2(view);
            }
        });
        this.f9383e0.S.setOnClickListener(new View.OnClickListener() { // from class: p5.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.F2(view);
            }
        });
        this.f9383e0.f8154d0.setOnClickListener(new View.OnClickListener() { // from class: p5.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.G2(view);
            }
        });
        this.f9383e0.f8153c0.setOnClickListener(new View.OnClickListener() { // from class: p5.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.H2(view);
            }
        });
        this.f9383e0.Z.setOnClickListener(new View.OnClickListener() { // from class: p5.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.I2(view);
            }
        });
        this.f9383e0.W.setOnClickListener(new View.OnClickListener() { // from class: p5.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.J2(view);
            }
        });
        this.f9383e0.f8151a0.setOnClickListener(new View.OnClickListener() { // from class: p5.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.K2(view);
            }
        });
        this.f9383e0.f8159i0.setOnClickListener(new View.OnClickListener() { // from class: p5.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.z2(view);
            }
        });
        this.f9383e0.Y.setOnClickListener(new View.OnClickListener() { // from class: p5.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.A2(view);
            }
        });
        this.f9383e0.f8160j0.setOnClickListener(new View.OnClickListener() { // from class: p5.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.B2(view);
            }
        });
        this.f9383e0.f8152b0.setOnClickListener(new View.OnClickListener() { // from class: p5.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JuicyVideosActivity.this.C2(view);
            }
        });
        getOnBackPressedDispatcher().h(this, this.f9387i0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s2();
    }
}
