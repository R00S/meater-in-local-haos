package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C6158s3;
import com.flurry.sdk.InterfaceC6078j3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.k3 */
/* loaded from: classes2.dex */
public final class C6087k3 implements InterfaceC6078j3 {

    /* renamed from: a */
    Map<EnumC6161s6, InterfaceC6177u6> f16079a;

    /* renamed from: b */
    private AtomicBoolean f16080b;

    /* renamed from: c */
    private InterfaceC6069i3 f16081c;

    /* renamed from: d */
    private boolean f16082d = false;

    /* renamed from: e */
    private Timer f16083e = null;

    /* renamed from: f */
    private TimerTask f16084f = null;

    /* renamed from: g */
    long f16085g = Long.MIN_VALUE;

    /* renamed from: h */
    long f16086h = Long.MIN_VALUE;

    /* renamed from: i */
    long f16087i = Long.MIN_VALUE;

    /* renamed from: j */
    int f16088j = EnumC6039f0.BACKGROUND.f15845j;

    /* renamed from: k */
    private d f16089k = d.INACTIVE;

    /* renamed from: com.flurry.sdk.k3$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f16090h;

        a(boolean z) {
            this.f16090h = z;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            if (this.f16090h) {
                C6020d0 c6020d0 = C6037e7.m13055a().f15832l;
                C6087k3 c6087k3 = C6087k3.this;
                c6020d0.m13027z(c6087k3.f16085g, c6087k3.f16086h);
            }
            C6020d0 c6020d02 = C6037e7.m13055a().f15832l;
            c6020d02.f15767r.set(this.f16090h);
        }
    }

    /* renamed from: com.flurry.sdk.k3$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16092a;

        static {
            int[] iArr = new int[d.values().length];
            f16092a = iArr;
            try {
                iArr[d.FOREGROUND_RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16092a[d.FOREGROUND_ENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16092a[d.BACKGROUND_RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16092a[d.BACKGROUND_ENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16092a[d.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.flurry.sdk.k3$c */
    public class c extends TimerTask {
        protected c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C6087k3.this.m13166g();
            C6087k3 c6087k3 = C6087k3.this;
            C6048g0.m13065a().m13071e();
            if (c6087k3.f16087i <= 0) {
                c6087k3.f16087i = SystemClock.elapsedRealtime();
            }
            if (C6087k3.m13157f(c6087k3.f16085g)) {
                c6087k3.m13167i(C6090k6.m13169h(c6087k3.f16085g, c6087k3.f16086h, c6087k3.f16087i, c6087k3.f16088j));
            } else {
                C6021d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            InterfaceC6078j3.a aVar = InterfaceC6078j3.a.REASON_SESSION_FINALIZE;
            c6087k3.m13167i(C6152r5.m13293h(aVar.ordinal(), aVar.f16030p));
            c6087k3.m13165e(false);
            c6087k3.m13168k();
        }
    }

    /* renamed from: com.flurry.sdk.k3$d */
    enum d {
        INACTIVE,
        FOREGROUND_RUNNING,
        FOREGROUND_ENDING,
        BACKGROUND_RUNNING,
        BACKGROUND_ENDING
    }

    public C6087k3(InterfaceC6069i3 interfaceC6069i3) {
        this.f16081c = interfaceC6069i3;
        if (this.f16079a == null) {
            this.f16079a = new HashMap();
        }
        this.f16079a.clear();
        this.f16079a.put(EnumC6161s6.SESSION_INFO, null);
        this.f16079a.put(EnumC6161s6.APP_STATE, null);
        this.f16079a.put(EnumC6161s6.APP_INFO, null);
        this.f16079a.put(EnumC6161s6.REPORTED_ID, null);
        this.f16079a.put(EnumC6161s6.DEVICE_PROPERTIES, null);
        this.f16079a.put(EnumC6161s6.SESSION_ID, null);
        this.f16079a = this.f16079a;
        this.f16080b = new AtomicBoolean(false);
    }

    /* renamed from: a */
    private static void m13154a(long j2, long j3, String str) {
        HashMap map = new HashMap();
        map.put("fl.session.elapsed.start.time", String.valueOf(j2));
        if (j3 != Long.MIN_VALUE) {
            map.put("fl.session.elapsed.end.time", String.valueOf(j3));
            map.put("fl.session.duration", String.valueOf(j3 - j2));
        }
        map.put("fl.session.message", str);
        C6048g0.m13065a();
        C6048g0.m13068f("Session Duration", map);
    }

    /* renamed from: c */
    private void m13155c(d dVar) {
        if (this.f16089k.equals(dVar)) {
            C6021d1.m13030c(3, "SessionRule", "Invalid state transition.");
            return;
        }
        C6021d1.m13030c(3, "SessionRule", "Previous session state: " + this.f16089k.name());
        this.f16089k = dVar;
        C6021d1.m13030c(3, "SessionRule", "Current session state: " + this.f16089k.name());
    }

    /* renamed from: d */
    private void m13156d(C6043f4 c6043f4) {
        if (!c6043f4.f15879f.equals(EnumC6030e0.SESSION_START)) {
            C6021d1.m13030c(3, "SessionRule", "Only generate session id during session start");
            return;
        }
        if (this.f16085g == Long.MIN_VALUE && this.f16079a.get(EnumC6161s6.SESSION_ID) == null) {
            C6021d1.m13030c(3, "SessionRule", "Generating Session Id:" + c6043f4.f15876c);
            this.f16085g = c6043f4.f15876c;
            this.f16086h = SystemClock.elapsedRealtime();
            this.f16088j = c6043f4.f15875b.f15845j == 1 ? 2 : 0;
            if (m13157f(this.f16085g)) {
                m13154a(this.f16086h, this.f16087i, "Generate Session Id");
                m13161m(C6090k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
            } else {
                C6021d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            m13165e(true);
        }
    }

    /* renamed from: f */
    static boolean m13157f(long j2) {
        return j2 > 0;
    }

    /* renamed from: h */
    private void m13158h(long j2) {
        m13166g();
        this.f16087i = SystemClock.elapsedRealtime();
        if (m13157f(this.f16085g)) {
            m13154a(this.f16086h, this.f16087i, "Start Session Finalize Timer");
            m13161m(C6090k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
        } else {
            C6021d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        m13160l(j2);
    }

    /* renamed from: j */
    private static boolean m13159j(C6043f4 c6043f4) {
        return c6043f4.f15875b.equals(EnumC6039f0.FOREGROUND) && c6043f4.f15879f.equals(EnumC6030e0.SESSION_START);
    }

    /* renamed from: l */
    private synchronized void m13160l(long j2) {
        if (this.f16083e != null) {
            m13166g();
        }
        this.f16083e = new Timer("FlurrySessionTimer");
        c cVar = new c();
        this.f16084f = cVar;
        this.f16083e.schedule(cVar, j2);
    }

    /* renamed from: m */
    private void m13161m(InterfaceC6177u6 interfaceC6177u6) {
        if (this.f16081c != null) {
            C6021d1.m13030c(3, "SessionRule", "Appending Frame:" + interfaceC6177u6.mo13296d());
            this.f16081c.mo12959b(interfaceC6177u6);
        }
    }

    /* renamed from: n */
    private static boolean m13162n(C6043f4 c6043f4) {
        return c6043f4.f15875b.equals(EnumC6039f0.BACKGROUND) && c6043f4.f15879f.equals(EnumC6030e0.SESSION_START);
    }

    /* renamed from: o */
    private boolean m13163o() {
        Iterator<Map.Entry<EnumC6161s6, InterfaceC6177u6>> it = this.f16079a.entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (it.next().getValue() == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: p */
    private void m13164p() {
        if (this.f16085g <= 0) {
            C6021d1.m13030c(6, "SessionRule", "Finalize session " + this.f16085g);
            return;
        }
        m13166g();
        C6048g0.m13065a().m13071e();
        this.f16087i = SystemClock.elapsedRealtime();
        if (m13157f(this.f16085g)) {
            m13167i(C6090k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
        } else {
            C6021d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        InterfaceC6078j3.a aVar = InterfaceC6078j3.a.REASON_SESSION_FINALIZE;
        m13167i(C6152r5.m13293h(aVar.ordinal(), aVar.f16030p));
        m13165e(false);
        m13168k();
    }

    @Override // com.flurry.sdk.InterfaceC6078j3
    /* renamed from: b */
    public final void mo13137b(InterfaceC6177u6 interfaceC6177u6) {
        if (interfaceC6177u6.mo12961a().equals(EnumC6161s6.FLUSH_FRAME)) {
            C6160s5 c6160s5 = (C6160s5) interfaceC6177u6.mo13298f();
            if (InterfaceC6078j3.a.REASON_SESSION_FINALIZE.f16030p.equals(c6160s5.f16331c)) {
                return;
            }
            if (!InterfaceC6078j3.a.REASON_STICKY_SET_COMPLETE.f16030p.equals(c6160s5.f16331c)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                m13154a(this.f16086h, jElapsedRealtime, "Flush In Middle");
                m13167i(C6090k6.m13169h(this.f16085g, this.f16086h, jElapsedRealtime, this.f16088j));
            }
            InterfaceC6177u6 interfaceC6177u62 = this.f16079a.get(EnumC6161s6.SESSION_ID);
            if (interfaceC6177u62 != null) {
                m13161m(interfaceC6177u62);
                return;
            }
            return;
        }
        if (interfaceC6177u6.mo12961a().equals(EnumC6161s6.REPORTING)) {
            C6043f4 c6043f4 = (C6043f4) interfaceC6177u6.mo13298f();
            int i2 = b.f16092a[this.f16089k.ordinal()];
            if (i2 == 1) {
                EnumC6039f0 enumC6039f0 = c6043f4.f15875b;
                EnumC6039f0 enumC6039f02 = EnumC6039f0.FOREGROUND;
                if (enumC6039f0.equals(enumC6039f02)) {
                    if (this.f16082d && !c6043f4.f15880g) {
                        this.f16082d = false;
                    }
                    if ((c6043f4.f15875b.equals(enumC6039f02) && c6043f4.f15879f.equals(EnumC6030e0.SESSION_END)) && (this.f16082d || !c6043f4.f15880g)) {
                        m13158h(c6043f4.f15878e);
                        m13155c(d.FOREGROUND_ENDING);
                    }
                }
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            C6021d1.m13030c(6, "SessionRule", "Unreachable Code");
                        } else if (m13159j(c6043f4)) {
                            this.f16082d = c6043f4.f15880g;
                            m13155c(d.FOREGROUND_RUNNING);
                            m13156d(c6043f4);
                        } else if (m13162n(c6043f4)) {
                            m13155c(d.BACKGROUND_RUNNING);
                            m13156d(c6043f4);
                        }
                    } else if (m13159j(c6043f4)) {
                        m13164p();
                        m13155c(d.FOREGROUND_RUNNING);
                        m13156d(c6043f4);
                    } else if (m13162n(c6043f4)) {
                        m13166g();
                        this.f16087i = Long.MIN_VALUE;
                        m13155c(d.BACKGROUND_RUNNING);
                    }
                } else if (m13159j(c6043f4)) {
                    m13164p();
                    m13155c(d.FOREGROUND_RUNNING);
                    m13156d(c6043f4);
                } else {
                    if (c6043f4.f15875b.equals(EnumC6039f0.BACKGROUND) && c6043f4.f15879f.equals(EnumC6030e0.SESSION_END)) {
                        m13158h(c6043f4.f15878e);
                        m13155c(d.BACKGROUND_ENDING);
                    }
                }
            } else if (m13159j(c6043f4)) {
                m13166g();
                this.f16087i = Long.MIN_VALUE;
                m13155c(d.FOREGROUND_RUNNING);
            }
        }
        if (interfaceC6177u6.mo12961a().equals(EnumC6161s6.ANALYTICS_ERROR) && ((C6166t3) interfaceC6177u6.mo13298f()).f16384h == C6158s3.a.UNRECOVERABLE_CRASH.f16324j) {
            m13166g();
            this.f16087i = SystemClock.elapsedRealtime();
            if (m13157f(this.f16085g)) {
                m13154a(this.f16086h, this.f16087i, "Process Crash");
                m13167i(C6090k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
            } else {
                C6021d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
        }
        if (interfaceC6177u6.mo12961a().equals(EnumC6161s6.CCPA_DELETION)) {
            InterfaceC6078j3.a aVar = InterfaceC6078j3.a.REASON_DATA_DELETION;
            m13161m(C6152r5.m13293h(aVar.ordinal(), aVar.f16030p));
        }
        EnumC6161s6 enumC6161s6Mo12961a = interfaceC6177u6.mo12961a();
        if (this.f16079a.containsKey(enumC6161s6Mo12961a)) {
            C6021d1.m13030c(3, "SessionRule", "Adding Sticky Frame:" + interfaceC6177u6.mo13296d());
            this.f16079a.put(enumC6161s6Mo12961a, interfaceC6177u6);
        }
        if (this.f16080b.get() || !m13163o()) {
            if (this.f16080b.get() && interfaceC6177u6.mo12961a().equals(EnumC6161s6.NOTIFICATION)) {
                C6048g0.m13065a();
                C6048g0.m13068f("Flush Token Refreshed", Collections.emptyMap());
                InterfaceC6078j3.a aVar2 = InterfaceC6078j3.a.REASON_PUSH_TOKEN_REFRESH;
                m13161m(C6152r5.m13293h(aVar2.ordinal(), aVar2.f16030p));
                return;
            }
            return;
        }
        this.f16080b.set(true);
        InterfaceC6078j3.a aVar3 = InterfaceC6078j3.a.REASON_STICKY_SET_COMPLETE;
        m13161m(C6152r5.m13293h(aVar3.ordinal(), aVar3.f16030p));
        int iM13256e = C6131p2.m13256e("last_streaming_http_error_code", Integer.MIN_VALUE);
        String strM13258g = C6131p2.m13258g("last_streaming_http_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
        String strM13258g2 = C6131p2.m13258g("last_streaming_http_report_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
        if (iM13256e != Integer.MIN_VALUE) {
            C6013c2.m12989e(iM13256e, strM13258g, strM13258g2, false);
            C6131p2.m13252a("last_streaming_http_error_code");
            C6131p2.m13252a("last_streaming_http_error_message");
            C6131p2.m13252a("last_streaming_http_report_identifier");
        }
        int iM13256e2 = C6131p2.m13256e("last_legacy_http_error_code", Integer.MIN_VALUE);
        String strM13258g3 = C6131p2.m13258g("last_legacy_http_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
        String strM13258g4 = C6131p2.m13258g("last_legacy_http_report_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
        if (iM13256e2 != Integer.MIN_VALUE) {
            C6013c2.m12989e(iM13256e2, strM13258g3, strM13258g4, false);
            C6131p2.m13252a("last_legacy_http_error_code");
            C6131p2.m13252a("last_legacy_http_error_message");
            C6131p2.m13252a("last_legacy_http_report_identifier");
        }
        C6131p2.m13254c("last_streaming_session_id", this.f16085g);
        HashMap map = new HashMap();
        map.put("streaming.session.id", String.valueOf(this.f16085g));
        C6048g0.m13065a();
        C6048g0.m13068f("Session Ids", map);
        C6048g0.m13065a().m13071e();
    }

    /* renamed from: e */
    final void m13165e(boolean z) {
        InterfaceC6069i3 interfaceC6069i3 = this.f16081c;
        if (interfaceC6069i3 != null) {
            interfaceC6069i3.mo12958a(new a(z));
        }
    }

    /* renamed from: g */
    final synchronized void m13166g() {
        Timer timer = this.f16083e;
        if (timer != null) {
            timer.cancel();
            this.f16083e = null;
        }
        TimerTask timerTask = this.f16084f;
        if (timerTask != null) {
            timerTask.cancel();
            this.f16084f = null;
        }
    }

    /* renamed from: i */
    final void m13167i(InterfaceC6177u6 interfaceC6177u6) {
        if (this.f16081c != null) {
            C6021d1.m13030c(3, "SessionRule", "Forwarding Frame:" + interfaceC6177u6.mo13296d());
            this.f16081c.mo12960c(interfaceC6177u6);
        }
    }

    /* renamed from: k */
    final void m13168k() {
        C6021d1.m13030c(3, "SessionRule", "Reset session rule");
        this.f16079a.put(EnumC6161s6.SESSION_ID, null);
        this.f16080b.set(false);
        this.f16085g = Long.MIN_VALUE;
        this.f16086h = Long.MIN_VALUE;
        this.f16087i = Long.MIN_VALUE;
        this.f16089k = d.INACTIVE;
        this.f16082d = false;
    }
}
