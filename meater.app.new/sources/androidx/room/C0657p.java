package androidx.room;

import java.io.File;
import p024c.p082u.p083a.InterfaceC1009c;

/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* renamed from: androidx.room.p */
/* loaded from: classes.dex */
class C0657p implements InterfaceC1009c.c {

    /* renamed from: a */
    private final String f4353a;

    /* renamed from: b */
    private final File f4354b;

    /* renamed from: c */
    private final InterfaceC1009c.c f4355c;

    C0657p(String str, File file, InterfaceC1009c.c cVar) {
        this.f4353a = str;
        this.f4354b = file;
        this.f4355c = cVar;
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c.c
    /* renamed from: a */
    public InterfaceC1009c mo4667a(InterfaceC1009c.b bVar) {
        return new C0656o(bVar.f6690a, this.f4353a, this.f4354b, bVar.f6692c.f6689a, this.f4355c.mo4667a(bVar));
    }
}
