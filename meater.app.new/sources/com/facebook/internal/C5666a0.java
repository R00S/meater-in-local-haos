package com.facebook.internal;

import android.R;
import android.content.Context;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.facebook.C5641a0;
import com.facebook.internal.C5668b0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: FeatureManager.kt */
/* renamed from: com.facebook.internal.a0 */
/* loaded from: classes2.dex */
public final class C5666a0 {

    /* renamed from: a */
    public static final C5666a0 f14313a = new C5666a0();

    /* renamed from: b */
    private static final Map<b, String[]> f14314b = new HashMap();

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.facebook.internal.a0$a */
    public interface a {
        /* renamed from: a */
        void mo11347a(boolean z);
    }

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.facebook.internal.a0$b */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        Login(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);


        /* renamed from: f */
        public static final a f14329f = new a(null);

        /* renamed from: O */
        private final int f14350O;

        /* compiled from: FeatureManager.kt */
        /* renamed from: com.facebook.internal.a0$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }

            /* renamed from: a */
            public final b m11383a(int i2) {
                b[] bVarArrValuesCustom = b.valuesCustom();
                int length = bVarArrValuesCustom.length;
                int i3 = 0;
                while (i3 < length) {
                    b bVar = bVarArrValuesCustom[i3];
                    i3++;
                    if (bVar.f14350O == i2) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        /* compiled from: FeatureManager.kt */
        /* renamed from: com.facebook.internal.a0$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C11459b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f14351a;

            static {
                int[] iArr = new int[b.valuesCustom().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ProtectedMode.ordinal()] = 16;
                iArr[b.MACARuleMatching.ordinal()] = 17;
                iArr[b.ModelRequest.ordinal()] = 18;
                iArr[b.EventDeactivation.ordinal()] = 19;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 20;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 21;
                iArr[b.IapLogging.ordinal()] = 22;
                iArr[b.IapLoggingLib2.ordinal()] = 23;
                iArr[b.Monitoring.ordinal()] = 24;
                iArr[b.Megatron.ordinal()] = 25;
                iArr[b.Elora.ordinal()] = 26;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 27;
                iArr[b.Login.ordinal()] = 28;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 29;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 30;
                iArr[b.BypassAppSwitch.ordinal()] = 31;
                iArr[b.Share.ordinal()] = 32;
                f14351a = iArr;
            }
        }

        b(int i2) {
            this.f14350O = i2;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
        }

        /* renamed from: q */
        public final b m11381q() {
            int i2 = this.f14350O;
            return (i2 & 255) > 0 ? f14329f.m11383a(i2 & (-256)) : (65280 & i2) > 0 ? f14329f.m11383a(i2 & (-65536)) : (16711680 & i2) > 0 ? f14329f.m11383a(i2 & (-16777216)) : f14329f.m11383a(0);
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C11459b.f14351a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ProtectedMode";
                case 17:
                    return "MACARuleMatching";
                case 18:
                    return "ModelRequest";
                case 19:
                    return "EventDeactivation";
                case 20:
                    return "OnDeviceEventProcessing";
                case 21:
                    return "OnDevicePostInstallEventProcessing";
                case 22:
                    return "IAPLogging";
                case 23:
                    return "IAPLoggingLib2";
                case 24:
                    return "Monitoring";
                case 25:
                    return "Megatron";
                case 26:
                    return "Elora";
                case 27:
                    return "ServiceUpdateCompliance";
                case 28:
                    return "LoginKit";
                case 29:
                    return "ChromeCustomTabsPrefetching";
                case 30:
                    return "IgnoreAppSwitchToLoggedOut";
                case 31:
                    return "BypassAppSwitch";
                case 32:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }

        /* renamed from: u */
        public final String m11382u() {
            return C9801m.m32354n("FBSDKFeature", this);
        }
    }

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.facebook.internal.a0$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14352a;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ProtectedMode.ordinal()] = 19;
            iArr[b.MACARuleMatching.ordinal()] = 20;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 21;
            iArr[b.Monitoring.ordinal()] = 22;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 23;
            iArr[b.BypassAppSwitch.ordinal()] = 24;
            f14352a = iArr;
        }
    }

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.facebook.internal.a0$d */
    public static final class d implements C5668b0.a {

        /* renamed from: a */
        final /* synthetic */ a f14353a;

        /* renamed from: b */
        final /* synthetic */ b f14354b;

        d(a aVar, b bVar) {
            this.f14353a = aVar;
            this.f14354b = bVar;
        }

        @Override // com.facebook.internal.C5668b0.a
        public void onCompleted() {
            a aVar = this.f14353a;
            C5666a0 c5666a0 = C5666a0.f14313a;
            aVar.mo11347a(C5666a0.m11378g(this.f14354b));
        }
    }

    private C5666a0() {
    }

    /* renamed from: a */
    public static final void m11372a(b bVar, a aVar) {
        C9801m.m32346f(bVar, DeepLinkIntentReceiver.DeepLinksTargets.FEATURE);
        C9801m.m32346f(aVar, "callback");
        C5668b0 c5668b0 = C5668b0.f14356a;
        C5668b0.m11389h(new d(aVar, bVar));
    }

    /* renamed from: b */
    private final boolean m11373b(b bVar) {
        switch (c.f14352a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public static final void m11374c(b bVar) {
        C9801m.m32346f(bVar, DeepLinkIntentReceiver.DeepLinksTargets.FEATURE);
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5641a0.m11284c().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(bVar.m11382u(), C5641a0.m11300s()).apply();
    }

    /* renamed from: d */
    public static final b m11375d(String str) {
        C9801m.m32346f(str, "className");
        f14313a.m11377f();
        for (Map.Entry<b, String[]> entry : f14314b.entrySet()) {
            b key = entry.getKey();
            String[] value = entry.getValue();
            int length = value.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = value[i2];
                i2++;
                if (C10546u.m37511E(str, str2, false, 2, null)) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    /* renamed from: e */
    private final boolean m11376e(b bVar) {
        boolean zM11373b = m11373b(bVar);
        C5668b0 c5668b0 = C5668b0.f14356a;
        String strM11382u = bVar.m11382u();
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5668b0.m11385b(strM11382u, C5641a0.m11285d(), zM11373b);
    }

    /* renamed from: f */
    private final synchronized void m11377f() {
        Map<b, String[]> map = f14314b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    /* renamed from: g */
    public static final boolean m11378g(b bVar) {
        C9801m.m32346f(bVar, DeepLinkIntentReceiver.DeepLinksTargets.FEATURE);
        if (b.Unknown == bVar) {
            return false;
        }
        if (b.Core == bVar) {
            return true;
        }
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        C5666a0 c5666a0 = f14313a;
        String string = contextM11284c.getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.m11382u(), null);
        if (string != null && C9801m.m32341a(string, C5641a0.m11300s())) {
            return false;
        }
        b bVarM11381q = bVar.m11381q();
        return bVarM11381q == bVar ? c5666a0.m11376e(bVar) : m11378g(bVarM11381q) && c5666a0.m11376e(bVar);
    }
}
