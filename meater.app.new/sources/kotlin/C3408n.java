package kotlin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: NavBackStackEntryState.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010*\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)¨\u0006/"}, d2 = {"Lg3/n;", "Landroid/os/Parcelable;", "Lg3/m;", "entry", "<init>", "(Lg3/m;)V", "Landroid/os/Parcel;", "inParcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", "context", "Lg3/t;", "destination", "Landroidx/lifecycle/m$b;", "hostLifecycleState", "Lg3/q;", "viewModel", "c", "(Landroid/content/Context;Lg3/t;Landroidx/lifecycle/m$b;Lg3/q;)Lg3/m;", "", "describeContents", "()I", "parcel", "i", "Loa/F;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "B", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "C", "I", "a", "destinationId", "Landroid/os/Bundle;", "D", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", "E", "getSavedState", "savedState", "F", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: g3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3408n implements Parcelable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Bundle args;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;
    public static final Parcelable.Creator<C3408n> CREATOR = new a();

    /* compiled from: NavBackStackEntryState.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g3/n$a", "Landroid/os/Parcelable$Creator;", "Lg3/n;", "Landroid/os/Parcel;", "inParcel", "a", "(Landroid/os/Parcel;)Lg3/n;", "", "size", "", "b", "(I)[Lg3/n;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.n$a */
    public static final class a implements Parcelable.Creator<C3408n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3408n createFromParcel(Parcel inParcel) {
            C3862t.g(inParcel, "inParcel");
            return new C3408n(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3408n[] newArray(int size) {
            return new C3408n[size];
        }
    }

    public C3408n(C3407m entry) {
        C3862t.g(entry, "entry");
        this.id = entry.getId();
        this.destinationId = entry.getDestination().getId();
        this.args = entry.d();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.j(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final C3407m c(Context context, C3414t destination, AbstractC2106m.b hostLifecycleState, C3411q viewModel) {
        C3862t.g(context, "context");
        C3862t.g(destination, "destination");
        C3862t.g(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return C3407m.INSTANCE.a(context, destination, bundle, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C3862t.g(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public C3408n(Parcel inParcel) {
        C3862t.g(inParcel, "inParcel");
        String string = inParcel.readString();
        C3862t.d(string);
        this.id = string;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(C3408n.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(C3408n.class.getClassLoader());
        C3862t.d(bundle);
        this.savedState = bundle;
    }
}
