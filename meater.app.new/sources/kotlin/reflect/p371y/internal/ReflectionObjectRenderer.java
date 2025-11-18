package kotlin.reflect.p371y.internal;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import okhttp3.HttpUrl;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(m32266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "appendReceiverType", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.c0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ReflectionObjectRenderer {

    /* renamed from: a */
    public static final ReflectionObjectRenderer f37273a = new ReflectionObjectRenderer();

    /* renamed from: b */
    private static final AbstractC10172c f37274b = AbstractC10172c.f39377g;

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.c0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37275a;

        static {
            int[] iArr = new int[KParameter.a.values().length];
            iArr[KParameter.a.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[KParameter.a.INSTANCE.ordinal()] = 2;
            iArr[KParameter.a.VALUE.ordinal()] = 3;
            f37275a = iArr;
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.c0$b */
    static final class b extends Lambda implements Function1<InterfaceC10599i1, CharSequence> {

        /* renamed from: f */
        public static final b f37276f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10599i1 interfaceC10599i1) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f37273a;
            AbstractC10344e0 type = interfaceC10599i1.getType();
            C9801m.m32345e(type, "it.type");
            return reflectionObjectRenderer.m32503h(type);
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.c0$c */
    static final class c extends Lambda implements Function1<InterfaceC10599i1, CharSequence> {

        /* renamed from: f */
        public static final c f37277f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10599i1 interfaceC10599i1) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f37273a;
            AbstractC10344e0 type = interfaceC10599i1.getType();
            C9801m.m32345e(type, "it.type");
            return reflectionObjectRenderer.m32503h(type);
        }
    }

    private ReflectionObjectRenderer() {
    }

    /* renamed from: a */
    private final void m32496a(StringBuilder sb, InterfaceC10735w0 interfaceC10735w0) {
        if (interfaceC10735w0 != null) {
            AbstractC10344e0 type = interfaceC10735w0.getType();
            C9801m.m32345e(type, "receiver.type");
            sb.append(m32503h(type));
            sb.append(".");
        }
    }

    /* renamed from: b */
    private final void m32497b(StringBuilder sb, InterfaceC10573a interfaceC10573a) {
        InterfaceC10735w0 interfaceC10735w0M32564i = C9891g0.m32564i(interfaceC10573a);
        InterfaceC10735w0 interfaceC10735w0Mo37032m0 = interfaceC10573a.mo37032m0();
        m32496a(sb, interfaceC10735w0M32564i);
        boolean z = (interfaceC10735w0M32564i == null || interfaceC10735w0Mo37032m0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        m32496a(sb, interfaceC10735w0Mo37032m0);
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: c */
    private final String m32498c(InterfaceC10573a interfaceC10573a) {
        if (interfaceC10573a instanceof InterfaceC10729t0) {
            return m32502g((InterfaceC10729t0) interfaceC10573a);
        }
        if (interfaceC10573a instanceof InterfaceC10738y) {
            return m32499d((InterfaceC10738y) interfaceC10573a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC10573a).toString());
    }

    /* renamed from: d */
    public final String m32499d(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = f37273a;
        reflectionObjectRenderer.m32497b(sb, interfaceC10738y);
        AbstractC10172c abstractC10172c = f37274b;
        C10163f name = interfaceC10738y.getName();
        C9801m.m32345e(name, "descriptor.name");
        sb.append(abstractC10172c.mo35504v(name, true));
        List<InterfaceC10599i1> listMo37028f = interfaceC10738y.mo37028f();
        C9801m.m32345e(listMo37028f, "descriptor.valueParameters");
        C10782c0.m38597c0(listMo37028f, sb, ", ", "(", ")", 0, null, b.f37276f, 48, null);
        sb.append(": ");
        AbstractC10344e0 returnType = interfaceC10738y.getReturnType();
        C9801m.m32343c(returnType);
        sb.append(reflectionObjectRenderer.m32503h(returnType));
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: e */
    public final String m32500e(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "invoke");
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = f37273a;
        reflectionObjectRenderer.m32497b(sb, interfaceC10738y);
        List<InterfaceC10599i1> listMo37028f = interfaceC10738y.mo37028f();
        C9801m.m32345e(listMo37028f, "invoke.valueParameters");
        C10782c0.m38597c0(listMo37028f, sb, ", ", "(", ")", 0, null, c.f37277f, 48, null);
        sb.append(" -> ");
        AbstractC10344e0 returnType = interfaceC10738y.getReturnType();
        C9801m.m32343c(returnType);
        sb.append(reflectionObjectRenderer.m32503h(returnType));
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: f */
    public final String m32501f(KParameterImpl kParameterImpl) {
        C9801m.m32346f(kParameterImpl, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        StringBuilder sb = new StringBuilder();
        int i2 = a.f37275a[kParameterImpl.getF40548i().ordinal()];
        if (i2 == 1) {
            sb.append("extension receiver parameter");
        } else if (i2 == 2) {
            sb.append("instance parameter");
        } else if (i2 == 3) {
            sb.append("parameter #" + kParameterImpl.getF40547h() + ' ' + kParameterImpl.getName());
        }
        sb.append(" of ");
        sb.append(f37273a.m32498c(kParameterImpl.m37284d().mo37304F()));
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: g */
    public final String m32502g(InterfaceC10729t0 interfaceC10729t0) {
        C9801m.m32346f(interfaceC10729t0, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC10729t0.mo37031j0() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = f37273a;
        reflectionObjectRenderer.m32497b(sb, interfaceC10729t0);
        AbstractC10172c abstractC10172c = f37274b;
        C10163f name = interfaceC10729t0.getName();
        C9801m.m32345e(name, "descriptor.name");
        sb.append(abstractC10172c.mo35504v(name, true));
        sb.append(": ");
        AbstractC10344e0 type = interfaceC10729t0.getType();
        C9801m.m32345e(type, "descriptor.type");
        sb.append(reflectionObjectRenderer.m32503h(type));
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: h */
    public final String m32503h(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "type");
        return f37274b.mo35505w(abstractC10344e0);
    }
}
