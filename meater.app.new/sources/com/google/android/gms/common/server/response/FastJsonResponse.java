package com.google.android.gms.common.server.response;

import android.os.Parcel;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        /* renamed from: c */
        I mo14546c(O o);
    }

    /* renamed from: f */
    private static void m14550f(StringBuilder sb, Field field, Object obj) {
        int i2 = field.f17909g;
        if (i2 == 11) {
            sb.append(field.f17915m.cast(obj).toString());
        } else {
            if (i2 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.m14634a((String) obj));
            sb.append("\"");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    protected static <O, I> I m14551g(Field<I, O> field, Object obj) {
        return ((Field) field).f17918p != null ? field.m14565c(obj) : obj;
    }

    @KeepForSdk
    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo13610a();

    @KeepForSdk
    /* renamed from: b */
    protected Object mo13611b(Field field) {
        String str = field.f17913k;
        if (field.f17915m == null) {
            return mo14552c(str);
        }
        Preconditions.m14377p(mo14552c(str) == null, "Concrete field shouldn't be value object: %s", field.f17913k);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(strSubstring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @KeepForSdk
    /* renamed from: c */
    protected abstract Object mo14552c(String str);

    @KeepForSdk
    /* renamed from: d */
    protected boolean mo13612d(Field field) {
        if (field.f17911i != 11) {
            return mo14553e(field.f17913k);
        }
        if (field.f17912j) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    /* renamed from: e */
    protected abstract boolean mo14553e(String str);

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> mapMo13610a = mo13610a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapMo13610a.keySet()) {
            Field<?, ?> field = mapMo13610a.get(str);
            if (mo13612d(field)) {
                Object objM14551g = m14551g(field, mo13611b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objM14551g != null) {
                    switch (field.f17911i) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.m14602a((byte[]) objM14551g));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.m14603b((byte[]) objM14551g));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.m14635a(sb, (HashMap) objM14551g);
                            break;
                        default:
                            if (field.f17910h) {
                                ArrayList arrayList = (ArrayList) objM14551g;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i2);
                                    if (obj != null) {
                                        m14550f(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                m14550f(sb, field, objM14551g);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    @VisibleForTesting
    @SafeParcelable.Class
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zai CREATOR = new zai();

        /* renamed from: f */
        @SafeParcelable.VersionField
        private final int f17908f;

        /* renamed from: g */
        @SafeParcelable.Field
        protected final int f17909g;

        /* renamed from: h */
        @SafeParcelable.Field
        protected final boolean f17910h;

        /* renamed from: i */
        @SafeParcelable.Field
        protected final int f17911i;

        /* renamed from: j */
        @SafeParcelable.Field
        protected final boolean f17912j;

        /* renamed from: k */
        @SafeParcelable.Field
        protected final String f17913k;

        /* renamed from: l */
        @SafeParcelable.Field
        protected final int f17914l;

        /* renamed from: m */
        protected final Class<? extends FastJsonResponse> f17915m;

        /* renamed from: n */
        @SafeParcelable.Field
        private final String f17916n;

        /* renamed from: o */
        private zak f17917o;

        /* renamed from: p */
        @SafeParcelable.Field
        private FieldConverter<I, O> f17918p;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) zaa zaaVar) {
            this.f17908f = i2;
            this.f17909g = i3;
            this.f17910h = z;
            this.f17911i = i4;
            this.f17912j = z2;
            this.f17913k = str;
            this.f17914l = i5;
            if (str2 == null) {
                this.f17915m = null;
                this.f17916n = null;
            } else {
                this.f17915m = SafeParcelResponse.class;
                this.f17916n = str2;
            }
            if (zaaVar == null) {
                this.f17918p = null;
            } else {
                this.f17918p = (FieldConverter<I, O>) zaaVar.m14549z();
            }
        }

        @KeepForSdk
        /* renamed from: W */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m14555W(String str, int i2, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i2, cls, null);
        }

        /* renamed from: X0 */
        private final String m14556X0() {
            String str = this.f17916n;
            if (str == null) {
                return null;
            }
            return str;
        }

        @VisibleForTesting
        @KeepForSdk
        /* renamed from: Y */
        public static Field<Integer, Integer> m14557Y(String str, int i2) {
            return new Field<>(0, false, 0, false, str, i2, null, null);
        }

        @KeepForSdk
        /* renamed from: e0 */
        public static Field<String, String> m14558e0(String str, int i2) {
            return new Field<>(7, false, 7, false, str, i2, null, null);
        }

        @KeepForSdk
        /* renamed from: i0 */
        public static Field<ArrayList<String>, ArrayList<String>> m14559i0(String str, int i2) {
            return new Field<>(7, true, 7, true, str, i2, null, null);
        }

        /* renamed from: q1 */
        private final zaa m14560q1() {
            FieldConverter<I, O> fieldConverter = this.f17918p;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.m14548y(fieldConverter);
        }

        @VisibleForTesting
        @KeepForSdk
        /* renamed from: y */
        public static Field<byte[], byte[]> m14561y(String str, int i2) {
            return new Field<>(8, false, 8, false, str, i2, null, null);
        }

        @KeepForSdk
        /* renamed from: z */
        public static <T extends FastJsonResponse> Field<T, T> m14562z(String str, int i2, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i2, cls, null);
        }

        /* renamed from: M0 */
        public final void m14563M0(zak zakVar) {
            this.f17917o = zakVar;
        }

        /* renamed from: a1 */
        public final boolean m14564a1() {
            return this.f17918p != null;
        }

        /* renamed from: c */
        public final I m14565c(O o) {
            return this.f17918p.mo14546c(o);
        }

        @KeepForSdk
        /* renamed from: p0 */
        public int m14566p0() {
            return this.f17914l;
        }

        /* renamed from: r1 */
        public final Map<String, Field<?, ?>> m14567r1() {
            Preconditions.m14372k(this.f17916n);
            Preconditions.m14372k(this.f17917o);
            return this.f17917o.m14572W(this.f17916n);
        }

        public String toString() {
            Objects.ToStringHelper toStringHelperM14358a = Objects.m14357c(this).m14358a(RoomInstalled.VERSION_CODE, Integer.valueOf(this.f17908f)).m14358a("typeIn", Integer.valueOf(this.f17909g)).m14358a("typeInArray", Boolean.valueOf(this.f17910h)).m14358a("typeOut", Integer.valueOf(this.f17911i)).m14358a("typeOutArray", Boolean.valueOf(this.f17912j)).m14358a("outputFieldName", this.f17913k).m14358a("safeParcelFieldId", Integer.valueOf(this.f17914l)).m14358a("concreteTypeName", m14556X0());
            Class<? extends FastJsonResponse> cls = this.f17915m;
            if (cls != null) {
                toStringHelperM14358a.m14358a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f17918p;
            if (fieldConverter != null) {
                toStringHelperM14358a.m14358a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperM14358a.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            int iM14466a = SafeParcelWriter.m14466a(parcel);
            SafeParcelWriter.m14477l(parcel, 1, this.f17908f);
            SafeParcelWriter.m14477l(parcel, 2, this.f17909g);
            SafeParcelWriter.m14468c(parcel, 3, this.f17910h);
            SafeParcelWriter.m14477l(parcel, 4, this.f17911i);
            SafeParcelWriter.m14468c(parcel, 5, this.f17912j);
            SafeParcelWriter.m14486u(parcel, 6, this.f17913k, false);
            SafeParcelWriter.m14477l(parcel, 7, m14566p0());
            SafeParcelWriter.m14486u(parcel, 8, m14556X0(), false);
            SafeParcelWriter.m14484s(parcel, 9, m14560q1(), i2, false);
            SafeParcelWriter.m14467b(parcel, iM14466a);
        }

        private Field(int i2, boolean z, int i3, boolean z2, String str, int i4, Class<? extends FastJsonResponse> cls, FieldConverter<I, O> fieldConverter) {
            this.f17908f = 1;
            this.f17909g = i2;
            this.f17910h = z;
            this.f17911i = i3;
            this.f17912j = z2;
            this.f17913k = str;
            this.f17914l = i4;
            this.f17915m = cls;
            if (cls == null) {
                this.f17916n = null;
            } else {
                this.f17916n = cls.getCanonicalName();
            }
            this.f17918p = fieldConverter;
        }
    }
}
