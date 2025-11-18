package fd;

import Zc.d;
import ad.b;
import ad.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C3830k;
import kotlin.jvm.internal.C3862t;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoDefinitionFoundException;

/* compiled from: Scope.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010'J\u001f\u0010*\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b*\u0010'J\u001f\u0010+\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010'JE\u0010.\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010,j\u0004\u0018\u0001`-¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010(\u001a\u00020\u0019H\u0000¢\u0006\u0004\b0\u0010'JC\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010,j\u0004\u0018\u0001`-¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\b5\u00106R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b+\u00107\u001a\u0004\b8\u00103R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b\t\u0010:R \u0010\u000b\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010;\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010=R$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u00000@j\b\u0012\u0004\u0012\u00020\u0000`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010BR*\u0010J\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010D\u0012\u0004\bI\u0010?\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00010@j\b\u0012\u0004\u0012\u00020\u0001`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010BR<\u0010Q\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d\u0018\u00010Lj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d\u0018\u0001`M8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010?R\u0016\u0010R\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00109¨\u0006S"}, d2 = {"Lfd/a;", "", "Lorg/koin/mp/Lockable;", "Ldd/a;", "scopeQualifier", "", "Lorg/koin/core/scope/ScopeID;", "id", "", "isRoot", "LUc/a;", "_koin", "<init>", "(Ldd/a;Ljava/lang/String;ZLUc/a;)V", "T", "LIa/d;", "clazz", "qualifier", "Lcd/a;", "parameters", "d", "(LIa/d;Ldd/a;Lcd/a;)Ljava/lang/Object;", "p", "o", "(Ldd/a;LIa/d;Lcd/a;)Ljava/lang/Object;", "LZc/d;", "instanceContext", "q", "(Lcd/a;LZc/d;)Ljava/lang/Object;", "Lkotlin/collections/k;", "k", "(Lcd/a;)Lkotlin/collections/k;", "stack", "Loa/F;", "a", "(Lkotlin/collections/k;)V", "f", "()Lkotlin/collections/k;", "l", "(LZc/d;)Ljava/lang/Object;", "ctx", "n", "m", "b", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "g", "(LIa/d;Ldd/a;LBa/a;)Ljava/lang/Object;", "i", "c", "toString", "()Ljava/lang/String;", "Ldd/a;", "j", "()Ldd/a;", "Ljava/lang/String;", "e", "Z", "()Z", "LUc/a;", "get_koin", "()LUc/a;", "get_koin$annotations", "()V", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "linkedScopes", "Ljava/lang/Object;", "getSourceValue", "()Ljava/lang/Object;", "setSourceValue", "(Ljava/lang/Object;)V", "getSourceValue$annotations", "sourceValue", "_callbacks", "Ljava/lang/ThreadLocal;", "Lorg/koin/mp/ThreadLocal;", "h", "Ljava/lang/ThreadLocal;", "getParameterStack$annotations", "parameterStack", "_closed", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dd.a scopeQualifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Uc.a _koin;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashSet<a> linkedScopes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Object sourceValue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashSet<Object> _callbacks;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ThreadLocal<C3830k<cd.a>> parameterStack;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean _closed;

    public a(dd.a scopeQualifier, String id2, boolean z10, Uc.a _koin) {
        C3862t.g(scopeQualifier, "scopeQualifier");
        C3862t.g(id2, "id");
        C3862t.g(_koin, "_koin");
        this.scopeQualifier = scopeQualifier;
        this.id = id2;
        this.isRoot = z10;
        this._koin = _koin;
        this.linkedScopes = new LinkedHashSet<>();
        this._callbacks = new LinkedHashSet<>();
    }

    private final void a(C3830k<cd.a> stack) {
        stack.E();
        if (stack.isEmpty()) {
            ThreadLocal<C3830k<cd.a>> threadLocal = this.parameterStack;
            if (threadLocal != null) {
                threadLocal.remove();
            }
            this.parameterStack = null;
        }
    }

    private final <T> T b(d ctx) {
        Iterator<T> it = this.linkedScopes.iterator();
        while (it.hasNext()) {
            T t10 = (T) ((a) it.next()).i(ctx);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    private final <T> T d(Ia.d<?> clazz, dd.a qualifier, cd.a parameters) {
        return (T) p(clazz, qualifier, parameters);
    }

    private final C3830k<cd.a> f() {
        C3830k<cd.a> c3830k;
        ThreadLocal<C3830k<cd.a>> threadLocal = this.parameterStack;
        if (threadLocal != null && (c3830k = threadLocal.get()) != null) {
            return c3830k;
        }
        C3830k<cd.a> c3830k2 = new C3830k<>();
        ThreadLocal<C3830k<cd.a>> threadLocal2 = new ThreadLocal<>();
        this.parameterStack = threadLocal2;
        threadLocal2.set(c3830k2);
        return c3830k2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object h(a aVar, Ia.d dVar, dd.a aVar2, Ba.a aVar3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        if ((i10 & 4) != 0) {
            aVar3 = null;
        }
        return aVar.g(dVar, aVar2, aVar3);
    }

    private final C3830k<cd.a> k(cd.a parameters) {
        C3830k<cd.a> c3830kF = f();
        c3830kF.addFirst(parameters);
        return c3830kF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T l(Zc.d r7) throws org.koin.core.error.NoDefinitionFoundException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.a.l(Zc.d):java.lang.Object");
    }

    private final <T> T m(d ctx) {
        this._koin.getLogger().a("|- ? " + ctx.getDebugTag() + " look in other scopes");
        return (T) b(ctx);
    }

    private final <T> T n(d ctx) {
        return (T) this._koin.getInstanceRegistry().g(ctx.getQualifier(), ctx.a(), this.scopeQualifier, ctx);
    }

    private final <T> T o(dd.a qualifier, Ia.d<?> clazz, cd.a parameters) throws ClosedScopeException {
        if (!this._closed) {
            return (T) q(parameters, new d(this._koin.getLogger(), this, clazz, qualifier, parameters));
        }
        throw new ClosedScopeException("Scope '" + this.id + "' is closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T p(Ia.d<?> r9, dd.a r10, cd.a r11) {
        /*
            r8 = this;
            Uc.a r0 = r8._koin
            ad.c r0 = r0.getLogger()
            ad.b r1 = ad.b.f20456B
            ad.b r0 = r0.getLevel()
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto Lc0
            java.lang.String r0 = ""
            r2 = 39
            if (r10 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " with qualifier '"
            r3.append(r4)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L2f
        L2e:
            r3 = r0
        L2f:
            boolean r4 = r8.isRoot
            if (r4 == 0) goto L34
            goto L4a
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = " - scope:'"
            r0.append(r4)
            java.lang.String r4 = r8.id
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L4a:
            Uc.a r4 = r8._koin
            ad.c r4 = r4.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "|- '"
            r5.append(r6)
            java.lang.String r7 = id.a.a(r9)
            r5.append(r7)
            r5.append(r2)
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = "..."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.b(r1, r0)
            Vb.h r0 = Vb.h.f18255a
            long r2 = r0.a()
            java.lang.Object r10 = r8.o(r10, r9, r11)
            Vb.i r11 = new Vb.i
            long r2 = Vb.h.a.j(r2)
            r0 = 0
            r11.<init>(r10, r2, r0)
            long r2 = r11.getDuration()
            Uc.a r10 = r8._koin
            ad.c r10 = r10.getLogger()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r9 = id.a.a(r9)
            r0.append(r9)
            java.lang.String r9 = "' in "
            r0.append(r9)
            double r2 = gd.a.a(r2)
            r0.append(r2)
            java.lang.String r9 = " ms"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.b(r1, r9)
            java.lang.Object r9 = r11.b()
            return r9
        Lc0:
            java.lang.Object r9 = r8.o(r10, r9, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.a.p(Ia.d, dd.a, cd.a):java.lang.Object");
    }

    private final <T> T q(cd.a parameters, d instanceContext) {
        if (parameters == null) {
            return (T) l(instanceContext);
        }
        c logger = this._koin.getLogger();
        b bVar = b.f20456B;
        if (logger.getLevel().compareTo(bVar) <= 0) {
            logger.b(bVar, "| >> parameters " + parameters);
        }
        C3830k<cd.a> c3830kK = k(parameters);
        try {
            return (T) l(instanceContext);
        } finally {
            this._koin.getLogger().a("| << parameters");
            a(c3830kK);
        }
    }

    public final <T> T c(Ia.d<?> clazz, dd.a qualifier, Ba.a<? extends cd.a> parameters) {
        C3862t.g(clazz, "clazz");
        return (T) p(clazz, qualifier, parameters != null ? parameters.invoke() : null);
    }

    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final <T> T g(Ia.d<?> clazz, dd.a qualifier, Ba.a<? extends cd.a> parameters) {
        C3862t.g(clazz, "clazz");
        try {
            return (T) c(clazz, qualifier, parameters);
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().a("* Scope closed - no instance found for " + id.a.a(clazz) + " on scope " + this);
            return null;
        } catch (NoDefinitionFoundException unused2) {
            this._koin.getLogger().a("* No instance found for type '" + id.a.a(clazz) + "' on scope '" + this + '\'');
            return null;
        }
    }

    public final <T> T i(d ctx) {
        C3862t.g(ctx, "ctx");
        try {
            return (T) d(ctx.a(), ctx.getQualifier(), ctx.getParameters());
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().a("* Scope closed - no instance found for " + id.a.a(ctx.a()) + " on scope " + this);
            return null;
        } catch (NoDefinitionFoundException unused2) {
            this._koin.getLogger().a("* No instance found for type '" + id.a.a(ctx.a()) + "' on scope '" + this + '\'');
            return null;
        }
    }

    /* renamed from: j, reason: from getter */
    public final dd.a getScopeQualifier() {
        return this.scopeQualifier;
    }

    public String toString() {
        return "['" + this.id + "']";
    }
}
