package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.C6182v3;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.HttpUrl;
import p241e.p252d.p253a.C8776b;

/* renamed from: com.flurry.sdk.g0 */
/* loaded from: classes2.dex */
public final class C6048g0 {

    /* renamed from: a */
    private static boolean f15886a = false;

    /* renamed from: b */
    private static boolean f15887b = false;

    /* renamed from: c */
    private static C6048g0 f15888c;

    /* renamed from: d */
    private int f15889d = C6131p2.m13256e("invalid.payload.count", 0);

    /* renamed from: com.flurry.sdk.g0$a */
    public static class a {

        /* renamed from: a */
        int f15890a;

        /* renamed from: b */
        Set<EnumC6161s6> f15891b;

        /* renamed from: c */
        int f15892c;

        public a() {
            if (C6048g0.f15887b) {
                this.f15890a = C6131p2.m13256e("drop.frame.count", 0);
                this.f15891b = new TreeSet();
                String strM13258g = C6131p2.m13258g("drop.frame.types", HttpUrl.FRAGMENT_ENCODE_SET);
                if (!TextUtils.isEmpty(strM13258g)) {
                    for (String str : strM13258g.split(",")) {
                        try {
                            this.f15891b.add(EnumC6161s6.m13306g(Integer.parseInt(str)));
                        } catch (NumberFormatException e2) {
                            C6021d1.m13030c(5, "SDKLogManager", "Cannot retrieve frame type from preferences: " + e2.getMessage());
                        }
                    }
                }
                this.f15892c = C6131p2.m13256e("auto.end.timed.events", 0);
            }
        }

        /* renamed from: a */
        public final synchronized void m13072a() {
            if (C6048g0.f15887b) {
                int i2 = this.f15892c + 1;
                this.f15892c = i2;
                C6131p2.m13253b("auto.end.timed.events", i2);
            }
        }

        /* renamed from: b */
        public final synchronized void m13073b(EnumC6161s6 enumC6161s6) {
            if (C6048g0.f15887b) {
                this.f15890a++;
                this.f15891b.add(enumC6161s6);
                C6131p2.m13253b("drop.frame.count", this.f15890a);
                StringBuilder sb = new StringBuilder();
                for (EnumC6161s6 enumC6161s62 : this.f15891b) {
                    if (sb.length() != 0) {
                        sb.append(',');
                    }
                    sb.append(enumC6161s62.f16372T);
                }
                C6131p2.m13255d("drop.frame.types", sb.toString());
            }
        }
    }

    /* renamed from: com.flurry.sdk.g0$b */
    public enum b {
        UNKNOWN(0),
        SUCCEED(1),
        IOEXCEPTION(2),
        EOF(3),
        PAYLOAD_ERROR(4),
        FRAME_MISSING(5);


        /* renamed from: m */
        private final int f15900m;

        /* renamed from: n */
        public String f15901n = null;

        /* renamed from: o */
        public int f15902o = 0;

        /* renamed from: p */
        public int f15903p = 0;

        /* renamed from: q */
        public List<EnumC6161s6> f15904q = null;

        /* renamed from: r */
        public Set<EnumC6161s6> f15905r = null;

        b(int i2) {
            this.f15900m = i2;
        }
    }

    /* renamed from: com.flurry.sdk.g0$c */
    public static class c {

        /* renamed from: a */
        int f15906a = 0;

        /* renamed from: a */
        public final void m13074a(int i2) {
            this.f15906a += i2;
        }
    }

    private C6048g0() {
    }

    /* renamed from: a */
    public static synchronized C6048g0 m13065a() {
        if (f15888c == null) {
            f15888c = new C6048g0();
        }
        return f15888c;
    }

    /* renamed from: c */
    public static void m13066c(String str, String str2, Throwable th) {
        Map mapEmptyMap = Collections.emptyMap();
        if (C5992a.m12945x()) {
            C8776b.m27931f(str, str2, th, mapEmptyMap);
            C6021d1.m13030c(4, "SDKLogManager", "Log SDK internal errors. " + str2 + "SDKLogManager");
        }
    }

    /* renamed from: d */
    public static void m13067d(String str, Map<String, String> map) {
        if (f15887b && C5992a.m12945x()) {
            C5992a.m12944v().m12946s(str, C6182v3.a.SDK_LOG, map);
            C6021d1.m13030c(4, "SDKLogManager", "Log SDK events: " + str + " with " + map);
        }
    }

    /* renamed from: f */
    public static void m13068f(String str, Map<String, String> map) {
        if (f15886a && C5992a.m12945x()) {
            C5992a.m12944v().m12946s(str, C6182v3.a.SDK_LOG, map);
            C6021d1.m13030c(4, "SDKLogManager", "Log SDK internal events. " + str + "SDKLogManager");
        }
    }

    /* renamed from: b */
    public final synchronized void m13070b(b bVar) {
        EnumC6161s6 enumC6161s6;
        if (f15887b) {
            HashMap map = new HashMap();
            map.put("fl.length", String.valueOf(bVar.f15902o));
            map.put("fl.frame.count", String.valueOf(bVar.f15903p));
            List<EnumC6161s6> list = bVar.f15904q;
            if (list == null || list.isEmpty()) {
                enumC6161s6 = EnumC6161s6.UNKNOWN;
            } else {
                enumC6161s6 = bVar.f15904q.get(r1.size() - 1);
            }
            map.put("fl.last.frame.type", String.valueOf(enumC6161s6));
            map.put("fl.failure.type", String.valueOf(bVar));
            map.put("fl.failure.reason", bVar.f15901n);
            map.put("fl.mandatory.frames", String.valueOf(bVar.f15905r));
            bVar.f15901n = null;
            bVar.f15902o = 0;
            bVar.f15903p = 0;
            bVar.f15904q = null;
            bVar.f15905r = null;
            int i2 = this.f15889d + 1;
            this.f15889d = i2;
            C6131p2.m13253b("invalid.payload.count", i2);
            m13067d("Flurry.SDKReport.PayloadError", map);
        }
    }

    /* renamed from: e */
    public final synchronized void m13071e() {
        if (f15887b) {
            c cVarMo13133d = C6104m2.m13180a().f16135d.mo13133d();
            a aVarM13386d = C6104m2.m13180a().f16133b.f16377a.m13386d();
            HashMap map = new HashMap();
            map.put("fl.invalid.payload.count", String.valueOf(this.f15889d));
            map.put("fl.payload.queue.size", String.valueOf(cVarMo13133d.f15906a));
            map.put("fl.drop.frame.count", String.valueOf(aVarM13386d.f15890a));
            map.put("fl.drop.frame.types", String.valueOf(aVarM13386d.f15891b));
            map.put("fl.auto.end.timed.events", String.valueOf(aVarM13386d.f15892c));
            this.f15889d = 0;
            cVarMo13133d.f15906a = 0;
            aVarM13386d.f15890a = 0;
            aVarM13386d.f15891b.clear();
            aVarM13386d.f15892c = 0;
            C6131p2.m13253b("invalid.payload.count", 0);
            C6131p2.m13253b("drop.frame.count", 0);
            C6131p2.m13255d("drop.frame.types", HttpUrl.FRAGMENT_ENCODE_SET);
            C6131p2.m13253b("auto.end.timed.events", 0);
            m13067d("Flurry.SDKReport.SessionSummary", map);
        }
    }
}
