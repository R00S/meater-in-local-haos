package androidx.media3.exoplayer.drm;

import U1.C1738n;
import e2.v1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: ExoMediaDrm.java */
/* loaded from: classes.dex */
public interface m {

    /* compiled from: ExoMediaDrm.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f27132a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27133b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27134c;

        public a(byte[] bArr, String str, int i10) {
            this.f27132a = bArr;
            this.f27133b = str;
            this.f27134c = i10;
        }

        public byte[] a() {
            return this.f27132a;
        }

        public String b() {
            return this.f27133b;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    public interface b {
        void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* compiled from: ExoMediaDrm.java */
    public interface c {
        m a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f27135a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27136b;

        public d(byte[] bArr, String str) {
            this.f27135a = bArr;
            this.f27136b = str;
        }

        public byte[] a() {
            return this.f27135a;
        }

        public String b() {
            return this.f27136b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    void c();

    c2.b d(byte[] bArr);

    byte[] e();

    boolean f(byte[] bArr, String str);

    void g(byte[] bArr, byte[] bArr2);

    void h(byte[] bArr);

    byte[] i(byte[] bArr, byte[] bArr2);

    void j(b bVar);

    void k(byte[] bArr);

    a l(byte[] bArr, List<C1738n.b> list, int i10, HashMap<String, String> map);

    int n();

    default void m(byte[] bArr, v1 v1Var) {
    }
}
