package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zac();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17899f;

    /* renamed from: g */
    private final HashMap<String, Integer> f17900g;

    /* renamed from: h */
    private final SparseArray<String> f17901h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final ArrayList<zaa> f17902i;

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<zaa> arrayList) {
        this.f17899f = i2;
        this.f17900g = new HashMap<>();
        this.f17901h = new SparseArray<>();
        this.f17902i = null;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            zaa zaaVar = arrayList.get(i3);
            i3++;
            zaa zaaVar2 = zaaVar;
            m14547y(zaaVar2.f17904g, zaaVar2.f17905h);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    /* renamed from: c */
    public final /* synthetic */ String mo14546c(Integer num) {
        String str = this.f17901h.get(num.intValue());
        return (str == null && this.f17900g.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17899f);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f17900g.keySet()) {
            arrayList.add(new zaa(str, this.f17900g.get(str).intValue()));
        }
        SafeParcelWriter.m14490y(parcel, 2, arrayList, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @KeepForSdk
    /* renamed from: y */
    public final StringToIntConverter m14547y(String str, int i2) {
        this.f17900g.put(str, Integer.valueOf(i2));
        this.f17901h.put(i2, str);
        return this;
    }

    @SafeParcelable.Class
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new zad();

        /* renamed from: f */
        @SafeParcelable.VersionField
        private final int f17903f;

        /* renamed from: g */
        @SafeParcelable.Field
        final String f17904g;

        /* renamed from: h */
        @SafeParcelable.Field
        final int f17905h;

        @SafeParcelable.Constructor
        zaa(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3) {
            this.f17903f = i2;
            this.f17904g = str;
            this.f17905h = i3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            int iM14466a = SafeParcelWriter.m14466a(parcel);
            SafeParcelWriter.m14477l(parcel, 1, this.f17903f);
            SafeParcelWriter.m14486u(parcel, 2, this.f17904g, false);
            SafeParcelWriter.m14477l(parcel, 3, this.f17905h);
            SafeParcelWriter.m14467b(parcel, iM14466a);
        }

        zaa(String str, int i2) {
            this.f17903f = 1;
            this.f17904g = str;
            this.f17905h = i2;
        }
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.f17899f = 1;
        this.f17900g = new HashMap<>();
        this.f17901h = new SparseArray<>();
        this.f17902i = null;
    }
}
