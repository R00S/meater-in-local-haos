package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zan();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17946f;

    /* renamed from: g */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f17947g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final ArrayList<zal> f17948h = null;

    /* renamed from: i */
    @SafeParcelable.Field
    private final String f17949i;

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.f17946f = i2;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = new HashMap<>();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zal zalVar = arrayList.get(i3);
            String str2 = zalVar.f17951g;
            HashMap map2 = new HashMap();
            int size2 = zalVar.f17952h.size();
            for (int i4 = 0; i4 < size2; i4++) {
                zam zamVar = zalVar.f17952h.get(i4);
                map2.put(zamVar.f17954g, zamVar.f17955h);
            }
            map.put(str2, map2);
        }
        this.f17947g = map;
        this.f17949i = (String) Preconditions.m14372k(str);
        m14573y();
    }

    /* renamed from: W */
    public final Map<String, FastJsonResponse.Field<?, ?>> m14572W(String str) {
        return this.f17947g.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f17947g.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f17947g.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17946f);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f17947g.keySet()) {
            arrayList.add(new zal(str, this.f17947g.get(str)));
        }
        SafeParcelWriter.m14490y(parcel, 2, arrayList, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f17949i, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final void m14573y() {
        Iterator<String> it = this.f17947g.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f17947g.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).m14563M0(this);
            }
        }
    }

    /* renamed from: z */
    public final String m14574z() {
        return this.f17949i;
    }
}
