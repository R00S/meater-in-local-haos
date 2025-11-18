package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;

/* compiled from: AnnotationDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.c */
/* loaded from: classes2.dex */
public interface InterfaceC10616c {

    /* compiled from: AnnotationDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.c$a */
    public static final class a {
        /* renamed from: a */
        public static C10160c m37727a(InterfaceC10616c interfaceC10616c) {
            InterfaceC10585e interfaceC10585eM36071e = C10235a.m36071e(interfaceC10616c);
            if (interfaceC10585eM36071e == null) {
                return null;
            }
            if (C10427k.m37054m(interfaceC10585eM36071e)) {
                interfaceC10585eM36071e = null;
            }
            if (interfaceC10585eM36071e != null) {
                return C10235a.m36070d(interfaceC10585eM36071e);
            }
            return null;
        }
    }

    /* renamed from: a */
    Map<C10163f, AbstractC10211g<?>> mo33159a();

    /* renamed from: d */
    C10160c mo33162d();

    AbstractC10344e0 getType();

    /* renamed from: t */
    InterfaceC10741z0 mo33164t();
}
