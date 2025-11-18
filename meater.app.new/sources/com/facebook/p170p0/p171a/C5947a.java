package com.facebook.p170p0.p171a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.C5641a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.EnumC5694o0;
import com.google.zxing.C8626d;
import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import org.json.JSONObject;

/* compiled from: DeviceRequestsHelper.kt */
/* renamed from: com.facebook.p0.a.a */
/* loaded from: classes2.dex */
public final class C5947a {

    /* renamed from: a */
    public static final C5947a f15554a = new C5947a();

    /* renamed from: b */
    private static final String f15555b = C5947a.class.getCanonicalName();

    /* renamed from: c */
    private static final HashMap<String, NsdManager.RegistrationListener> f15556c = new HashMap<>();

    /* compiled from: DeviceRequestsHelper.kt */
    /* renamed from: com.facebook.p0.a.a$a */
    public static final class a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f15557a;

        /* renamed from: b */
        final /* synthetic */ String f15558b;

        a(String str, String str2) {
            this.f15557a = str;
            this.f15558b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            C9801m.m32346f(nsdServiceInfo, "serviceInfo");
            C5947a c5947a = C5947a.f15554a;
            C5947a.m12876a(this.f15558b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            C9801m.m32346f(nsdServiceInfo, "NsdServiceInfo");
            if (C9801m.m32341a(this.f15557a, nsdServiceInfo.getServiceName())) {
                return;
            }
            C5947a c5947a = C5947a.f15554a;
            C5947a.m12876a(this.f15558b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            C9801m.m32346f(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            C9801m.m32346f(nsdServiceInfo, "serviceInfo");
        }
    }

    private C5947a() {
    }

    /* renamed from: a */
    public static final void m12876a(String str) {
        f15554a.m12877b(str);
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m12877b(String str) {
        NsdManager.RegistrationListener registrationListener = f15556c.get(str);
        if (registrationListener != null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Object systemService = C5641a0.m11284c().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            try {
                ((NsdManager) systemService).unregisterService(registrationListener);
            } catch (IllegalArgumentException e2) {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11573i0(f15555b, e2);
            }
            f15556c.remove(str);
        }
    }

    /* renamed from: c */
    public static final Bitmap m12878c(String str) {
        EnumMap enumMap = new EnumMap(EnumC8622c.class);
        enumMap.put((EnumMap) EnumC8622c.MARGIN, (EnumC8622c) 2);
        Bitmap bitmapCreateBitmap = null;
        try {
            C8637b c8637bMo27243a = new C8626d().mo27243a(str, EnumC8620a.QR_CODE, 200, 200, enumMap);
            int iM27296g = c8637bMo27243a.m27296g();
            int iM27297h = c8637bMo27243a.m27297h();
            int[] iArr = new int[iM27296g * iM27297h];
            if (iM27296g > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    int i4 = i2 * iM27297h;
                    if (iM27297h > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            iArr[i4 + i5] = c8637bMo27243a.m27295f(i5, i2) ? -16777216 : -1;
                            if (i6 >= iM27297h) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    if (i3 >= iM27296g) {
                        break;
                    }
                    i2 = i3;
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(iM27297h, iM27296g, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, iM27297h, 0, 0, iM27297h, iM27296g);
            return bitmapCreateBitmap;
        } catch (WriterException unused) {
            return bitmapCreateBitmap;
        }
    }

    /* renamed from: d */
    public static final String m12879d(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        String str = Build.DEVICE;
        C9801m.m32345e(str, "DEVICE");
        map.put("device", str);
        String str2 = Build.MODEL;
        C9801m.m32345e(str2, "MODEL");
        map.put("model", str2);
        String string = new JSONObject(map).toString();
        C9801m.m32345e(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    /* renamed from: e */
    public static final boolean m12880e() {
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5670c0 c5670c0M11417c = C5672d0.m11417c(C5641a0.m11285d());
        return Build.VERSION.SDK_INT >= 16 && c5670c0M11417c != null && c5670c0M11417c.m11408l().contains(EnumC5694o0.Enabled);
    }

    /* renamed from: f */
    public static final boolean m12881f(String str) {
        C5947a c5947a = f15554a;
        if (m12880e()) {
            return c5947a.m12882g(str);
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: g */
    private final boolean m12882g(String str) {
        HashMap<String, NsdManager.RegistrationListener> map = f15556c;
        if (map.containsKey(str)) {
            return true;
        }
        C5641a0 c5641a0 = C5641a0.f14199a;
        String str2 = "fbsdk_" + C9801m.m32354n("android-", C10546u.m37524z(C5641a0.m11300s(), '.', '|', false, 4, null)) + '_' + ((Object) str);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(str2);
        nsdServiceInfo.setPort(80);
        Object systemService = C5641a0.m11284c().getSystemService("servicediscovery");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        }
        a aVar = new a(str2, str);
        map.put(str, aVar);
        ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
        return true;
    }
}
