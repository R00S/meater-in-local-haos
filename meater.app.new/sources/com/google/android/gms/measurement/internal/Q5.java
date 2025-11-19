package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import c7.C2337f;
import com.apptionlabs.meater_app.data.Config;
import g7.C3445p;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import n3.AbstractC4060a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class Q5 extends AbstractC2816p3 {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f35144i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f35145j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f35146c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f35147d;

    /* renamed from: e, reason: collision with root package name */
    private int f35148e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC4060a f35149f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f35150g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f35151h;

    Q5(P2 p22) {
        super(p22);
        this.f35151h = null;
        this.f35147d = new AtomicLong(0L);
    }

    public static long B(F f10) {
        long length = 0;
        if (f10 == null) {
            return 0L;
        }
        Iterator<String> it = f10.iterator();
        while (it.hasNext()) {
            if (f10.O0(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    static long C(byte[] bArr) {
        C3445p.k(bArr);
        int i10 = 0;
        C3445p.n(bArr.length > 0);
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (bArr[length] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    private final boolean C0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = l7.c.a(context).e(str, 64);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            k().H().b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            k().H().b("Error obtaining certificate", e11);
            return true;
        }
    }

    public static Bundle E(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean E0(String str) {
        String strA = K.f34990m0.a(null);
        return strA.equals("*") || Arrays.asList(strA.split(",")).contains(str);
    }

    public static Bundle H(List<P5> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (P5 p52 : list) {
            String str = p52.f35132F;
            if (str != null) {
                bundle.putString(p52.f35129C, str);
            } else {
                Long l10 = p52.f35131E;
                if (l10 != null) {
                    bundle.putLong(p52.f35129C, l10.longValue());
                } else {
                    Double d10 = p52.f35134H;
                    if (d10 != null) {
                        bundle.putDouble(p52.f35129C, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    static boolean H0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private final Object J(int i10, Object obj, boolean z10, boolean z11, String str) {
        Bundle bundleF;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return K(String.valueOf(obj), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleF = F((Bundle) parcelable, null)) != null && !bundleF.isEmpty()) {
                arrayList.add(bundleF);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static boolean J0(String str) {
        C3445p.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String K(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i10)) + "...";
    }

    public static boolean K0(String str) {
        for (String str2 : f35145j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int L0(String str) {
        if (!x0("event param", str)) {
            return 3;
        }
        if (p0("event param", null, str)) {
            return !k0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static void M(Bundle bundle, int i10, String str, Object obj) {
        if (w0(bundle, i10)) {
            bundle.putString("_ev", K(str, 40, true));
            if (obj != null) {
                C3445p.k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    private final int M0(String str) {
        if (!D0("event param", str)) {
            return 3;
        }
        if (p0("event param", null, str)) {
            return !k0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int N0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean O0(String str) {
        C3445p.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest T0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @TargetApi(Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD)
    private final boolean X0() throws ExecutionException, InterruptedException, TimeoutException {
        Integer num;
        if (this.f35150g == null) {
            AbstractC4060a abstractC4060aR0 = R0();
            boolean z10 = false;
            if (abstractC4060aR0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = abstractC4060aR0.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        num2 = num;
                        k().M().b("Measurement manager api exception", e);
                        this.f35150g = Boolean.FALSE;
                        num = num2;
                        k().L().b("Measurement manager api status result", num);
                        return this.f35150g.booleanValue();
                    } catch (CancellationException e11) {
                        e = e11;
                        num2 = num;
                        k().M().b("Measurement manager api exception", e);
                        this.f35150g = Boolean.FALSE;
                        num = num2;
                        k().L().b("Measurement manager api status result", num);
                        return this.f35150g.booleanValue();
                    } catch (ExecutionException e12) {
                        e = e12;
                        num2 = num;
                        k().M().b("Measurement manager api exception", e);
                        this.f35150g = Boolean.FALSE;
                        num = num2;
                        k().L().b("Measurement manager api status result", num);
                        return this.f35150g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        k().M().b("Measurement manager api exception", e);
                        this.f35150g = Boolean.FALSE;
                        num = num2;
                        k().L().b("Measurement manager api status result", num);
                        return this.f35150g.booleanValue();
                    }
                }
                this.f35150g = Boolean.valueOf(z10);
            } catch (InterruptedException e14) {
                e = e14;
            } catch (CancellationException e15) {
                e = e15;
            } catch (ExecutionException e16) {
                e = e16;
            } catch (TimeoutException e17) {
                e = e17;
            }
            k().L().b("Measurement manager api status result", num);
        }
        return this.f35150g.booleanValue();
    }

    public static void Y(C2782k4 c2782k4, Bundle bundle, boolean z10) {
        if (bundle == null || c2782k4 == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && c2782k4 == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c2782k4.f35427a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c2782k4.f35428b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c2782k4.f35429c);
    }

    public static void Z(S5 s52, int i10, String str, String str2, int i11) {
        a0(s52, null, i10, str, str2, i11);
    }

    static void a0(S5 s52, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        w0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        s52.a(str, "_err", bundle);
    }

    private final void b0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int iM0;
        int i10;
        String str4;
        int iY;
        int i11;
        if (bundle == null) {
            return;
        }
        int i12 = c().j().d0(231100000, true) ? 35 : 0;
        int i13 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iM0 = !z10 ? M0(str5) : 0;
                if (iM0 == 0) {
                    iM0 = L0(str5);
                }
            } else {
                iM0 = 0;
            }
            if (iM0 != 0) {
                M(bundle, iM0, str5, iM0 == 3 ? str5 : null);
                bundle.remove(str5);
                i10 = i12;
            } else {
                if (i0(bundle.get(str5))) {
                    k().N().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iY = 22;
                    str4 = str5;
                    i10 = i12;
                } else {
                    str4 = str5;
                    i10 = i12;
                    iY = y(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (iY == 0 || "_ev".equals(str4)) {
                    if (!J0(str4) || o0(str4, v7.G.f51509d)) {
                        i11 = i10;
                    } else {
                        int i14 = i13 + 1;
                        if (d0(231100000, true)) {
                            i11 = i10;
                            if (i14 > i11) {
                                k().I().c("Item can't contain more than " + i11 + " item-scoped custom params", g().c(str2), g().a(bundle));
                                w0(bundle, 28);
                                bundle.remove(str4);
                            }
                        } else {
                            k().I().c("Item array not supported on client's version of Google Play Services (Android Only)", g().c(str2), g().a(bundle));
                            w0(bundle, 23);
                            bundle.remove(str4);
                            i11 = i10;
                        }
                        i13 = i14;
                    }
                    i12 = i11;
                } else {
                    M(bundle, iY, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
            }
            i12 = i10;
        }
    }

    static boolean e0(Context context) {
        ActivityInfo receiverInfo;
        C3445p.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean f0(Context context, boolean z10) {
        C3445p.k(context);
        return v0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean g0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean h0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean i0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean n0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            C3445p.k(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean o0(String str, String[] strArr) {
        C3445p.k(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] r0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList<Bundle> u0(List<C2749g> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C2749g c2749g : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c2749g.f35351B);
            bundle.putString("origin", c2749g.f35352C);
            bundle.putLong("creation_timestamp", c2749g.f35354E);
            bundle.putString("name", c2749g.f35353D.f35129C);
            v7.D.b(bundle, C3445p.k(c2749g.f35353D.f0()));
            bundle.putBoolean("active", c2749g.f35355F);
            String str = c2749g.f35356G;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            J j10 = c2749g.f35357H;
            if (j10 != null) {
                bundle.putString("timed_out_event_name", j10.f34889B);
                F f10 = j10.f34890C;
                if (f10 != null) {
                    bundle.putBundle("timed_out_event_params", f10.v0());
                }
            }
            bundle.putLong("trigger_timeout", c2749g.f35358I);
            J j11 = c2749g.f35359J;
            if (j11 != null) {
                bundle.putString("triggered_event_name", j11.f34889B);
                F f11 = j11.f34890C;
                if (f11 != null) {
                    bundle.putBundle("triggered_event_params", f11.v0());
                }
            }
            bundle.putLong("triggered_timestamp", c2749g.f35353D.f35130D);
            bundle.putLong("time_to_live", c2749g.f35360K);
            J j12 = c2749g.f35361L;
            if (j12 != null) {
                bundle.putString("expired_event_name", j12.f34889B);
                F f12 = j12.f34890C;
                if (f12 != null) {
                    bundle.putBundle("expired_event_params", f12.v0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean v0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static boolean w0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int y(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List<java.lang.String> r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q5.y(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] y0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static long z(long j10, long j11) {
        return (j10 + (j11 * Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX)) / 86400000;
    }

    static int z0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final long A(android.content.Context r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            r6.n()
            g7.C3445p.k(r7)
            g7.C3445p.e(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = T0()
            r2 = -1
            if (r1 != 0) goto L23
            com.google.android.gms.measurement.internal.h2 r7 = r6.k()
            com.google.android.gms.measurement.internal.i2 r7 = r7.H()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.a(r8)
            goto L74
        L23:
            r4 = 0
            if (r0 == 0) goto L73
            boolean r8 = r6.C0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r8 != 0) goto L73
            l7.b r7 = l7.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            android.content.Context r8 = r6.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.e(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r7 == 0) goto L58
            int r8 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r8 <= 0) goto L58
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            long r2 = C(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            goto L74
        L56:
            r7 = move-exception
            goto L66
        L58:
            com.google.android.gms.measurement.internal.h2 r7 = r6.k()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            com.google.android.gms.measurement.internal.i2 r7 = r7.M()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            java.lang.String r8 = "Could not get signatures"
            r7.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            goto L74
        L66:
            com.google.android.gms.measurement.internal.h2 r8 = r6.k()
            com.google.android.gms.measurement.internal.i2 r8 = r8.H()
            java.lang.String r0 = "Package name not found"
            r8.b(r0, r7)
        L73:
            r2 = r4
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q5.A(android.content.Context, java.lang.String):long");
    }

    final long A0(String str) {
        if (a().getPackageManager() == null) {
            return 0L;
        }
        int i10 = 0;
        try {
            ApplicationInfo applicationInfoC = l7.c.a(a()).c(str, 0);
            if (applicationInfoC != null) {
                i10 = applicationInfoC.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            k().K().b("PackageManager failed to find running app: app_id", str);
        }
        return i10;
    }

    final Object B0(String str, Object obj) {
        return "_ldl".equals(str) ? J(N0(str), obj, true, false, null) : J(N0(str), obj, false, false, null);
    }

    final Bundle D(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            k().M().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    final boolean D0(String str, String str2) {
        if (str2 == null) {
            k().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            k().I().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            k().I().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                k().I().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final Bundle F(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objT0 = t0(str2, bundle.get(str2));
                if (objT0 == null) {
                    k().N().b("Param value can't be null", g().f(str2));
                } else {
                    P(bundle2, str2, objT0);
                }
            }
        }
        return bundle2;
    }

    final boolean F0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c().U().equals(str);
    }

    final Bundle G(String str, String str2, Bundle bundle, List<String> list, boolean z10) {
        int iM0;
        int i10;
        Q5 q52 = this;
        boolean zO0 = o0(str2, v7.H.f51513d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iB = c().B();
        int i11 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM0 = !z10 ? q52.M0(str3) : 0;
                if (iM0 == 0) {
                    iM0 = q52.L0(str3);
                }
            } else {
                iM0 = 0;
            }
            if (iM0 != 0) {
                M(bundle2, iM0, str3, iM0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i10 = iB;
            } else {
                i10 = iB;
                int iY = y(str, str2, str3, bundle.get(str3), bundle2, list, z10, zO0);
                if (iY == 17) {
                    M(bundle2, iY, str3, Boolean.FALSE);
                } else if (iY != 0 && !"_ev".equals(str3)) {
                    M(bundle2, iY, iY == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (J0(str3)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        k().I().c("Event can't contain more than " + i10 + " params", g().c(str2), g().a(bundle));
                        w0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i11 = i12;
                }
            }
            iB = i10;
            q52 = this;
        }
        return bundle2;
    }

    final boolean G0(String str) {
        n();
        if (l7.c.a(a()).a(str) == 0) {
            return true;
        }
        k().G().b("Permission not granted", str);
        return false;
    }

    final J I(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (w(str2) != 0) {
            k().H().b("Invalid conditional property event name", g().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleG = G(str, str2, bundle2, com.google.android.gms.common.util.f.a("_o"), true);
        if (z10) {
            bundleG = F(bundleG, str);
        }
        C3445p.k(bundleG);
        return new J(str2, new F(bundleG), str3, j10);
    }

    public final int I0() {
        if (this.f35151h == null) {
            this.f35151h = Integer.valueOf(C2337f.f().a(a()) / 1000);
        }
        return this.f35151h.intValue();
    }

    public final URL L(long j10, String str, String str2, long j11, String str3) {
        try {
            C3445p.e(str2);
            C3445p.e(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j10), Integer.valueOf(I0())), str2, str, Long.valueOf(j11));
            if (str.equals(c().V())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e10) {
            e = e10;
            k().H().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            k().H().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    final void N(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            k().M().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    final void O(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                j().P(bundle, str, bundle2.get(str));
            }
        }
    }

    final void P(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            k().N().c("Not putting event parameter. Invalid value type. name, type", g().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    final long P0() {
        n();
        if (!E0(this.f35457a.D().H())) {
            return 0L;
        }
        long j10 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : z0() < K.f34978g0.a(null).intValue() ? 16L : 0L;
        if (!G0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !X0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    public final void Q(com.google.android.gms.internal.measurement.U0 u02, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f35457a.k().M().b("Error returning int value to wrapper", e10);
        }
    }

    public final long Q0() {
        long andIncrement;
        long j10;
        if (this.f35147d.get() != 0) {
            synchronized (this.f35147d) {
                this.f35147d.compareAndSet(-1L, 1L);
                andIncrement = this.f35147d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f35147d) {
            long jNextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
            int i10 = this.f35148e + 1;
            this.f35148e = i10;
            j10 = jNextLong + i10;
        }
        return j10;
    }

    public final void R(com.google.android.gms.internal.measurement.U0 u02, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f35457a.k().M().b("Error returning long value to wrapper", e10);
        }
    }

    final AbstractC4060a R0() {
        if (this.f35149f == null) {
            this.f35149f = AbstractC4060a.a(a());
        }
        return this.f35149f;
    }

    public final void S(com.google.android.gms.internal.measurement.U0 u02, Bundle bundle) {
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f35457a.k().M().b("Error returning bundle value to wrapper", e10);
        }
    }

    final String S0() {
        byte[] bArr = new byte[16];
        U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(com.google.android.gms.internal.measurement.U0 u02, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f35457a.k().M().b("Error returning string value to wrapper", e10);
        }
    }

    public final void U(com.google.android.gms.internal.measurement.U0 u02, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f35457a.k().M().b("Error returning bundle list to wrapper", e10);
        }
    }

    final SecureRandom U0() {
        n();
        if (this.f35146c == null) {
            this.f35146c = new SecureRandom();
        }
        return this.f35146c;
    }

    public final void V(com.google.android.gms.internal.measurement.U0 u02, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f35457a.k().M().b("Error returning boolean value to wrapper", e10);
        }
    }

    final boolean V0() {
        n();
        return P0() == 1;
    }

    public final void W(com.google.android.gms.internal.measurement.U0 u02, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f35457a.k().M().b("Error returning byte array to wrapper", e10);
        }
    }

    public final boolean W0() throws ClassNotFoundException {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final void X(C2780k2 c2780k2, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(c2780k2.f35423d.keySet())) {
            if (J0(str) && (i11 = i11 + 1) > i10) {
                k().I().c("Event can't contain more than " + i10 + " params", g().c(c2780k2.f35420a), g().a(c2780k2.f35423d));
                w0(c2780k2.f35423d, 5);
                c2780k2.f35423d.remove(str);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    final void c0(Parcelable[] parcelableArr, int i10) {
        C3445p.k(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (J0(str) && !o0(str, v7.G.f51509d) && (i11 = i11 + 1) > i10) {
                    k().I().c("Param can't contain more than " + i10 + " item-scoped custom parameters", g().f(str), g().a(bundle));
                    w0(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean d0(int i10, boolean z10) {
        Boolean boolD0 = this.f35457a.N().d0();
        if (I0() < i10 / 1000) {
            return (boolD0 == null || boolD0.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean j0(String str, double d10) {
        try {
            SharedPreferences.Editor editorEdit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d10));
            return editorEdit.commit();
        } catch (RuntimeException e10) {
            k().H().b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    final boolean k0(String str, int i10, String str2) {
        if (str2 == null) {
            k().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        k().I().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    final boolean l0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (O0(str)) {
                return true;
            }
            if (this.f35457a.u()) {
                k().I().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2759h2.w(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f35457a.u()) {
                k().I().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (O0(str2)) {
            return true;
        }
        k().I().b("Invalid admob_app_id. Analytics disabled.", C2759h2.w(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    final boolean m0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i10) {
                k().N().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2816p3
    protected final void p() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                k().M().a("Utils falling back to Random for random id");
            }
        }
        this.f35147d.set(jNextLong);
    }

    final boolean p0(String str, String[] strArr, String str2) {
        return q0(str, strArr, null, str2);
    }

    final boolean q0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            k().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        C3445p.k(str2);
        for (String str3 : f35144i) {
            if (str2.startsWith(str3)) {
                k().I().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !o0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && o0(str2, strArr2)) {
            return true;
        }
        k().I().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final int s0(String str) {
        if (!x0("user property", str)) {
            return 6;
        }
        if (p0("user property", v7.J.f51514a, str)) {
            return !k0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final Object t0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return J(c().A(null, false), obj, true, true, null);
        }
        return J(H0(str) ? c().A(null, false) : c().s(null, false), obj, false, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2816p3
    protected final boolean u() {
        return true;
    }

    public final int v(int i10) {
        return C2337f.f().h(a(), 12451000);
    }

    final int w(String str) {
        if (!x0("event", str)) {
            return 2;
        }
        if (q0("event", v7.H.f51510a, v7.H.f51511b, str)) {
            return !k0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int x(String str, Object obj) {
        return "_ldl".equals(str) ? m0("user property referrer", str, N0(str), obj) : m0("user property", str, N0(str), obj) ? 0 : 7;
    }

    final boolean x0(String str, String str2) {
        if (str2 == null) {
            k().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            k().I().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            k().I().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                k().I().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }
}
