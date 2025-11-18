package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: f */
    private static final C0867a<String, FastJsonResponse.Field<?, ?>> f16935f;

    /* renamed from: g */
    @SafeParcelable.VersionField
    private final int f16936g;

    /* renamed from: h */
    @SafeParcelable.Field
    private List<String> f16937h;

    /* renamed from: i */
    @SafeParcelable.Field
    private List<String> f16938i;

    /* renamed from: j */
    @SafeParcelable.Field
    private List<String> f16939j;

    /* renamed from: k */
    @SafeParcelable.Field
    private List<String> f16940k;

    /* renamed from: l */
    @SafeParcelable.Field
    private List<String> f16941l;

    static {
        C0867a<String, FastJsonResponse.Field<?, ?>> c0867a = new C0867a<>();
        f16935f = c0867a;
        c0867a.put("registered", FastJsonResponse.Field.m14559i0("registered", 2));
        c0867a.put("in_progress", FastJsonResponse.Field.m14559i0("in_progress", 3));
        c0867a.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, FastJsonResponse.Field.m14559i0(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, 4));
        c0867a.put("failed", FastJsonResponse.Field.m14559i0("failed", 5));
        c0867a.put("escrowed", FastJsonResponse.Field.m14559i0("escrowed", 6));
    }

    public zzo() {
        this.f16936g = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo13610a() {
        return f16935f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    protected Object mo13611b(FastJsonResponse.Field field) {
        switch (field.m14566p0()) {
            case 1:
                return Integer.valueOf(this.f16936g);
            case 2:
                return this.f16937h;
            case 3:
                return this.f16938i;
            case 4:
                return this.f16939j;
            case 5:
                return this.f16940k;
            case 6:
                return this.f16941l;
            default:
                int iM14566p0 = field.m14566p0();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(iM14566p0);
                throw new IllegalStateException(sb.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    protected boolean mo13612d(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f16936g);
        SafeParcelWriter.m14488w(parcel, 2, this.f16937h, false);
        SafeParcelWriter.m14488w(parcel, 3, this.f16938i, false);
        SafeParcelWriter.m14488w(parcel, 4, this.f16939j, false);
        SafeParcelWriter.m14488w(parcel, 5, this.f16940k, false);
        SafeParcelWriter.m14488w(parcel, 6, this.f16941l, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) List<String> list, @SafeParcelable.Param(id = 3) List<String> list2, @SafeParcelable.Param(id = 4) List<String> list3, @SafeParcelable.Param(id = 5) List<String> list4, @SafeParcelable.Param(id = 6) List<String> list5) {
        this.f16936g = i2;
        this.f16937h = list;
        this.f16938i = list2;
        this.f16939j = list3;
        this.f16940k = list4;
        this.f16941l = list5;
    }
}
