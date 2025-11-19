package U2;

import S2.r;
import W1.a;
import X1.InterfaceC1811h;
import X1.L;
import X1.n;
import X1.x;
import X1.y;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: DvbParser.java */
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f17480h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f17481i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f17482j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f17483a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f17484b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f17485c;

    /* renamed from: d, reason: collision with root package name */
    private final b f17486d;

    /* renamed from: e, reason: collision with root package name */
    private final C0258a f17487e;

    /* renamed from: f, reason: collision with root package name */
    private final h f17488f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f17489g;

    /* compiled from: DvbParser.java */
    /* renamed from: U2.a$a, reason: collision with other inner class name */
    private static final class C0258a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17490a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f17491b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f17492c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f17493d;

        public C0258a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f17490a = i10;
            this.f17491b = iArr;
            this.f17492c = iArr2;
            this.f17493d = iArr3;
        }
    }

    /* compiled from: DvbParser.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17494a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17495b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17496c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17497d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17498e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17499f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f17494a = i10;
            this.f17495b = i11;
            this.f17496c = i12;
            this.f17497d = i13;
            this.f17498e = i14;
            this.f17499f = i15;
        }
    }

    /* compiled from: DvbParser.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f17500a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17501b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f17502c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f17503d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f17500a = i10;
            this.f17501b = z10;
            this.f17502c = bArr;
            this.f17503d = bArr2;
        }
    }

    /* compiled from: DvbParser.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f17504a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17505b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17506c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f17507d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f17504a = i10;
            this.f17505b = i11;
            this.f17506c = i12;
            this.f17507d = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f17508a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17509b;

        public e(int i10, int i11) {
            this.f17508a = i10;
            this.f17509b = i11;
        }
    }

    /* compiled from: DvbParser.java */
    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f17510a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17511b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17512c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17513d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17514e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17515f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17516g;

        /* renamed from: h, reason: collision with root package name */
        public final int f17517h;

        /* renamed from: i, reason: collision with root package name */
        public final int f17518i;

        /* renamed from: j, reason: collision with root package name */
        public final int f17519j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f17520k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f17510a = i10;
            this.f17511b = z10;
            this.f17512c = i11;
            this.f17513d = i12;
            this.f17514e = i13;
            this.f17515f = i14;
            this.f17516g = i15;
            this.f17517h = i16;
            this.f17518i = i17;
            this.f17519j = i18;
            this.f17520k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f17520k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f17520k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* compiled from: DvbParser.java */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f17521a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17522b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17523c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17524d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17525e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17526f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f17521a = i10;
            this.f17522b = i11;
            this.f17523c = i12;
            this.f17524d = i13;
            this.f17525e = i14;
            this.f17526f = i15;
        }
    }

    /* compiled from: DvbParser.java */
    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f17527a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17528b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f17529c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<C0258a> f17530d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f17531e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<C0258a> f17532f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f17533g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public b f17534h;

        /* renamed from: i, reason: collision with root package name */
        public d f17535i;

        public h(int i10, int i11) {
            this.f17527a = i10;
            this.f17528b = i11;
        }

        public void a() {
            this.f17529c.clear();
            this.f17530d.clear();
            this.f17531e.clear();
            this.f17532f.clear();
            this.f17533g.clear();
            this.f17534h = null;
            this.f17535i = null;
        }
    }

    public a(List<byte[]> list) {
        y yVar = new y(list.get(0));
        int iP = yVar.P();
        int iP2 = yVar.P();
        Paint paint = new Paint();
        this.f17483a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f17484b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f17485c = new Canvas();
        this.f17486d = new b(719, 575, 0, 719, 0, 575);
        this.f17487e = new C0258a(0, f(), g(), h());
        this.f17488f = new h(iP, iP2);
    }

    private static byte[] e(int i10, int i11, x xVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) xVar.h(i11);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = i(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = i(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = i(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
                if (i11 == 0) {
                    iArr[i10] = i(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = i(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = i(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = i(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int i(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int j(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int iH3 = xVar.h(2);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (xVar.g()) {
                    iH = xVar.h(3) + 3;
                    iH2 = xVar.h(2);
                } else {
                    if (xVar.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int iH4 = xVar.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = xVar.h(4) + 12;
                            iH2 = xVar.h(2);
                        } else if (iH4 != 3) {
                            z10 = z11;
                        } else {
                            iH = xVar.h(8) + 29;
                            iH2 = xVar.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int k(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int iH3 = xVar.h(4);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (xVar.g()) {
                if (xVar.g()) {
                    int iH4 = xVar.h(2);
                    if (iH4 == 0) {
                        z10 = z11;
                        i12 = 1;
                    } else if (iH4 == 1) {
                        z10 = z11;
                        i12 = 2;
                    } else if (iH4 == 2) {
                        iH = xVar.h(4) + 9;
                        iH2 = xVar.h(4);
                    } else if (iH4 != 3) {
                        z10 = z11;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = xVar.h(8) + 25;
                        iH2 = xVar.h(4);
                    }
                    iH3 = 0;
                } else {
                    iH = xVar.h(2) + 4;
                    iH2 = xVar.h(4);
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = xVar.h(3);
                if (iH5 != 0) {
                    z10 = z11;
                    i12 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int l(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = xVar.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (xVar.g()) {
                z10 = z11;
                iH = xVar.h(7);
                iH2 = xVar.h(8);
            } else {
                int iH3 = xVar.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i12, i11, i12 + iH, i11 + 1, paint);
            }
            i12 += iH;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void m(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        x xVar = new x(bArr);
        int iJ = i11;
        int i13 = i12;
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        while (xVar.b() != 0) {
            int iH = xVar.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                iJ = j(xVar, iArr, bArr2, iJ, i13, paint, canvas);
                                xVar.c();
                                break;
                            } else {
                                bArr3 = bArrE3 == null ? f17480h : bArrE3;
                            }
                        } else {
                            bArr3 = bArrE == null ? f17481i : bArrE;
                        }
                        bArr2 = bArr3;
                        iJ = j(xVar, iArr, bArr2, iJ, i13, paint, canvas);
                        xVar.c();
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArrE2 == null ? f17482j : bArrE2;
                        } else {
                            bArr4 = null;
                        }
                        iJ = k(xVar, iArr, bArr4, iJ, i13, paint, canvas);
                        xVar.c();
                        break;
                    case 18:
                        iJ = l(xVar, iArr, null, iJ, i13, paint, canvas);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrE3 = e(4, 4, xVar);
                                break;
                            case 33:
                                bArrE = e(4, 8, xVar);
                                break;
                            case 34:
                                bArrE2 = e(16, 8, xVar);
                                break;
                        }
                }
            } else {
                i13 += 2;
                iJ = i11;
            }
        }
    }

    private static void n(c cVar, C0258a c0258a, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? c0258a.f17493d : i10 == 2 ? c0258a.f17492c : c0258a.f17491b;
        m(cVar.f17502c, iArr, i10, i11, i12, paint, canvas);
        m(cVar.f17503d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    private S2.e o(x xVar) {
        int i10;
        SparseArray<g> sparseArray;
        while (xVar.b() >= 48 && xVar.h(8) == 15) {
            u(xVar, this.f17488f);
        }
        h hVar = this.f17488f;
        d dVar = hVar.f17535i;
        if (dVar == null) {
            return new S2.e(AbstractC4009y.G(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f17534h;
        if (bVar == null) {
            bVar = this.f17486d;
        }
        Bitmap bitmap = this.f17489g;
        if (bitmap == null || bVar.f17494a + 1 != bitmap.getWidth() || bVar.f17495b + 1 != this.f17489g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f17494a + 1, bVar.f17495b + 1, Bitmap.Config.ARGB_8888);
            this.f17489g = bitmapCreateBitmap;
            this.f17485c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f17507d;
        for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
            this.f17485c.save();
            e eVarValueAt = sparseArray2.valueAt(i11);
            f fVar = this.f17488f.f17529c.get(sparseArray2.keyAt(i11));
            int i12 = eVarValueAt.f17508a + bVar.f17496c;
            int i13 = eVarValueAt.f17509b + bVar.f17498e;
            this.f17485c.clipRect(i12, i13, Math.min(fVar.f17512c + i12, bVar.f17497d), Math.min(fVar.f17513d + i13, bVar.f17499f));
            C0258a c0258a = this.f17488f.f17530d.get(fVar.f17516g);
            if (c0258a == null && (c0258a = this.f17488f.f17532f.get(fVar.f17516g)) == null) {
                c0258a = this.f17487e;
            }
            SparseArray<g> sparseArray3 = fVar.f17520k;
            int i14 = 0;
            while (i14 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i14);
                g gVarValueAt = sparseArray3.valueAt(i14);
                c cVar = this.f17488f.f17531e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f17488f.f17533g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i10 = i14;
                    sparseArray = sparseArray3;
                    n(cVar2, c0258a, fVar.f17515f, gVarValueAt.f17523c + i12, i13 + gVarValueAt.f17524d, cVar2.f17501b ? null : this.f17483a, this.f17485c);
                } else {
                    i10 = i14;
                    sparseArray = sparseArray3;
                }
                i14 = i10 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f17511b) {
                int i15 = fVar.f17515f;
                this.f17484b.setColor(i15 == 3 ? c0258a.f17493d[fVar.f17517h] : i15 == 2 ? c0258a.f17492c[fVar.f17518i] : c0258a.f17491b[fVar.f17519j]);
                this.f17485c.drawRect(i12, i13, fVar.f17512c + i12, fVar.f17513d + i13, this.f17484b);
            }
            arrayList.add(new a.b().f(Bitmap.createBitmap(this.f17489g, i12, i13, fVar.f17512c, fVar.f17513d)).k(i12 / bVar.f17494a).l(0).h(i13 / bVar.f17495b, 0).i(0).n(fVar.f17512c / bVar.f17494a).g(fVar.f17513d / bVar.f17495b).a());
            this.f17485c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f17485c.restore();
        }
        return new S2.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0258a p(x xVar, int i10) {
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = xVar.h(8);
        xVar.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrF = f();
        int[] iArrG = g();
        int[] iArrH = h();
        while (i14 > 0) {
            int iH6 = xVar.h(i12);
            int iH7 = xVar.h(i12);
            int[] iArr = (iH7 & 128) != 0 ? iArrF : (iH7 & 64) != 0 ? iArrG : iArrH;
            if ((iH7 & 1) != 0) {
                iH3 = xVar.h(i12);
                iH4 = xVar.h(i12);
                iH = xVar.h(i12);
                iH2 = xVar.h(i12);
                i11 = i14 - 6;
            } else {
                int iH8 = xVar.h(6) << i13;
                int iH9 = xVar.h(4) << 4;
                iH = xVar.h(4) << 4;
                i11 = i14 - 4;
                iH2 = xVar.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = i((byte) (255 - (iH2 & 255)), L.p((int) (d10 + (1.402d * d11)), 0, 255), L.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), L.p((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new C0258a(iH5, iArrF, iArrG, iArrH);
    }

    private static b q(x xVar) {
        int i10;
        int i11;
        int i12;
        int iH;
        xVar.r(4);
        boolean zG = xVar.g();
        xVar.r(3);
        int iH2 = xVar.h(16);
        int iH3 = xVar.h(16);
        if (zG) {
            int iH4 = xVar.h(16);
            int iH5 = xVar.h(16);
            int iH6 = xVar.h(16);
            iH = xVar.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c r(x xVar) {
        byte[] bArr;
        int iH = xVar.h(16);
        xVar.r(4);
        int iH2 = xVar.h(2);
        boolean zG = xVar.g();
        xVar.r(1);
        byte[] bArr2 = L.f18631f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = xVar.h(16);
                int iH4 = xVar.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    xVar.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    xVar.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        xVar.r(xVar.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d s(x xVar, int i10) {
        int iH = xVar.h(8);
        int iH2 = xVar.h(4);
        int iH3 = xVar.h(2);
        xVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = xVar.h(8);
            xVar.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(xVar.h(16), xVar.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f t(x xVar, int i10) {
        int i11;
        int iH;
        int iH2;
        int iH3 = xVar.h(8);
        xVar.r(4);
        boolean zG = xVar.g();
        xVar.r(3);
        int i12 = 16;
        int iH4 = xVar.h(16);
        int iH5 = xVar.h(16);
        int iH6 = xVar.h(3);
        int iH7 = xVar.h(3);
        int i13 = 2;
        xVar.r(2);
        int iH8 = xVar.h(8);
        int iH9 = xVar.h(8);
        int iH10 = xVar.h(4);
        int iH11 = xVar.h(2);
        xVar.r(2);
        int i14 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i14 > 0) {
            int iH12 = xVar.h(i12);
            int iH13 = xVar.h(i13);
            int iH14 = xVar.h(i13);
            int iH15 = xVar.h(12);
            int i15 = iH11;
            xVar.r(4);
            int iH16 = xVar.h(12);
            int i16 = i14 - 6;
            if (iH13 != 1) {
                i11 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i14 = i16;
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i13 = i11;
                iH11 = i15;
                i12 = 16;
            } else {
                i11 = 2;
            }
            i14 -= 8;
            iH2 = xVar.h(8);
            iH = xVar.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i13 = i11;
            iH11 = i15;
            i12 = 16;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void u(x xVar, h hVar) {
        f fVar;
        int iH = xVar.h(8);
        int iH2 = xVar.h(16);
        int iH3 = xVar.h(16);
        int iD = xVar.d() + iH3;
        if (iH3 * 8 > xVar.b()) {
            n.h("DvbParser", "Data field length exceeds limit");
            xVar.r(xVar.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f17527a) {
                    d dVar = hVar.f17535i;
                    d dVarS = s(xVar, iH3);
                    if (dVarS.f17506c == 0) {
                        if (dVar != null && dVar.f17505b != dVarS.f17505b) {
                            hVar.f17535i = dVarS;
                            break;
                        }
                    } else {
                        hVar.f17535i = dVarS;
                        hVar.f17529c.clear();
                        hVar.f17530d.clear();
                        hVar.f17531e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f17535i;
                if (iH2 == hVar.f17527a && dVar2 != null) {
                    f fVarT = t(xVar, iH3);
                    if (dVar2.f17506c == 0 && (fVar = hVar.f17529c.get(fVarT.f17510a)) != null) {
                        fVarT.a(fVar);
                    }
                    hVar.f17529c.put(fVarT.f17510a, fVarT);
                    break;
                }
                break;
            case 18:
                if (iH2 != hVar.f17527a) {
                    if (iH2 == hVar.f17528b) {
                        C0258a c0258aP = p(xVar, iH3);
                        hVar.f17532f.put(c0258aP.f17490a, c0258aP);
                        break;
                    }
                } else {
                    C0258a c0258aP2 = p(xVar, iH3);
                    hVar.f17530d.put(c0258aP2.f17490a, c0258aP2);
                    break;
                }
                break;
            case 19:
                if (iH2 != hVar.f17527a) {
                    if (iH2 == hVar.f17528b) {
                        c cVarR = r(xVar);
                        hVar.f17533g.put(cVarR.f17500a, cVarR);
                        break;
                    }
                } else {
                    c cVarR2 = r(xVar);
                    hVar.f17531e.put(cVarR2.f17500a, cVarR2);
                    break;
                }
                break;
            case 20:
                if (iH2 == hVar.f17527a) {
                    hVar.f17534h = q(xVar);
                    break;
                }
                break;
        }
        xVar.s(iD - xVar.d());
    }

    @Override // S2.r
    public void b() {
        this.f17488f.a();
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<S2.e> interfaceC1811h) {
        x xVar = new x(bArr, i11 + i10);
        xVar.p(i10);
        interfaceC1811h.accept(o(xVar));
    }

    @Override // S2.r
    public int d() {
        return 2;
    }
}
