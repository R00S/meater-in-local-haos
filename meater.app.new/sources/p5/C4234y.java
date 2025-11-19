package p5;

import C4.b;
import E4.e;
import P5.H;
import P5.Q;
import Xb.C1837g;
import Xb.C1841i;
import Xb.E;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import Xb.T;
import Xb.Z;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import oa.C4153F;
import oa.C4173r;
import p5.C4234y;
import ta.InterfaceC4588d;
import ua.C4696b;
import x4.b;

/* compiled from: MeaterBlockFirmwareFactory.kt */
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0005*\u0001a\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ#\u0010\u001b\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\bJ\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bJ/\u0010'\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010-R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010Q\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010-R\"\u0010V\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010>\u001a\u0004\bS\u0010T\"\u0004\b8\u0010UR$\u0010^\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00108R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lp5/y;", "Lp5/m;", "Lp5/y$a;", "builder", "<init>", "(Lp5/y$a;)V", "Loa/F;", "x", "()V", "Ljava/nio/ByteBuffer;", "firmware", "M", "(Ljava/nio/ByteBuffer;)V", "L", "K", "D", "P", "C", "", "Q", "()Ljava/lang/String;", "J", "z", "w", "E", "firmwareImage", "deviceIp", "N", "(Ljava/nio/ByteBuffer;Ljava/lang/String;)V", "byteBuffer", "", "y", "(Ljava/nio/ByteBuffer;)[B", "a", "O", "ip", "", "port", "timeout", "G", "(Ljava/lang/String;IILjava/nio/ByteBuffer;)V", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "device", "b", "Ljava/lang/String;", "firmwareUrl", "Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "c", "Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "meaterLinkAddress", "Lp5/l;", "d", "Lp5/l;", "callback", "e", "I", "connectionTimeOut", "f", "firmwareVersion", "", "g", "Z", "isUpdateInProgress", "LC4/b;", "h", "LC4/b;", "webserver", "i", "Ljava/nio/ByteBuffer;", "Landroid/os/CountDownTimer;", "j", "Landroid/os/CountDownTimer;", "blockOTAStartTimer", "LXb/v0;", "k", "LXb/v0;", "timeoutJob", "l", "statusCheckerJob", "m", "blockInstalledFirmwareVersion", "n", "B", "()Z", "(Z)V", "started", "Ljava/net/Socket;", "o", "Ljava/net/Socket;", "A", "()Ljava/net/Socket;", "H", "(Ljava/net/Socket;)V", "socket", "p", "retryAttempted", "p5/y$c", "q", "Lp5/y$c;", "localCallback", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p5.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4234y implements InterfaceC4222m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private MEATERBlock device;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String firmwareUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private MEATERLinkAddress meaterLinkAddress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4221l callback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int connectionTimeOut;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String firmwareVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isUpdateInProgress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C4.b webserver;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ByteBuffer firmware;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private CountDownTimer blockOTAStartTimer;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 timeoutJob;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 statusCheckerJob;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String blockInstalledFirmwareVersion;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean started;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Socket socket;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int retryAttempted;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final c localCallback;

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006$"}, d2 = {"Lp5/y$a;", "", "<init>", "()V", "LT4/p;", "device", "g", "(LT4/p;)Lp5/y$a;", "", "firmwareUrl", "h", "(Ljava/lang/String;)Lp5/y$a;", "Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "meaterLinkAddress", "i", "(Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;)Lp5/y$a;", "Lp5/l;", "callback", "f", "(Lp5/l;)Lp5/y$a;", "Lp5/y;", "a", "()Lp5/y;", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "c", "()Lcom/apptionlabs/meater_app/model/MEATERBlock;", "d", "()Ljava/lang/String;", "e", "()Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "b", "()Lp5/l;", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "Ljava/lang/String;", "Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "Lp5/l;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.y$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private MEATERBlock device;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String firmwareUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private MEATERLinkAddress meaterLinkAddress;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4221l callback;

        public final C4234y a() {
            return new C4234y(this);
        }

        public final InterfaceC4221l b() {
            InterfaceC4221l interfaceC4221l = this.callback;
            if (interfaceC4221l != null) {
                return interfaceC4221l;
            }
            C3862t.u("callback");
            return null;
        }

        public final MEATERBlock c() {
            MEATERBlock mEATERBlock = this.device;
            if (mEATERBlock != null) {
                return mEATERBlock;
            }
            C3862t.u("device");
            return null;
        }

        /* renamed from: d, reason: from getter */
        public final String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        /* renamed from: e, reason: from getter */
        public final MEATERLinkAddress getMeaterLinkAddress() {
            return this.meaterLinkAddress;
        }

        public final a f(InterfaceC4221l callback) {
            C3862t.d(callback);
            this.callback = callback;
            return this;
        }

        public final a g(T4.p device) {
            C3862t.g(device, "device");
            this.device = (MEATERBlock) device;
            return this;
        }

        public final a h(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }

        public final a i(MEATERLinkAddress meaterLinkAddress) {
            this.meaterLinkAddress = meaterLinkAddress;
            return this;
        }
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"p5/y$b", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.y$b */
    public static final class b implements e.b {
        b() {
        }

        @Override // E4.e.b
        public void a() {
            C4234y.this.E();
        }

        @Override // E4.e.b
        public void b(ByteBuffer firmwareImage) {
            if (firmwareImage != null) {
                C4234y.this.M(firmwareImage);
            } else {
                C4234y.this.E();
            }
        }
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"p5/y$c", "LC4/b$b;", "Loa/F;", "d", "()V", "c", "", "totalBytes", "bytesSent", "b", "(JJ)V", "", "errorMessage", "e", "(Ljava/lang/String;)V", "a", "J", "totalBytesSent", "totalBytesToSend", "", "Z", "f", "()Z", "setBlockDidConnect", "(Z)V", "blockDidConnect", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.y$c */
    public static final class c implements b.InterfaceC0044b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long totalBytesSent;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long totalBytesToSend;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean blockDidConnect;

        c() {
        }

        @Override // C4.b.InterfaceC0044b
        public void a() throws InterruptedException {
            C4.b bVar = C4234y.this.webserver;
            ByteBuffer byteBuffer = null;
            if (bVar == null) {
                C3862t.u("webserver");
                bVar = null;
            }
            bVar.A();
            C4.b bVar2 = C4234y.this.webserver;
            if (bVar2 == null) {
                C3862t.u("webserver");
                bVar2 = null;
            }
            bVar2.E();
            C4234y c4234y = C4234y.this;
            ByteBuffer byteBuffer2 = c4234y.firmware;
            if (byteBuffer2 == null) {
                C3862t.u("firmware");
            } else {
                byteBuffer = byteBuffer2;
            }
            c4234y.M(byteBuffer);
            C4234y.this.isUpdateInProgress = false;
        }

        @Override // C4.b.InterfaceC0044b
        public void b(long totalBytes, long bytesSent) {
            InterfaceC4221l interfaceC4221l;
            this.totalBytesSent = bytesSent;
            this.totalBytesToSend = totalBytes;
            if (bytesSent < totalBytes) {
                C4234y.this.D();
            }
            double dFloor = Math.floor(100 * ((bytesSent * 1.0d) / totalBytes));
            InterfaceC4221l interfaceC4221l2 = C4234y.this.callback;
            if (interfaceC4221l2 != null) {
                interfaceC4221l2.b(dFloor);
            }
            if (((int) dFloor) == 100 && (interfaceC4221l = C4234y.this.callback) != null) {
                interfaceC4221l.e();
            }
            U4.b.b("Progress: %d%% (%d/%d bytes)", Double.valueOf(dFloor), Long.valueOf(bytesSent), Long.valueOf(totalBytes));
            C4234y.this.isUpdateInProgress = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
        @Override // C4.b.InterfaceC0044b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c() throws java.lang.InterruptedException {
            /*
                r9 = this;
                x4.b$b r0 = x4.b.EnumC0768b.f52660O
                java.lang.String r1 = r0.title
                x4.b$a r2 = x4.b.a.f52612J
                java.lang.String r2 = r2.title
                p5.y r3 = p5.C4234y.this
                java.lang.String r3 = p5.C4234y.c(r3)
                r5 = 8
                r6 = 0
                r4 = 0
                x4.b.j(r1, r2, r3, r4, r5, r6)
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = "Block disconnected"
                U4.b.b(r3, r2)
                p5.y r2 = p5.C4234y.this
                Xb.v0 r2 = p5.C4234y.l(r2)
                r3 = 0
                if (r2 == 0) goto L2a
                r4 = 1
                Xb.InterfaceC1867v0.a.a(r2, r3, r4, r3)
            L2a:
                p5.y r2 = p5.C4234y.this
                C4.b r2 = p5.C4234y.m(r2)
                if (r2 != 0) goto L38
                java.lang.String r2 = "webserver"
                kotlin.jvm.internal.C3862t.u(r2)
                goto L39
            L38:
                r3 = r2
            L39:
                r3.A()
                java.lang.String r2 = "Got disconnection"
                java.lang.Object[] r3 = new java.lang.Object[r1]
                U4.b.b(r2, r3)
                long r2 = r9.totalBytesSent
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                long r3 = r9.totalBytesToSend
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
                java.lang.String r3 = "Block downloaded %d/%d bytes"
                U4.b.b(r3, r2)
                p5.y r2 = p5.C4234y.this
                r2.O()
                long r2 = r9.totalBytesSent
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L8f
                long r6 = r9.totalBytesToSend
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 == 0) goto L8f
                int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r2 >= 0) goto L70
                goto L8f
            L70:
                java.lang.String r3 = r0.title
                x4.b$a r0 = x4.b.a.f52607E
                java.lang.String r4 = r0.title
                p5.y r0 = p5.C4234y.this
                java.lang.String r5 = p5.C4234y.c(r0)
                r7 = 8
                r8 = 0
                r6 = 0
                x4.b.j(r3, r4, r5, r6, r7, r8)
                p5.y r0 = p5.C4234y.this
                p5.l r0 = p5.C4234y.f(r0)
                if (r0 == 0) goto L94
                r0.g()
                goto L94
            L8f:
                p5.y r0 = p5.C4234y.this
                p5.C4234y.s(r0)
            L94:
                p5.y r0 = p5.C4234y.this
                p5.C4234y.r(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.C4234y.c.c():void");
        }

        @Override // C4.b.InterfaceC0044b
        public void d() {
            U4.b.c("onConnected .....", new Object[0]);
            CountDownTimer countDownTimer = C4234y.this.blockOTAStartTimer;
            if (countDownTimer == null) {
                C3862t.u("blockOTAStartTimer");
                countDownTimer = null;
            }
            countDownTimer.cancel();
            C4234y.this.D();
            this.blockDidConnect = true;
            U4.b.b("Got connection from block", new Object[0]);
            C4234y.this.O();
            C4234y.this.isUpdateInProgress = false;
        }

        @Override // C4.b.InterfaceC0044b
        public void e(String errorMessage) {
            C3862t.g(errorMessage, "errorMessage");
            InterfaceC1867v0 interfaceC1867v0 = C4234y.this.timeoutJob;
            if (interfaceC1867v0 != null) {
                InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            }
            U4.b.b("Got an error (%s)", errorMessage);
            C4234y.this.O();
            C4234y.this.isUpdateInProgress = false;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getBlockDidConnect() {
            return this.blockDidConnect;
        }
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$resetTimeout$1", f = "MeaterBlockFirmwareFactory.kt", l = {260}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: p5.y$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f47577B;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C4234y.this.new d(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            Object objE = C4696b.e();
            int i10 = this.f47577B;
            if (i10 == 0) {
                C4173r.b(obj);
                long j10 = C4234y.this.connectionTimeOut;
                this.f47577B = 1;
                if (T.a(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            C4234y.this.P();
            return C4153F.f46609a;
        }
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"p5/y$e", "LE4/e$b;", "Loa/F;", "a", "()V", "Ljava/nio/ByteBuffer;", "firmwareImage", "b", "(Ljava/nio/ByteBuffer;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.y$e */
    public static final class e implements e.b {
        e() {
        }

        @Override // E4.e.b
        public void a() {
            InterfaceC4221l interfaceC4221l = C4234y.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.c(C4234y.this.z());
            }
        }

        @Override // E4.e.b
        public void b(ByteBuffer firmwareImage) {
            if (firmwareImage != null) {
                C4234y.this.M(firmwareImage);
            }
        }
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$sendFirmwareToProXL$1", f = "MeaterBlockFirmwareFactory.kt", l = {498, 502}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: p5.y$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f47580B;

        /* renamed from: C, reason: collision with root package name */
        int f47581C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f47582D;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f47584F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ String f47585G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f47586H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f47587I;

        /* compiled from: MeaterBlockFirmwareFactory.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$sendFirmwareToProXL$1$1", f = "MeaterBlockFirmwareFactory.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: p5.y$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f47588B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4234y f47589C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ String f47590D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f47591E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ int f47592F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4234y c4234y, String str, int i10, int i11, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f47589C = c4234y;
                this.f47590D = str;
                this.f47591E = i10;
                this.f47592F = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f47589C, this.f47590D, this.f47591E, this.f47592F, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws IOException {
                C4696b.e();
                if (this.f47588B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                Socket socket = this.f47589C.getSocket();
                C3862t.d(socket);
                socket.connect(new InetSocketAddress(this.f47590D, this.f47591E), this.f47592F);
                return C4153F.f46609a;
            }
        }

        /* compiled from: MeaterBlockFirmwareFactory.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$sendFirmwareToProXL$1$2", f = "MeaterBlockFirmwareFactory.kt", l = {515, 517}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: p5.y$f$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f47593B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4234y f47594C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C4234y c4234y, InterfaceC4588d<? super b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f47594C = c4234y;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new b(this.f47594C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r6.f47593B
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oa.C4173r.b(r7)
                    goto L51
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    oa.C4173r.b(r7)
                    goto L39
                L1e:
                    oa.C4173r.b(r7)
                    p5.y r7 = r6.f47594C
                    p5.l r7 = p5.C4234y.f(r7)
                    if (r7 == 0) goto L2e
                    r4 = 4626322717216342016(0x4034000000000000, double:20.0)
                    r7.b(r4)
                L2e:
                    r6.f47593B = r3
                    r3 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r7 = Xb.T.a(r3, r6)
                    if (r7 != r0) goto L39
                    return r0
                L39:
                    p5.y r7 = r6.f47594C
                    p5.l r7 = p5.C4234y.f(r7)
                    if (r7 == 0) goto L46
                    r3 = 4636737291354636288(0x4059000000000000, double:100.0)
                    r7.b(r3)
                L46:
                    r6.f47593B = r2
                    r1 = 700(0x2bc, double:3.46E-321)
                    java.lang.Object r7 = Xb.T.a(r1, r6)
                    if (r7 != r0) goto L51
                    return r0
                L51:
                    p5.y r7 = r6.f47594C
                    p5.l r7 = p5.C4234y.f(r7)
                    if (r7 == 0) goto L5c
                    r7.e()
                L5c:
                    oa.F r7 = oa.C4153F.f46609a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p5.C4234y.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: MeaterBlockFirmwareFactory.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$sendFirmwareToProXL$1$3", f = "MeaterBlockFirmwareFactory.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: p5.y$f$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f47595B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4234y f47596C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C4234y c4234y, InterfaceC4588d<? super c> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f47596C = c4234y;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new c(this.f47596C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f47595B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                InterfaceC4221l interfaceC4221l = this.f47596C.callback;
                if (interfaceC4221l != null) {
                    interfaceC4221l.c(x4.g.h().getString(R.string.error_text_something_went_wrong));
                }
                return C4153F.f46609a;
            }
        }

        /* compiled from: MeaterBlockFirmwareFactory.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$sendFirmwareToProXL$1$out$1", f = "MeaterBlockFirmwareFactory.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXb/I;", "Ljava/io/OutputStream;", "kotlin.jvm.PlatformType", "<anonymous>", "(LXb/I;)Ljava/io/OutputStream;"}, k = 3, mv = {2, 0, 0})
        /* renamed from: p5.y$f$d */
        static final class d extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super OutputStream>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f47597B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4234y f47598C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C4234y c4234y, InterfaceC4588d<? super d> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f47598C = c4234y;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new d(this.f47598C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super OutputStream> interfaceC4588d) {
                return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f47597B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                Socket socket = this.f47598C.getSocket();
                C3862t.d(socket);
                return socket.getOutputStream();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ByteBuffer byteBuffer, String str, int i10, int i11, InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f47584F = byteBuffer;
            this.f47585G = str;
            this.f47586H = i10;
            this.f47587I = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = C4234y.this.new f(this.f47584F, this.f47585G, this.f47586H, this.f47587I, interfaceC4588d);
            fVar.f47582D = obj;
            return fVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            I i10;
            byte[] bArrY;
            I i11;
            byte[] bArr;
            Object objE = C4696b.e();
            I i12 = this.f47581C;
            try {
            } catch (IOException e10) {
                e = e10;
                i10 = i12;
            }
            if (i12 == 0) {
                C4173r.b(obj);
                I i13 = (I) this.f47582D;
                bArrY = C4234y.this.y(this.f47584F);
                U4.b.b("ProBlockFw starting ip:%s  port: %s timeout %s", this.f47585G, kotlin.coroutines.jvm.internal.b.c(this.f47586H), kotlin.coroutines.jvm.internal.b.c(this.f47587I));
                C4234y.this.H(new Socket());
                E eB = Z.b();
                a aVar = new a(C4234y.this, this.f47585G, this.f47586H, this.f47587I, null);
                this.f47582D = i13;
                this.f47580B = bArrY;
                this.f47581C = 1;
                i11 = i13;
                if (C1837g.g(eB, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bArr = (byte[]) this.f47580B;
                    I i14 = (I) this.f47582D;
                    C4173r.b(obj);
                    i12 = i14;
                    new DataOutputStream((OutputStream) obj).write(bArr, 0, bArr.length);
                    x4.b.j(b.EnumC0768b.f52660O.title, b.a.f52607E.title, C4234y.this.blockInstalledFirmwareVersion, null, 8, null);
                    C4234y.this.O();
                    C1841i.d(i12, Z.c(), null, new b(C4234y.this, null), 2, null);
                    return C4153F.f46609a;
                }
                byte[] bArr2 = (byte[]) this.f47580B;
                I i15 = (I) this.f47582D;
                try {
                    C4173r.b(obj);
                    bArrY = bArr2;
                    i11 = i15;
                } catch (IOException e11) {
                    e = e11;
                    i10 = i15;
                    e.printStackTrace();
                    C4234y.this.I(false);
                    U4.b.b("ProBlockFw failure IOException   = %s ", e.getLocalizedMessage());
                    C1841i.d(i10, Z.c(), null, new c(C4234y.this, null), 2, null);
                    return C4153F.f46609a;
                }
            }
            E eB2 = Z.b();
            d dVar = new d(C4234y.this, null);
            this.f47582D = i11;
            this.f47580B = bArrY;
            this.f47581C = 2;
            Object objG = C1837g.g(eB2, dVar, this);
            if (objG == objE) {
                return objE;
            }
            bArr = bArrY;
            obj = objG;
            i12 = i11;
            new DataOutputStream((OutputStream) obj).write(bArr, 0, bArr.length);
            x4.b.j(b.EnumC0768b.f52660O.title, b.a.f52607E.title, C4234y.this.blockInstalledFirmwareVersion, null, 8, null);
            C4234y.this.O();
            C1841i.d(i12, Z.c(), null, new b(C4234y.this, null), 2, null);
            return C4153F.f46609a;
        }
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$startSendingUpdateRequestMessages$1", f = "MeaterBlockFirmwareFactory.kt", l = {140}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: p5.y$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f47600B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f47601C;

        h(InterfaceC4588d<? super h> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            h hVar = C4234y.this.new h(interfaceC4588d);
            hVar.f47601C = obj;
            return hVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((h) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            I i10;
            Object objE = C4696b.e();
            int i11 = this.f47600B;
            if (i11 == 0) {
                C4173r.b(obj);
                i10 = (I) this.f47601C;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = (I) this.f47601C;
                C4173r.b(obj);
            }
            while (J.f(i10)) {
                C4234y.this.C();
                this.f47601C = i10;
                this.f47600B = 1;
                if (T.a(Config.MC_BROADCAST_INTERVAL_WIFI, this) == objE) {
                    return objE;
                }
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p5/y$i", "Ljava/util/TimerTask;", "Loa/F;", "run", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.y$i */
    public static final class i extends TimerTask {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f47604C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Timer f47605D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f47606E;

        /* compiled from: MeaterBlockFirmwareFactory.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.firmware.MeaterBlockFirmwareFactory$startV2FirmwareWithDelay$delayedThreadStartTask$1$run$1$1", f = "MeaterBlockFirmwareFactory.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: p5.y$i$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f47607B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4234y f47608C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f47609D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ String f47610E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4234y c4234y, ByteBuffer byteBuffer, String str, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f47608C = c4234y;
                this.f47609D = byteBuffer;
                this.f47610E = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void m(C4234y c4234y, ByteBuffer byteBuffer, String str) {
                c4234y.I(false);
                c4234y.N(byteBuffer, str);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f47608C, this.f47609D, this.f47610E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f47607B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                U4.b.b("V2_Block_Firmware retryAttempted %s", kotlin.coroutines.jvm.internal.b.c(this.f47608C.retryAttempted));
                if (this.f47608C.retryAttempted < 2) {
                    this.f47608C.retryAttempted++;
                    Handler handler = new Handler(Looper.getMainLooper());
                    final C4234y c4234y = this.f47608C;
                    final ByteBuffer byteBuffer = this.f47609D;
                    final String str = this.f47610E;
                    kotlin.coroutines.jvm.internal.b.a(handler.postDelayed(new Runnable() { // from class: p5.A
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4234y.i.a.m(c4234y, byteBuffer, str);
                        }
                    }, 1500L));
                } else {
                    int unused = this.f47608C.retryAttempted;
                    InterfaceC4221l interfaceC4221l = this.f47608C.callback;
                    if (interfaceC4221l != null) {
                        interfaceC4221l.c(x4.g.h().getString(R.string.error_text_something_went_wrong));
                    }
                }
                return C4153F.f46609a;
            }
        }

        i(String str, Timer timer, ByteBuffer byteBuffer) {
            this.f47604C = str;
            this.f47605D = timer;
            this.f47606E = byteBuffer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C4234y c4234y, String str, Timer timer, ByteBuffer byteBuffer) {
            String strB;
            String strC;
            if (c4234y.getStarted()) {
                return;
            }
            c4234y.I(true);
            if (str == null) {
                C1841i.d(J.b(), Z.c(), null, new a(c4234y, byteBuffer, str, null), 2, null);
                timer.cancel();
                return;
            }
            MEATERLinkAddress mEATERLinkAddress = c4234y.meaterLinkAddress;
            if (mEATERLinkAddress == null || (strB = mEATERLinkAddress.b()) == null || (strC = Ub.n.C(strB, "/", "", false, 4, null)) == null) {
                return;
            }
            C3862t.d(byteBuffer);
            c4234y.G(strC, 1001, 10000, byteBuffer);
            timer.cancel();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final C4234y c4234y = C4234y.this;
            final String str = this.f47604C;
            final Timer timer = this.f47605D;
            final ByteBuffer byteBuffer = this.f47606E;
            new Thread(new Runnable() { // from class: p5.z
                @Override // java.lang.Runnable
                public final void run() {
                    C4234y.i.b(c4234y, str, timer, byteBuffer);
                }
            }).start();
        }
    }

    public C4234y(a builder) {
        C3862t.g(builder, "builder");
        this.connectionTimeOut = 45000;
        this.blockInstalledFirmwareVersion = "";
        this.device = builder.c();
        this.firmwareUrl = builder.getFirmwareUrl();
        this.meaterLinkAddress = builder.getMeaterLinkAddress();
        this.callback = builder.b();
        this.localCallback = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        String firmwareRevision = this.device.getFirmwareRevision();
        if (firmwareRevision != null) {
            try {
                int iA = H.a(firmwareRevision);
                if (iA < 2) {
                    Log.info("postUpdateRequest()", " v1 version for  " + firmwareRevision);
                    V4.l.g0().d0(this.device.getMeaterLinkAddress(), Q());
                } else if (iA < 3) {
                    Log.info("postUpdateRequest()", " v2 version for " + firmwareRevision);
                    V4.l.g0().e0(this.device.getMeaterLinkAddress(), Q());
                } else {
                    Log.info("postUpdateRequest() ", " Modern version for " + firmwareRevision);
                    V4.l.g0().U(this.meaterLinkAddress, Q());
                }
            } catch (NumberFormatException unused) {
                Log.warn("postUpdateRequest()", "not handle check for 1 or 2 versions of FW");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        U4.b.b("resetTimeout()", new Object[0]);
        InterfaceC1867v0 interfaceC1867v0 = this.timeoutJob;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
        InterfaceC1867v0 interfaceC1867v0D = C1841i.d(J.a(Z.b()), null, null, new d(null), 3, null);
        this.timeoutJob = interfaceC1867v0D;
        if (interfaceC1867v0D != null) {
            interfaceC1867v0D.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.x
            @Override // java.lang.Runnable
            public final void run() {
                C4234y.F(this.f47550B);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(C4234y c4234y) {
        e.Companion companion = E4.e.INSTANCE;
        String str = c4234y.firmwareUrl;
        C3862t.d(str);
        companion.c(str, c4234y.new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        if (Q.e(this.device.getFirmwareRevision() != null ? this.device.getFirmwareRevision() : " ", "2.0") == -1) {
            x4.b.j(b.EnumC0768b.f52660O.title, b.a.f52611I.title, this.blockInstalledFirmwareVersion, null, 8, null);
        } else {
            x4.b.j(b.EnumC0768b.f52660O.title, b.a.f52610H.title, this.blockInstalledFirmwareVersion, null, 8, null);
        }
        InterfaceC4221l interfaceC4221l = this.callback;
        if (interfaceC4221l != null) {
            interfaceC4221l.c(z());
        }
    }

    private final void K() {
        U4.b.c("CountDownTimer starting ", new Object[0]);
        this.blockOTAStartTimer = new g().start();
    }

    private final void L() {
        this.statusCheckerJob = C1841i.d(J.a(Z.b()), null, null, new h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(ByteBuffer firmware) {
        this.webserver = new C4.b(this.localCallback, firmware, C4.b.G());
        C4.b bVar = null;
        if (this.device.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK || this.device.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK) {
            MEATERLinkAddress mEATERLinkAddress = this.meaterLinkAddress;
            N(firmware, mEATERLinkAddress != null ? mEATERLinkAddress.b() : null);
        } else {
            C4.b bVar2 = this.webserver;
            if (bVar2 == null) {
                C3862t.u("webserver");
            } else {
                bVar = bVar2;
            }
            bVar.x();
            K();
        }
        L();
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(ByteBuffer firmwareImage, String deviceIp) {
        Timer timer = new Timer();
        timer.schedule(new i(deviceIp, timer, firmwareImage), 1100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() throws InterruptedException {
        C4.b bVar = this.webserver;
        if (bVar == null) {
            C3862t.u("webserver");
            bVar = null;
        }
        bVar.A();
        O();
        U4.b.b("Timeout!", new Object[0]);
        J();
    }

    private final String Q() {
        Object systemService = x4.g.h().getSystemService("wifi");
        C3862t.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        int ipAddress = ((WifiManager) systemService).getConnectionInfo().getIpAddress();
        V v10 = V.f43983a;
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(ipAddress & 255);
        Integer numValueOf2 = Integer.valueOf((ipAddress >> 8) & 255);
        Integer numValueOf3 = Integer.valueOf((ipAddress >> 16) & 255);
        Integer numValueOf4 = Integer.valueOf((ipAddress >> 24) & 255);
        C4.b bVar = this.webserver;
        if (bVar == null) {
            C3862t.u("webserver");
            bVar = null;
        }
        String str = String.format(locale, "http://%d.%d.%d.%d:%d/ssv6060-main.bin", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, numValueOf3, numValueOf4, Integer.valueOf(bVar.F())}, 5));
        C3862t.f(str, "format(...)");
        return str;
    }

    private final void w() {
        MEATERLinkAddress mEATERLinkAddress = this.meaterLinkAddress;
        if (C3862t.b(mEATERLinkAddress != null ? mEATERLinkAddress.b() : null, this.device.wifiSetupAccessPointIPAddress())) {
            x();
            return;
        }
        x4.b.j(b.EnumC0768b.f52660O.title, b.a.f52609G.title, this.blockInstalledFirmwareVersion, null, 8, null);
        e.Companion companion = E4.e.INSTANCE;
        String str = this.firmwareUrl;
        C3862t.d(str);
        companion.c(str, new b());
    }

    private final void x() {
        this.firmwareVersion = FirmwareVersion.sharedInstance().getVersion(this.device.getMEATERDeviceType());
        ByteBuffer firmware = FirmwareVersion.sharedInstance().getFirmware(this.device.getMEATERDeviceType());
        C3862t.d(firmware);
        this.firmware = firmware;
        if (firmware == null) {
            C3862t.u("firmware");
            firmware = null;
        }
        M(firmware);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] y(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String z() {
        Context contextH = x4.g.h();
        if (this.localCallback.getBlockDidConnect()) {
            if (this.device.getMEATERDeviceType() != MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
                String string = contextH.getString(R.string.block_failed_to_download_update);
                C3862t.f(string, "getString(...)");
                return string;
            }
            return contextH.getString(R.string.download_update_issue, contextH.getString(this.device.getMEATERDeviceType().getDeviceName())) + " " + contextH.getString(R.string.device_move_closer_to_wifi, contextH.getString(this.device.getMEATERDeviceType().getDeviceName()));
        }
        if (this.device.getMEATERDeviceType() != MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
            String string2 = contextH.getString(R.string.unable_to_update_block_error_message);
            C3862t.f(string2, "getString(...)");
            return string2;
        }
        return contextH.getString(R.string.unable_to_dowanload_at_this_time, contextH.getString(this.device.getMEATERDeviceType().getDeviceName())) + " " + contextH.getString(R.string.unable_to_update_a_device_error_message, contextH.getString(this.device.getMEATERDeviceType().getDeviceName()));
    }

    /* renamed from: A, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getStarted() {
        return this.started;
    }

    public final void G(String ip, int port, int timeout, ByteBuffer byteBuffer) {
        C3862t.g(byteBuffer, "byteBuffer");
        C1841i.d(J.b(), Z.b(), null, new f(byteBuffer, ip, port, timeout, null), 2, null);
    }

    public final void H(Socket socket) {
        this.socket = socket;
    }

    public final void I(boolean z10) {
        this.started = z10;
    }

    public final void O() {
        U4.b.b("Stop sending Block firmware update Messages", new Object[0]);
        InterfaceC1867v0 interfaceC1867v0 = this.statusCheckerJob;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
    }

    @Override // p5.InterfaceC4222m
    public void a() {
        this.device.setConnectionState(DeviceConnectionState.OFFLINE);
        this.device.notifyStateUpdatedForSelfAndChildren();
        String firmwareRevision = this.device.getFirmwareRevision();
        C3862t.d(firmwareRevision);
        this.blockInstalledFirmwareVersion = firmwareRevision;
        if (this.firmwareUrl == null) {
            x();
        } else {
            w();
        }
        this.isUpdateInProgress = true;
    }

    /* compiled from: MeaterBlockFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"p5/y$g", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Loa/F;", "onTick", "(J)V", "onFinish", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.y$g */
    public static final class g extends CountDownTimer {
        g() {
            super(45000L, Config.MC_BROADCAST_INTERVAL_WIFI);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            Boolean bool = Boolean.FALSE;
            C4.b bVar = C4234y.this.webserver;
            C4.b bVar2 = null;
            if (bVar == null) {
                C3862t.u("webserver");
                bVar = null;
            }
            Boolean boolValueOf = Boolean.valueOf(bVar.p());
            C4.b bVar3 = C4234y.this.webserver;
            if (bVar3 == null) {
                C3862t.u("webserver");
                bVar3 = null;
            }
            U4.b.c("CountDownTimer webServer null %s ,webServer Alive %s wasStarted = %s  ", bool, boolValueOf, Boolean.valueOf(bVar3.C()));
            C4.b bVar4 = C4234y.this.webserver;
            if (bVar4 == null) {
                C3862t.u("webserver");
                bVar4 = null;
            }
            if (bVar4.C()) {
                return;
            }
            C4.b bVar5 = C4234y.this.webserver;
            if (bVar5 == null) {
                C3862t.u("webserver");
            } else {
                bVar2 = bVar5;
            }
            bVar2.x();
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }
    }
}
