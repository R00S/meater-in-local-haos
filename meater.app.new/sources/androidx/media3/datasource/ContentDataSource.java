package androidx.media3.datasource;

import X1.L;
import a2.AbstractC1884a;
import a2.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class ContentDataSource extends AbstractC1884a {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f26125e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f26126f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f26127g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f26128h;

    /* renamed from: i, reason: collision with root package name */
    private long f26129i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26130j;

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f26125e = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = gVar.f19983a.normalizeScheme();
            this.f26126f = uriNormalizeScheme;
            s(gVar);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f26125e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f26125e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f26127g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f26128h = fileInputStream;
            if (length != -1 && gVar.f19989g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(gVar.f19989g + startOffset) - startOffset;
            if (jSkip != gVar.f19989g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f26129i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f26129i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f26129i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = gVar.f19990h;
            if (jMin != -1) {
                long j11 = this.f26129i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f26129i = jMin;
            }
            this.f26130j = true;
            t(gVar);
            long j12 = gVar.f19990h;
            return j12 != -1 ? j12 : this.f26129i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f26126f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f26128h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f26128h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f26127g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new ContentDataSourceException(e10, 2000);
                    }
                } finally {
                    this.f26127g = null;
                    if (this.f26130j) {
                        this.f26130j = false;
                        r();
                    }
                }
            } catch (Throwable th) {
                this.f26128h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f26127g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f26127g = null;
                        if (this.f26130j) {
                            this.f26130j = false;
                            r();
                        }
                        throw th;
                    } finally {
                        this.f26127g = null;
                        if (this.f26130j) {
                            this.f26130j = false;
                            r();
                        }
                    }
                } catch (IOException e11) {
                    throw new ContentDataSourceException(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new ContentDataSourceException(e12, 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f26126f;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f26129i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) L.i(this.f26128h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f26129i;
        if (j11 != -1) {
            this.f26129i = j11 - i12;
        }
        q(i12);
        return i12;
    }
}
