package p2;

import S2.l;
import S2.r;
import U1.s;
import java.util.Objects;

/* compiled from: SubtitleDecoderFactory.java */
/* renamed from: p2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4200g {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC4200g f47393a = new a();

    /* compiled from: SubtitleDecoderFactory.java */
    /* renamed from: p2.g$a */
    class a implements InterfaceC4200g {

        /* renamed from: b, reason: collision with root package name */
        private final S2.h f47394b = new S2.h();

        a() {
        }

        @Override // p2.InterfaceC4200g
        public boolean a(s sVar) {
            String str = sVar.f17162o;
            return this.f47394b.a(sVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // p2.InterfaceC4200g
        public l b(s sVar) {
            String str = sVar.f17162o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new T2.a(str, sVar.f17142I, 16000L);
                    case "application/cea-708":
                        return new T2.c(sVar.f17142I, sVar.f17165r);
                }
            }
            if (!this.f47394b.a(sVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            r rVarB = this.f47394b.b(sVar);
            return new C4195b(rVarB.getClass().getSimpleName() + "Decoder", rVarB);
        }
    }

    boolean a(s sVar);

    l b(s sVar);
}
