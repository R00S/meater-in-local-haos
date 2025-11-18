package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0013a();

        /* renamed from: f */
        ResultReceiver f39f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0013a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0013a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f39f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f39f.writeToParcel(parcel, i2);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0014a();

        /* renamed from: f */
        private final Object f40f;

        /* renamed from: g */
        private InterfaceC0019b f41g;

        /* renamed from: h */
        private Bundle f42h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0014a implements Parcelable.Creator<Token> {
            C0014a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i2) {
                return new Token[i2];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public InterfaceC0019b m61a() {
            return this.f41g;
        }

        /* renamed from: b */
        public void m62b(InterfaceC0019b interfaceC0019b) {
            this.f41g = interfaceC0019b;
        }

        /* renamed from: c */
        public void m63c(Bundle bundle) {
            this.f42h = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f40f;
            if (obj2 == null) {
                return token.f40f == null;
            }
            Object obj3 = token.f40f;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f40f;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f40f, i2);
            } else {
                parcel.writeStrongBinder((IBinder) this.f40f);
            }
        }

        Token(Object obj, InterfaceC0019b interfaceC0019b, Bundle bundle) {
            this.f40f = obj;
            this.f41g = interfaceC0019b;
            this.f42h = bundle;
        }
    }

    /* renamed from: a */
    public static void m54a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0012a();

        /* renamed from: f */
        private final MediaDescriptionCompat f36f;

        /* renamed from: g */
        private final long f37g;

        /* renamed from: h */
        private Object f38h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0012a implements Parcelable.Creator<QueueItem> {
            C0012a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j2 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f36f = mediaDescriptionCompat;
            this.f37g = j2;
            this.f38h = obj;
        }

        /* renamed from: a */
        public static QueueItem m55a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m8a(C0023f.m104a(obj)), C0023f.m105b(obj));
        }

        /* renamed from: b */
        public static List<QueueItem> m56b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m55a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f36f + ", Id=" + this.f37g + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f36f.writeToParcel(parcel, i2);
            parcel.writeLong(this.f37g);
        }

        QueueItem(Parcel parcel) {
            this.f36f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f37g = parcel.readLong();
        }
    }
}
