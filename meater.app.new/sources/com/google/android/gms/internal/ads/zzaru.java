package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzaru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaru> CREATOR = new zzarw();

    /* renamed from: f */
    @SafeParcelable.Field
    private ParcelFileDescriptor f22408f;

    /* renamed from: g */
    private Parcelable f22409g = null;

    /* renamed from: h */
    private boolean f22410h = true;

    @SafeParcelable.Constructor
    public zzaru(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f22408f = parcelFileDescriptor;
    }

    /* renamed from: W */
    private final ParcelFileDescriptor m16898W() {
        if (this.f22408f == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f22409g.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                this.f22408f = m16899z(bArrMarshall);
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        return this.f22408f;
    }

    /* renamed from: z */
    private final <T> ParcelFileDescriptor m16899z(byte[] bArr) throws IOException {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
            try {
                new Thread(new RunnableC7103r3(this, autoCloseOutputStream, bArr)).start();
                return parcelFileDescriptorArrCreatePipe[0];
            } catch (IOException e2) {
                e = e2;
                zzbad.m17347c("Error transporting the ad response", e);
                zzk.zzlk().m17052e(e, "LargeParcelTeleporter.pipeData.2");
                IOUtils.m14630a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        m16898W();
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 2, this.f22408f, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final <T extends SafeParcelable> T m16900y(Parcelable.Creator<T> creator) throws IOException {
        if (this.f22410h) {
            if (this.f22408f == null) {
                zzbad.m17351g("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f22408f));
            try {
                try {
                    int i2 = dataInputStream.readInt();
                    byte[] bArr = new byte[i2];
                    dataInputStream.readFully(bArr, 0, i2);
                    IOUtils.m14630a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i2);
                        parcelObtain.setDataPosition(0);
                        this.f22409g = creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f22410h = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e2) {
                    zzbad.m17347c("Could not read from parcel file descriptor", e2);
                    IOUtils.m14630a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.m14630a(dataInputStream);
                throw th2;
            }
        }
        return (T) this.f22409g;
    }
}
