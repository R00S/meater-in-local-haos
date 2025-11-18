package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.notification.PullingContentService;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzn;
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
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzkk extends AbstractC7799q4 {

    /* renamed from: c */
    private static final String[] f29395c = {"firebase_", "google_", "ga_"};

    /* renamed from: d */
    private SecureRandom f29396d;

    /* renamed from: e */
    private final AtomicLong f29397e;

    /* renamed from: f */
    private int f29398f;

    /* renamed from: g */
    private Integer f29399g;

    zzkk(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29399g = null;
        this.f29397e = new AtomicLong(0L);
    }

    /* renamed from: A0 */
    static MessageDigest m23495A0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
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

    /* renamed from: B */
    public static Bundle m23496B(List<zzkj> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzkj zzkjVar : list) {
            String str = zzkjVar.f29392k;
            if (str != null) {
                bundle.putString(zzkjVar.f29388g, str);
            } else {
                Long l = zzkjVar.f29390i;
                if (l != null) {
                    bundle.putLong(zzkjVar.f29388g, l.longValue());
                } else {
                    Double d2 = zzkjVar.f29394m;
                    if (d2 != null) {
                        bundle.putDouble(zzkjVar.f29388g, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: D */
    private static Object m23497D(int i2, Object obj, boolean z) {
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
            return m23498F(String.valueOf(obj), i2, z);
        }
        return null;
    }

    /* renamed from: F */
    public static String m23498F(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    /* renamed from: K */
    private static void m23499K(Bundle bundle, Object obj) {
        Preconditions.m14372k(bundle);
        if (obj != null) {
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", String.valueOf(obj).length());
            }
        }
    }

    /* renamed from: U */
    static boolean m23500U(Context context, boolean z) {
        Preconditions.m14372k(context);
        return Build.VERSION.SDK_INT >= 24 ? m23512m0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : m23512m0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: V */
    static boolean m23501V(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: W */
    private static boolean m23502W(Bundle bundle, int i2) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    /* renamed from: X */
    static boolean m23503X(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: Y */
    static boolean m23504Y(String str) {
        Preconditions.m14368g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: c0 */
    private final boolean m23505c0(String str, String str2, int i2, Object obj, boolean z) throws IllegalStateException {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if ((obj instanceof Bundle) && z) {
                    return true;
                }
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            mo22836h().m23142M().m23149c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof ArrayList) || !z) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (!(obj2 instanceof Bundle)) {
                        mo22836h().m23142M().m23149c("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i2) {
                mo22836h().m23142M().m23150d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: d0 */
    static boolean m23506d0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
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

    /* renamed from: f0 */
    static boolean m23507f0(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* renamed from: g0 */
    static byte[] m23508g0(Parcelable parcelable) {
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

    /* renamed from: h0 */
    static Bundle[] m23509h0(Object obj) {
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

    /* renamed from: k0 */
    public static Bundle m23510k0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: l0 */
    public static ArrayList<Bundle> m23511l0(List<zzv> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzv zzvVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, zzvVar.f29422f);
            bundle.putString("origin", zzvVar.f29423g);
            bundle.putLong("creation_timestamp", zzvVar.f29425i);
            bundle.putString("name", zzvVar.f29424h.f29388g);
            zzgt.m23250b(bundle, zzvVar.f29424h.m23494y());
            bundle.putBoolean("active", zzvVar.f29426j);
            String str = zzvVar.f29427k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzan zzanVar = zzvVar.f29428l;
            if (zzanVar != null) {
                bundle.putString("timed_out_event_name", zzanVar.f29077f);
                zzam zzamVar = zzvVar.f29428l.f29078g;
                if (zzamVar != null) {
                    bundle.putBundle("timed_out_event_params", zzamVar.m22960Y());
                }
            }
            bundle.putLong("trigger_timeout", zzvVar.f29429m);
            zzan zzanVar2 = zzvVar.f29430n;
            if (zzanVar2 != null) {
                bundle.putString("triggered_event_name", zzanVar2.f29077f);
                zzam zzamVar2 = zzvVar.f29430n.f29078g;
                if (zzamVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzamVar2.m22960Y());
                }
            }
            bundle.putLong("triggered_timestamp", zzvVar.f29424h.f29389h);
            bundle.putLong("time_to_live", zzvVar.f29431o);
            zzan zzanVar3 = zzvVar.f29432p;
            if (zzanVar3 != null) {
                bundle.putString("expired_event_name", zzanVar3.f29077f);
                zzam zzamVar3 = zzvVar.f29432p.f29078g;
                if (zzamVar3 != null) {
                    bundle.putBundle("expired_event_params", zzamVar3.m22960Y());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: m0 */
    private static boolean m23512m0(Context context, String str) {
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

    @VisibleForTesting
    /* renamed from: q0 */
    private final boolean m23513q0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM14671e = Wrappers.m14674a(context).m14671e(str, 64);
            if (packageInfoM14671e == null || (signatureArr = packageInfoM14671e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            mo22836h().m23137H().m23148b("Package name not found", e2);
            return true;
        } catch (CertificateException e3) {
            mo22836h().m23137H().m23148b("Error obtaining certificate", e3);
            return true;
        }
    }

    /* renamed from: t0 */
    static boolean m23514t0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: u0 */
    static boolean m23515u0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: v */
    public static long m23516v(long j2, long j3) {
        return (j2 + (j3 * 60000)) / PullingContentService.UPDATES_INTERVAL;
    }

    @VisibleForTesting
    /* renamed from: x */
    static long m23517x(byte[] bArr) {
        Preconditions.m14372k(bArr);
        int i2 = 0;
        Preconditions.m14375n(bArr.length > 0);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (bArr[length] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    @VisibleForTesting
    /* renamed from: x0 */
    private static boolean m23518x0(String str) {
        Preconditions.m14372k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: y0 */
    private static int m23519y0(String str) {
        return "_ldl".equals(str) ? RecyclerView.AbstractC0599l.FLAG_MOVED : "_id".equals(str) ? 256 : 36;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189 A[PHI: r14
      0x0189: PHI (r14v2 int) = (r14v1 int), (r14v3 int) binds: [B:83:0x014c, B:85:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.os.Bundle m23520A(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkk.m23520A(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: B0 */
    public final int m23521B0() {
        if (this.f29399g == null) {
            this.f29399g = Integer.valueOf(GoogleApiAvailabilityLight.m13823h().m13825b(mo22834f()) / 1000);
        }
        return this.f29399g.intValue();
    }

    /* renamed from: C */
    final zzan m23522C(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m23542i0(str2) != 0) {
            mo22836h().m23137H().m23148b("Invalid conditional property event name", mo22838k().m23120B(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        return new zzan(str2, new zzam(m23554z(m23520A(str, str2, bundle2, CollectionUtils.m14611b("_o"), false, false))), str3, j2);
    }

    /* renamed from: C0 */
    final String m23523C0() {
        byte[] bArr = new byte[16];
        m23555z0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: D0 */
    public final boolean m23524D0() throws ClassNotFoundException {
        try {
            mo22834f().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: E */
    final Object m23525E(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m23497D(256, obj, true);
        }
        return m23497D(m23515u0(str) ? 256 : 100, obj, false);
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    public final URL m23526H(long j2, String str, String str2, long j3) {
        try {
            Preconditions.m14368g(str2);
            Preconditions.m14368g(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j2), Integer.valueOf(m23521B0())), str2, str, Long.valueOf(j3));
            if (str.equals(mo22841n().m23582W())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            mo22836h().m23137H().m23148b("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    /* renamed from: I */
    public final void m23527I(int i2, String str, String str2, int i3) {
        m23537T(null, i2, str, str2, i3);
    }

    /* renamed from: J */
    final void m23528J(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            mo22836h().m23140K().m23148b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    /* renamed from: L */
    final void m23529L(Bundle bundle, String str, Object obj) throws IllegalStateException {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str != null) {
            mo22836h().m23142M().m23149c("Not putting event parameter. Invalid value type. name, type", mo22838k().m23119A(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: M */
    public final void m23530M(zzn zznVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28874a.mo22836h().m23140K().m23148b("Error returning int value to wrapper", e2);
        }
    }

    /* renamed from: N */
    public final void m23531N(zzn zznVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28874a.mo22836h().m23140K().m23148b("Error returning long value to wrapper", e2);
        }
    }

    /* renamed from: O */
    public final void m23532O(zzn zznVar, Bundle bundle) {
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28874a.mo22836h().m23140K().m23148b("Error returning bundle value to wrapper", e2);
        }
    }

    /* renamed from: P */
    public final void m23533P(zzn zznVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28874a.mo22836h().m23140K().m23148b("Error returning string value to wrapper", e2);
        }
    }

    /* renamed from: Q */
    public final void m23534Q(zzn zznVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28874a.mo22836h().m23140K().m23148b("Error returning bundle list to wrapper", e2);
        }
    }

    /* renamed from: R */
    public final void m23535R(zzn zznVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28874a.mo22836h().m23140K().m23148b("Error returning boolean value to wrapper", e2);
        }
    }

    /* renamed from: S */
    public final void m23536S(zzn zznVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28874a.mo22836h().m23140K().m23148b("Error returning byte array to wrapper", e2);
        }
    }

    /* renamed from: T */
    final void m23537T(String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        m23502W(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        this.f28874a.mo22832G();
        this.f28874a.m23216H().m23281S("auto", "_err", bundle);
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: Z */
    final boolean m23538Z(String str, double d2) {
        try {
            SharedPreferences.Editor editorEdit = mo22834f().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString(DeepLinkIntentReceiver.DEEP_LINK, str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return editorEdit.commit();
        } catch (Exception e2) {
            mo22836h().m23137H().m23148b("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    /* renamed from: a0 */
    final boolean m23539a0(String str, int i2, String str2) throws IllegalStateException {
        if (str2 == null) {
            mo22836h().m23139J().m23148b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        mo22836h().m23139J().m23150d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    /* renamed from: b0 */
    final boolean m23540b0(String str, String str2) throws IllegalStateException {
        if (str2 == null) {
            mo22836h().m23139J().m23148b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo22836h().m23139J().m23148b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            mo22836h().m23139J().m23149c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo22836h().m23139J().m23149c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    /* renamed from: e0 */
    final boolean m23541e0(String str, String[] strArr, String str2) throws IllegalStateException {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo22836h().m23139J().m23148b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.m14372k(str2);
        String[] strArr2 = f29395c;
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr2[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            mo22836h().m23139J().m23149c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Preconditions.m14372k(strArr);
            int length2 = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z2 = false;
                    break;
                }
                if (m23514t0(str2, strArr[i3])) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                mo22836h().m23139J().m23149c("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    /* renamed from: i0 */
    final int m23542i0(String str) {
        if (!m23544n0("event", str)) {
            return 2;
        }
        if (m23541e0("event", zzgw.f29309a, str)) {
            return !m23539a0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    /* renamed from: j0 */
    final int m23543j0(String str, Object obj) {
        return "_ldl".equals(str) ? m23505c0("user property referrer", str, m23519y0(str), obj, false) : m23505c0("user property", str, m23519y0(str), obj, false) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7807r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    /* renamed from: n0 */
    final boolean m23544n0(String str, String str2) throws IllegalStateException {
        if (str2 == null) {
            mo22836h().m23139J().m23148b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo22836h().m23139J().m23148b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            mo22836h().m23139J().m23149c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo22836h().m23139J().m23149c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: o */
    protected final void mo22806o() {
        mo22792d();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                mo22836h().m23140K().m23147a("Utils falling back to Random for random id");
            }
        }
        this.f29397e.set(jNextLong);
    }

    /* renamed from: o0 */
    final int m23545o0(String str) {
        if (!m23544n0("user property", str)) {
            return 6;
        }
        if (m23541e0("user property", zzgy.f29311a, str)) {
            return !m23539a0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* renamed from: p0 */
    final Object m23546p0(String str, Object obj) {
        return "_ldl".equals(str) ? m23497D(m23519y0(str), obj, true) : m23497D(m23519y0(str), obj, false);
    }

    /* renamed from: r0 */
    final boolean m23547r0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m23518x0(str)) {
                return true;
            }
            if (this.f28874a.m23220L()) {
                mo22836h().m23139J().m23148b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzet.m23131x(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f28874a.m23220L()) {
                mo22836h().m23139J().m23147a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (m23518x0(str2)) {
            return true;
        }
        mo22836h().m23139J().m23148b("Invalid admob_app_id. Analytics disabled.", zzet.m23131x(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: s */
    protected final boolean mo22810s() {
        return true;
    }

    /* renamed from: s0 */
    final boolean m23548s0(String str) {
        mo22792d();
        if (Wrappers.m14674a(mo22834f()).m14667a(str) == 0) {
            return true;
        }
        mo22836h().m23144O().m23148b("Permission not granted", str);
        return false;
    }

    /* renamed from: u */
    public final int m23549u(int i2) {
        return GoogleApiAvailabilityLight.m13823h().mo13813j(mo22834f(), 12451000);
    }

    /* renamed from: v0 */
    final boolean m23550v0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strM23581V = mo22841n().m23581V();
        mo22832G();
        return strM23581V.equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:17:0x0072). Please report as a decompilation issue!!! */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final long m23551w(android.content.Context r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            r6.mo22792d()
            com.google.android.gms.common.internal.Preconditions.m14372k(r7)
            com.google.android.gms.common.internal.Preconditions.m14368g(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = m23495A0()
            r2 = -1
            r4 = 0
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.zzet r7 = r6.mo22836h()
            com.google.android.gms.measurement.internal.zzev r7 = r7.m23137H()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.m23147a(r8)
            goto L73
        L25:
            if (r0 == 0) goto L72
            boolean r8 = r6.m23513q0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r8 != 0) goto L72
            com.google.android.gms.common.wrappers.PackageManagerWrapper r7 = com.google.android.gms.common.wrappers.Wrappers.m14674a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.Context r8 = r6.mo22834f()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.m14671e(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r7 == 0) goto L56
            int r8 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r8 <= 0) goto L56
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            long r2 = m23517x(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L73
        L56:
            com.google.android.gms.measurement.internal.zzet r7 = r6.mo22836h()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            com.google.android.gms.measurement.internal.zzev r7 = r7.m23140K()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r8 = "Could not get signatures"
            r7.m23147a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L73
        L64:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzet r8 = r6.mo22836h()
            com.google.android.gms.measurement.internal.zzev r8 = r8.m23137H()
            java.lang.String r0 = "Package name not found"
            r8.m23148b(r0, r7)
        L72:
            r2 = r4
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkk.m23551w(android.content.Context, java.lang.String):long");
    }

    /* renamed from: w0 */
    public final long m23552w0() {
        long andIncrement;
        long j2;
        if (this.f29397e.get() != 0) {
            synchronized (this.f29397e) {
                this.f29397e.compareAndSet(-1L, 1L);
                andIncrement = this.f29397e.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f29397e) {
            long jNextLong = new Random(System.nanoTime() ^ mo22837j().mo14608a()).nextLong();
            int i2 = this.f29398f + 1;
            this.f29398f = i2;
            j2 = jNextLong + i2;
        }
        return j2;
    }

    /* renamed from: y */
    final Bundle m23553y(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
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
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("term", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("content", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("aclid", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("cp1", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            mo22836h().m23140K().m23148b("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* renamed from: z */
    final Bundle m23554z(Bundle bundle) throws IllegalStateException {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM23525E = m23525E(str, bundle.get(str));
                if (objM23525E == null) {
                    mo22836h().m23142M().m23148b("Param value can't be null", mo22838k().m23119A(str));
                } else {
                    m23529L(bundle2, str, objM23525E);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: z0 */
    final SecureRandom m23555z0() {
        mo22792d();
        if (this.f29396d == null) {
            this.f29396d = new SecureRandom();
        }
        return this.f29396d;
    }
}
