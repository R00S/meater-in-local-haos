package A7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0865t extends AbstractC3492a {
    public static final Parcelable.Creator<C0865t> CREATOR = new O();

    /* renamed from: F, reason: collision with root package name */
    private static final long f1014F = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: G, reason: collision with root package name */
    private static final Random f1015G = new SecureRandom();

    /* renamed from: B, reason: collision with root package name */
    private final Uri f1016B;

    /* renamed from: C, reason: collision with root package name */
    private final Bundle f1017C;

    /* renamed from: D, reason: collision with root package name */
    private byte[] f1018D;

    /* renamed from: E, reason: collision with root package name */
    private long f1019E;

    private C0865t(Uri uri) {
        this(uri, new Bundle(), null, f1014F);
    }

    public static C0865t C1(Uri uri) {
        C3445p.l(uri, "uri must not be null");
        return new C0865t(uri);
    }

    private static Uri D1(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        return new Uri.Builder().scheme("wear").path(str).build();
    }

    public static C0865t f0(String str) {
        C3445p.l(str, "path must not be null");
        return C1(D1(str));
    }

    public String B1(boolean z10) {
        StringBuilder sb2 = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f1018D;
        sb2.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb2.append(", numAssets=" + this.f1017C.size());
        sb2.append(", uri=".concat(String.valueOf(this.f1016B)));
        sb2.append(", syncDeadline=" + this.f1019E);
        if (!z10) {
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : this.f1017C.keySet()) {
            sb2.append("\n    " + str + ": " + String.valueOf(this.f1017C.getParcelable(str)));
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    public C0865t G0(String str, Asset asset) {
        C3445p.k(str);
        C3445p.k(asset);
        this.f1017C.putParcelable(str, asset);
        return this;
    }

    public C0865t O0(byte[] bArr) {
        this.f1018D = bArr;
        return this;
    }

    public C0865t U0() {
        this.f1019E = 0L;
        return this;
    }

    public byte[] f() {
        return this.f1018D;
    }

    public Map<String, Asset> h0() {
        HashMap map = new HashMap();
        for (String str : this.f1017C.keySet()) {
            map.put(str, (Asset) this.f1017C.getParcelable(str));
        }
        return Collections.unmodifiableMap(map);
    }

    public Uri r0() {
        return this.f1016B;
    }

    public String toString() {
        return B1(Log.isLoggable("DataMap", 3));
    }

    public boolean v0() {
        return this.f1019E == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C3445p.l(parcel, "dest must not be null");
        int iA = C3493b.a(parcel);
        C3493b.p(parcel, 2, r0(), i10, false);
        C3493b.e(parcel, 4, this.f1017C, false);
        C3493b.g(parcel, 5, f(), false);
        C3493b.n(parcel, 6, this.f1019E);
        C3493b.b(parcel, iA);
    }

    C0865t(Uri uri, Bundle bundle, byte[] bArr, long j10) {
        this.f1016B = uri;
        this.f1017C = bundle;
        bundle.setClassLoader((ClassLoader) C3445p.k(DataItemAssetParcelable.class.getClassLoader()));
        this.f1018D = bArr;
        this.f1019E = j10;
    }
}
