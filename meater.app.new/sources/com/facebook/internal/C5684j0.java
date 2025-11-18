package com.facebook.internal;

import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import com.facebook.C5641a0;
import com.facebook.EnumC5659g0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10546u;

/* compiled from: Logger.kt */
/* renamed from: com.facebook.internal.j0 */
/* loaded from: classes2.dex */
public final class C5684j0 {

    /* renamed from: a */
    public static final a f14429a = new a(null);

    /* renamed from: b */
    private static final HashMap<String, String> f14430b = new HashMap<>();

    /* renamed from: c */
    private final EnumC5659g0 f14431c;

    /* renamed from: d */
    private final String f14432d;

    /* renamed from: e */
    private StringBuilder f14433e;

    /* renamed from: f */
    private int f14434f;

    /* compiled from: Logger.kt */
    /* renamed from: com.facebook.internal.j0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: f */
        private final synchronized String m11452f(String str) {
            String strM37507A;
            strM37507A = str;
            for (Map.Entry entry : C5684j0.f14430b.entrySet()) {
                strM37507A = C10546u.m37507A(strM37507A, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strM37507A;
        }

        /* renamed from: a */
        public final void m11453a(EnumC5659g0 enumC5659g0, int i2, String str, String str2) {
            C9801m.m32346f(enumC5659g0, "behavior");
            C9801m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
            C9801m.m32346f(str2, "string");
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (C5641a0.m11306y(enumC5659g0)) {
                String strM11452f = m11452f(str2);
                if (!C10546u.m37511E(str, "FacebookSDK.", false, 2, null)) {
                    str = C9801m.m32354n("FacebookSDK.", str);
                }
                Log.println(i2, str, strM11452f);
                if (enumC5659g0 == EnumC5659g0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void m11454b(EnumC5659g0 enumC5659g0, String str, String str2) {
            C9801m.m32346f(enumC5659g0, "behavior");
            C9801m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
            C9801m.m32346f(str2, "string");
            m11453a(enumC5659g0, 3, str, str2);
        }

        /* renamed from: c */
        public final void m11455c(EnumC5659g0 enumC5659g0, String str, String str2, Object... objArr) {
            C9801m.m32346f(enumC5659g0, "behavior");
            C9801m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
            C9801m.m32346f(str2, "format");
            C9801m.m32346f(objArr, "args");
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (C5641a0.m11306y(enumC5659g0)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                C9801m.m32345e(str3, "java.lang.String.format(format, *args)");
                m11453a(enumC5659g0, 3, str, str3);
            }
        }

        /* renamed from: d */
        public final synchronized void m11456d(String str) {
            C9801m.m32346f(str, "accessToken");
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (!C5641a0.m11306y(EnumC5659g0.INCLUDE_ACCESS_TOKENS)) {
                m11457e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        /* renamed from: e */
        public final synchronized void m11457e(String str, String str2) {
            C9801m.m32346f(str, "original");
            C9801m.m32346f(str2, "replace");
            C5684j0.f14430b.put(str, str2);
        }
    }

    public C5684j0(EnumC5659g0 enumC5659g0, String str) {
        C9801m.m32346f(enumC5659g0, "behavior");
        C9801m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.f14434f = 3;
        this.f14431c = enumC5659g0;
        C5698q0 c5698q0 = C5698q0.f14500a;
        this.f14432d = C9801m.m32354n("FacebookSDK.", C5698q0.m11643k(str, StoreTabGridRecyclerFragment.BundleCons.TAG));
        this.f14433e = new StringBuilder();
    }

    /* renamed from: g */
    private final boolean m11446g() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5641a0.m11306y(this.f14431c);
    }

    /* renamed from: b */
    public final void m11447b(String str) {
        C9801m.m32346f(str, "string");
        if (m11446g()) {
            this.f14433e.append(str);
        }
    }

    /* renamed from: c */
    public final void m11448c(String str, Object... objArr) {
        C9801m.m32346f(str, "format");
        C9801m.m32346f(objArr, "args");
        if (m11446g()) {
            StringBuilder sb = this.f14433e;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
            sb.append(str2);
        }
    }

    /* renamed from: d */
    public final void m11449d(String str, Object obj) {
        C9801m.m32346f(str, RoomNotification.KEY);
        C9801m.m32346f(obj, "value");
        m11448c("  %s:\t%s\n", str, obj);
    }

    /* renamed from: e */
    public final void m11450e() {
        String string = this.f14433e.toString();
        C9801m.m32345e(string, "contents.toString()");
        m11451f(string);
        this.f14433e = new StringBuilder();
    }

    /* renamed from: f */
    public final void m11451f(String str) {
        C9801m.m32346f(str, "string");
        f14429a.m11453a(this.f14431c, this.f14434f, this.f14432d, str);
    }
}
