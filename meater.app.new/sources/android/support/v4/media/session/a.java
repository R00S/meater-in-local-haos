package android.support.v4.media.session;

import C9.h;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* compiled from: IMediaControllerCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IMediaControllerCallback.java */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void A0();

    void B0(MediaMetadataCompat mediaMetadataCompat);

    void L();

    void M(Bundle bundle);

    void N0(int i10);

    void O(List<MediaSessionCompat.QueueItem> list);

    void h0(boolean z10);

    void j(String str, Bundle bundle);

    void p1(PlaybackStateCompat playbackStateCompat);

    void q(int i10);

    void s0(boolean z10);

    void s1(ParcelableVolumeInfo parcelableVolumeInfo);

    void u0(CharSequence charSequence);

    /* compiled from: IMediaControllerCallback.java */
    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0296a extends Binder implements a {
        public AbstractBinderC0296a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i10) {
                case 1:
                    j(parcel.readString(), (Bundle) b.b(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    A0();
                    return true;
                case 3:
                    p1((PlaybackStateCompat) b.b(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    B0((MediaMetadataCompat) b.b(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    O(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    u0((CharSequence) b.b(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    M((Bundle) b.b(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    s1((ParcelableVolumeInfo) b.b(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    q(parcel.readInt());
                    return true;
                case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    s0(parcel.readInt() != 0);
                    return true;
                case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    h0(parcel.readInt() != 0);
                    return true;
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    N0(parcel.readInt());
                    return true;
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    L();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
