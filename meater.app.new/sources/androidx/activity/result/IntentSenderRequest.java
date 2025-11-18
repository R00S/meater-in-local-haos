package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0048a();

    /* renamed from: f */
    private final IntentSender f140f;

    /* renamed from: g */
    private final Intent f141g;

    /* renamed from: h */
    private final int f142h;

    /* renamed from: i */
    private final int f143i;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    class C0048a implements Parcelable.Creator<IntentSenderRequest> {
        C0048a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i2) {
            return new IntentSenderRequest[i2];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0049b {

        /* renamed from: a */
        private IntentSender f144a;

        /* renamed from: b */
        private Intent f145b;

        /* renamed from: c */
        private int f146c;

        /* renamed from: d */
        private int f147d;

        public C0049b(IntentSender intentSender) {
            this.f144a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest m168a() {
            return new IntentSenderRequest(this.f144a, this.f145b, this.f146c, this.f147d);
        }

        /* renamed from: b */
        public C0049b m169b(Intent intent) {
            this.f145b = intent;
            return this;
        }

        /* renamed from: c */
        public C0049b m170c(int i2, int i3) {
            this.f147d = i2;
            this.f146c = i3;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f140f = intentSender;
        this.f141g = intent;
        this.f142h = i2;
        this.f143i = i3;
    }

    /* renamed from: a */
    public Intent m162a() {
        return this.f141g;
    }

    /* renamed from: b */
    public int m163b() {
        return this.f142h;
    }

    /* renamed from: c */
    public int m164c() {
        return this.f143i;
    }

    /* renamed from: d */
    public IntentSender m165d() {
        return this.f140f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f140f, i2);
        parcel.writeParcelable(this.f141g, i2);
        parcel.writeInt(this.f142h);
        parcel.writeInt(this.f143i);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f140f = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f141g = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f142h = parcel.readInt();
        this.f143i = parcel.readInt();
    }
}
