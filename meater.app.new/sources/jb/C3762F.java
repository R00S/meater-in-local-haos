package jb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: SignatureBuildingComponents.kt */
/* renamed from: jb.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3762F {

    /* renamed from: a, reason: collision with root package name */
    public static final C3762F f43573a = new C3762F();

    private C3762F() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(String it) {
        C3862t.g(it, "it");
        return f43573a.c(it);
    }

    public final String[] b(String... signatures) {
        C3862t.g(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set<String> d(String internalName, String... signatures) {
        C3862t.g(internalName, "internalName");
        C3862t.g(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final Set<String> e(String name, String... signatures) {
        C3862t.g(name, "name");
        C3862t.g(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set<String> f(String name, String... signatures) {
        C3862t.g(name, "name");
        C3862t.g(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        C3862t.g(name, "name");
        return "java/util/function/" + name;
    }

    public final String h(String name) {
        C3862t.g(name, "name");
        return "java/lang/" + name;
    }

    public final String i(String name) {
        C3862t.g(name, "name");
        return "java/util/" + name;
    }

    public final String j(String name, List<String> parameters, String ret) {
        C3862t.g(name, "name");
        C3862t.g(parameters, "parameters");
        C3862t.g(ret, "ret");
        return name + '(' + kotlin.collections.r.s0(parameters, "", null, null, 0, null, C3761E.f43572B, 30, null) + ')' + c(ret);
    }

    public final String l(String internalName, String jvmDescriptor) {
        C3862t.g(internalName, "internalName");
        C3862t.g(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
