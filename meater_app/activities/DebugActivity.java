package com.apptionlabs.meater_app.activities;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import androidx.core.content.FileProvider;
import com.apptionlabs.meater_app.activities.DebugActivity;
import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.views.b1;
import f8.l0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DebugActivity extends j {

    /* renamed from: e0, reason: collision with root package name */
    static String f9359e0;

    /* renamed from: a0, reason: collision with root package name */
    boolean f9360a0;

    /* renamed from: b0, reason: collision with root package name */
    Probe f9361b0;

    /* renamed from: c0, reason: collision with root package name */
    b6.k f9362c0;

    /* renamed from: d0, reason: collision with root package name */
    private final BroadcastReceiver f9363d0 = new a();

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            if (intent.getAction().equals(ProtocolParameters.MEATER_LOG_NOTIF)) {
                DebugActivity.this.f2(extras.getString("log"));
            } else if (intent.getAction().equals(ProtocolParameters.PROBE_EVENT_LOG_NOTIF) && extras.getLong("sn", 0L) == DebugActivity.this.f9361b0.getDeviceID()) {
                DebugActivity.this.f2(extras.getString("event_log"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f2(String str) {
        if (this.f9360a0) {
            return;
        }
        g2(str, false);
        l2();
        m2();
    }

    private void g2(String str, boolean z10) {
        if (z10) {
            this.f9362c0.V.append(p2());
            if (this.f9361b0 != null) {
                this.f9362c0.V.setText("");
                this.f9362c0.V.append(h2());
            }
        }
        String str2 = f9359e0;
        if (str2 != null && str2.length() > 0) {
            if (str.contains(f9359e0)) {
                this.f9362c0.V.append(str + "\n");
                return;
            }
            return;
        }
        this.f9362c0.V.append(str + "\n");
    }

    private String h2() {
        String str;
        String str2;
        String str3 = "Session Start " + DateExtensionKt.getFormatWithDayMonthYearHMS().format(Calendar.getInstance().getTime()) + "\n";
        String str4 = "Device: " + com.apptionlabs.meater_app.app.a.o() + " (Android " + b1.f10463c + ")";
        String str5 = "Probe: " + this.f9361b0.getDeviceIDString() + " (" + this.f9361b0.getFirmwareRevision() + ")";
        if (this.f9361b0.appearsToHaveCookInProgress()) {
            str = "Cook ID: " + this.f9361b0.cookIDString();
            str2 = this.f9361b0.cookNameForDisplay();
        } else {
            str = "";
            str2 = "";
        }
        return "v4.3.1 (9743-hotfix/4.3.1 d676fe25e) – built Fri 24 May 24\n" + str3 + "\n" + str4 + "\n" + str5 + "\n" + str + "\n" + str2 + "\n\n";
    }

    private void i2() {
        List d10;
        int i10;
        boolean z10;
        Probe probe = this.f9361b0;
        if (probe != null) {
            if (!probe.appearsToHaveCookInProgress()) {
                d10 = new ArrayList();
                d10.add("No log – start a cook to see something here.");
            } else if (this.f9361b0.getEventLog() != null) {
                d10 = this.f9361b0.getEventLog().getCurrentProbeEventLogMessages();
            } else {
                d10 = k6.c.d();
            }
        } else {
            d10 = k6.c.d();
        }
        if (d10 == null) {
            this.f9362c0.V.setText(getString(2132017588));
            return;
        }
        int size = d10.size();
        if (size > 10000) {
            i10 = size - 10000;
        } else {
            i10 = 0;
        }
        for (int i11 = i10; i11 < d10.size(); i11++) {
            if (i11 == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            g2((String) d10.get(i11), z10);
        }
        m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j2(View view) {
        if (this.f9361b0 != null) {
            n2("m.azeemanwar@gmail.com", "", "ProbeEventLog", this.f9362c0.V.getText().toString());
        } else {
            o2(this);
        }
    }

    private static String k2(Context context) {
        try {
            FileInputStream openFileInput = context.openFileInput("crash_ui.txt");
            if (openFileInput == null) {
                return "";
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    openFileInput.close();
                    return sb.toString();
                }
            }
        } catch (FileNotFoundException e10) {
            Log.error("DebugActivity", "File not found: " + e10.toString());
            return "";
        } catch (IOException e11) {
            Log.error("DebugActivity", "Can not read file: " + e11.toString());
            return "";
        }
    }

    private void l2() {
        int lineCount = this.f9362c0.V.getLineCount() - k6.c.f14777i;
        if (lineCount > 0) {
            for (int i10 = 0; i10 < lineCount; i10++) {
                this.f9362c0.V.getEditableText().delete(this.f9362c0.V.getLayout().getLineStart(0), this.f9362c0.V.getLayout().getLineEnd(0));
            }
        }
    }

    private void m2() {
        int lineCount = (this.f9362c0.V.getLineCount() * this.f9362c0.V.getLineHeight()) - (this.f9362c0.V.getBottom() - this.f9362c0.V.getTop());
        if (lineCount > 1) {
            this.f9362c0.V.scrollTo(0, lineCount);
            this.f9362c0.V.setGravity(80);
        } else {
            this.f9362c0.V.setGravity(48);
        }
    }

    private CharSequence p2() {
        SpannableString spannableString = new SpannableString(" \n");
        spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, spannableString.length(), 0);
        return TextUtils.concat(spannableString, "");
    }

    public void n2(String str, String str2, String str3, String str4) {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.CC", new String[]{str2});
        intent.putExtra("android.intent.extra.SUBJECT", str3);
        intent.putExtra("android.intent.extra.TEXT", str4);
        startActivity(Intent.createChooser(intent, "Send mail..."));
    }

    public void o2(Context context) {
        k6.c.b();
        File file = new File(context.getApplicationContext().getFilesDir() + "/" + k6.c.f14775g);
        String k22 = k2(context);
        Uri g10 = FileProvider.g(context, "com.apptionlabs.meater_app", file);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"m.azeemanwar@gmail.com"});
        intent2.putExtra("android.intent.extra.SUBJECT", "Meater_Log");
        intent2.addFlags(1);
        intent2.putExtra("android.intent.extra.STREAM", g10);
        intent2.putExtra("android.intent.extra.TEXT", k22);
        if (Build.VERSION.SDK_INT >= 33) {
            intent2.setType("text/plain");
            try {
                startActivity(intent2);
            } catch (ActivityNotFoundException unused) {
            }
        } else {
            intent2.setSelector(intent);
            startActivity(Intent.createChooser(intent2, "Send email..."));
        }
    }

    public void onClearButtonClick(View view) {
        this.f9362c0.V.setText("");
        k6.c.a();
        i2();
        this.f9362c0.V.setGravity(48);
        this.f9362c0.V.scrollTo(0, 0);
        this.f9362c0.V.setText(p2());
        if (this.f9361b0 != null) {
            this.f9362c0.V.append(h2());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b6.k kVar = (b6.k) androidx.databinding.g.j(this, 2131558440);
        this.f9362c0 = kVar;
        kVar.V.setMovementMethod(new ScrollingMovementMethod());
        this.f9362c0.V.setText(p2());
        long longExtra = getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, -1L);
        if (longExtra != -1) {
            this.f9361b0 = (Probe) c6.h.f8879a.o(longExtra);
            this.f9362c0.V.setText(h2());
        }
        findViewById(2131362417).setOnClickListener(new View.OnClickListener() { // from class: p5.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.this.j2(view);
            }
        });
        i2();
    }

    public void onDebugCloseClick(View view) {
        finish();
    }

    public void onDownButtonClick(View view) {
        i2();
        this.f9360a0 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        Probe probe = this.f9361b0;
        if (probe != null) {
            if (probe.getEventLog() != null) {
                this.f9361b0.getEventLog().stopBroadCastProbeEvents();
            }
        } else {
            k6.c.j();
        }
        unregisterReceiver(this.f9363d0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ProtocolParameters.MEATER_LOG_NOTIF);
        intentFilter.addAction(ProtocolParameters.PROBE_EVENT_LOG_NOTIF);
        l0.E(this, this.f9363d0, intentFilter);
        Probe probe = this.f9361b0;
        if (probe != null) {
            if (probe.getEventLog() != null) {
                this.f9361b0.getEventLog().startUIBroadCastProbeEvents();
                return;
            }
            return;
        }
        k6.c.i();
    }

    public void onStopButtonClick(View view) {
        i2();
        this.f9360a0 = true;
    }

    public void onUpButtonClick(View view) {
        i2();
        this.f9362c0.V.setGravity(48);
        this.f9362c0.V.scrollTo(0, 0);
        this.f9360a0 = true;
    }
}
