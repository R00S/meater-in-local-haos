package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzvv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f27230f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final long f27231g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f27232h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final String f27233i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final String f27234j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final Bundle f27235k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final boolean f27236l;

    /* renamed from: m */
    @SafeParcelable.Field
    public long f27237m;

    @SafeParcelable.Constructor
    zzvv(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j3) {
        this.f27230f = str;
        this.f27231g = j2;
        this.f27232h = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f27233i = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f27234j = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.f27235k = bundle == null ? new Bundle() : bundle;
        this.f27236l = z;
        this.f27237m = j3;
    }

    /* renamed from: y */
    public static zzvv m20678y(String str) {
        return m20679z(Uri.parse(str));
    }

    /* renamed from: z */
    public static zzvv m20679z(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzbad.m17353i(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j2 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            zzk.zzli();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzvv(queryParameter, j2, host, str, str2, bundle, zEquals, 0L);
        } catch (NullPointerException | NumberFormatException e2) {
            zzbad.m17348d("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f27230f, false);
        SafeParcelWriter.m14481p(parcel, 3, this.f27231g);
        SafeParcelWriter.m14486u(parcel, 4, this.f27232h, false);
        SafeParcelWriter.m14486u(parcel, 5, this.f27233i, false);
        SafeParcelWriter.m14486u(parcel, 6, this.f27234j, false);
        SafeParcelWriter.m14470e(parcel, 7, this.f27235k, false);
        SafeParcelWriter.m14468c(parcel, 8, this.f27236l);
        SafeParcelWriter.m14481p(parcel, 9, this.f27237m);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
