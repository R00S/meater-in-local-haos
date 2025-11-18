package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzauy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzauy> CREATOR = new zzauz();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f22545f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f22546g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final boolean f22547h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final boolean f22548i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final List<String> f22549j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final boolean f22550k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final boolean f22551l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final List<String> f22552m;

    @SafeParcelable.Constructor
    public zzauy(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) List<String> list2) {
        this.f22545f = str;
        this.f22546g = str2;
        this.f22547h = z;
        this.f22548i = z2;
        this.f22549j = list;
        this.f22550k = z3;
        this.f22551l = z4;
        this.f22552m = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: y */
    public static zzauy m16981y(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzauy(jSONObject.optString("click_string", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optString("report_url", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzazc.m17261c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzazc.m17261c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f22545f, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f22546g, false);
        SafeParcelWriter.m14468c(parcel, 4, this.f22547h);
        SafeParcelWriter.m14468c(parcel, 5, this.f22548i);
        SafeParcelWriter.m14488w(parcel, 6, this.f22549j, false);
        SafeParcelWriter.m14468c(parcel, 7, this.f22550k);
        SafeParcelWriter.m14468c(parcel, 8, this.f22551l);
        SafeParcelWriter.m14488w(parcel, 9, this.f22552m, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
