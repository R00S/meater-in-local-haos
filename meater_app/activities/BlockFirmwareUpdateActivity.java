package com.apptionlabs.meater_app.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import b6.b1;
import c6.h;
import com.apptionlabs.meater_app.activities.BlockFirmwareUpdateActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.DevicesType;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.versions.FirmwareInfo;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.views.e0;
import f8.b0;
import f8.l0;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import lm.b;
import w5.b;
import y5.d;

/* loaded from: /tmp/meat/meat/classes.dex */
public class BlockFirmwareUpdateActivity extends j {

    /* renamed from: a0, reason: collision with root package name */
    private w5.b f9223a0;

    /* renamed from: b0, reason: collision with root package name */
    MEATERBlock f9224b0;

    /* renamed from: c0, reason: collision with root package name */
    b1 f9225c0;

    /* renamed from: i0, reason: collision with root package name */
    AlertDialog f9231i0;

    /* renamed from: l0, reason: collision with root package name */
    private String f9234l0;

    /* renamed from: n0, reason: collision with root package name */
    ByteBuffer f9236n0;

    /* renamed from: s0, reason: collision with root package name */
    private CountDownTimer f9241s0;

    /* renamed from: v0, reason: collision with root package name */
    Thread f9244v0;

    /* renamed from: w0, reason: collision with root package name */
    Socket f9245w0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f9226d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    private final Handler f9227e0 = new Handler(Looper.getMainLooper());

    /* renamed from: f0, reason: collision with root package name */
    boolean f9228f0 = false;

    /* renamed from: g0, reason: collision with root package name */
    boolean f9229g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f9230h0 = false;

    /* renamed from: j0, reason: collision with root package name */
    private final h f9232j0 = new h();

    /* renamed from: k0, reason: collision with root package name */
    Handler f9233k0 = new Handler(Looper.getMainLooper());

    /* renamed from: m0, reason: collision with root package name */
    String f9235m0 = "";

    /* renamed from: o0, reason: collision with root package name */
    long f9237o0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    Runnable f9238p0 = new a();

    /* renamed from: q0, reason: collision with root package name */
    android.view.o f9239q0 = new d(true);

    /* renamed from: r0, reason: collision with root package name */
    private final Runnable f9240r0 = new e();

    /* renamed from: t0, reason: collision with root package name */
    private i f9242t0 = i.Default;

    /* renamed from: u0, reason: collision with root package name */
    boolean f9243u0 = false;

    /* renamed from: x0, reason: collision with root package name */
    Handler f9246x0 = new Handler(Looper.getMainLooper());

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BlockFirmwareUpdateActivity.this.J2();
            } finally {
                BlockFirmwareUpdateActivity.this.f9227e0.postDelayed(BlockFirmwareUpdateActivity.this.f9238p0, Config.MC_BROADCAST_INTERVAL_WIFI);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b implements d.b {
        b() {
        }

        @Override // y5.d.b
        public void a() {
            BlockFirmwareUpdateActivity.this.M2();
        }

        @Override // y5.d.b
        public void b(ByteBuffer byteBuffer) {
            BlockFirmwareUpdateActivity.this.U2(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class c implements d.b {
        c() {
        }

        @Override // y5.d.b
        public void a() {
            BlockFirmwareUpdateActivity blockFirmwareUpdateActivity = BlockFirmwareUpdateActivity.this;
            blockFirmwareUpdateActivity.P2(blockFirmwareUpdateActivity.getString(2132018832), BlockFirmwareUpdateActivity.this.getString(2132017683), true);
        }

        @Override // y5.d.b
        public void b(ByteBuffer byteBuffer) {
            BlockFirmwareUpdateActivity.this.U2(byteBuffer);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class d extends android.view.o {
        d(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            k6.b.b("onBackPressed()", new Object[0]);
            if (!BlockFirmwareUpdateActivity.this.f9226d0) {
                s6.c.j(true);
                BlockFirmwareUpdateActivity.this.finish();
            } else {
                Toast.makeText(com.apptionlabs.meater_app.app.a.i(), "System in process , Please wait", 1).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class e implements Runnable {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            BlockFirmwareUpdateActivity.this.f9223a0.A();
            BlockFirmwareUpdateActivity.this.T2();
            k6.b.b("Timeout!", new Object[0]);
            BlockFirmwareUpdateActivity.this.O2();
        }

        @Override // java.lang.Runnable
        public void run() {
            BlockFirmwareUpdateActivity.this.runOnUiThread(new Runnable() { // from class: com.apptionlabs.meater_app.activities.a
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.e.this.b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class g extends TimerTask {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f9253q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Timer f9254r;

        g(ByteBuffer byteBuffer, Timer timer) {
            this.f9253q = byteBuffer;
            this.f9254r = timer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ByteBuffer byteBuffer, Timer timer) {
            BlockFirmwareUpdateActivity blockFirmwareUpdateActivity = BlockFirmwareUpdateActivity.this;
            if (!blockFirmwareUpdateActivity.f9243u0) {
                blockFirmwareUpdateActivity.f9243u0 = true;
                blockFirmwareUpdateActivity.N2(blockFirmwareUpdateActivity.f9224b0.getMeaterLinkAddress().b().replace("/", ""), 1001, 10000, byteBuffer);
                timer.cancel();
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final ByteBuffer byteBuffer = this.f9253q;
            final Timer timer = this.f9254r;
            new Thread(new Runnable() { // from class: com.apptionlabs.meater_app.activities.b
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.g.this.b(byteBuffer, timer);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class h implements b.InterfaceC0332b {

        /* renamed from: a, reason: collision with root package name */
        private long f9256a;

        /* renamed from: b, reason: collision with root package name */
        private long f9257b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9258c;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k() {
            BlockFirmwareUpdateActivity.this.L2();
            this.f9258c = true;
            BlockFirmwareUpdateActivity.this.f9225c0.V.setText(2132017781);
            BlockFirmwareUpdateActivity.this.f9225c0.W.setText(2132018903);
            k6.b.b("Got connection from block", new Object[0]);
            BlockFirmwareUpdateActivity.this.T2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            BlockFirmwareUpdateActivity.this.f9223a0.A();
            BlockFirmwareUpdateActivity.this.f9229g0 = false;
            k6.b.b("Got disconnection", new Object[0]);
            k6.b.b("Block downloaded %d/%d bytes", Long.valueOf(this.f9256a), Long.valueOf(this.f9257b));
            BlockFirmwareUpdateActivity.this.T2();
            long j10 = this.f9256a;
            if (j10 != 0) {
                long j11 = this.f9257b;
                if (j11 != 0 && j10 >= j11) {
                    lm.b.g(b.EnumC0292b.D.title, b.a.f17300t.title, BlockFirmwareUpdateActivity.this.f9235m0);
                    BlockFirmwareUpdateActivity blockFirmwareUpdateActivity = BlockFirmwareUpdateActivity.this;
                    blockFirmwareUpdateActivity.f9228f0 = true;
                    blockFirmwareUpdateActivity.W2();
                    return;
                }
            }
            BlockFirmwareUpdateActivity.this.O2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str) {
            BlockFirmwareUpdateActivity.this.f9229g0 = false;
            k6.b.b("Got an error (%s)", str);
            BlockFirmwareUpdateActivity.this.T2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(long j10, long j11) {
            this.f9256a = j10;
            this.f9257b = j11;
            if (j10 < j11) {
                BlockFirmwareUpdateActivity.this.L2();
            }
            BlockFirmwareUpdateActivity.this.f9225c0.f7553b0.setVisibility(0);
            int floor = (int) Math.floor(((j10 * 1.0d) / j11) * 100.0d);
            BlockFirmwareUpdateActivity.this.f9225c0.f7553b0.setProgress(floor);
            if (floor == 100) {
                BlockFirmwareUpdateActivity.this.f9230h0 = true;
            }
            k6.b.b("Progress: %d%% (%d/%d bytes)", Integer.valueOf(floor), Long.valueOf(j10), Long.valueOf(j11));
        }

        @Override // w5.b.InterfaceC0332b
        public void a() {
            BlockFirmwareUpdateActivity.this.f9223a0.A();
            BlockFirmwareUpdateActivity.this.f9223a0.E();
            BlockFirmwareUpdateActivity blockFirmwareUpdateActivity = BlockFirmwareUpdateActivity.this;
            blockFirmwareUpdateActivity.U2(blockFirmwareUpdateActivity.f9236n0);
        }

        @Override // w5.b.InterfaceC0332b
        public void b(final long j10, final long j11) {
            BlockFirmwareUpdateActivity.this.runOnUiThread(new Runnable() { // from class: com.apptionlabs.meater_app.activities.f
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.h.this.n(j11, j10);
                }
            });
        }

        @Override // w5.b.InterfaceC0332b
        public void c() {
            lm.b.g(b.EnumC0292b.D.title, b.a.f17305y.title, BlockFirmwareUpdateActivity.this.f9235m0);
            k6.b.b("Block disconnected", new Object[0]);
            BlockFirmwareUpdateActivity blockFirmwareUpdateActivity = BlockFirmwareUpdateActivity.this;
            blockFirmwareUpdateActivity.f9233k0.removeCallbacks(blockFirmwareUpdateActivity.f9240r0);
            BlockFirmwareUpdateActivity.this.runOnUiThread(new Runnable() { // from class: com.apptionlabs.meater_app.activities.e
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.h.this.l();
                }
            });
        }

        @Override // w5.b.InterfaceC0332b
        public void d() {
            k6.b.c("onConnected .....", new Object[0]);
            BlockFirmwareUpdateActivity.this.f9241s0.cancel();
            BlockFirmwareUpdateActivity.this.runOnUiThread(new Runnable() { // from class: com.apptionlabs.meater_app.activities.d
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.h.this.k();
                }
            });
        }

        @Override // w5.b.InterfaceC0332b
        public void e(final String str) {
            BlockFirmwareUpdateActivity blockFirmwareUpdateActivity = BlockFirmwareUpdateActivity.this;
            blockFirmwareUpdateActivity.f9233k0.removeCallbacks(blockFirmwareUpdateActivity.f9240r0);
            BlockFirmwareUpdateActivity.this.runOnUiThread(new Runnable() { // from class: com.apptionlabs.meater_app.activities.c
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.h.this.m(str);
                }
            });
        }

        private h() {
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum i {
        Default,
        Progress,
        Finish
    }

    private void A2() {
        ByteBuffer firmware = FirmwareVersion.sharedInstance().getFirmware(DevicesType.MEATER_BLOCK);
        if (firmware != null) {
            lm.b.g(b.EnumC0292b.D.title, b.a.f17302v.title, this.f9235m0);
            U2(firmware);
        }
    }

    private byte[] B2(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C2(MEATERDevice mEATERDevice) {
        if (mEATERDevice == null) {
            k6.b.c("monitorBlock() Block is null  ", new Object[0]);
        } else {
            k6.b.c("monitorBlock() device online %s and deviceSinceLastSeen = %s sec ", Boolean.valueOf(mEATERDevice.isOnline()), Long.valueOf(mEATERDevice.secondsSinceLastSeen()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D2() {
        if (!isFinishing()) {
            y5.d.INSTANCE.c(this.f9234l0, new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E2(ByteBuffer byteBuffer, String str, int i10, int i11) {
        byte[] B2 = B2(byteBuffer);
        try {
            k6.b.b("V2_Block_Firmware ip:%s  port: %s timeout %s", str, Integer.valueOf(i10), Integer.valueOf(i11));
            Socket socket = new Socket();
            this.f9245w0 = socket;
            socket.connect(new InetSocketAddress(str, i10), i11);
            new DataOutputStream(this.f9245w0.getOutputStream()).write(B2, 0, B2.length);
            lm.b.g(b.EnumC0292b.D.title, b.a.f17300t.title, this.f9235m0);
            this.f9228f0 = true;
            runOnUiThread(new Runnable() { // from class: p5.w
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.this.W2();
                }
            });
        } catch (IOException e10) {
            e10.printStackTrace();
            k6.b.b("V2_Block_Firmware bufferLength  <NOOOOOOOOOOOOOOOO> EXCEPTIOB = %s ", e10.getLocalizedMessage());
            runOnUiThread(new Runnable() { // from class: p5.x
                @Override // java.lang.Runnable
                public final void run() {
                    BlockFirmwareUpdateActivity.this.O2();
                }
            });
            if (this.f9225c0.f7553b0.getProgress() > 100) {
                this.f9225c0.f7553b0.setProgress(10);
                runOnUiThread(new Runnable() { // from class: p5.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlockFirmwareUpdateActivity.this.O2();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F2() {
        s6.c.j(true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G2() {
        WebViewActivity.D2(this, null, i6.c.f14119z, null, Boolean.TRUE, Boolean.FALSE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H2(boolean z10) {
        if (z10) {
            s6.c.j(true);
            y2();
            finish();
        }
    }

    private void I2() {
        if (!Config.getInstance().EXTRA_LOGGING_ENABLE) {
            return;
        }
        c6.h.f8879a.A(this, this.f9237o0, new h.a() { // from class: p5.s
            @Override // c6.h.a
            public final void a(MEATERDevice mEATERDevice) {
                BlockFirmwareUpdateActivity.C2(mEATERDevice);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J2() {
        String firmwareRevision = this.f9224b0.getFirmwareRevision();
        if (firmwareRevision != null) {
            try {
                int a10 = b0.a(firmwareRevision);
                if (a10 < 2) {
                    Log.info("postUpdateRequest()", " v1 version for  " + firmwareRevision);
                    l6.k.e0().b0(this.f9224b0.getMeaterLinkAddress(), V2());
                } else if (a10 < 3) {
                    Log.info("postUpdateRequest()", " v2 version for " + firmwareRevision);
                    l6.k.e0().c0(this.f9224b0.getMeaterLinkAddress(), V2());
                } else {
                    Log.info("postUpdateRequest() ", " Modern version for " + firmwareRevision);
                    l6.k.e0().S(this.f9224b0.getMeaterLinkAddress(), V2());
                }
            } catch (NumberFormatException unused) {
                Log.warn("postUpdateRequest()", "not handle check for 1 or 2 versions of FW");
            }
        }
    }

    private void K2() {
        this.f9234l0 = getIntent().getStringExtra(FirmwareInfo.Key.URL.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2() {
        k6.b.b("resetTimeout()", new Object[0]);
        this.f9233k0.removeCallbacks(this.f9240r0);
        try {
            this.f9233k0.postDelayed(this.f9240r0, 45000L);
        } catch (Exception e10) {
            k6.b.b("Reset timeout failed: " + e10.getLocalizedMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.u
            @Override // java.lang.Runnable
            public final void run() {
                BlockFirmwareUpdateActivity.this.D2();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2() {
        String str;
        int i10;
        int i11;
        AlertDialog alertDialog = this.f9231i0;
        if (alertDialog != null && alertDialog.isShowing()) {
            return;
        }
        MEATERBlock mEATERBlock = this.f9224b0;
        if (mEATERBlock != null && mEATERBlock.getFirmwareRevision() != null) {
            str = this.f9224b0.getFirmwareRevision();
        } else {
            str = " ";
        }
        if (l0.d(str, "2.0") == -1) {
            lm.b.g(b.EnumC0292b.D.title, b.a.f17304x.title, this.f9235m0);
        } else {
            lm.b.g(b.EnumC0292b.D.title, b.a.f17303w.title, this.f9235m0);
        }
        if (!isFinishing() && !this.f9228f0) {
            AlertDialog alertDialog2 = this.f9231i0;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            e0.Companion companion = e0.INSTANCE;
            if (this.f9232j0.f9258c) {
                i10 = 2132018890;
            } else {
                i10 = 2132017767;
            }
            String string = getString(i10);
            if (this.f9232j0.f9258c) {
                i11 = 2132017330;
            } else {
                i11 = 2132018879;
            }
            AlertDialog e10 = companion.e(this, string, getString(i11), false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.y
                @Override // j6.e
                public final void a() {
                    BlockFirmwareUpdateActivity.this.F2();
                }
            }), new e0.AlertPair(getString(2132017893), new j6.e() { // from class: p5.z
                @Override // j6.e
                public final void a() {
                    BlockFirmwareUpdateActivity.this.G2();
                }
            }), null);
            this.f9231i0 = e10;
            e10.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2(String str, String str2, final boolean z10) {
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog = this.f9231i0;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f9231i0.dismiss();
        }
        AlertDialog e10 = e0.INSTANCE.e(this, str, str2, false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.t
            @Override // j6.e
            public final void a() {
                BlockFirmwareUpdateActivity.this.H2(z10);
            }
        }), null, null);
        this.f9231i0 = e10;
        e10.show();
    }

    private void Q2() {
        k6.b.c("CountDownTimer starting ", new Object[0]);
        this.f9241s0 = new f(45000L, Config.MC_BROADCAST_INTERVAL_WIFI).start();
    }

    private void R2() {
        this.f9238p0.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2(ByteBuffer byteBuffer) {
        this.f9236n0 = byteBuffer;
        w5.b bVar = new w5.b(this.f9232j0, byteBuffer, w5.b.G());
        this.f9223a0 = bVar;
        bVar.x();
        k6.b.b("Server running at: " + V2(), new Object[0]);
        R2();
        Q2();
        I2();
        L2();
        this.f9229g0 = true;
        this.f9226d0 = true;
        if (this.f9224b0.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
            this.f9225c0.f7553b0.setProgress(2);
            S2(byteBuffer);
        }
    }

    private String V2() {
        int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return String.format(Locale.US, "http://%d.%d.%d.%d:%d/ssv6060-main.bin", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255), Integer.valueOf(this.f9223a0.F()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W2() {
        this.f9242t0 = i.Finish;
        this.f9225c0.f7558g0.setVisibility(8);
        this.f9225c0.f7554c0.setVisibility(8);
        this.f9225c0.X.setVisibility(8);
        this.f9225c0.f7560i0.setVisibility(0);
        this.f9225c0.Q.setVisibility(0);
        this.f9225c0.f7558g0.requestLayout();
        this.f9225c0.f7560i0.requestLayout();
    }

    private void X2() {
        this.f9242t0 = i.Progress;
        this.f9225c0.f7558g0.setVisibility(8);
        this.f9225c0.f7560i0.setVisibility(8);
        this.f9225c0.Q.setVisibility(8);
        this.f9225c0.f7554c0.setVisibility(0);
        this.f9225c0.X.setVisibility(0);
        this.f9225c0.X.setAnimation(2131951746);
        this.f9225c0.X.v();
    }

    private void x2() {
        String str;
        MEATERDevice o10 = c6.h.f8879a.o(getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
        if (o10 != null) {
            str = o10.getFirmwareRevision();
        } else {
            str = "";
        }
        this.f9235m0 = str;
        if (o10 != null && o10.mustFirmwareUpdate()) {
            this.f9225c0.f7561j0.setClickable(false);
            this.f9225c0.f7561j0.setFocusable(false);
            this.f9225c0.f7561j0.setBackground(l0.j(this, 2131231530));
        }
    }

    private void y2() {
        MEATERBlock mEATERBlock = this.f9224b0;
        if (mEATERBlock != null) {
            mEATERBlock.setConnectionState(DeviceConnectionState.OFFLINE);
            this.f9224b0.notifyStateUpdatedForSelfAndChildren();
        }
    }

    private void z2() {
        lm.b.g(b.EnumC0292b.D.title, b.a.f17302v.title, this.f9235m0);
        y5.d.INSTANCE.c(this.f9234l0, new b());
    }

    public void N2(final String str, final int i10, final int i11, final ByteBuffer byteBuffer) {
        Thread thread = new Thread(new Runnable() { // from class: p5.v
            @Override // java.lang.Runnable
            public final void run() {
                BlockFirmwareUpdateActivity.this.E2(byteBuffer, str, i10, i11);
            }
        });
        this.f9244v0 = thread;
        thread.start();
    }

    public void S2(ByteBuffer byteBuffer) {
        Timer timer = new Timer();
        timer.schedule(new g(byteBuffer, timer), 1100L);
    }

    void T2() {
        k6.b.b("Stop sending Block firmware update Messages", new Object[0]);
        this.f9227e0.removeCallbacks(this.f9238p0);
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected List<String> c1() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == lm.a.HELP_SCREEN.i()) {
            s6.c.j(true);
            y2();
            finish();
        }
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9225c0 = (b1) androidx.databinding.g.j(this, 2131558468);
        i iVar = this.f9242t0;
        if (iVar == i.Progress) {
            X2();
        } else if (iVar == i.Finish) {
            W2();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Context applicationContext;
        int i10;
        super.onCreate(bundle);
        k6.b.b("OTA Screen onCreate BlockFirmwareUpdateActivity  ", new Object[0]);
        w5.b.f19344s = 0;
        K2();
        this.f9225c0 = (b1) androidx.databinding.g.j(this, 2131558468);
        x0().m();
        boolean z10 = getApplicationContext().getResources().getBoolean(2131034115);
        TextView textView = this.f9225c0.f7557f0;
        String string = getApplicationContext().getString(2132017779);
        Object[] objArr = new Object[3];
        if (z10) {
            applicationContext = getApplicationContext();
            i10 = 2132018182;
        } else {
            applicationContext = getApplicationContext();
            i10 = 2132018180;
        }
        objArr[0] = applicationContext.getString(i10);
        objArr[1] = getApplicationContext().getString(2132018079);
        objArr[2] = getApplicationContext().getString(2132018079);
        textView.setText(String.format(string, objArr));
        getOnBackPressedDispatcher().h(this, this.f9239q0);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.apptionlabs.meater_app.views.b1.f10481u = false;
        AlertDialog alertDialog = this.f9231i0;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f9231i0 = null;
        }
        w5.b bVar = this.f9223a0;
        if (bVar != null) {
            bVar.A();
        }
    }

    public void onGotItButtonClick(View view) {
        s6.c.j(true);
        y2();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        com.apptionlabs.meater_app.views.b1.f10481u = true;
        this.f9237o0 = getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
        x2();
        MEATERDevice o10 = c6.h.f8879a.o(this.f9237o0);
        if (o10 != null && o10.isMEATERBlock()) {
            this.f9224b0 = (MEATERBlock) o10;
            if (this.f9228f0) {
                W2();
            }
        }
        if (this.f9230h0) {
            W2();
            return;
        }
        w5.b bVar = this.f9223a0;
        if (bVar != null && !bVar.p()) {
            P2(getString(2132018832), getString(2132017683), true);
        } else {
            k6.b.b("OTA was not started yet On Resume", new Object[0]);
        }
    }

    public void onStartUpdateButtonClick(View view) {
        X2();
        if (this.f9234l0 == null) {
            A2();
        } else {
            z2();
        }
        s6.c.j(false);
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        AlertDialog alertDialog = this.f9231i0;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f9231i0 = null;
        }
        getWindow().clearFlags(128);
    }

    public void onUpdateLaterButtonClick(View view) {
        lm.b.g(b.EnumC0292b.D.title, b.a.f17301u.title, this.f9235m0);
        s6.c.j(true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class f extends CountDownTimer {
        f(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            Object[] objArr = new Object[3];
            boolean z13 = true;
            if (BlockFirmwareUpdateActivity.this.f9223a0 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            objArr[0] = Boolean.valueOf(z10);
            if (BlockFirmwareUpdateActivity.this.f9223a0 != null && BlockFirmwareUpdateActivity.this.f9223a0.p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            objArr[1] = Boolean.valueOf(z11);
            if (BlockFirmwareUpdateActivity.this.f9223a0 != null && BlockFirmwareUpdateActivity.this.f9223a0.C()) {
                z12 = true;
            } else {
                z12 = false;
            }
            objArr[2] = Boolean.valueOf(z12);
            k6.b.c("CountDownTimer webServer null %s ,webServer Alive %s wasStarted = %s  ", objArr);
            if (BlockFirmwareUpdateActivity.this.f9223a0 == null) {
                Object[] objArr2 = new Object[1];
                if (BlockFirmwareUpdateActivity.this.f9236n0 == null) {
                    z13 = false;
                }
                objArr2[0] = Boolean.valueOf(z13);
                k6.b.c("CountDownTimer webserver null and firmwareImageToUpdate is not null %s ", objArr2);
                BlockFirmwareUpdateActivity blockFirmwareUpdateActivity = BlockFirmwareUpdateActivity.this;
                blockFirmwareUpdateActivity.U2(blockFirmwareUpdateActivity.f9236n0);
                return;
            }
            if (!BlockFirmwareUpdateActivity.this.f9223a0.C()) {
                BlockFirmwareUpdateActivity.this.f9223a0.x();
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }
    }
}
