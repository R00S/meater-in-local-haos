package jb;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: PackagePartProvider.kt */
/* renamed from: jb.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3760D {

    /* compiled from: PackagePartProvider.kt */
    /* renamed from: jb.D$a */
    public static final class a implements InterfaceC3760D {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43571a = new a();

        private a() {
        }

        @Override // jb.InterfaceC3760D
        public List<String> a(String packageFqName) {
            C3862t.g(packageFqName, "packageFqName");
            return kotlin.collections.r.m();
        }
    }

    List<String> a(String str);
}
