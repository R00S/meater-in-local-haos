package com.apptionlabs.meater_app.activities;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import b6.e0;
import bn.s;
import com.apptionlabs.meater_app.activities.ShareCookActivity;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.views.e0;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import f8.l0;
import f8.t;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ShareCookActivity extends OrientationActivity {
    e0 S;
    MEATERCloudAccount T;
    long U = -1;
    b V = b.None;
    private ih.g<NetworkConstant> W = zm.a.c(NetworkConstant.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements bn.d<com.google.gson.l> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            ShareCookActivity.this.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Throwable th) {
            String string;
            if (th.getLocalizedMessage() != null) {
                string = th.getLocalizedMessage();
            } else {
                string = ShareCookActivity.this.getString(2132017683);
            }
            String str = string;
            e0.Companion companion = com.apptionlabs.meater_app.views.e0.INSTANCE;
            ShareCookActivity shareCookActivity = ShareCookActivity.this;
            companion.e(shareCookActivity, "Oops", str, false, new e0.AlertPair(shareCookActivity.getString(2132018881), new j6.e() { // from class: com.apptionlabs.meater_app.activities.o
                @Override // j6.e
                public final void a() {
                    ShareCookActivity.a.this.e();
                }
            }), null, null).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g() {
            ShareCookActivity.this.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(s sVar) {
            String string = ShareCookActivity.this.getString(2132017683);
            try {
                string = new JSONObject(sVar.d().j()).getString("reason");
            } catch (IOException | JSONException | JsonSyntaxException e10) {
                e10.printStackTrace();
            }
            String str = string;
            e0.Companion companion = com.apptionlabs.meater_app.views.e0.INSTANCE;
            ShareCookActivity shareCookActivity = ShareCookActivity.this;
            companion.e(shareCookActivity, "Oops", str, false, new e0.AlertPair(shareCookActivity.getString(2132018881), new j6.e() { // from class: com.apptionlabs.meater_app.activities.n
                @Override // j6.e
                public final void a() {
                    ShareCookActivity.a.this.g();
                }
            }), null, null).show();
        }

        public void onFailure(bn.b<com.google.gson.l> bVar, final Throwable th) {
            if (ShareCookActivity.this.isFinishing()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apptionlabs.meater_app.activities.m
                @Override // java.lang.Runnable
                public final void run() {
                    ShareCookActivity.a.this.f(th);
                }
            });
        }

        public void onResponse(bn.b<com.google.gson.l> bVar, final s<com.google.gson.l> sVar) {
            if (sVar.f()) {
                if (sVar.a() != null) {
                    try {
                        ShareCookActivity.this.V0(new JSONObject(new Gson().s((com.google.gson.j) sVar.a())).getJSONObject("data").getString("url"));
                        return;
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (ShareCookActivity.this.isFinishing()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apptionlabs.meater_app.activities.l
                @Override // java.lang.Runnable
                public final void run() {
                    ShareCookActivity.a.this.h(sVar);
                }
            });
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum b {
        Browser_Request,
        Email_Request,
        CopyLink_Request,
        More_Request,
        None
    }

    private void U0() {
        String replaceAll = l0.r(this, "\n", 2132018688, 2132018689).replaceAll("\n", "\n\n");
        SpannableString spannableString = new SpannableString(replaceAll);
        Matcher matcher = Pattern.compile("\n\n").matcher(replaceAll);
        while (matcher.find()) {
            spannableString.setSpan(new AbsoluteSizeSpan(9, true), matcher.start() + 1, matcher.end(), 33);
        }
        this.S.f7702j0.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(String str) {
        if (!isFinishing()) {
            if (str != null) {
                b bVar = this.V;
                if (bVar == b.Browser_Request) {
                    l0.H(this, str);
                } else if (bVar == b.Email_Request) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
                    intent.putExtra("android.intent.extra.SUBJECT", "");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    startActivity(Intent.createChooser(intent, null));
                } else if (bVar == b.CopyLink_Request) {
                    ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
                    this.S.W.setVisibility(8);
                    this.S.Z.setVisibility(0);
                    this.S.f7704l0.setText(getString(2132017990));
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.j4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareCookActivity.this.W0();
                        }
                    }, 1000L);
                } else if (bVar == b.More_Request) {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.SEND");
                    intent2.putExtra("android.intent.extra.TEXT", str);
                    intent2.setType("text/plain");
                    startActivity(Intent.createChooser(Intent.createChooser(intent2, null), "MEATER Cook"));
                }
            }
            if (str == null || this.V != b.CopyLink_Request) {
                finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(View view) {
        a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0() {
        if (this.T == null) {
            finish();
        } else {
            h1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0() {
        finish();
    }

    private void a1() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(View view) {
        view.setPressed(false);
        this.V = b.Browser_Request;
        g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(View view) {
        view.setPressed(false);
        this.V = b.CopyLink_Request;
        g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(View view) {
        view.setPressed(false);
        this.V = b.Email_Request;
        g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(View view) {
        view.setPressed(false);
        this.V = b.More_Request;
        g1();
    }

    private void f1() {
        this.S.W.setVisibility(0);
        this.S.f7704l0.setVisibility(0);
        this.S.S.setVisibility(8);
        this.S.f7703k0.setVisibility(8);
    }

    private void g1() {
        if (t.f12516a.b()) {
            f1();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.h4
                @Override // java.lang.Runnable
                public final void run() {
                    ShareCookActivity.this.Y0();
                }
            }, 100L);
        } else if (!isFinishing()) {
            com.apptionlabs.meater_app.views.e0.INSTANCE.e(this, "Oops", getString(2132018873), false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.i4
                @Override // j6.e
                public final void a() {
                    ShareCookActivity.this.Z0();
                }
            }), null, null).show();
        }
    }

    private void h1() {
        long j10 = this.U;
        if (j10 != -1) {
            lm.d.f17383a.g(true).x(((NetworkConstant) this.W.getValue()).getCloudBaseUrl() + "v2/cook-share/" + Long.toHexString(j10).toUpperCase()).enqueue(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = (b6.e0) androidx.databinding.g.j(this, 2131558454);
        this.U = getIntent().getLongExtra("c_i", 0L);
        MEATERCloudAccount k10 = com.apptionlabs.meater_app.app.a.u().k();
        this.T = k10;
        if (k10 == null) {
            finish();
            return;
        }
        U0();
        this.S.T.setOnClickListener(new View.OnClickListener() { // from class: p5.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareCookActivity.this.b1(view);
            }
        });
        this.S.f7694b0.setOnClickListener(new View.OnClickListener() { // from class: p5.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareCookActivity.this.d1(view);
            }
        });
        this.S.f7697e0.setOnClickListener(new View.OnClickListener() { // from class: p5.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareCookActivity.this.e1(view);
            }
        });
        this.S.X.setOnClickListener(new View.OnClickListener() { // from class: p5.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareCookActivity.this.c1(view);
            }
        });
        this.S.S.setOnClickListener(new View.OnClickListener() { // from class: p5.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareCookActivity.this.X0(view);
            }
        });
    }
}
