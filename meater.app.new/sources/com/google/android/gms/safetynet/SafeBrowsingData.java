package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {

    /* renamed from: g */
    @SafeParcelable.Field
    private String f29443g;

    /* renamed from: h */
    @SafeParcelable.Field
    private DataHolder f29444h;

    /* renamed from: i */
    @SafeParcelable.Field
    private ParcelFileDescriptor f29445i;

    /* renamed from: j */
    @SafeParcelable.Field
    private long f29446j;

    /* renamed from: k */
    @SafeParcelable.Field
    private byte[] f29447k;

    /* renamed from: l */
    private byte[] f29448l;

    /* renamed from: m */
    private File f29449m;

    /* renamed from: f */
    private static final String f29442f = SafeBrowsingData.class.getSimpleName();
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();

    public SafeBrowsingData() {
        this(null, null, null, 0L, null);
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) DataHolder dataHolder, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) byte[] bArr) {
        this.f29443g = str;
        this.f29444h = dataHolder;
        this.f29445i = parcelFileDescriptor;
        this.f29446j = j2;
        this.f29447k = bArr;
    }

    /* renamed from: i0 */
    private final FileOutputStream m23594i0() throws Throwable {
        Throwable th;
        File fileCreateTempFile;
        File file = this.f29449m;
        if (file == null) {
            return null;
        }
        try {
            fileCreateTempFile = File.createTempFile("xlb", ".tmp", file);
        } catch (IOException unused) {
            fileCreateTempFile = null;
        } catch (Throwable th2) {
            th = th2;
            fileCreateTempFile = null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            this.f29445i = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
            if (fileCreateTempFile != null) {
                fileCreateTempFile.delete();
            }
            return fileOutputStream;
        } catch (IOException unused2) {
            if (fileCreateTempFile != null) {
                fileCreateTempFile.delete();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileCreateTempFile != null) {
                fileCreateTempFile.delete();
            }
            throw th;
        }
    }

    /* renamed from: p0 */
    private static void m23595p0(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: W */
    public long m23596W() {
        return this.f29446j;
    }

    /* renamed from: Y */
    public String m23597Y() {
        return this.f29443g;
    }

    /* renamed from: e0 */
    public byte[] m23598e0() {
        return this.f29447k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) throws IOException {
        boolean z;
        FileOutputStream fileOutputStreamM23594i0;
        if (this.f29445i != null || this.f29448l == null || (fileOutputStreamM23594i0 = m23594i0()) == null) {
            z = false;
        } else {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStreamM23594i0));
            try {
                dataOutputStream.writeInt(this.f29448l.length);
                dataOutputStream.write(this.f29448l);
                m23595p0(dataOutputStream);
                z = true;
            } catch (IOException unused) {
                m23595p0(dataOutputStream);
            } catch (Throwable th) {
                m23595p0(dataOutputStream);
                throw th;
            }
        }
        if (z) {
            i2 |= 1;
        }
        zzj.m23604a(this, parcel, i2);
        this.f29445i = null;
    }

    /* renamed from: y */
    public DataHolder m23599y() {
        return this.f29444h;
    }

    /* renamed from: z */
    public ParcelFileDescriptor m23600z() {
        return this.f29445i;
    }
}
