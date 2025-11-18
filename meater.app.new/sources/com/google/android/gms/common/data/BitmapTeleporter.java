package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17641f;

    /* renamed from: g */
    @SafeParcelable.Field
    private ParcelFileDescriptor f17642g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f17643h;

    /* renamed from: i */
    private Bitmap f17644i = null;

    /* renamed from: j */
    private boolean f17645j = false;

    /* renamed from: k */
    private File f17646k;

    @SafeParcelable.Constructor
    BitmapTeleporter(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) int i3) {
        this.f17641f = i2;
        this.f17642g = parcelFileDescriptor;
        this.f17643h = i3;
    }

    /* renamed from: y */
    private static void m14258y(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("BitmapTeleporter", "Could not close stream", e2);
        }
    }

    /* renamed from: z */
    private final FileOutputStream m14259z() throws IOException {
        File file = this.f17646k;
        if (file == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                this.f17642g = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                fileCreateTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException unused) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) throws IOException {
        if (this.f17642g == null) {
            Bitmap bitmap = this.f17644i;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m14259z()));
            try {
                try {
                    dataOutputStream.writeInt(bArrArray.length);
                    dataOutputStream.writeInt(bitmap.getWidth());
                    dataOutputStream.writeInt(bitmap.getHeight());
                    dataOutputStream.writeUTF(bitmap.getConfig().toString());
                    dataOutputStream.write(bArrArray);
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not write into unlinked file", e2);
                }
            } finally {
                m14258y(dataOutputStream);
            }
        }
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17641f);
        SafeParcelWriter.m14484s(parcel, 2, this.f17642g, i2 | 1, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f17643h);
        SafeParcelWriter.m14467b(parcel, iM14466a);
        this.f17642g = null;
    }
}
