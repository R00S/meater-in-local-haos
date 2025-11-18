package p024c.p079s.p080a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;
import p024c.p052i.p053e.C0923a;

/* compiled from: Palette.java */
/* renamed from: c.s.a.b */
/* loaded from: classes.dex */
public final class C1002b {

    /* renamed from: a */
    static final c f6630a = new a();

    /* renamed from: b */
    private final List<e> f6631b;

    /* renamed from: c */
    private final List<C1003c> f6632c;

    /* renamed from: e */
    private final SparseBooleanArray f6634e = new SparseBooleanArray();

    /* renamed from: d */
    private final Map<C1003c, e> f6633d = new C0867a();

    /* renamed from: f */
    private final e f6635f = m6405a();

    /* compiled from: Palette.java */
    /* renamed from: c.s.a.b$a */
    static class a implements c {
        a() {
        }

        /* renamed from: b */
        private boolean m6413b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: c */
        private boolean m6414c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: d */
        private boolean m6415d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        @Override // p024c.p079s.p080a.C1002b.c
        /* renamed from: a */
        public boolean mo6416a(int i2, float[] fArr) {
            return (m6415d(fArr) || m6413b(fArr) || m6414c(fArr)) ? false : true;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: c.s.a.b$b */
    public static final class b {

        /* renamed from: a */
        private final List<e> f6636a;

        /* renamed from: b */
        private final Bitmap f6637b;

        /* renamed from: c */
        private final List<C1003c> f6638c;

        /* renamed from: d */
        private int f6639d;

        /* renamed from: e */
        private int f6640e;

        /* renamed from: f */
        private int f6641f;

        /* renamed from: g */
        private final List<c> f6642g;

        /* renamed from: h */
        private Rect f6643h;

        /* compiled from: Palette.java */
        /* renamed from: c.s.a.b$b$a */
        class a extends AsyncTask<Bitmap, Void, C1002b> {

            /* renamed from: a */
            final /* synthetic */ d f6644a;

            a(d dVar) {
                this.f6644a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C1002b doInBackground(Bitmap... bitmapArr) {
                try {
                    return b.this.m6420b();
                } catch (Exception e2) {
                    Log.e("Palette", "Exception thrown during async generate", e2);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(C1002b c1002b) {
                this.f6644a.mo6424a(c1002b);
            }
        }

        public b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f6638c = arrayList;
            this.f6639d = 16;
            this.f6640e = 12544;
            this.f6641f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f6642g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C1002b.f6630a);
            this.f6637b = bitmap;
            this.f6636a = null;
            arrayList.add(C1003c.f6655a);
            arrayList.add(C1003c.f6656b);
            arrayList.add(C1003c.f6657c);
            arrayList.add(C1003c.f6658d);
            arrayList.add(C1003c.f6659e);
            arrayList.add(C1003c.f6660f);
        }

        /* renamed from: c */
        private int[] m6417c(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f6643h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f6643h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i2 = 0; i2 < iHeight; i2++) {
                Rect rect2 = this.f6643h;
                System.arraycopy(iArr, ((rect2.top + i2) * width) + rect2.left, iArr2, i2 * iWidth, iWidth);
            }
            return iArr2;
        }

        /* renamed from: e */
        private Bitmap m6418e(Bitmap bitmap) {
            int iMax;
            int i2;
            double dSqrt = -1.0d;
            if (this.f6640e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i3 = this.f6640e;
                if (width > i3) {
                    double d2 = i3;
                    double d3 = width;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    dSqrt = Math.sqrt(d2 / d3);
                }
            } else if (this.f6641f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i2 = this.f6641f)) {
                double d4 = i2;
                double d5 = iMax;
                Double.isNaN(d4);
                Double.isNaN(d5);
                dSqrt = d4 / d5;
            }
            if (dSqrt <= 0.0d) {
                return bitmap;
            }
            double width2 = bitmap.getWidth();
            Double.isNaN(width2);
            int iCeil = (int) Math.ceil(width2 * dSqrt);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, iCeil, (int) Math.ceil(height * dSqrt), false);
        }

        /* renamed from: a */
        public AsyncTask<Bitmap, Void, C1002b> m6419a(d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f6637b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        /* renamed from: b */
        public C1002b m6420b() {
            List<e> listM6395d;
            c[] cVarArr;
            Bitmap bitmap = this.f6637b;
            if (bitmap != null) {
                Bitmap bitmapM6418e = m6418e(bitmap);
                Rect rect = this.f6643h;
                if (bitmapM6418e != this.f6637b && rect != null) {
                    double width = bitmapM6418e.getWidth();
                    double width2 = this.f6637b.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    double d2 = width / width2;
                    double d3 = rect.left;
                    Double.isNaN(d3);
                    rect.left = (int) Math.floor(d3 * d2);
                    double d4 = rect.top;
                    Double.isNaN(d4);
                    rect.top = (int) Math.floor(d4 * d2);
                    double d5 = rect.right;
                    Double.isNaN(d5);
                    rect.right = Math.min((int) Math.ceil(d5 * d2), bitmapM6418e.getWidth());
                    double d6 = rect.bottom;
                    Double.isNaN(d6);
                    rect.bottom = Math.min((int) Math.ceil(d6 * d2), bitmapM6418e.getHeight());
                }
                int[] iArrM6417c = m6417c(bitmapM6418e);
                int i2 = this.f6639d;
                if (this.f6642g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list = this.f6642g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                C1001a c1001a = new C1001a(iArrM6417c, i2, cVarArr);
                if (bitmapM6418e != this.f6637b) {
                    bitmapM6418e.recycle();
                }
                listM6395d = c1001a.m6395d();
            } else {
                listM6395d = this.f6636a;
                if (listM6395d == null) {
                    throw new AssertionError();
                }
            }
            C1002b c1002b = new C1002b(listM6395d, this.f6638c);
            c1002b.m6411c();
            return c1002b;
        }

        /* renamed from: d */
        public b m6421d(int i2) {
            this.f6639d = i2;
            return this;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: c.s.a.b$c */
    public interface c {
        /* renamed from: a */
        boolean mo6416a(int i2, float[] fArr);
    }

    /* compiled from: Palette.java */
    /* renamed from: c.s.a.b$d */
    public interface d {
        /* renamed from: a */
        void mo6424a(C1002b c1002b);
    }

    /* compiled from: Palette.java */
    /* renamed from: c.s.a.b$e */
    public static final class e {

        /* renamed from: a */
        private final int f6646a;

        /* renamed from: b */
        private final int f6647b;

        /* renamed from: c */
        private final int f6648c;

        /* renamed from: d */
        private final int f6649d;

        /* renamed from: e */
        private final int f6650e;

        /* renamed from: f */
        private boolean f6651f;

        /* renamed from: g */
        private int f6652g;

        /* renamed from: h */
        private int f6653h;

        /* renamed from: i */
        private float[] f6654i;

        public e(int i2, int i3) {
            this.f6646a = Color.red(i2);
            this.f6647b = Color.green(i2);
            this.f6648c = Color.blue(i2);
            this.f6649d = i2;
            this.f6650e = i3;
        }

        /* renamed from: a */
        private void m6425a() {
            if (this.f6651f) {
                return;
            }
            int iM5878f = C0923a.m5878f(-1, this.f6649d, 4.5f);
            int iM5878f2 = C0923a.m5878f(-1, this.f6649d, 3.0f);
            if (iM5878f != -1 && iM5878f2 != -1) {
                this.f6653h = C0923a.m5887o(-1, iM5878f);
                this.f6652g = C0923a.m5887o(-1, iM5878f2);
                this.f6651f = true;
                return;
            }
            int iM5878f3 = C0923a.m5878f(-16777216, this.f6649d, 4.5f);
            int iM5878f4 = C0923a.m5878f(-16777216, this.f6649d, 3.0f);
            if (iM5878f3 == -1 || iM5878f4 == -1) {
                this.f6653h = iM5878f != -1 ? C0923a.m5887o(-1, iM5878f) : C0923a.m5887o(-16777216, iM5878f3);
                this.f6652g = iM5878f2 != -1 ? C0923a.m5887o(-1, iM5878f2) : C0923a.m5887o(-16777216, iM5878f4);
                this.f6651f = true;
            } else {
                this.f6653h = C0923a.m5887o(-16777216, iM5878f3);
                this.f6652g = C0923a.m5887o(-16777216, iM5878f4);
                this.f6651f = true;
            }
        }

        /* renamed from: b */
        public int m6426b() {
            m6425a();
            return this.f6653h;
        }

        /* renamed from: c */
        public float[] m6427c() {
            if (this.f6654i == null) {
                this.f6654i = new float[3];
            }
            C0923a.m5874b(this.f6646a, this.f6647b, this.f6648c, this.f6654i);
            return this.f6654i;
        }

        /* renamed from: d */
        public int m6428d() {
            return this.f6650e;
        }

        /* renamed from: e */
        public int m6429e() {
            return this.f6649d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f6650e == eVar.f6650e && this.f6649d == eVar.f6649d;
        }

        /* renamed from: f */
        public int m6430f() {
            m6425a();
            return this.f6652g;
        }

        public int hashCode() {
            return (this.f6649d * 31) + this.f6650e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m6429e()) + "] [HSL: " + Arrays.toString(m6427c()) + "] [Population: " + this.f6650e + "] [Title Text: #" + Integer.toHexString(m6430f()) + "] [Body Text: #" + Integer.toHexString(m6426b()) + ']';
        }
    }

    C1002b(List<e> list, List<C1003c> list2) {
        this.f6631b = list;
        this.f6632c = list2;
    }

    /* renamed from: a */
    private e m6405a() {
        int size = this.f6631b.size();
        int iM6428d = Integer.MIN_VALUE;
        e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = this.f6631b.get(i2);
            if (eVar2.m6428d() > iM6428d) {
                iM6428d = eVar2.m6428d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public static b m6406b(Bitmap bitmap) {
        return new b(bitmap);
    }

    /* renamed from: d */
    private float m6407d(e eVar, C1003c c1003c) {
        float[] fArrM6427c = eVar.m6427c();
        e eVar2 = this.f6635f;
        return (c1003c.m6444g() > 0.0f ? c1003c.m6444g() * (1.0f - Math.abs(fArrM6427c[1] - c1003c.m6446i())) : 0.0f) + (c1003c.m6438a() > 0.0f ? c1003c.m6438a() * (1.0f - Math.abs(fArrM6427c[2] - c1003c.m6445h())) : 0.0f) + (c1003c.m6443f() > 0.0f ? c1003c.m6443f() * (eVar.m6428d() / (eVar2 != null ? eVar2.m6428d() : 1)) : 0.0f);
    }

    /* renamed from: e */
    private e m6408e(C1003c c1003c) {
        e eVarM6409g = m6409g(c1003c);
        if (eVarM6409g != null && c1003c.m6447j()) {
            this.f6634e.append(eVarM6409g.m6429e(), true);
        }
        return eVarM6409g;
    }

    /* renamed from: g */
    private e m6409g(C1003c c1003c) {
        int size = this.f6631b.size();
        float f2 = 0.0f;
        e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = this.f6631b.get(i2);
            if (m6410h(eVar2, c1003c)) {
                float fM6407d = m6407d(eVar2, c1003c);
                if (eVar == null || fM6407d > f2) {
                    eVar = eVar2;
                    f2 = fM6407d;
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    private boolean m6410h(e eVar, C1003c c1003c) {
        float[] fArrM6427c = eVar.m6427c();
        return fArrM6427c[1] >= c1003c.m6442e() && fArrM6427c[1] <= c1003c.m6440c() && fArrM6427c[2] >= c1003c.m6441d() && fArrM6427c[2] <= c1003c.m6439b() && !this.f6634e.get(eVar.m6429e());
    }

    /* renamed from: c */
    void m6411c() {
        int size = this.f6632c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1003c c1003c = this.f6632c.get(i2);
            c1003c.m6448k();
            this.f6633d.put(c1003c, m6408e(c1003c));
        }
        this.f6634e.clear();
    }

    /* renamed from: f */
    public int m6412f(int i2) {
        e eVar = this.f6635f;
        return eVar != null ? eVar.m6429e() : i2;
    }
}
