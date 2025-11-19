package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: CallableReference.java */
/* renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3849f implements Ia.c, Serializable {
    public static final Object NO_RECEIVER = a.f43997B;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient Ia.c reflected;
    private final String signature;

    /* compiled from: CallableReference.java */
    /* renamed from: kotlin.jvm.internal.f$a */
    private static class a implements Serializable {

        /* renamed from: B, reason: collision with root package name */
        private static final a f43997B = new a();

        private a() {
        }
    }

    public AbstractC3849f() {
        this(NO_RECEIVER);
    }

    @Override // Ia.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // Ia.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public Ia.c compute() {
        Ia.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        Ia.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    protected abstract Ia.c computeReflected();

    @Override // Ia.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // Ia.c
    public String getName() {
        return this.name;
    }

    public Ia.g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? P.c(cls) : P.b(cls);
    }

    @Override // Ia.c
    public List<Ia.l> getParameters() {
        return getReflected().getParameters();
    }

    protected Ia.c getReflected() {
        Ia.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new Aa.c();
    }

    @Override // Ia.c
    public Ia.q getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // Ia.c
    public List<Ia.r> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // Ia.c
    public Ia.u getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // Ia.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // Ia.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // Ia.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // Ia.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC3849f(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC3849f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
