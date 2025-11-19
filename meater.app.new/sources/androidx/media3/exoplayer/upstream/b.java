package androidx.media3.exoplayer.upstream;

import X1.C1804a;
import java.io.IOException;
import n2.i;
import n2.j;

/* compiled from: LoadErrorHandlingPolicy.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27860a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27861b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27862c;

        /* renamed from: d, reason: collision with root package name */
        public final int f27863d;

        public a(int i10, int i11, int i12, int i13) {
            this.f27860a = i10;
            this.f27861b = i11;
            this.f27862c = i12;
            this.f27863d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f27860a - this.f27861b <= 1) {
                    return false;
                }
            } else if (this.f27862c - this.f27863d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* renamed from: androidx.media3.exoplayer.upstream.b$b, reason: collision with other inner class name */
    public static final class C0381b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27864a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27865b;

        public C0381b(int i10, long j10) {
            C1804a.a(j10 >= 0);
            this.f27864a = i10;
            this.f27865b = j10;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final i f27866a;

        /* renamed from: b, reason: collision with root package name */
        public final j f27867b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f27868c;

        /* renamed from: d, reason: collision with root package name */
        public final int f27869d;

        public c(i iVar, j jVar, IOException iOException, int i10) {
            this.f27866a = iVar;
            this.f27867b = jVar;
            this.f27868c = iOException;
            this.f27869d = i10;
        }
    }

    long a(c cVar);

    int c(int i10);

    C0381b d(a aVar, c cVar);

    default void b(long j10) {
    }
}
