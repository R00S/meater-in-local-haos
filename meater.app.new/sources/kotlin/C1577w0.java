package kotlin;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ParcelableSnapshotMutableState.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LO/w0;", "T", "LO/k1;", "Landroid/os/Parcelable;", "value", "LO/l1;", "policy", "<init>", "(Ljava/lang/Object;LO/l1;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Loa/F;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "E", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: O.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1577w0<T> extends MutableState<T> implements Parcelable {
    public static final Parcelable.Creator<C1577w0<Object>> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableState.android.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"O/w0$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "LO/w0;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "b", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)LO/w0;", "a", "(Landroid/os/Parcel;)LO/w0;", "", "size", "", "c", "(I)[LO/w0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.w0$a */
    public static final class a implements Parcelable.ClassLoaderCreator<C1577w0<Object>> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1577w0<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1577w0<Object> createFromParcel(Parcel parcel, ClassLoader loader) {
            l1 l1VarI;
            if (loader == null) {
                loader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(loader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                l1VarI = m1.i();
            } else if (i10 == 1) {
                l1VarI = m1.o();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                l1VarI = m1.l();
            }
            return new C1577w0<>(value, l1VarI);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1577w0<Object>[] newArray(int size) {
            return new C1577w0[size];
        }
    }

    public C1577w0(T t10, l1<T> l1Var) {
        super(t10, l1Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i10;
        parcel.writeValue(getValue());
        l1<T> l1VarC = c();
        if (C3862t.b(l1VarC, m1.i())) {
            i10 = 0;
        } else if (C3862t.b(l1VarC, m1.o())) {
            i10 = 1;
        } else {
            if (!C3862t.b(l1VarC, m1.l())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}
