package b3;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* compiled from: TsPayloadReader.java */
/* loaded from: classes.dex */
public interface L {

    /* compiled from: TsPayloadReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f30194a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30195b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f30196c;

        public a(String str, int i10, byte[] bArr) {
            this.f30194a = str;
            this.f30195b = i10;
            this.f30196c = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f30197a;

        /* renamed from: b, reason: collision with root package name */
        public final String f30198b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30199c;

        /* renamed from: d, reason: collision with root package name */
        public final List<a> f30200d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f30201e;

        public b(int i10, String str, int i11, List<a> list, byte[] bArr) {
            this.f30197a = i10;
            this.f30198b = str;
            this.f30199c = i11;
            this.f30200d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f30201e = bArr;
        }

        public int a() {
            int i10 = this.f30199c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* compiled from: TsPayloadReader.java */
    public interface c {
        SparseArray<L> a();

        L b(int i10, b bVar);
    }

    /* compiled from: TsPayloadReader.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f30202a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30203b;

        /* renamed from: c, reason: collision with root package name */
        private final int f30204c;

        /* renamed from: d, reason: collision with root package name */
        private int f30205d;

        /* renamed from: e, reason: collision with root package name */
        private String f30206e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f30205d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f30205d;
            this.f30205d = i10 == Integer.MIN_VALUE ? this.f30203b : i10 + this.f30204c;
            this.f30206e = this.f30202a + this.f30205d;
        }

        public String b() {
            d();
            return this.f30206e;
        }

        public int c() {
            d();
            return this.f30205d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f30202a = str;
            this.f30203b = i11;
            this.f30204c = i12;
            this.f30205d = Integer.MIN_VALUE;
            this.f30206e = "";
        }
    }

    void a();

    void b(X1.y yVar, int i10);

    void c(X1.E e10, v2.r rVar, d dVar);
}
