package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Looper;
import android.telephony.CellSignalStrength;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.flurry.sdk.C6178v;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Scanner;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.w */
/* loaded from: classes2.dex */
public class C6186w extends C6027d7<C6178v> {

    /* renamed from: p */
    protected static long f16452p = 3600000;

    /* renamed from: A */
    private int f16453A;

    /* renamed from: B */
    private C6064h7 f16454B;

    /* renamed from: C */
    private BroadcastReceiver f16455C;

    /* renamed from: D */
    private ConnectivityManager.NetworkCallback f16456D;

    /* renamed from: E */
    private PhoneStateListener f16457E;

    /* renamed from: F */
    protected InterfaceC6046f7<C6073i7> f16458F;

    /* renamed from: q */
    private boolean f16459q;

    /* renamed from: r */
    private boolean f16460r;

    /* renamed from: s */
    private boolean f16461s;

    /* renamed from: t */
    private C6178v.a f16462t;

    /* renamed from: u */
    private String f16463u;

    /* renamed from: v */
    private String f16464v;

    /* renamed from: w */
    private String f16465w;

    /* renamed from: x */
    private String f16466x;

    /* renamed from: y */
    private String f16467y;

    /* renamed from: z */
    private String f16468z;

    /* renamed from: com.flurry.sdk.w$a */
    final class a implements InterfaceC6046f7<C6073i7> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6073i7 c6073i7) {
            if (c6073i7.f16000b == EnumC6055g7.FOREGROUND) {
                C6186w.this.m13363d0();
            }
        }
    }

    /* renamed from: com.flurry.sdk.w$b */
    final class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            C6186w.m13332B(C6186w.this, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            C6186w.m13332B(C6186w.this, null);
        }
    }

    /* renamed from: com.flurry.sdk.w$c */
    final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C6186w.m13332B(C6186w.this, null);
        }
    }

    /* renamed from: com.flurry.sdk.w$d */
    final class d extends PhoneStateListener {

        /* renamed from: a */
        private long f16472a;

        d() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f16472a > C6186w.f16452p) {
                this.f16472a = jCurrentTimeMillis;
                C6186w.m13332B(C6186w.this, signalStrength);
            }
        }
    }

    /* renamed from: com.flurry.sdk.w$e */
    final class e extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ SignalStrength f16474h;

        e(SignalStrength signalStrength) {
            this.f16474h = signalStrength;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6186w.this.m13355Q(this.f16474h);
            C6186w.this.m13363d0();
        }
    }

    /* renamed from: com.flurry.sdk.w$f */
    final class f extends AbstractRunnableC6041f2 {
        f() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6186w.m13341K().registerNetworkCallback(new NetworkRequest.Builder().build(), C6186w.this.m13356R());
        }
    }

    /* renamed from: com.flurry.sdk.w$g */
    final class g extends AbstractRunnableC6041f2 {
        g() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6186w c6186w = C6186w.this;
            c6186w.f16460r = c6186w.m13338H();
            C6186w c6186w2 = C6186w.this;
            c6186w2.f16462t = c6186w2.m13358T();
            C6186w c6186w3 = C6186w.this;
            c6186w3.m13048t(new C6178v(c6186w3.f16462t, C6186w.this.f16460r, C6186w.this.f16463u, C6186w.this.f16464v, C6186w.this.f16465w, C6186w.this.f16466x, C6186w.this.f16467y, C6186w.this.f16468z, C6186w.this.f16453A));
        }
    }

    /* renamed from: com.flurry.sdk.w$h */
    final class h extends AbstractRunnableC6041f2 {
        h() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            boolean zM13338H = C6186w.this.m13338H();
            C6178v.a aVarM13358T = C6186w.this.m13358T();
            if (C6186w.this.f16460r == zM13338H && C6186w.this.f16462t == aVarM13358T && !C6186w.this.f16461s) {
                return;
            }
            C6186w.this.f16460r = zM13338H;
            C6186w.this.f16462t = aVarM13358T;
            C6186w.m13351c0(C6186w.this);
            C6186w c6186w = C6186w.this;
            c6186w.m13048t(new C6178v(c6186w.m13358T(), C6186w.this.f16460r, C6186w.this.f16463u, C6186w.this.f16464v, C6186w.this.f16465w, C6186w.this.f16466x, C6186w.this.f16467y, C6186w.this.f16468z, C6186w.this.f16453A));
        }
    }

    public C6186w(C6064h7 c6064h7) {
        super("NetworkProvider");
        this.f16461s = false;
        this.f16463u = null;
        this.f16464v = null;
        this.f16465w = null;
        this.f16466x = null;
        this.f16467y = null;
        this.f16468z = null;
        this.f16453A = -1;
        this.f16458F = new a();
        if (!C6122o2.m13225a("android.permission.ACCESS_NETWORK_STATE")) {
            this.f16460r = true;
            this.f16462t = C6178v.a.NONE_OR_UNKNOWN;
        } else {
            m13339I();
            this.f16454B = c6064h7;
            c6064h7.mo13050v(this.f16458F);
        }
    }

    /* renamed from: B */
    static /* synthetic */ void m13332B(C6186w c6186w, SignalStrength signalStrength) {
        c6186w.mo13007m(c6186w.new e(signalStrength));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: H */
    public boolean m13338H() {
        if (!C6122o2.m13225a("android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        ConnectivityManager connectivityManagerM13341K = m13341K();
        if (connectivityManagerM13341K == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return m13359U(connectivityManagerM13341K) != C6178v.a.NONE_OR_UNKNOWN;
            }
            NetworkInfo activeNetworkInfo = connectivityManagerM13341K.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Throwable th) {
            C6021d1.m13030c(5, "NetworkProvider", "Failed to get Network status: " + th.toString());
            return false;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: I */
    private synchronized void m13339I() {
        if (this.f16459q) {
            return;
        }
        this.f16460r = m13338H();
        this.f16462t = m13358T();
        if (Build.VERSION.SDK_INT >= 29) {
            mo13007m(new f());
        } else {
            C6002b0.m12964a().registerReceiver(m13357S(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        m13343M().listen(m13361W(), 256);
        this.f16459q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static ConnectivityManager m13341K() {
        return (ConnectivityManager) C6002b0.m12964a().getSystemService("connectivity");
    }

    /* renamed from: M */
    private static TelephonyManager m13343M() {
        return (TelephonyManager) C6002b0.m12964a().getSystemService("phone");
    }

    /* renamed from: c0 */
    static /* synthetic */ boolean m13351c0(C6186w c6186w) {
        c6186w.f16461s = false;
        return false;
    }

    /* renamed from: x */
    private int m13352x(SignalStrength signalStrength) throws NumberFormatException {
        if (signalStrength == null) {
            return this.f16453A;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                Iterator<CellSignalStrength> it = signalStrength.getCellSignalStrengths().iterator();
                while (it.hasNext()) {
                    int dbm = it.next().getDbm();
                    if (dbm != Integer.MAX_VALUE) {
                        return dbm;
                    }
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        char c2 = 0;
        try {
            return ((Integer) signalStrength.getClass().getMethod("getDbm", new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            if (!signalStrength.isGsm()) {
                int cdmaDbm = signalStrength.getCdmaDbm();
                int evdoDbm = signalStrength.getEvdoDbm();
                return (evdoDbm != -120 && (cdmaDbm == -120 || cdmaDbm >= evdoDbm)) ? evdoDbm : cdmaDbm;
            }
            int iM13353y = m13353y(signalStrength, "getLteDbm", "rsrp", 9);
            if (iM13353y != Integer.MAX_VALUE) {
                return iM13353y;
            }
            int iM13353y2 = m13353y(signalStrength, "getTdScdmaDbm", "mTdscdma", 14);
            if (iM13353y2 <= -25 && iM13353y2 != Integer.MAX_VALUE) {
                if (iM13353y2 >= -49) {
                    c2 = 4;
                } else if (iM13353y2 >= -73) {
                    c2 = 3;
                } else if (iM13353y2 >= -97) {
                    c2 = 2;
                } else if (iM13353y2 >= -110) {
                    c2 = 1;
                }
            }
            if (c2 != 0) {
                return iM13353y2;
            }
            int iM13353y3 = m13353y(signalStrength, "getWcdmaDbm", "mWcdma", 17);
            if (iM13353y3 != Integer.MAX_VALUE) {
                return iM13353y3;
            }
            int gsmSignalStrength = signalStrength.getGsmSignalStrength();
            if ((gsmSignalStrength == 99 ? -1 : gsmSignalStrength) != -1) {
                return (gsmSignalStrength * 2) - 113;
            }
            return -1;
        }
    }

    /* renamed from: y */
    private static int m13353y(SignalStrength signalStrength, String str, String str2, int i2) throws NumberFormatException {
        int iNextInt;
        try {
            iNextInt = ((Integer) signalStrength.getClass().getMethod(str, new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            iNextInt = Integer.MAX_VALUE;
        }
        if (iNextInt == Integer.MAX_VALUE) {
            String string = signalStrength.toString();
            int iIndexOf = string.indexOf(str2 + "=");
            if (iIndexOf != -1) {
                Scanner scanner = new Scanner(string.substring(iIndexOf + str2.length() + 1));
                if (scanner.hasNextInt() && (iNextInt = scanner.nextInt()) == 99) {
                    iNextInt = Integer.MAX_VALUE;
                }
            }
        }
        if (iNextInt != Integer.MAX_VALUE) {
            return iNextInt;
        }
        String[] strArrSplit = signalStrength.toString().split(" ");
        if (strArrSplit.length <= i2) {
            return iNextInt;
        }
        try {
            int i3 = Integer.parseInt(strArrSplit[i2]);
            return i3 != 99 ? i3 : Integer.MAX_VALUE;
        } catch (NumberFormatException unused2) {
            return iNextInt;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: Q */
    public void m13355Q(SignalStrength signalStrength) throws NumberFormatException {
        TelephonyManager telephonyManagerM13343M = m13343M();
        String networkOperatorName = telephonyManagerM13343M.getNetworkOperatorName();
        String networkOperator = telephonyManagerM13343M.getNetworkOperator();
        String simOperator = telephonyManagerM13343M.getSimOperator();
        String simOperatorName = telephonyManagerM13343M.getSimOperatorName();
        int i2 = Build.VERSION.SDK_INT;
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i2 >= 28) {
            try {
                CharSequence simCarrierIdName = telephonyManagerM13343M.getSimCarrierIdName();
                if (simCarrierIdName != null) {
                    string = simCarrierIdName.toString();
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int networkType = 0;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 24) {
                networkType = telephonyManagerM13343M.getNetworkType();
            } else if (C6122o2.m13225a("android.permission.READ_PHONE_STATE")) {
                networkType = telephonyManagerM13343M.getDataNetworkType();
            } else if (i3 < 29) {
                networkType = telephonyManagerM13343M.getNetworkType();
            }
        } catch (SecurityException unused2) {
        }
        String string2 = Integer.toString(networkType);
        int iM13352x = m13352x(signalStrength);
        if (TextUtils.equals(this.f16463u, networkOperatorName) && TextUtils.equals(this.f16464v, networkOperator) && TextUtils.equals(this.f16465w, simOperator) && TextUtils.equals(this.f16466x, string) && TextUtils.equals(this.f16467y, simOperatorName) && TextUtils.equals(this.f16468z, string2) && this.f16453A == iM13352x) {
            return;
        }
        C6021d1.m13030c(3, "NetworkProvider", "Cellular Name: " + networkOperatorName + ", Operator: " + networkOperator + ", Sim Operator: " + simOperator + ", Sim Id: " + string + ", Sim Name: " + simOperatorName + ", Band: " + string2 + ", Signal Strength: " + iM13352x);
        this.f16461s = true;
        this.f16463u = networkOperatorName;
        this.f16464v = networkOperator;
        this.f16465w = simOperator;
        this.f16466x = string;
        this.f16467y = simOperatorName;
        this.f16468z = string2;
        this.f16453A = iM13352x;
    }

    /* renamed from: R */
    protected ConnectivityManager.NetworkCallback m13356R() {
        if (this.f16456D == null) {
            this.f16456D = new b();
        }
        return this.f16456D;
    }

    /* renamed from: S */
    protected BroadcastReceiver m13357S() {
        if (this.f16455C == null) {
            this.f16455C = new c();
        }
        return this.f16455C;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: T */
    public C6178v.a m13358T() {
        if (!C6122o2.m13225a("android.permission.ACCESS_NETWORK_STATE")) {
            return C6178v.a.NONE_OR_UNKNOWN;
        }
        ConnectivityManager connectivityManagerM13341K = m13341K();
        if (connectivityManagerM13341K == null) {
            return C6178v.a.NONE_OR_UNKNOWN;
        }
        try {
            return Build.VERSION.SDK_INT >= 23 ? m13359U(connectivityManagerM13341K) : m13360V(connectivityManagerM13341K);
        } catch (Throwable th) {
            C6021d1.m13030c(5, "NetworkProvider", "Failed to get Network type: " + th.toString());
            return C6178v.a.NONE_OR_UNKNOWN;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: U */
    public C6178v.a m13359U(ConnectivityManager connectivityManager) {
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return C6178v.a.NONE_OR_UNKNOWN;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities == null ? C6178v.a.NONE_OR_UNKNOWN : networkCapabilities.hasTransport(1) ? C6178v.a.WIFI : networkCapabilities.hasTransport(0) ? C6178v.a.CELL : C6178v.a.NETWORK_AVAILABLE;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: V */
    public C6178v.a m13360V(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return C6178v.a.NONE_OR_UNKNOWN;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                return C6178v.a.WIFI;
            }
            if (type != 2 && type != 3 && type != 4 && type != 5) {
                return type != 8 ? C6178v.a.NETWORK_AVAILABLE : C6178v.a.NONE_OR_UNKNOWN;
            }
        }
        return C6178v.a.CELL;
    }

    /* renamed from: W */
    protected PhoneStateListener m13361W() {
        if (this.f16457E == null) {
            try {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                    Looper.loop();
                }
                this.f16457E = new d();
            } catch (Throwable th) {
                C6021d1.m13030c(5, "NetworkProvider", "Failed to initialize PhoneStateListener: " + th.toString());
            }
        }
        return this.f16457E;
    }

    /* renamed from: Z */
    public boolean m13362Z() {
        return this.f16460r;
    }

    /* renamed from: d0 */
    public void m13363d0() {
        mo13007m(new h());
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: v */
    public void mo13050v(InterfaceC6046f7<C6178v> interfaceC6046f7) {
        super.mo13050v(interfaceC6046f7);
        mo13007m(new g());
    }
}
