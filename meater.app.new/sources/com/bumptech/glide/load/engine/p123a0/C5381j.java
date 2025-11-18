package com.bumptech.glide.load.engine.p123a0;

import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.p145r.C5593g;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;
import com.bumptech.glide.p145r.p146l.AbstractC5600c;
import com.bumptech.glide.p145r.p146l.C5598a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: SafeKeyGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.a0.j */
/* loaded from: classes.dex */
public class C5381j {

    /* renamed from: a */
    private final C5593g<InterfaceC5423f, String> f13282a = new C5593g<>(1000);

    /* renamed from: b */
    private final InterfaceC0956f<b> f13283b = C5598a.m11068d(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.j$a */
    class a implements C5598a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.p145r.p146l.C5598a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo10211a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.j$b */
    private static final class b implements C5598a.f {

        /* renamed from: f */
        final MessageDigest f13285f;

        /* renamed from: g */
        private final AbstractC5600c f13286g = AbstractC5600c.m11078a();

        b(MessageDigest messageDigest) {
            this.f13285f = messageDigest;
        }

        @Override // com.bumptech.glide.p145r.p146l.C5598a.f
        /* renamed from: u */
        public AbstractC5600c mo10213u() {
            return this.f13286g;
        }
    }

    /* renamed from: a */
    private String m10209a(InterfaceC5423f interfaceC5423f) {
        b bVar = (b) C5596j.m11042d(this.f13283b.mo6061b());
        try {
            interfaceC5423f.updateDiskCacheKey(bVar.f13285f);
            return C5597k.m11064u(bVar.f13285f.digest());
        } finally {
            this.f13283b.mo6060a(bVar);
        }
    }

    /* renamed from: b */
    public String m10210b(InterfaceC5423f interfaceC5423f) {
        String strM11031g;
        synchronized (this.f13282a) {
            strM11031g = this.f13282a.m11031g(interfaceC5423f);
        }
        if (strM11031g == null) {
            strM11031g = m10209a(interfaceC5423f);
        }
        synchronized (this.f13282a) {
            this.f13282a.m11033k(interfaceC5423f, strM11031g);
        }
        return strM11031g;
    }
}
